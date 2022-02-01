package kr.co.dajsoft.hell0.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Member extends BaseEntity {
    @Id
    private String member_NICKNAME;

    @Column(length = 200, nullable = false)
    private String member_PW;

    @Column(length = 30, nullable = false)
    private String member_NAME;

    @Column(length = 200, nullable = false)
    private String member_EMAIL;

    @Column(length = 11, nullable = false)
    private String member_PHONE;

    @Column(length = 3, nullable = false)
    private String member_GENDER;

    @Column(length = 600)
    private String member_ADDRESS;

    private String ip;

    private String writer;

    @OneToMany
    private List<Board> board;

    @Builder
    public Member(String member_ADDRESS, String member_EMAIL, String member_GENDER, String member_NAME, String member_NICKNAME, String member_PHONE, String member_PW) {
        this.member_ADDRESS = member_ADDRESS;
        this.member_EMAIL = member_EMAIL;
        this.member_GENDER = member_GENDER;
        this.member_NAME = member_NAME;
        this.member_NICKNAME = member_NICKNAME;
        this.member_PHONE = member_PHONE;
        this.member_PW = member_PW;
    }
}
