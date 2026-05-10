package com.saferoute.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "configuracion_notificaciones")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ConfiguracionNotificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean recibirCorreos;
    private Boolean recibirAlertasWeb;
    private String nivelAlerta;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}