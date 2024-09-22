package io.github.beatrizdamascenof.service;

import io.github.beatrizdamascenof.model.Cliente;
import io.github.beatrizdamascenof.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository clientesRepository;

    @Autowired
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
   }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente); //salva o cliente
    }

    public void validarCliente(Cliente cliente){
        //aplica as validações
    }
}
