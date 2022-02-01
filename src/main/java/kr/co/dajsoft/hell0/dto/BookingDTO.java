package kr.co.dajsoft.hell0.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long bookingID;
    private String bookingPAYMENT;
    private String bookingPLACENAME;
    private String bookingPLACEADDRESS;
    private Long bookingTEAMMEMBER;
    private String bookingNAME;
    private LocalDateTime bookingDATE;
    private String bookingIP;
}
