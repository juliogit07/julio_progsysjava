package Aula13.swing;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Telacomtexto {

    public static void main(String[] args) {

        JFrame tela = new JFrame();

        tela.setTitle("Tela com JLabel");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        JLabel titulo = new JLabel("Sistema de Cadastro");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));

        painel.add(titulo);

        tela.add(painel);

        tela.setVisible(true);
    }
}
    

       





