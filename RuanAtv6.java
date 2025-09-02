/* 6. Sistema de Vendas
Crie uma classe Produto para representar um item à venda.
Atributos: nome, código, preço, estoque.
Métodos: vender(quantidade), repor(quantidade), exibirProduto().
Simule vendas e reposição de estoque, garantindo que não seja possível vender mais do que o disponível.
 */
public class RuanAtv6 {
    public class Produto {
        private String nome;
        private String codigo;
        private double preco;
        private int estoque;

        public Produto(String nome, String codigo, double preco, int estoque) {
            this.nome = nome;
            this.codigo = codigo;
            this.preco = preco;
            this.estoque = estoque;
        }

        public void vender(int quantidade) {
            if (quantidade <= estoque) {
                estoque -= quantidade;
                double total = quantidade * preco;
                System.out.println("Venda realizada! Total: R$ " + total);
            } else {
                System.out.println("Estoque insuficiente para a venda.");
            }
        }

        public void repor(int quantidade) {
            estoque += quantidade;
            System.out.println("Estoque reposto! Novo estoque: " + estoque);
        }

        public void exibirProduto() {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Estoque: " + estoque);
        }
    }

    public static void main(String[] args) {
        RuanAtv6 programa = new RuanAtv6();
        Produto produto1 = programa.new Produto("Notebook", "NB123", 3500.0, 10);
        Produto produto2 = programa.new Produto("Smartphone", "SP456", 1500.0, 5);

        produto1.exibirProduto();
        produto1.vender(3);
        produto1.exibirProduto();
        produto1.vender(8);
        produto1.repor(5);
        produto1.exibirProduto();
        produto2.vender(2);
        produto2.exibirProduto();
        produto2.vender(4);
    }
}
