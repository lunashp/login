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
public class BoardVO {

 private int BOARD_NUMBER;
 private String BOARD_TITLE;
 private String  BOARD_CONTENT;
 private int BOARD_READCNT;
 private String BOARD_NICKNAME;
 private LocalDateTime BOARD_WRITEDATE;
 //FOREIGN KEY(BOARD_NICKNAME) REFERENCES MEMBER(MEMBER_ID) ON UPDATE CASCADE ON DELETE CASCADE
}
