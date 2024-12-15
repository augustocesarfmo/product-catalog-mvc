package controllers;

import models.Product;
import views.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
  private List<Product> products = new ArrayList<>();
  private ProductView view;

  public ProductController(ProductView view) {
    this.view = view;
  }

  public void addProduct() {
    String name = view.getProductName();
    double price = view.getProductPrice();
    products.add(new Product(name, price));
    view.showMessage("Produto adicionado com sucesso!");
  }

  public void displayProducts() {
    view.displayProducts(products);
  }
}
