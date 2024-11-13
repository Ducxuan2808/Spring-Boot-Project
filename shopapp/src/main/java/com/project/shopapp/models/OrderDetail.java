package com.project.shopapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_details")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonBackReference
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @JoinColumn(name = "price" ,nullable = false)
    private Float price;

    @JoinColumn(name = "number_of_products" ,nullable = false)
    private int numberOfProducts;

    @JoinColumn(name = "total_money" ,nullable = false)
    private Float totalMoney;

    @JoinColumn(name = "color")
    private String color;
}
