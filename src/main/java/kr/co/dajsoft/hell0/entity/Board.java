package kr.co.dajsoft.hell0.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "writer")
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNUMBER;

    @Column(length = 100, nullable = false)
    private String boardTITLE;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String boardCONTENT;

    @Column(length = 10, nullable = false)
    private String boardNICKNAME;

    @Column
    private Long boardREADCNT;


    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;


}
