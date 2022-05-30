package com.digitalinnovationgft.labpadroesprojetospring.Servicos;

import com.digitalinnovationgft.labpadroesprojetospring.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceIml implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos(){

        return null;

    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }

}
