/* 4. Sistema de Reservas de Hotel
Crie uma classe Quarto que represente um quarto de hotel.
Atributos: número, tipo (simples, duplo, suíte), preço por noite, estáOcupado (True/False).
Métodos: reservar(), liberar(), calcularValor(dias).
Simule o processo de reserva e liberação de quartos, incluindo cálculo de valor total da estadia. */

public class RuanAtv4 {
    public class Quarto {
        private int numero;
        private String tipo;
        private double precoPorNoite;
        private boolean estaOcupado = false;

        public Quarto(int numero, String tipo, double precoPorNoite) {
            this.numero = numero;
            this.tipo = tipo;
            this.precoPorNoite = precoPorNoite;
            this.estaOcupado = false;
        }

        public void reservar() {
            if (!estaOcupado) {
                estaOcupado = true;
                System.out.println("Quarto " + numero + " reservado com sucesso!");
            } else {
                System.out.println("Quarto " + numero + " já está ocupado.");
            }
        }

        public void liberar(int noites) {
            if (estaOcupado) {
                estaOcupado = false;
                double aPagar = noites * precoPorNoite;
                System.out.println("Quarto " + numero + " liberado com sucesso! Total a pagar: R$ " + aPagar);
            } else {
                System.out.println("O quarto já está livre.");
            }
        }

    }

    public static void main(String[] args) {
        RuanAtv4 programa = new RuanAtv4();
        Quarto quarto1 = programa.new Quarto(101, "Simples", 150.0);
        Quarto quarto2 = programa.new Quarto(202, "Suíte", 300.0);
        quarto1.reservar();
        quarto1.reservar();
        quarto1.liberar(3);
        quarto1.liberar(2);
        quarto2.reservar();
        quarto2.liberar(1);
    }
}
