package kr.co.dajsoft.hell0.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member extends BaseEntity {
    @Id
    private String member_NICKNAME;

    @Column(length = 200, nullable = false)
    private  String member_PW;

    @Column(length = 30, nullable = false)
    private  String member_NAME;

    @Column(length = 200, nullable = false)
    private  String member_EMAIL;

    @Column(length = 11, nullable = false)
    private  String member_PHONE;

    @Column(length = 3, nullable = false)
    private  String member_GENDER;

    @Column(length = 600)
    private  String member_ADDRESS;

    private String ip;

    private String writer;

    @OneToMany
    private List<Board> board;
}
