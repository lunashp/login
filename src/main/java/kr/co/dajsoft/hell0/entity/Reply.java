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
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int REPLY_ID; //INT PRIMARY KEY,
    //private String BOARD_ID ;
    private String REPLY_PASSWORD ;//INT(4),
    private String REPLY_CONTENT; // VARCHAR(300),

    //private String replyer ??????????

    @ManyToOne(fetch =FetchType.LAZY)
    private Board board;

    // MEMBER_NICKNAME VARCHAR(30),
    // private String REPLY_IP   VARCHAR(50),
    //REPLY_SECRET VARCHAR(3) DEFAULT 'N' CHECK(REPLY_SECRET IN ('Y', 'N')),

}
