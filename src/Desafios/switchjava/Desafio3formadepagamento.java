package Desafios.switchjava;

import java.util.Scanner;

public class Desafio3formadepagamento {
public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);

     int opcao;

     System.out.println("===== FORMAS DE PAGAMENTO =====");
     System.out.println("1 - Dinheiro");
     System.out.println("2 - PIX");
     System.out.println("3 - Cartão de crédito");
     System.out.println("4 - Cartão de débito");
     System.out.println("5 - Cheque");
     System.out.print("Escolha uma opção:");
     opcao = entrada.nextInt();
     
     
     switch (opcao) {
     case 1:
         System.out.println("Pix");
         break;
     case 2:
         System.out.println("Dinheiro");
         break;
     case 3:
         System.out.println("Cartão de crédito");
         break;
     case 4:
         System.out.println("cartão de débito");
         break; 
     case 5:
    	 System.out.println("Cheque");
    	 break;
    	 
     default:
     	
     	System.out.println("opção inválida");
     }
    
     entrada.close();
}
}
