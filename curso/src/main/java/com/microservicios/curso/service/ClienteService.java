package com.microservicios.curso.service;

import com.microservicios.curso.entity.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public ResponseEntity<ClienteResponse> buscarCliente(ClienteResponse data) {
        try {
            ClienteResponse cl = null;
            switch (data.getTipoDocumento()) {
                case "C"://cedula
                case "P"://pasaporte
                    cl = ClienteResponse.builder()
                            .cedula(data.getCedula())
                            .tipoDocumento(data.getTipoDocumento())
                            .apellido("CHOEZ CHOEZ")
                            .nombre("CRISTHIAN JONATHAN")
                            .telefono("099999999")
                            .direccion("GUAYAQUIL - ECUADOR")
                            .build();
                    break;
                default:
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

            }

            return new ResponseEntity<>(cl, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
