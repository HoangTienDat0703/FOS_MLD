package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Dishes")
@NoArgsConstructor
@AllArgsConstructor
public class Dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dishesId;

    @Column(name = "dishesName")
    private String dishesName;

    @Column(name = "description")
    private String description;

    @Column(name = "dishImage")
    private String dishImage;

    @Column(name = "salePrice")
    private Long salePrice;

    @Column(name = "costPrice")
    private Long costPrice;

    @Column(name = "discount")
    private Long discount;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = true)
    private Category category;

}
