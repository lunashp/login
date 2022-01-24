package kr.co.dajsoft.hell0.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long BOARD_NUMBER;
    private String BOARD_TITLE;
    private String BOARD_CONTENT;

    private String BOARD_NICKNAME;


    private LocalDateTime MEMBER_JOINDATE;
    private LocalDateTime MEMBER_LOGINDATE;
    private LocalDateTime BOARD_WRITEDATE;

    private Long BOARD_READCNT;
}
