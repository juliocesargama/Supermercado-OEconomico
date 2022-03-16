package br.com.repository;

import br.com.interfaces.Crud;
import br.com.models.Client;

public class ClientRepository implements Crud<Client> {

    @Override
    public Integer create(Client client) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Client findById(Integer id) {
        return null;
    }
}
