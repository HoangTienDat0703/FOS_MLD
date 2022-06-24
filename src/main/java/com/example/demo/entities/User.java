//package com.example.demo.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "Users")
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "role")
//    private String role;
//
////    @OneToMany(targetEntity = Food.class,cascade = CascadeType.ALL)
////    @JoinColumn(name = "uf_fk", referencedColumnName = "id")
////    private List<Food> foodID;
//}
