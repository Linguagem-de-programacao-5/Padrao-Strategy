public class Calculadora {
    private double saldo;
    private double valorOperacao;

    public Calculadora(double saldo, double valorOperacao) {
        this.saldo = saldo;
        this.valorOperacao = valorOperacao;
    }

    public double calcular(Operacao operacao){
        return operacao.calcular(saldo, valorOperacao);
    }
}
