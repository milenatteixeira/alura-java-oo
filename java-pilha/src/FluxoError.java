
public class FluxoError {
	
	public static void main(String[] args){
		System.out.println("Início do main");
		
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException exception ){			
			String msg = exception.getMessage();
			System.out.println("Erro: " + msg);
			exception.printStackTrace();
		}

		System.out.println("Fim do main");
	}
	
	private static void metodo1(){
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2(){
		System.out.println("Chamando o método 2.");
		metodo2();
	}
}
