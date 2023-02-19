
public class Aliquota {
	public static void main(String[] args) {
		double salario = 3300.0;
		String regrasImpostoRenda = "";
		
		if(salario >= 1900.0 && salario <= 2800.0){
			regrasImpostoRenda = "Imposto de renda: 7.5% "
					+ "podendo deduzir R$142.";
		} else if(salario >= 2800.01 && salario <= 3751.0){
			regrasImpostoRenda = "Imposto de renda: 15% "
					+ "podendo deduzir R$350.";
		} else{
			regrasImpostoRenda = "Imposto de renda: 22.5% "
					+ "podendo deduzir R$636.";
		}
		
		System.out.println(regrasImpostoRenda);
		
	}
}
