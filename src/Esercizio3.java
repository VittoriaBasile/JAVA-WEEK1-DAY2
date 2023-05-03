import java.util.Date;

public class Esercizio3 {

	public static void main(String[] args) {
		Articolo articolo1 = new Articolo("123asdf", "Figo", 20, 5);
		Articolo articolo2 = new Articolo("456ghjk", "Troppo Figo", 40, 2);
		
		Articolo[] listaArticoli1 = {articolo1, articolo2};
		
		Cliente cliente1 = new Cliente("1234qwert","Mario Rossi","MarioRossi@gmail.com",new Date());
		
		Carrello carrello1 = new Carrello(cliente1.codiceCliente, listaArticoli1, sommaArticoli(listaArticoli1) );
		carrello1.totaleCarello();
	
	}
	public static double sommaArticoli (Articolo[] lista) {
        double totale = 0.0;
        for (int i = 0; i < lista.length; i++) {
            totale += lista[i].prezzo;
        }
        return totale;

    }

}
