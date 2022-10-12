package jpabasic.inflearnjpabasic.jpashop.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "ORDERS")
@Data
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;
}
