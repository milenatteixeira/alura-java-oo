
public class TestaVariaveis {
	public static void main(String[] args){
		
		// Teste variáveis
		int idade;
		idade = 37;
		
		System.out.println(idade);
		
		// Teste ponto flutuante		
		double divisaoErrada = 5/2;
		System.out.println(divisaoErrada);
		
		double divisaoCorreta = 5.0 / 2.0;
		System.out.println(divisaoCorreta);
		
		// Teste conversão (casting)
		
		double salario = 5988.97;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		long numeroGrande = 65654654l;
		
		System.out.println(numeroGrande);
	} 
}
