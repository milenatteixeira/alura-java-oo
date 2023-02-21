
public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(12345, 1234);
		SeguroVida seguroVida = new SeguroVida();
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		
		
		contaCorrente.deposita(100);
		
		calculadorImposto.calculaImposto(contaCorrente);
		calculadorImposto.calculaImposto(seguroVida);
		
		System.out.println(calculadorImposto.getTotalImposto());
	}

}
