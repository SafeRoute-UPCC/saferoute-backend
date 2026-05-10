package com.saferoute.backend.dto.response;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CiudadResponse {

    private Integer id;
    private String nombre;
    private String pais;
}