import java.util.Arrays;

public class Sim {

	int numero;
	double credito= 0;
	Chiamata[] listaChiamate ;
	
	public Sim(int num, double cred, Chiamata[]list) {
		this.numero = num;
		this.credito= cred;
		this.listaChiamate= list;
	}
	public Sim(int num) {
        this.numero = num;
        this.credito = 0;
        this.listaChiamate = null;
    }

    public Sim(int num, double cred) {
        this.numero = num;
        this.credito = cred;
        this.listaChiamate = null;
}
	
	
	
	public void  stampaSim() {
		String arr = Arrays.toString(this.listaChiamate);
		System.out.println("Numero:" + this.numero+ " "+ "Credito:" + this.credito +" "+ "Lista chiamate:"+ arr);
	}

}
