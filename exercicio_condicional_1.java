package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_1 {

	public static void main(String[] args) {
		

	Scanner leitor = new Scanner(System.in);
	
	int num;
	
	System.out.print("Digite um número: ");
	num = leitor.nextInt();
	
	if( num >= 20 && num <= 90 )
		System.out.print("O número digitado está entre 20 e 90.");
	
	else 
		System.out.print("O número digitado não está entre 20 e 90.");
	
	
	
	}
}
