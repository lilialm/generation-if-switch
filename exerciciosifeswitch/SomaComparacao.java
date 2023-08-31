package exerciciosifeswitch;

import java.util.Scanner;

public class SomaComparacao {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número A: ");
	        int a = scanner.nextInt();

	        System.out.print("Digite o número B: ");
	        int b = scanner.nextInt();

	        System.out.print("Digite o número C: ");
	        int c = scanner.nextInt();

	        int soma = a + b;

	        if (soma > c) {
	            System.out.println(b + "+" + a + "=" + soma + ">" + c);
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if (soma < c) {
	            System.out.println(b + "+" + a + "=" + soma + "<" + c);
	            System.out.println("A Soma de A + B é Menor do que C");
	        } else {
	            System.out.println(b + "+" + a + "=" + soma + "=" + c);
	            System.out.println("A Soma de A + B é Igual a C");
	        }
	        scanner.close();

	}

}
