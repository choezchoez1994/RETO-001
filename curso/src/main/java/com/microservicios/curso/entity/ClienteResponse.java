package com.microservicios.curso.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteResponse implements Serializable {

    private String cedula;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

}
