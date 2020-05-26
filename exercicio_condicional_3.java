package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
	float salario; 
	
	System.out.print("Digite o valor do seu salário: ");
	salario = leitor.nextFloat();
	
	if( salario >= 0 && salario <= 1000 ) {
		System.out.println("Seu salário terá aumento em 15%");
		System.out.print("Seu salário com o aumento será de: ");
		System.out.print(salario+(salario/100*15));
	}
	
	else if( salario >= 1000.01 && salario <= 2500 ) {
		System.out.println("Seu salário terá aumento em 7%");
		System.out.print("Seu salário com o aumento será de: ");
		System.out.print(salario+(salario/100*7));
	}
	
	else
		System.out.println("Seu salário não sofrerá alterações");
		
	
	
	
	
	}
}
