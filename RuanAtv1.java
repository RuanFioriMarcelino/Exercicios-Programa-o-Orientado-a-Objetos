/* 1. Sistema de Biblioteca
Crie uma classe Livro que represente um livro de uma biblioteca.
Atributos: título, autor, ano de publicação, ISBN, disponibilidade (True/False).
Métodos: emprestar(), devolver(), exibirInformacoes().
Implemente a lógica para controlar o empréstimo e devolução de livros, garantindo que um livro só possa ser emprestado se estiver disponível. */

public class RuanAtv1 {

    public class Livro {
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private int isbn;
        private boolean disponibilidade = true;

        public Livro(String titulo, String autor, int anoPublicacao, int isbn) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.isbn = isbn;
            this.disponibilidade = true;
        }

        public void emprestar() {
            if (disponibilidade) {
                disponibilidade = false;
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Livro indisponível para empréstimo.");
            }
        }

        public void devolver() {
            if (!disponibilidade) {
                disponibilidade = true;
                System.out.println("Livro devolvido com sucesso!");
            } else {
                System.out.println("O livro já está disponível na biblioteca.");
            }
        }

        public void exibirInformacoes() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano de Publicação: " + anoPublicacao);
            System.out.println("ISBN: " + isbn);
            System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível"));
        }
    }

    public static void main(String[] args) {
        RuanAtv1 programa = new RuanAtv1();
        Livro livro = programa.new Livro("O Alquimista", "Paulo Coelho", 1988, 123456789);
        livro.emprestar();
        livro.emprestar();
        livro.exibirInformacoes();
        livro.devolver();

    }
}
