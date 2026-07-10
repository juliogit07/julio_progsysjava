package Aula09;

public class Encapsulamentoview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Encapsulamentomodelo produto1 = new Encapsulamentomodelo();
        
        
        produto1.setNome("computador");
        produto1.setPreco(1150.90);
        produto1.setEstoque(15);
		
        produto1.exibirDados();
        
        }
	}
