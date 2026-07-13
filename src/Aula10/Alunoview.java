package Aula10;

public class Alunoview {
public static void main(String[] args) {
    Aluno aluno = new Aluno("Julio", "Programador de sistemas", 6, 10);

    System.out.println("Nome:" + aluno.getNome());
    System.out.println("Curso:" + aluno.getCurso());
    System.out.println("Média:" + aluno.calcularMedia());
    System.out.println("Situação:" + aluno.verificarSituacao());
   }

}

