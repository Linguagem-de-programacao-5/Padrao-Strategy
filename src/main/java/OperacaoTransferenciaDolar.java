public class OperacaoTransferenciaDolar implements Operacao{

    private String numContaDestino;

    public OperacaoTransferenciaDolar(String numContaDestino) {
        this.numContaDestino = numContaDestino;
    }

    @Override
    public double calcular(double saldo, double valorOperacao) {
        double valorDolarEmReal = valorOperacao * 5.0;
        if(saldo>=valorDolarEmReal){
            return saldo - valorDolarEmReal;
        }else {
            throw new IllegalArgumentException("A conta não possui saldo suficente para a transferência em dólar!");
        }
    }
}
