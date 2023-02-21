package br.com.alura.main;

public class TestePrioridades {

	public static void main(String[] args) {

//		Thread t = new Thread(() -> System.out.println("rodando..."));
//		
////		t.setPriority(10); // significa MAX_PRIORITY porém é ruim de ler
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name()); // MIN
		System.out.println(pMin.getValor()); // MAX
		
		System.out.println(pMax.name()); // 0
		System.out.println(pMax.getValor()); // 2
		
	}

}
