public class OperacaoDeposito implements Operacao{
    @Override
    public double calcular(double saldo, double valorOperacao) {
        return saldo + valorOperacao;
    }
}
