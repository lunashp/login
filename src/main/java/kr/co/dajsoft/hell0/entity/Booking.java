package kr.co.dajsoft.hell0.entity;


import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "member_NAME")
public class Booking extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingID;

    @Column(length = 30, nullable = false)
    private String bookingNAME;

    @Column(length = 3, nullable = false)
    private String bookingPAYMENT;

    @Column(length = 60, nullable = false)
    private String bookingPLACENAME;

    @Column(length = 600, nullable = false)
    private String bookingPLACEADDRESS;

    @Column(length = 20, nullable = false)
    private int bookingTEAMMEMBER;


    @ManyToOne
    private Member memberNAME;
}
