package kr.co.dajsoft.hell0;

import kr.co.dajsoft.hell0.entity.Member;
import kr.co.dajsoft.hell0.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMember(){
        for(int i=1; i<=3; i++){
            Member member = Member.builder()
                    .memberEMAIL("user" + i + "@gmail.com")
                    .memberNAME("사용자" + i)
                    .memberADDRESS("서울")
                    .memberGENDER("여")
                    .memberPW("1106")
                    .memberPHONE("01012345678")
                    .memberNICKNAME("user" + i)
                    .build();
            memberRepository.save(member);

        }
    }
}
