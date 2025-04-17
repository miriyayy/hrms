package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "password_repeat")
    private String passwordRepeat;

    @Column(name = "user_type",nullable=false)
    private String userType;
    
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "created_at",nullable=true)
    private LocalTime createdAt;

    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "updated_at" ,nullable=true)
    private LocalTime updatedAt;
    public abstract String getUserType();
}

