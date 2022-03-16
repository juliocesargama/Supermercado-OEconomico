package br.com.repository;

import br.com.interfaces.Crud;
import br.com.models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements Crud<Client> {

    private static ArrayList<Client> clientes = new ArrayList<>();

    @Override
    public Integer create(Client client) {
        clientes.add(client);
        return client.getId();
    }

    @Override
    public Client update(Client client) {
        Client clienteBanco = this.findById(client.getId());
        System.out.println("clienteBancoss" + client);
        if(clienteBanco != null){
            this.delete(client.getId());
            this.create(client);
            return client;
        }

        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        Client cliente = findById(id);
        return clientes.remove(cliente);
    }

    @Override
    public Client findById(Integer id) {
        Client clientBanco = clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
        return clientBanco;
    }

    @Override
    public List<Client> getAll() {
        return clientes;
    }
}
