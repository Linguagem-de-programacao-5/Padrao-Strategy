import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria contaBancaria;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria("0000000", "Jose", 100.d);
    }

    @Test
    void deveRetornarSaldoAposDeposito(){
        contaBancaria.depositar(50.0d);
        assertEquals(150.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoAposSaque(){
        contaBancaria.sacar(75.0d);
        assertEquals(25.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteParaSaque(){
        try{
            contaBancaria.sacar(150.0d);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A conta não possui saldo suficente para o saque!", e.getMessage());
        }

    }

    @Test
    void deveRetornarSaldoAposTransferenciaReal(){
        contaBancaria.transferirReal("90834",90.0d);
        assertEquals(10.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteParaTransferencia(){
        try{
            contaBancaria.transferirReal("90834",150.0d);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A conta não possui saldo suficente para a transferência!", e.getMessage());
        }

    }

    @Test
    void deveRetornarSaladoAposTransferenciaDolar(){
        contaBancaria.transferirDolar("362873", 15.0);
        assertEquals(25.0d, contaBancaria.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteParaTransferenciaEmDolar(){
        try{
            contaBancaria.transferirDolar("362873",80.0d);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A conta não possui saldo suficente para a transferência em dólar!", e.getMessage());
        }

    }

}