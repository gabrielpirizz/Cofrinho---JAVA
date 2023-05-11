import java.util.Objects;

public abstract class Moeda {
	double valorMoeda;
	
	public Moeda(double valorMoeda){
		super();
		this.valorMoeda= valorMoeda;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(valorMoeda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valorMoeda) == Double.doubleToLongBits(other.valorMoeda);
	}


	
	abstract double converter();
	
	
	abstract void info();
		
}
	
	
