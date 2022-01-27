package kr.co.dajsoft.hell0.dto;

import kr.co.dajsoft.hell0.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyDTO {
    private Long reply_ID;
    private  String member_NICKNAME;
    private  String reply_CONTENT;
    private  String reply_IP;
    private  String reply_SERCERET;
    private  Long reply_PASSWORD;

    private Long board_NUMBER;
    private Member member;//멤버 엔티티와 연결이 되는지 확인하지

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}