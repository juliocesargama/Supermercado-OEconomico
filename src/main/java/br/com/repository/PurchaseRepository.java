package br.com.repository;

import br.com.interfaces.Crud;
import br.com.models.Item;
import br.com.models.Purchase;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRepository implements Crud<Purchase> {

  private static ArrayList<Purchase> purchaseList = new ArrayList<>();


  @Override
  public Integer create(Purchase purchase) {
    Purchase purchase1 = purchaseList.stream().filter(purchases -> purchases.getClient().getId() == purchase.getClient().getId()).findFirst().orElse(null);
    if (purchase1 == null) {
      purchaseList.add(purchase);
      System.out.println("Purchase created");
      return purchase.getId();
    }
    System.out.println("Client already exists");
    return -1;
  }

  @Override
  public Purchase update(Purchase purchase) {
    Purchase purchaseData = this.findById(purchase.getId());

    if ( purchaseData != null) {
      this.delete(purchaseData.getId());
      this.create(purchase);

      return purchase;
    }
    return null;

  }

  @Override
  public Boolean delete(Integer id) {
    return purchaseList.remove(findById(id));
  }

  @Override
  public Purchase findById(Integer id) {
    return purchaseList.stream().filter(purchase -> purchase.getId() == id).findFirst().orElse(null);
  }

  @Override
  public List<Purchase> getAll() {
    return purchaseList;
  }
}
