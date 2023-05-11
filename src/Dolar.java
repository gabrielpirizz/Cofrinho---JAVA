
public class Dolar extends Moeda{

	public Dolar(double valorMoeda) {
		super(valorMoeda);
	}

	@Override
	double converter() {
		
		return this.valorMoeda*5;
	}

	
	@Override
	void info() {
		System.out.println("Dolar -> "+this.valorMoeda);
		
	}

}
