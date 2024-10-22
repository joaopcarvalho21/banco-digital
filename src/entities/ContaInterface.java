package entities;

import exception.SaldoInsuficienteException;

public interface ContaInterface {
    void sacar(double valor) throws SaldoInsuficienteException;
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException;
    void imprimirExtrato();
}