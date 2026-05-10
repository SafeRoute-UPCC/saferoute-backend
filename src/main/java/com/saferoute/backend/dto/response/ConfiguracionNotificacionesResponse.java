package com.saferoute.backend.dto.response;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ConfiguracionNotificacionesResponse {
    private Integer id;
    private Boolean recibirCorreos;
    private Boolean recibirAlertasWeb;
    private String nivelAlerta;
    private String nombreUsuario;
}