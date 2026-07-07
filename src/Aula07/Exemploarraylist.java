package Aula07;
import java.util.ArrayList;


public class Exemploarraylist {
	public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("PC");
        produtos.add("SMARTPHONE");
        produtos.add("TELEVISÃO");
        produtos.add("MONITOR");
        produtos.add("MOUSE");
        

        System.out.println("===== LISTA DE PRODUTOS =====");

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i));
        }
    }
}
