package kr.co.dajsoft.hell0.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mmNUM; // INT PRIMARY KEY,

    private String mmNAME; // VARCHAR(15) NOT NULL,
    private String mmTEAMNAME; // VARCHAR(30) NOT NULL


}
