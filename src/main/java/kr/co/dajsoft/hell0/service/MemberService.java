package kr.co.dajsoft.hell0.service;

import kr.co.dajsoft.hell0.dto.MemberDTO;
import kr.co.dajsoft.hell0.entity.Member;
import kr.co.dajsoft.hell0.repository.MemberRepository;
import kr.co.dajsoft.hell0.role.Role;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
    private MemberRepository memberRepository;

    @Transactional
    public String joinUser(MemberDTO memberdto) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        memberdto.setMember_PW(passwordEncoder.encode(memberdto.getMember_PW()));

        return memberRepository.save(memberdto.toEntity()).getMember_NICKNAME();
    }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        Optional<Member> userEntityWrapper = memberRepository.findByMember_EMAIL(userEmail);
        Member userEntity = userEntityWrapper.get();

        List<GrantedAuthority> authorities = new ArrayList<>();

        if (("admin@example.com").equals(userEmail)) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }

        return new User(userEntity.getMember_EMAIL(), userEntity.getMember_PW(), authorities);
    }
}
