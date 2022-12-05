package model;

import java.util.Arrays;
import java.util.List;

public class DadosFicticios {
	
	private List<Cliente> getListBook() {
		Cliente cliente1 =  new Cliente(1,"Head First Java", "Kathy Serria", "79666");
		Cliente cliente2 = new Cliente(2,"Effective Java", "Joshua Bloch", "365555");
		Cliente cliente3 = new Cliente(3,"Clean Code", "Robert Martin", "424444");
		Cliente cliente4 = new Cliente(4,"Thinking in Java", "Bruce Eckel", "3533333");
	 
	    List<Cliente> listCliente = Arrays.asList(cliente1, cliente2, cliente3,cliente4);
	 
	    return listCliente;
	}
}
