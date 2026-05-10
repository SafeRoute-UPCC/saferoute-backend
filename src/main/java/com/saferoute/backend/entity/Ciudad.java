package com.saferoute.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ciudad")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String pais;
}