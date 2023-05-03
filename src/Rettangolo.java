
public class Rettangolo {
	double altezza;
	double base;
	public Rettangolo (double h, double l) {
		this.altezza= h;
		this.base= l;
	}
	public double perimetro(){
		
		return (this.altezza + this.base)*2;
		
	}
	public double area(){
		
		return this.altezza *this.base;
		
	}
}
