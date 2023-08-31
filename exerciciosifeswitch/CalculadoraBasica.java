package exerciciosifeswitch;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float number1 = scanner.nextFloat();

        System.out.print("Digite o 2º número: ");
        float number2 = scanner.nextFloat();

        System.out.print("Operação: ");
        int operation = scanner.nextInt();

        float result = 0;

        switch (operation) {
            case 1:
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }
          scanner.close();
	}

}
