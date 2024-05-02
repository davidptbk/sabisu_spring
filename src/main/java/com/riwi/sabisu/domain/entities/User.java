package com.riwi.sabisu.domain.entities;

import java.util.Date;
import java.util.UUID;

import com.riwi.sabisu.util.enums.RolUser;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String document;
    private String name;
    private String last_name;
    private String email;
    private String username;
    private String password;
    private Date birthdate;
    @Enumerated(EnumType.STRING)
    private RolUser rol;
}
