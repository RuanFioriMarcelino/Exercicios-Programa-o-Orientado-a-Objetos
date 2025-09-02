/* 3. Controle de Animais em um Pet Shop
Crie uma classe Animal para representar os animais hospedados no pet shop.
Atributos: nome, espécie, idade, peso, dono.
Métodos: alimentar(quantidade), darBanho(), exibirFicha().
Implemente ações que alterem o estado do animal (como peso) e registrem os cuidados recebidos. */

public class RuanAtv3 {
    public class Animal {
        private String nome;
        private String especie;
        private int idade;
        private double peso;
        private String dono;

        public Animal(String nome, String especie, int idade, double peso, String dono) {
            this.nome = nome;
            this.especie = especie;
            this.idade = idade;
            this.peso = peso;
            this.dono = dono;

        }

        public void alimentar(double quantidade) {
            this.peso += quantidade * 0.1; // caso cada porcao de comida aumente 0.1kg
            System.out.println(
                    nome + " foi alimentado com " + quantidade + " unidades de comida. Novo peso: " + peso + " kg.");
        }

        public void darBanho() {
            System.out.println(nome + " tomou banho.");
        }

        public void exibirFicha() {
            System.out.println("Nome: " + nome);
            System.out.println("Espécie: " + especie);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Peso: " + peso + " kg");
            System.out.println("Dono: " + dono + "\n");
        }
    }

    public static void main(String[] args) {
        RuanAtv3 programa = new RuanAtv3();
        Animal animal = programa.new Animal("Rex", "Cachorro", 5, 20.5, "João");
        animal.exibirFicha();
        animal.alimentar(2.0);
        animal.darBanho();

    }
}
