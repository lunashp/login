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
    private Long booking_ID;

    @Column(length = 30, nullable = false)
    private String booking_NAME;

    @Column(length = 3, nullable = false)
    private String booking_PAYMENT;

    @Column(length = 60, nullable = false)
    private String booking_PLACE_NAME;

    @Column(length = 600, nullable = false)
    private String booking_PLACE_ADDRESS;

    @Column(length = 20, nullable = false)
    private int booking_TEAMMEMBER;

    private String ip;

    @ManyToOne
    private Member member_NAME;
}
