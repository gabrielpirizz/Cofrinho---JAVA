
public class Real extends Moeda {

	public Real(double valorMoeda) {
		super(valorMoeda);
	}

	
	@Override
	double converter() {
		
		return this.valorMoeda*1;
	}

	@Override
	void info() {
		System.out.println("Real ->"+this.valorMoeda);
		
	}

}
