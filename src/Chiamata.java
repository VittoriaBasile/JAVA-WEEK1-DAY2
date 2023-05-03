
public class Chiamata {

	double durata = 0.00;
	int numeroChiamato = 0;
	public Chiamata(double durata, int numeroChiamato ) {
		this.durata= durata;
		this.numeroChiamato= numeroChiamato;
	}
	@Override
	public  String toString() {
		return "Durata chiamata" + " " + this.durata + " " + "Numero chiamato" + this.numeroChiamato;
	}

}
