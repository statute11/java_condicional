package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
	float salario; 
	
	System.out.print("Digite o valor do seu sal�rio: ");
	salario = leitor.nextFloat();
	
	if( salario >= 0 && salario <= 1000 ) {
		System.out.println("Seu sal�rio ter� aumento em 15%");
		System.out.print("Seu sal�rio com o aumento ser� de: ");
		System.out.print(salario+(salario/100*15));
	}
	
	else if( salario >= 1000.01 && salario <= 2500 ) {
		System.out.println("Seu sal�rio ter� aumento em 7%");
		System.out.print("Seu sal�rio com o aumento ser� de: ");
		System.out.print(salario+(salario/100*7));
	}
	
	else
		System.out.println("Seu sal�rio n�o sofrer� altera��es");
		
	
	
	
	
	}
}
