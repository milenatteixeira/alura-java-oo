
public class Fluxo {
	
	public static void main(String[] args){
		System.out.println("Início do main");
		
		try {
			metodo1();
		} catch(ArithmeticException arithmeticException){			
			String msg = arithmeticException.getMessage();
			System.out.println("Erro de aritmética: " + msg);
		} catch(NullPointerException nullPointerException){			
			String msg = nullPointerException.getMessage();
			System.out.println("Erro de ponteiro nulo: " + msg);
		}

		System.out.println("Fim do main");
	}
	
	private static void metodo1(){
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2(){
		System.out.println("Início do metodo2");
		
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
//			int a = i/0;
			
			Conta conta = null;
			System.out.println(conta.toString());
		}
		
		System.out.println("Fim do metodo2");
	}
}