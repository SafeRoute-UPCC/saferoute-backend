package com.saferoute.backend.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ConfiguracionNotificacionesRequest {

    @NotNull(message = "El campo recibirCorreos es obligatorio")
    private Boolean recibirCorreos;

    @NotNull(message = "El campo recibirAlertasWeb es obligatorio")
    private Boolean recibirAlertasWeb;

    @NotNull(message = "El nivel de alerta es obligatorio")
    private String nivelAlerta;

    @NotNull(message = "El usuario es obligatorio")
    private Integer idUsuario;
}