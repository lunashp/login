package kr.co.dajsoft.hell0.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long booking_ID;
    private String booking_PAYMENT;
    private String booking_PLACE_NAME;
    private String booking_PLACE_ADDRESS;
    private Long booking_TEAMMEMBER;
    private String booking_NAME;
    private LocalDateTime booking_DATE;
    private String booking_IP;
}
