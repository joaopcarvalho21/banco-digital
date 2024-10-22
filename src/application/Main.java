package application;

import entities.*;
import exception.SaldoInsuficienteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        banco.adicionarCliente(cliente);

        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar na Conta Corrente");
            System.out.println("2 - Sacar da Conta Corrente");
            System.out.println("3 - Transferir da Conta Corrente para Poupança");
            System.out.println("4 - Imprimir Extrato da Conta Corrente");
            System.out.println("5 - Imprimir Extrato da Conta Poupança");
            System.out.println("6 - Consultar Saldo da Conta Corrente");
            System.out.println("7 - Listar Clientes");
            System.out.println("8 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    try {
                        contaCorrente.sacar(valorSaque);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir: R$ ");
                    double valorTransferencia = sc.nextDouble();
                    try {
                        contaCorrente.transferirParaContaPoupanca(valorTransferencia, contaPoupanca);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    contaCorrente.imprimirExtrato();
                    break;
                case 5:
                    contaPoupanca.imprimirExtrato();
                    break;
                case 6:
                    System.out.println("Saldo da Conta Corrente: R$" + contaCorrente.consultarSaldo());
                    break;
                case 7:
                    banco.listarClientes();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}