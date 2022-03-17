package kr.co.dajsoft.hell0.service;

import kr.co.dajsoft.hell0.dto.MemberDTO;
import kr.co.dajsoft.hell0.entity.Member;
import kr.co.dajsoft.hell0.repository.MemberRepository;
import kr.co.dajsoft.hell0.role.Role;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.*;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {
    private MemberRepository memberRepository;

//    private final BCryptPasswordEncoder passwordEncoder;

    //회원가입 시, 유효성 체크
    @Transactional(readOnly = true)
    public Map<String, String> validateHandling(Errors errors) {
        Map<String, String> validatorResult = new HashMap<>();

        //유효성 검사에 실패한 필드 목록을 받음
        for (FieldError error : errors.getFieldErrors()) {
            String validKeyName = String.format("valid_%s", error.getField());
            validatorResult.put(validKeyName, error.getDefaultMessage());
        }
        return validatorResult;
    }

    @Transactional
    public String joinUser(MemberDTO memberdto) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        memberdto.setMemberPW(passwordEncoder.encode(memberdto.getMemberPW()));
        return memberRepository.save(memberdto.toEntity()).getMemberNICKNAME();
    }


    @Override
    public UserDetails loadUserByUsername(String memberEMAIL) throws UsernameNotFoundException {
        Optional<Member> memberWrapper = memberRepository.findBymemberEMAIL(memberEMAIL);
        System.out.println(memberWrapper.toString());
        Member member = memberWrapper.get();

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (("admin@example.com").equals(memberEMAIL)) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }
        return new User(member.getMemberEMAIL(), member.getMemberPW(), authorities);
    }
}

    //회원 수정(dirty checking)
//    @Transactional
//    public void modify(MemberDTO memberdto){
//        Member member = memberRepository.findBymemberEMAIL(memberdto.toEntity().getMemberEMAIL()).orElseThrow(() ->
//                new IllegalArgumentException("해당 회원이 존재하지 않습니다"));
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encPassword = passwordEncoder.encode(memberdto.getMemberPW());
//        member.modify(memberdto.getMemberEMAIL(), encPassword);
//    }

