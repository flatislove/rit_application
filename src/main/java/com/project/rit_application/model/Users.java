package com.project.rit_application.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long users_id;
    private String users_firstname;
    private String users_lastname;
    private String users_password;
    private String users_email;
}
