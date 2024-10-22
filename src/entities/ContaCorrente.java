package entities;

import exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public void transferirParaContaPoupanca(double valor, ContaPoupanca contaPoupanca) throws SaldoInsuficienteException, SaldoInsuficienteException {
        transferir(valor, contaPoupanca);
    }
}