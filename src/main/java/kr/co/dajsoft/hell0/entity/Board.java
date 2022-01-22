package kr.co.dajsoft.hell0.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BOARD_NUMBER;
    @Column
    private String BOARD_TITLE;
    @Column
    private String BOARD_CONTENT;

    @Column
    private String BOARD_NICKNAME;
    @Column
    private Long BOARD_READCNT;



}
