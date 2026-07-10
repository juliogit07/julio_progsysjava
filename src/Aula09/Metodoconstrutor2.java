package Aula09;

public class Metodoconstrutor2 {
	
	private String nome;
	private double preco;
	private int estoque;
	
	public Metodoconstrutor2() {
		
	}
	public Metodoconstrutor2(String nome, double preco, int estoque) {
		setNome(nome);
		setPreco(preco);
		setEstoque(estoque);
	}
	public void setNome(String nome) {
		if(nome!= null && !nome.isBlank()) {
			
			this.nome = nome;
		} else {
			System.out.println("nome não pode ser vazio");
		}
		
	}
	public void setPreco(double preco) {
		if(preco>0) {
			
			this.preco = preco;
		} else {
			System.out.println("preço inconsistente");
		}
	}
	public void setEstoque(int estoque) {
		if(estoque>0) {
			
			this.estoque = estoque;
		} else {
			System.out.println("estoque não pode ser negativo");
		}
	}
	
	public double calcular() {
		
		return preco* estoque;
		
	}
	
	public void exibirDados() {
		System.out.println("produto: "+nome);
		System.out.println("preco:%.2f%n: R$ "+preco);
		System.out.println("estoque: "+estoque);
		System.out.printf("total estoque R$ %.2f%n: ",calcular());
		
	}
}


	


