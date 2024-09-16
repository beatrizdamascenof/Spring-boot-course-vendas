package io.github.beatrizdamascenof.service;

import io.github.beatrizdamascenof.model.Cliente;
import io.github.beatrizdamascenof.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    public void salvarCliente(Cliente cliente){
        salvarCliente(cliente);
        ClientesRepository clientesRepository  = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
