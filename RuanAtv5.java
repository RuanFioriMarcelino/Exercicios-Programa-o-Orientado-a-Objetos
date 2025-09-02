/*5. Gestão de Alunos
Crie uma classe Aluno para representar um estudante.
Atributos: nome, idade, matrícula, curso, lista de notas.
Métodos: adicionarNota(nota), calcularMedia(), verificarAprovacao().
Implemente a lógica para calcular a média e verificar se o aluno está aprovado (média ≥ 7). */

public class RuanAtv5 {
    public class Aluno {
        private String nome;
        private int idade;
        private String matricula;
        private String curso;
        private java.util.ArrayList<Double> notas;

        public Aluno(String nome, int idade, String matricula, String curso) {
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
            this.curso = curso;
            this.notas = new java.util.ArrayList<>();
        }

        public void adicionarNota(double nota) {
            notas.add(nota);
            System.out.println("Nota " + nota + " adicionada para o aluno " + nome);
        }

        public double calcularMedia() {
            if (notas.isEmpty()) {
                System.out.println("Nenhuma nota disponível para cálculo de média.");
                return 0.0;
            }
            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.size();
        }

        public void verificarAprovacao() {
            double media = calcularMedia();
            if (media >= 7.0) {
                System.out.println("Aluno " + nome + " aprovado com média: " + media);
            } else {
                System.out.println("Aluno " + nome + " reprovado com média: " + media);
            }
        }
    }

    public static void main(String[] args) {
        RuanAtv5 programa = new RuanAtv5();
        Aluno aluno1 = programa.new Aluno("Ruan", 20, "2023001", "Engenharia");
        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(6.0);
        aluno1.adicionarNota(7.5);
        aluno1.verificarAprovacao();

        Aluno aluno2 = programa.new Aluno("Maria", 22, "2023002", "Medicina");
        aluno2.adicionarNota(5.0);
        aluno2.adicionarNota(6.5);
        aluno2.verificarAprovacao();
    }
}
