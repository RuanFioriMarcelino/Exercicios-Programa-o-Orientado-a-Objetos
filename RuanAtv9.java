/* 9. Gerenciador de Eventos
Crie uma classe Evento para representar um evento público.
Atributos: nome, data, local, capacidade, inscritos (lista de nomes).
Métodos: inscrever(nome), verificarDisponibilidade(), exibirDetalhes().
Controle as inscrições, impedindo que ultrapassem a capacidade máxima. */

import java.util.ArrayList;

public class RuanAtv9 {
    public class Evento {
        private String nome;
        private String data;
        private String local;
        private int capacidade;
        private ArrayList<String> inscritos = new ArrayList<>();

        public Evento(String nome, String data, String local, int capacidade) {
            this.nome = nome;
            this.data = data;
            this.local = local;
            this.capacidade = capacidade;
        }

        public void inscrever(String nome) {
            if (verificarDisponibilidade()) {
                inscritos.add(nome);
                System.out.println(nome + " inscrito com sucesso!");
            } else {
                System.out.println("Inscrição não realizada. Capacidade máxima atingida.");
            }
        }

        public boolean verificarDisponibilidade() {
            return this.inscritos.size() < this.capacidade;
        }

        public void exibirDetalhes() {
            System.out.println("Evento: " + nome);
            System.out.println("Data: " + data);
            System.out.println("Local: " + local);
            System.out.println("Capacidade: " + capacidade);
            System.out.println("Inscritos: " + inscritos);
        }

    }

    public static void main(String[] args) {
        Evento evento = new RuanAtv9().new Evento("Show de Talentos", "01/09/2025", "Teatro", 4);
        evento.inscrever("Alice");
        evento.inscrever("Bob");
        evento.inscrever("Charlie");
        evento.inscrever("David");
        evento.inscrever("Eve");
        evento.exibirDetalhes();
    }
}