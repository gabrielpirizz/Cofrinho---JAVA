import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda; 
		int opcaoMenu;
		int selecionarTipoMoeda;
		double valorMoeda;
		
		System.out.println("--**----**----**-- COFRINHO --**----**----**--");
		System.out.println("* APERTE A TECLA PARA ACIONAR A OPCAO *\n "
				+ "1 - Adicionar uma moeda "
				+ "\n 2 - Remover uma moeda \n "
				+ "3 - Listar as moedas \n "
				+ "4 - Valor total das moedas convertido para real \n "
				+ "0 - Sair do Programa...");
		
		opcaoMenu = scanner.nextInt();
		while (opcaoMenu != 0 ) {
			
		
		switch(opcaoMenu) {
		
		case 1:
			selecionarTipoMoeda = 0;
			while (selecionarTipoMoeda > 3 || selecionarTipoMoeda  <= 0) {
				
			System.out.println("***** SELECIONE O TIPO DE MOEDA *****");
			System.out.println(" 1 - Euro");
			System.out.println(" 2 - Real");
			System.out.println(" 3 - Dolar");
			
			selecionarTipoMoeda = scanner.nextInt();
			
			System.out.println("Voce selecionou a opcao "+selecionarTipoMoeda);
			}
			System.out.println("Digite o valor desejado: ");
			valorMoeda = scanner.nextDouble();
			
			moeda = null;
			
			if (selecionarTipoMoeda == 1) {
				moeda = new Euro(valorMoeda);
				System.out.println("Voce depositou " +valorMoeda + " Euros na sua conta");
				
			} 
			if (selecionarTipoMoeda == 2) {
				moeda = new Real(valorMoeda);
				System.out.println("Voce depositou " +valorMoeda + " Reais na sua conta");
			} 
			
			if (selecionarTipoMoeda == 3) {
				moeda = new Dolar(valorMoeda);
				System.out.println("Voce depositou " +valorMoeda + " Dolares na sua conta");
			}
			
			cofrinho.adicionar_Moeda(moeda);
			break;	
			
		case 2:
		
		selecionarTipoMoeda = 0;
		while (selecionarTipoMoeda > 3 || selecionarTipoMoeda  <= 0) {	
		
		System.out.println("***** SELECIONE O TIPO DE MOEDA PARA REMOVER *****");
		System.out.println(" 1 - Euro");
		System.out.println(" 2 - Real");
		System.out.println(" 3 - Dolar");
		
		selecionarTipoMoeda = scanner.nextInt();
		}
		System.out.println("Digite o valor desejado: ");
		valorMoeda = scanner.nextDouble();
		
		moeda = null;
		
		if (selecionarTipoMoeda == 1) {
			moeda = new Euro(valorMoeda);
			System.out.println("Voce sacou " +valorMoeda + " Euros da sua conta");
			
		} 
		if (selecionarTipoMoeda == 2) {
			moeda = new Real(valorMoeda);
			System.out.println("Voce sacou " +valorMoeda + " Reais da sua conta");
			
		} 
		if (selecionarTipoMoeda == 3) {
			moeda = new Dolar(valorMoeda);
			System.out.println("Voce sacou " +valorMoeda + " Dolares da sua conta");
			
		}
		cofrinho.remover_Moeda(moeda);
		break;
		
		case 3:
			cofrinho.listar_Moeda();
		break;	
		
		
		case 4:
			cofrinho.total_Convertido();
		break;
	
		default:
		System.out.println("Opcao Invalida, tente novamente");
		}
		
		System.out.println("--**----**----**-- COFRINHO --**----**----**--");
		System.out.println("* APERTE A TECLA PARA ACIONAR A OPCAO *\n "
				+ "1 - Adicionar uma moeda "
				+ "\n 2 - Remover uma moeda \n "
				+ "3 - Listar as moedas \n "
				+ "4 - Valor total das moedas convertido para real \n "
				+ "0 - Sair do Programa...");
		
		opcaoMenu = scanner.nextInt();
	}
	}
}
