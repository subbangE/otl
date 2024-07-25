package com.otl.cart.entity;

import com.otl.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER) //회원 엔티티와 1:1 매칭 (즉시로딩)
    @JoinColumn(name = "user_id") // 매핑할 외래키를 지정한다. name을 명시하지 않으면 JPA가 알아서 ID를 찾지만 컬럼명이 원하는대로 생정되지 않을 수 있기 때문에 직접 지정한다.
    private User user;
}
