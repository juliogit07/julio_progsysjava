package Aula13.swing;
import javax.swing.JFrame;

public class PrimeiraJanela {

    public static void main(String[] args) {

        JFrame tela = new JFrame();

        tela.setVisible("Minha primeira tela Java");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
