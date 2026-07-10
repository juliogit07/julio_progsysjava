package Aula09;

public class Metodoconstrutor {
	 private String nome;
	    private double preco;
	    private int estoque;

	    public Metodoconstrutor(String nome, double preco, int estoque) {
	        this.nome = nome;
	        this.preco = preco;
	        this.estoque = estoque;
	    }

	    public void exibirDados() {
	        System.out.println("Produto: " +nome);
	        System.out.printf("Preço: &.2f%n" , preco);
	        System.out.println("Estoque: " +estoque);
	    }
}
