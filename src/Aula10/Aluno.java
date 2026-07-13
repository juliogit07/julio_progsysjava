package Aula10;

public class Aluno {
    
    private String nome;
    private String curso;
    private double nota1;
    private double nota2;

    
    public Aluno() {
    }

   
    public Aluno(String nome, String curso, double nota1, double nota2) {
        setNome(nome);
        setCurso(curso);
        setNota1(nota1);
        setNota2(nota2);
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
    }

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("O curso não pode ser vazio.");
        }
    }

    
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("A nota 1 deve estar entre 0 e 10.");
        }
    }

 
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("A nota 2 deve estar entre 0 e 10.");
        }
    }

    
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    
    public String verificarSituacao() {
        if (calcularMedia() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
