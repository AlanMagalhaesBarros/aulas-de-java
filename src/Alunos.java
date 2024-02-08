import java.util.Locale;
import java.util.Scanner;

import Verificador.Notas;

public class Alunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Notas media = new Notas(); 
		
		System.out.println("Degite o Nome do Aluno: ");
		System.out.print("Name: ");
		media.name = sc.nextLine();
		
		System.out.println("Informe a Nota da Av1");
		System.out.print("NotaV1: ");
		media.nota1 = sc.nextDouble();
		
		
		System.out.println("Informe a Nota da Av2");
		System.out.print("NotaV2: ");
		media.nota2 = sc.nextDouble();
		
		System.out.println("Informe a Nota da Av3");
		System.out.print("NotaV3: ");
		media.nota3 = sc.nextDouble();
		
		System.out.printf("Resultado media final %.2f%n ", media.Nfinal());
		
		
		
		
		
		if( media.Nfinal()>= 60.0) {
			System.out.println("Aprovado");
		}else {
			System.out.printf("Reprovado Media base 60.00 pontos requeridos %.2f%n ", media.AprovadoOuReprovado());
			
		}
		
		
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
