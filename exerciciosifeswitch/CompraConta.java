package exerciciosifeswitch;

import java.util.Scanner;

public class CompraConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Código do Produto: ");
        int code = scanner.nextInt();

        System.out.print("Quantidade: ");
        int quantity = scanner.nextInt();

        double totalPrice = 0;
        String productName = "";

        switch (code) {
            case 1:
                productName = "Cachorro Quente";
                totalPrice = quantity * 10.00;
                break;
            case 2:
                productName = "X-Salada";
                totalPrice = quantity * 15.00;
                break;
            case 3:
                productName = "X-Bacon";
                totalPrice = quantity * 18.00;
                break;
            case 4:
                productName = "Bauru";
                totalPrice = quantity * 12.00;
                break;
            case 5:
                productName = "Refrigerante";
                totalPrice = quantity * 8.00;
                break;
            case 6:
                productName = "Suco de laranja";
                totalPrice = quantity * 13.00;
                break;
            default:
                System.out.println("Código inválido!");
      
            
        }
        scanner.close();
        System.out.println("Produto: " + productName);
        System.out.println("Valor total: R$ " + totalPrice);
        

	}

}
