package kr.co.dajsoft.hell0.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Reply extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long REPLY_ID;

    @Column(length = 30, nullable = false)
    private  String MEMBER_NICKNAME;

    @Column(length = 300, nullable = false)
    private  String REPLY_CONTENT;

    @Column(length = 50, nullable = false)
    private  String REPLY_IP;

    @Column(length = 3, nullable = false)
    private  String REPLY_SERCERET;

    @Column(length = 4, nullable = false)
    private  Long REPLY_PASSWORD;


    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

}
