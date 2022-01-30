package kr.co.dajsoft.hell0.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "board")
public class Reply extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reply_ID;

    @Column(length = 300, nullable = false)
    private  String reply_CONTENT;

    @Column(length = 3, nullable = false)
    private  String reply_SERCERET;

    @Column(length = 4, nullable = false)
    private  Long reply_PASSWORD;

    private String ip;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member_NICKNAME;


    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

}
