package kr.co.dajsoft.hell0.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
