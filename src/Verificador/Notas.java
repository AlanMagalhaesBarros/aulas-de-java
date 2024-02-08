package Verificador;

public class Notas {
  
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double Nfinal() {
		return  nota1 + nota2 + nota3 ;

	}
	
	public double AprovadoOuReprovado() {
		
		
		if( Nfinal()>= 60.0) {
			
			return 0.0;
		}else {
			
			return 60.0 - Nfinal ();		
		}
		
	}
}
	
