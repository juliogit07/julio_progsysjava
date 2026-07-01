package Aula02;
import java.text.DecimalFormat;

public class Oficina {
public static void main(String[] args) {
	double v1, v2, soma, multiplicacao, divisao, subtracao, resto;
	DecimalFormat formatar = new DecimalFormat("#,##0.00");
	v1 = 100;
	v2 = 50;
	soma = v1 + v2;
	
	subtracao = v1 - v2;
	
	divisao = v1 / v2;
	
	multiplicacao = v1 * v2;
	
	resto = v1 / v2;
	
	System.out.println("subtracao: de "+ v1 + " - "+v2+" = " + subtracao);
	System.out.println("multiplicacao: de "+ v1 + " * "+v2+" = " + multiplicacao);
	System.out.println("divisao: de "+ v1 + " / "+v2+" = " + divisao);
	System.out.println("soma: de "+ v1 + " + "+v2+" = " + soma);
	System.out.println("resto: de "+ v1 + " & "+v2+" = " + resto);
	System.out.println("mudança de saída");
	System.out.printf("total subtracao: R$ % 2.f%n", subtracao);
	System.out.printf("total multiplicacao: R$ % 2.f%n", multiplicacao);
	System.out.printf("total divisao: R$ % 2.f%n", divisao);
	System.out.printf("total soma: R$ % 2.f%n", soma);
	System.out.printf("total resto: R$ % 2.f%n", resto);
	
	System.out.println("===========================");
	System.out.println("mudança de saída de valores");
	System.out.println("soma R$ " + formatar.format(soma));
	System.out.println("subtração R$ " + formatar.format(subtracao));
	System.out.println("multiplicação R$ " + formatar.format(multiplicacao));
	System.out.println("divisão R$ " + formatar.format(divisao));
	
	
	

	
}
}
