/* 10. Sistema de Pagamento de Mensalidades
Crie uma classe Mensalidade para representar o pagamento de um aluno.
Atributos: aluno, valor, data de vencimento, estáPago (True/False).
Métodos: pagar(), verificarAtraso(dataAtual), exibirStatus().
Implemente a lógica para registrar pagamentos e verificar se há atraso com base na data atual. */

public class RuanAtv10 {
    public class Mensalidade {
        private String aluno;
        private double valor;
        private String dataVencimento;
        private boolean estaPago;

        public Mensalidade(String aluno, double valor, String dataVencimento) {
            this.aluno = aluno;
            this.valor = valor;
            this.dataVencimento = dataVencimento;
            this.estaPago = false;
        }

        public void pagar() {
            this.estaPago = true;
            System.out.println("Pagamento realizado com sucesso!");
        }

        public boolean verificarAtraso(String dataAtual) {
            return !estaPago && dataAtual.compareTo(dataVencimento) > 0;
        }

        public void exibirStatus() {
            System.out.println("Aluno: " + aluno);
            System.out.println("Valor: " + valor);
            System.out.println("Data de Vencimento: " + dataVencimento);
            System.out.println("Está Pago: " + estaPago);
        }
    }

    public static void main(String[] args) {
        RuanAtv10 programa = new RuanAtv10();
        Mensalidade mensalidadeJoao = programa.new Mensalidade("João", 150.0, "30/09/2025");
        mensalidadeJoao.exibirStatus();
        mensalidadeJoao.pagar();
        mensalidadeJoao.exibirStatus();
        mensalidadeJoao.verificarAtraso("01/10/2025");
    }
}
