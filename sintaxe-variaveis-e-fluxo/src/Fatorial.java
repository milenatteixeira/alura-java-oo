
public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		
		for(int numeroAtual = 1; numeroAtual <= 10; numeroAtual++){
			fatorial *= numeroAtual;
			System.out.println(fatorial);
		}
	}
}
