package com.saferoute.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "suscripcion")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Suscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipoPlan;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estadoSuscripcion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}