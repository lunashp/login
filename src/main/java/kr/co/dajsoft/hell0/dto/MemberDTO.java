package kr.co.dajsoft.hell0.dto;

import kr.co.dajsoft.hell0.entity.Member;
import lombok.*;

import java.time.LocalDateTime;
@ToString
@Data
@NoArgsConstructor
public class MemberDTO {
    private String memberPW;
    private String memberNAME;
    private String memberEMAIL;
    private String memberPHONE;
    private String memberNICKNAME;
    private String memberGENDER;
    private String memberADDRESS;

    private LocalDateTime memberLOGINDATE;
    private LocalDateTime memberJOINDATE;

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

    @Builder
    public MemberDTO(String memberADDRESS, String memberEMAIL, String memberGENDER, String memberNAME, String memberNICKNAME, String memberPHONE, String memberPW){
        this.memberADDRESS = memberADDRESS;
        this.memberEMAIL = memberEMAIL;
        this.memberGENDER = memberGENDER;
        this.memberNAME = memberNAME;
        this.memberNICKNAME = memberNICKNAME;
        this.memberPHONE = memberPHONE;
        this.memberPW = memberPW;
    }
}
