package com.microservicios.curso.resource;

import com.microservicios.curso.entity.ClienteResponse;
import com.microservicios.curso.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/cliente")
public class ClienteApi {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/buscar")
    public ResponseEntity<ClienteResponse> buscarCliente(@RequestBody ClienteResponse data) {
        return clienteService.buscarCliente(data);
    }

}
