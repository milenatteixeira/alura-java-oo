
public class TesteSistema {

	public static void main(String[] args) {
		Autenticavel g = new Gerente();
		g.setSenha(2222);
		
		Autenticavel adm = new Administrador();
		adm.setSenha(2222);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}

}
