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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String MEMBER_NICKNAME;

    @Column(length = 200, nullable = false)
    private  String MEMBER_PW;

    @Column(length = 30, nullable = false)
    private  String MEMBER_NAME;

    @Column(length = 200, nullable = false)
    private  String MEMBER_EMAIL;

    @Column(length = 11, nullable = false)
    private  String MEMBER_PHONE;

    @Column(length = 3, nullable = false)
    private  String MEMBER_GENDER;

    @Column(length = 600)
    private  String MEMBER_ADDRESS;

    @OneToMany
    private List<Board> board;
}
