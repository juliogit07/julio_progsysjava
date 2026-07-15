package Aula10;

public class Produtoview {
public static void main(String[] args) {
    Produto produto = new Produto("Smartphone", 2500.00, 10);

    System.out.println("Nome: " + produto.getNome());
    System.out.println("Preço: R$ " + produto.getPreco());
    System.out.println("Quantidade: " + produto.getQuantidade());
    System.out.println("Total: R$ " + produto.calcularTotal());
}
}

