package kr.co.dajsoft.hell0.dto;

import kr.co.dajsoft.hell0.entity.Member;
import lombok.*;

import java.time.LocalDateTime;
@ToString
@Data
@NoArgsConstructor
public class MemberDTO {
    private String member_PW;
    private String member_NAME;
    private String member_EMAIL;
    private String member_PHONE;
    private String member_NICKNAME;
    private String member_GENDER;
    private String member_ADDRESS;

    private LocalDateTime member_LOGINDATE;
    private LocalDateTime member_JOINDATE;

    public Member toEntity(){
        return Member.builder()
                .member_NAME(member_NAME)
                .member_NICKNAME(member_NICKNAME)
                .member_PHONE(member_PHONE)
                .member_GENDER(member_GENDER)
                .member_EMAIL(member_EMAIL)
                .member_ADDRESS(member_ADDRESS)
                .member_PW(member_PW)
                .build();
    }

    @Builder
    public MemberDTO(String member_ADDRESS, String member_EMAIL, String member_GENDER, String member_NAME, String member_NICKNAME, String member_PHONE, String member_PW){
        this.member_ADDRESS = member_ADDRESS;
        this.member_EMAIL = member_EMAIL;
        this.member_GENDER = member_GENDER;
        this.member_NAME = member_NAME;
        this.member_NICKNAME = member_NICKNAME;
        this.member_PHONE = member_PHONE;
        this.member_PW = member_PW;
    }
}
