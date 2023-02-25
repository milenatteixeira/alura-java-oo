/*
 * Checked: o compilador verifica a utilização do 
 * termo "throws" nos métodos que utilizam essa classe.
 * 
 * */

@SuppressWarnings("serial")
public class MinhaException extends Exception { //exception do tipo checked
	
	public MinhaException(String msg){
		super(msg);
	}

}
