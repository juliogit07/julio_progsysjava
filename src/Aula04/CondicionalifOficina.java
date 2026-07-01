package Aula04;

import java.util.Scanner;
public class CondicionalifOficina {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double media, bim1, bim2, bim3, bim4;
		String teste;
		
		
		System.out.println("DIGITE A NOTA DO PRIMEIRO BIMESTRE");
         bim1 = input.nextDouble();
         
         System.out.println("DIGITE A NOTA DO SEGUNDO BIMESTRE");
         bim2 = input.nextDouble();
         
         System.out.println("DIGITE A NOTA DO TERCEIRO BIMESTRE");
         bim3 = input.nextDouble();
         
         System.out.println("DIGITE A NOTA DO QUARTO BIMESTRE");
         bim4 = input.nextDouble();
         
         
         media =(bim1+bim2+bim3+bim4)/4;
         if(media >= 7) {
        	System.out.printf("aprovado com media %.1f%n",media); 
         }else if(media >= 4) {
        	 System.out.printf("recuperação com media %.1f%n",media);
        	 
         } else {
        	 System.out.printf("reprovado com media %.1f%n",media);
         }
         
		}
	}

	

	

