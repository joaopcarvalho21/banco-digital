package entities;

import exception.SaldoInsuficienteException;
import java.util.Random;

public abstract class Conta implements ContaInterface {
    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1000;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = gerarNumeroConta();
        this.cliente = cliente;
        this.saldo = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    private int gerarNumeroConta() {
        Random random = new Random();
        return SEQUENCIAL + random.nextInt(9000);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %s", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}