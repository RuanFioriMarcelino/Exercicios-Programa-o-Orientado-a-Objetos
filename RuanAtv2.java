/* 2. Gerenciador de Funcionários
Crie uma classe Funcionario para representar um colaborador de uma empresa.
Atributos: nome, cargo, salário, matrícula, departamento.
Métodos: promover(novo_cargo, aumento), transferir(novo_departamento), exibirDados().
Simule a promoção e transferência de funcionários, atualizando os dados conforme necessário. */

public class RuanAtv2 {
    public class Funcionario {
        private String nome;
        private String cargo;
        private double salario;
        private int matricula;
        private String departamento;

        public Funcionario(String nome, String cargo, double salario, int matricula, String departamento) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
            this.matricula = matricula;
            this.departamento = departamento;
        }

        public void promover(String novo_cargo, double aumento) {
            this.cargo = novo_cargo;
            this.salario += aumento;
            System.out.println("Sucesso! Cargo e salário alterados.");
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário: " + salario);
            System.out.println("matricula: " + matricula);
            System.out.println("Departamento: " + departamento);
        }

        public void transferir(String novo_departamento) {
            this.departamento = novo_departamento;
            System.out.println("Sucesso! Departamento alterado.");
        }

    }

    public static void main(String[] args) {
        RuanAtv2 programa = new RuanAtv2();

        Funcionario funcionario = programa.new Funcionario("Ruan", "Desenvolvedor Junior", 5000.0, 12345, "TI");
        funcionario.exibirDados();
        funcionario.promover("Desenvolvedor Senior", 6500);
        funcionario.transferir("Desenvolvimento");
        funcionario.exibirDados();

    }
}
