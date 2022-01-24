package kr.co.dajsoft.hell0.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
public class BaseEntity {
    @CreatedDate
    @Column(name = "MEMBER_JOINDATE", updatable = false)
    private LocalDateTime MEMBER_JOINDATE;

    @LastModifiedDate
    @Column(name = "MEMBER_LOGINDATE")
    private LocalDateTime MEMBER_LOGINDATE;

    @LastModifiedDate
    @Column(name = "BOARD_WRITEDATE")
    private LocalDateTime BOARD_WRITEDATE;

    @LastModifiedDate
    @Column(name = "REPLY_WRITHDATE")
    LocalDateTime REPLY_WRITHDATE;


    @Column(length = 50, nullable = false)
    private  String MEMBER_IP;
}
