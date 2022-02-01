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

 private int boardNUMBER;
 private String boardTITLE;
 private String  boardCONTENT;
 private int boardREADCNT;
 private String boardNICKNAME;

 private String memberEMAIL;

 private LocalDateTime memberJOINDATE;
 private LocalDateTime memberLOGINDATE;
 private LocalDateTime boardWRITEDATE;

}
