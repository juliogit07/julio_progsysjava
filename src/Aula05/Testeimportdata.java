package Aula05;

import Config.Datahoraformatada;
import Config.Author;

public class Testeimportdata {
public static void main(String[] args) {
	
	Datahoraformatada horabr = new Datahoraformatada();
	Author nome = new Author();
	
	System.out.println(horabr.datahoraFormatada());
	System.out.println(nome.meuNome());
	System.out.println(nome.meuCurso());
}
}
