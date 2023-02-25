
public class Fluxo {
	
	public static void main(String[] args){
		System.out.println("Início do main");
		
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaException exception ){			
			String msg = exception.getMessage();
			System.out.println("Erro: " + msg);
			exception.printStackTrace();
		}

		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaException {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MinhaException {
		System.out.println("Início do metodo2");
		
		throw new MinhaException("Erro de aritmética.");
		
//		System.out.println("Fim do metodo2"); //unreachble code
	}
}
