import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> Lista_Moedas = new ArrayList<Moeda>();
	
	public void adicionar_Moeda(Moeda moedaM) {
		Lista_Moedas.add(moedaM);
	}
	public void remover_Moeda(Moeda moedaM) {
		Lista_Moedas.remove(moedaM);
	}
	public void listar_Moeda() {
		if (this.Lista_Moedas.isEmpty()) {
			System.out.println("O Cofrinho esta vazio.");
		}
		
		for (Moeda moedaM : Lista_Moedas) {
			moedaM.info();
	}
	}
	
	public void total_Convertido() {
	double valor_acumulado = 0;
	
	for(Moeda moedaM : this.Lista_Moedas) {
		valor_acumulado += moedaM.converter();
	}
	System.out.println("O Total de moedas convertidas para reais eh de: "+valor_acumulado);
	}
	
}
