
public class Euro extends Moeda {

	public Euro(double valorMoeda) {
		super(valorMoeda);
		
	}

	@Override
	double converter() {
		 
		return this.valorMoeda*5;
	}

	@Override
	void info() {
		System.out.println("Euro -> "+this.valorMoeda);
		
	}

}
