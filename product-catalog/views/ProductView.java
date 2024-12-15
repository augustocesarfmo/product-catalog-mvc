package views;

import models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
  private Scanner scanner = new Scanner(System.in);

  public void displayProducts(List<Product> products) {
    if (products.isEmpty()) {
      System.out.println("Nenhum produto cadastrado.");
    } else {
      System.out.println("Lista de Produtos:");
      for (int i = 0; i < products.size(); i++) {
        System.out.println((i + 1) + ". " + products.get(i));
      }
    }
  }

  public String getProductName() {
    System.out.print("Digite o nome do produto: ");
    return scanner.nextLine();
  }

  public double getProductPrice() {
    System.out.print("Digite o preço do produto: R$ ");
    return scanner.nextDouble();
  }

  public void showMessage(String message) {
    System.out.println(message);
  }
}
