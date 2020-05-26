package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_2 {

	public static void main(String[] args) {
		
	
	Scanner leitor = new Scanner(System.in);
		
	int idade;
		
	System.out.print("Digite a sua idade: ");
	idade = leitor.nextInt();
		
	if( idade >= 5 && idade <= 10 ) {
		System.out.print("Sua categoria é: Infantil");
		}
	else if( idade >= 11 && idade <= 17 ) {
		System.out.print("Sua categoria é: Juvenil");
	}
	
	else if( idade >= 18 ) {		
		System.out.print("Sua categoria é: Adulto");
		}
	
	else {
		System.out.print("Você não tem a idade correta para participar");
		}
	}
		
			
		
	}


