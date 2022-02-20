package kr.co.dajsoft.hell0.dto;

import kr.co.dajsoft.hell0.entity.Member;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.time.LocalDateTime;
@ToString
@Data
@NoArgsConstructor

public class MemberDTO implements Serializable {

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String memberPW;

    private String memberNAME;

    @NotBlank(message = "이메일은 필수 입력 값 입니다")
    @Email(message = "이메일 형식에 맞지 않습니다")
    private String memberEMAIL;

    private String memberPHONE;

    @NotBlank(message = "닉네임은 필수 입력 값 입니다")
    private String memberNICKNAME;

    private String memberGENDER;

    private String memberADDRESS;

//    private LocalDateTime regd;
//    private LocalDateTime modd;

    //비밀번호 암호화
    public Member toEntity(){
        return Member.builder()
                .memberNAME(memberNAME)
                .memberNICKNAME(memberNICKNAME)
                .memberPHONE(memberPHONE)
                .memberGENDER(memberGENDER)
                .memberEMAIL(memberEMAIL)
                .memberADDRESS(memberADDRESS)
                .memberPW(memberPW)
                .build();
    }

//    @Builder
//    public MemberDTO(String memberADDRESS, String memberEMAIL, String memberGENDER, String memberNAME, String memberNICKNAME, String memberPHONE, String memberPW){
//        this.memberADDRESS = memberADDRESS;
//        this.memberEMAIL = memberEMAIL;
//        this.memberGENDER = memberGENDER;
//        this.memberNAME = memberNAME;
//        this.memberNICKNAME = memberNICKNAME;
//        this.memberPHONE = memberPHONE;
//        this.memberPW = memberPW;

        //entity -> dto
    public MemberDTO(Member member){
            this.memberADDRESS = member.getMemberADDRESS();
            this.memberEMAIL = member.getMemberEMAIL();
            this.memberGENDER = member.getMemberGENDER();
            this.memberNAME = member.getMemberNAME();
            this.memberNICKNAME = member.getMemberNICKNAME();
            this.memberPHONE = member.getMemberPHONE();
            this.memberPW = member.getMemberPW();

    }
}
