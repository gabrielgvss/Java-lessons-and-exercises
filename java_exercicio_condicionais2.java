//autor: Gabriel Vinícius
//linguagem: Java
import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		
	int hi,hf,duracao;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("=========================");
	System.out.println(" CALCULADORA DE DURAÇÃO  ");
	System.out.println("=========================");
	
	System.out.println("Digite a hora em que começou o evento: ");
	hi = ler.nextInt();
	System.out.println("Digite a hora em que terminou o evento: ");
	hf = ler.nextInt();
	
	if (hi>hf) {
		duracao = 24 - (hi-hf);
		System.out.printf("O evento durou %d horas",duracao);
	}
	else if (hi<hf) {
		duracao = hf - hi;
		System.out.printf("O evento durou %d horas",duracao);
	}
	else {
		System.out.println("O evento durou 24 horas");
	}
	
	
	}
}
