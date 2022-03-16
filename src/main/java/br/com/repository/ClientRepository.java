package br.com.repository;

import br.com.interfaces.Crud;
import br.com.models.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientRepository implements Crud<Client> {

    private static List<Client> clientes = new ArrayList<>();

    @Override
    public Integer create(Client client) {
        clientes.add(client);
        return client.getId();
    }

    @Override
    public Client update(Client client) {
        Client clienteBanco = this.findById(client.getId());
        if(clienteBanco != null){
            this.delete(client.getId());
            this.create(client);
        }

        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Client findById(Integer id) {
        Optional<Client> clientBanco = clientes.stream().filter(c -> c.getId() == id).findFirst();
        if(clientBanco.isPresent()){
            return clientBanco.get();
        }
        return null;
    }

    @Override
    public List<Client> getAll() {
        return clientes;
    }
}
