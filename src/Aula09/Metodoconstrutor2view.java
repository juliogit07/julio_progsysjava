package Aula09;

public class Metodoconstrutor2view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Metodoconstrutor2 produto1 = new Metodoconstrutor2("Notebook", 3500.00, 3);
	        Metodoconstrutor2 produto2 = new Metodoconstrutor2("Mouse", 15, 10);

	        System.out.println("===== PRODUTO 1 =====");
	        produto1.exibirDados();

	        System.out.println();

	        System.out.println("===== PRODUTO 2 =====");
	        produto2.exibirDados();
	}

}
