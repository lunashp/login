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
public class MemberVO {
    private String MEMBER_PW;
    private String MEMBER_NAME;
    private String MEMBER_EMAIL;
    private String MEMBER_PHONE;
    private String MEMBER_NICKNAME;
    private String MEMBER_GENDER;
    private String MEMBER_ADDRESS;

    private LocalDateTime MEMBER_LOGINDATE;
    private LocalDateTime MEMBER_JOINDATE;
}
