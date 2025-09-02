/* 8. Sistema de Pedidos em Restaurante
Crie uma classe Pedido que represente um pedido feito por um cliente.
Atributos: número do pedido, itens (lista), valor total, status (em preparo, pronto, entregue).
Métodos: adicionarItem(item, valor), alterarStatus(novo_status), exibirResumo().
Simule o fluxo de um pedido desde a criação até a entrega, com atualização de status e valor.. */

import java.util.ArrayList;

public class RuanAtv8 {
    public class Pedido {
        private int numeroPedido;
        private ArrayList<String> itens = new ArrayList<>();
        private double valorTotal;
        private String status;

        public Pedido(int numeroPedido) {
            this.numeroPedido = numeroPedido;
            this.itens = new ArrayList<>();
            this.valorTotal = 0.0;
            this.status = "em preparo";
        }

        public void adicionarItem(String item, double valor) {
            itens.add(item);
            valorTotal += valor;
        }

        public void alterarStatus(String novoStatus) {
            this.status = novoStatus;
        }

        public void exibirResumo() {
            System.out.println("Número do Pedido: " + numeroPedido);
            System.out.println("Itens: " + String.join(", ", itens));
            System.out.println("Valor Total: R$ " + valorTotal);
            System.out.println("Status: " + status);
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new RuanAtv8().new Pedido(1);
        
        pedido.adicionarItem("Pizza", 30.0);
        pedido.adicionarItem("Refrigerante", 5.0);
        pedido.exibirResumo();

        pedido.alterarStatus("pronto");
        pedido.exibirResumo();

        pedido.alterarStatus("entregue");
        pedido.exibirResumo();  
    }

}
