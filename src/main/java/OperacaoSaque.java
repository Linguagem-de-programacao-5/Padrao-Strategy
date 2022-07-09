public class OperacaoSaque implements Operacao{
    @Override
    public double calcular(double saldo, double valorOperacao) {

        if(saldo>=valorOperacao){
            return saldo - valorOperacao;
        }else{
            throw new IllegalArgumentException("A conta não possui saldo suficente para o saque!");
        }

    }
}
