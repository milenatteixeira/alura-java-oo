
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 20;
//		int quantidadePessoas = 2;
		
//		if(quantidadePessoas >= 2){
//			boolean acompanhado = true;
//		}else{
//			boolean acompanhado = false;
//		}
		
		boolean acompanhado = true;
		
		// a variavel acompanhado morreu no escopo interno do if
		if (idade >= 18 && acompanhado){
			System.out.println("bem vindo");
		}else {
			System.out.println("não autorizado");
		}
	}
}
