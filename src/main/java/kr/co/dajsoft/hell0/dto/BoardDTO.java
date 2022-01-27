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
public class BoardDTO {

 private int board_NUMBER;
 private String board_TITLE;
 private String  board_CONTENT;
 private int board_READCNT;
 private String board_NICKNAME;

 private String member_EMAIL;

 private LocalDateTime member_JOINDATE;
 private LocalDateTime member_LOGINDATE;
 private LocalDateTime board_WRITEDATE;

}
