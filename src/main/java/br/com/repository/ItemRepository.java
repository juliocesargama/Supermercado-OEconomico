package br.com.repository;

import br.com.interfaces.Crud;
import br.com.models.Client;
import br.com.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements Crud<Item> {

    private static List<Item> itemsLista= new ArrayList<>();

    @Override
    public Integer create(Item item) {
        itemsLista.add(item);
        return item.getId();
    }

    @Override
    public Item update(Item item) {
        Item itemBanco = this.findById(item.getId());
        if (itemBanco != null) {
            this.delete(itemBanco.getId());
            this.create(item);
            return item;
        }
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        itemsLista.remove(findById(id));
        return false;

    }

    @Override
    public Item findById(Integer id) {
        return itemsLista.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Item> getAll() {
        return itemsLista;
    }
}
