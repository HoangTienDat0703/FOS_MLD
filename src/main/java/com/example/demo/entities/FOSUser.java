package com.example.demo.entities;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Data
@Entity
@Table(name="FOSUser")
@NoArgsConstructor
@AllArgsConstructor
public class FOSUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

//    @ManyToOne
//    @JoinColumn(name = "roleId", nullable = true)
//    private Role roleId;

//    @ManyToMany(fetch = FetchType.EAGER)
//    private Collection<Role> roles = new ArrayList<>();

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact")
    private String contact;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private Integer status;

    @Column(name = "profileImage")
    private String profileImage;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = true)
    private Role role;

}
