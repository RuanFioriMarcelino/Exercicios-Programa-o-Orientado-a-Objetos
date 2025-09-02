/*7. Controle de Veículos
Crie uma classe Veiculo para representar um carro em uma locadora.
Atributos: modelo, placa, ano, estáAlugado (True/False), quilometragem.
Métodos: alugar(), devolver(kmRodados), exibirStatus().
Implemente o controle de aluguel e devolução, atualizando a quilometragem e disponibilidade.a. */

public class RuanAtv7 {
    public class Veiculo {
        private String modelo;
        private String placa;
        private int ano;
        private boolean estaAlugado = false;
        private double quilometragem;

        public Veiculo(String modelo, String placa, int ano, double quilometragem) {
            this.modelo = modelo;
            this.placa = placa;
            this.ano = ano;
            this.quilometragem = quilometragem;
            this.estaAlugado = false;
        }

        public void alugar() {
            if (!estaAlugado) {
                estaAlugado = true;
                System.out.println("Veículo " + modelo + " alugado com sucesso!");
            } else {
                System.out.println("Veículo " + modelo + " já está alugado.");
            }
        }

        public void devolver(double kmRodados) {
            if (estaAlugado) {
                estaAlugado = false;
                quilometragem += kmRodados;
                System.out
                        .println("Veículo " + modelo + " devolvido com sucesso! Quilometragem atual: " + quilometragem);
            } else {
                System.out.println("O veículo não está alugado.");
            }
        }

        public void exibirStatus() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Placa: " + placa);
            System.out.println("Ano: " + ano);
            System.out.println("Quilometragem: " + quilometragem);
            System.out.println("Status: " + (estaAlugado ? "Alugado" : "Disponível"));
        }
    }

    public static void main(String[] args) {
        RuanAtv7 programa = new RuanAtv7();
        Veiculo carro1 = programa.new Veiculo("Toyota Corolla", "ABC-1234", 2020, 15000.0);
        Veiculo carro2 = programa.new Veiculo("Honda Civic", "XYZ-5678", 2019, 20000.0);

        carro1.exibirStatus();
        carro1.alugar();
        carro1.exibirStatus();
        carro1.devolver(300);
        carro1.exibirStatus();
        carro1.devolver(100);

        carro2.alugar();
        carro2.exibirStatus();
        carro2.devolver(150);
        carro2.exibirStatus();
    }
}