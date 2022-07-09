public class OperacaoTransferenciaReal implements Operacao{

    private String numContaDestino;

    public OperacaoTransferenciaReal(String numContaDestino) {
        this.numContaDestino = numContaDestino;
    }

    @Override
    public double calcular(double saldo, double valorOperacao) {
        if(saldo>=valorOperacao){
            return saldo - valorOperacao;
        }else{
            throw new IllegalArgumentException("A conta não possui saldo suficente para a transferência!");
        }
    }
}
