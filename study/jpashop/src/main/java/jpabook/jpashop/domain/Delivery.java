package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    // EnumType.DEFAULT로 쓰면 숫자로 들어간다.
    // 만약 다른 타입이 또 생기면 숫자가 밀려서 오류가 발생할 수 있다.
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
