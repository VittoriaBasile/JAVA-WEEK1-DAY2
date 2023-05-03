
public class Esercizio2 {

	public static void main(String[] args) {

		Chiamata chiamata1 = new Chiamata(2.45,123345677);
		Chiamata chiamata2 = new Chiamata(4.45,987676544);
		Chiamata chiamata3 = new Chiamata(1.45,234567878);
		Chiamata chiamata4 = new Chiamata(7.45,977976544);
		Chiamata chiamata5 = new Chiamata(0.45,123576544);

		Chiamata[] listaChiamate1 = {chiamata1,chiamata2};
		Chiamata[] listaChiamate2 = {chiamata3,chiamata4, chiamata5};

		Sim sim1 = new Sim(123456789, 5.70, listaChiamate1);
		Sim sim2 = new Sim(987654321, 10.70, listaChiamate2);

		sim1.stampaSim();
		sim2.stampaSim();
	}

}
