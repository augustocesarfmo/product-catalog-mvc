import java.util.Scanner;

import controllers.ProductController;
import views.ProductView;

public class Main {
  public static void main(String[] args) {
    ProductView view = new ProductView();
    ProductController controller = new ProductController(view);
    Scanner scanner = new Scanner(System.in);
    int option;

    do {
      System.out.println("\n1. Adicionar produto");
      System.out.println("2. Exibir produtos");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      option = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer do scanner

      switch (option) {
        case 1:
          controller.addProduct();
          break;
        case 2:
          controller.displayProducts();
          break;
        case 3:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (option != 3);

    scanner.close();
  }
}
