
public class Carrello {

	String clienteAssociato;
	Articolo[] elencoArticoli;
	double totaleCostoCarrello;
	
	public Carrello(String clienteAssociato,Articolo[] elencoArticoli,double totaleCostoCarrello) {
		this.clienteAssociato=clienteAssociato;
		this.elencoArticoli = elencoArticoli;
		this.totaleCostoCarrello=totaleCostoCarrello;
		
	}
	 public void totaleCarello() {
	        System.out.println(this.totaleCostoCarrello);
	    }
	}

