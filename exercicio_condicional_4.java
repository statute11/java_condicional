package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_4 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);	
	
	float lado1, lado2, lado3;
	
	System.out.print("Digite o valor do lado 1 do tri�ngulo: ");
	lado1 = leitor.nextFloat();
	
	System.out.print("Digite o valor do lado 2 do tri�ngulo: ");
	lado2 = leitor.nextFloat();
	
	System.out.print("Digite o valor do lado 3 do tri�ngulo: ");
	lado3 = leitor.nextFloat();
	
	if( lado1 == lado2 && lado2 == lado3 ) {
		System.out.print("O tri�ngulo � equil�tero!");
		}
	else if( lado1 == lado2 && lado2 != lado3 || lado1 != lado2 && lado2 == lado3 || lado1 == lado3 && lado3 != lado2 ) {
		System.out.print("O tri�ngulo � is�sceles!");
		}
	else {
		System.out.print("O tri�ngulo � escaleno!");
		}
	
	
	}
	
	
	
}
	

