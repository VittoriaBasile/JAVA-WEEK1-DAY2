
public class Esercizio1 {
	public static void main(String[] args) {
	Rettangolo rettangolo1= new Rettangolo(4,7);
	Rettangolo rettangolo2= new Rettangolo(8,4.6);
	stampaRettangolo(rettangolo1);
	stampaRettangolo(rettangolo2);
	stampaDueRettangoli(rettangolo1,rettangolo2);

	}
	static void stampaRettangolo( Rettangolo obj) {
		System.out.println("il perimetro del rettangolo è " + obj.perimetro());
		System.out.println("L' area del rettangolo è " + obj.area());
	}
	
	static void stampaDueRettangoli(Rettangolo obj1, Rettangolo obj2) {
		stampaRettangolo(obj1);
		stampaRettangolo(obj2);
		double sommaPerimetri = obj1.perimetro() + obj2.perimetro();
		System.out.println("La somma dei perimetri è " + sommaPerimetri);
		double sommaAree = obj1.area() + obj2.area();
		System.out.println("La somma delle aree è " + sommaAree);


	}
}
