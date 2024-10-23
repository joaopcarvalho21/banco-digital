
# Projeto Banco Digital

## Descrição
Projeto realizado para o Bootcamp Dio - Java com Spring Boot, Este projeto é uma simulação de um sistema de banco digital, desenvolvido para fins de estudo e aprimoramento de habilidades em programação orientada a objetos, manipulação de exceções e gerenciamento de dados. O sistema permite a realização de operações bancárias como depósitos, saques e transferências entre contas, demonstrando boas práticas de programação e design de software.

## Competências Desenvolvidas

- **Programação Orientada a Objetos (POO)**: O projeto utiliza conceitos de POO, como encapsulamento, herança e abstração para modelar entidades como `Cliente`, `Conta`, `ContaCorrente` e `ContaPoupanca`.
- **Manipulação de Exceções**: Implementação de exceções personalizadas para lidar com erros, como saldo insuficiente, garantindo que o sistema opere de forma robusta.
- **Estruturas de Dados**: Uso de listas para gerenciar clientes e contas, demonstrando habilidades em organização e manipulação de dados.
- **Geração de Números Aleatórios**: Geração de números de contas de forma aleatória, imitando práticas do mercado bancário.
- **Interatividade com o Usuário**: Utilização de entrada de dados via terminal, permitindo uma interface simples e funcional para o usuário.

## Estrutura do Código

### Classes Principais

- **`Cliente`**: Representa um cliente do banco, com atributos como nome.
- **`Conta`**: Classe abstrata que define as operações básicas de uma conta bancária (sacar, depositar, transferir). A agência é fixa em `0001`, e o número da conta é gerado aleatoriamente.
- **`ContaCorrente` e `ContaPoupanca`**: Extensões da classe `Conta`, cada uma com métodos específicos para imprimir extratos.
- **`Banco`**: Gerencia a lista de clientes e suas contas, permitindo adicionar e listar clientes.

### Exemplo de Execução

Aqui está um exemplo de como o sistema pode ser utilizado:

```plaintext
Digite o nome do cliente: 
João da Silva
Cliente adicionado: João da Silva

Escolha uma operação:
1 - Depositar na Conta Corrente
2 - Sacar da Conta Corrente
3 - Transferir da Conta Corrente para Poupança
4 - Imprimir Extrato da Conta Corrente
5 - Imprimir Extrato da Conta Poupança
6 - Consultar Saldo da Conta Corrente
7 - Listar Clientes
8 - Sair
```

### Detalhamento das Operações

1. **Depositar na Conta Corrente**: Solicita um valor ao usuário e o adiciona ao saldo da conta corrente.
2. **Sacar da Conta Corrente**: Solicita um valor ao usuário e tenta realizar o saque. Se o saldo for insuficiente, uma exceção é lançada e uma mensagem é exibida.
3. **Transferir da Conta Corrente para Poupança**: Solicita um valor e realiza a transferência para a conta poupança, validando saldo.
4. **Imprimir Extrato**: Exibe informações como titular, agência, número da conta e saldo.
5. **Consultar Saldo**: Mostra o saldo atual da conta corrente.
6. **Listar Clientes**: Exibe todos os clientes cadastrados no banco.

## Conclusão

Este projeto visa aprimorar habilidades de programação e design de sistemas, servindo como uma base para futuras implementações e aprendizado. Sinta-se à vontade para contribuir ou expandir as funcionalidades!

---

# Digital Bank Project

## Description

This project is a simulation of a digital banking system, developed for study purposes and to enhance programming skills. The system allows for banking operations such as deposits, withdrawals, and transfers between accounts, demonstrating good programming practices and software design.

## Developed Competencies

- **Object-Oriented Programming (OOP)**: The project utilizes OOP concepts like encapsulation, inheritance, and abstraction to model entities such as `Client`, `Account`, `CheckingAccount`, and `SavingsAccount`.
- **Exception Handling**: Implementation of custom exceptions to handle errors, such as insufficient funds, ensuring the system operates robustly.
- **Data Structures**: Use of lists to manage clients and accounts, demonstrating skills in data organization and manipulation.
- **Random Number Generation**: Generation of account numbers randomly, mimicking market practices in banking.
- **User Interaction**: Use of terminal input for data entry, providing a simple and functional user interface.

## Code Structure

### Main Classes

- **`Client`**: Represents a bank client with attributes such as name.
- **`Account`**: An abstract class that defines basic operations of a bank account (withdraw, deposit, transfer). The agency is fixed at `0001`, and the account number is generated randomly.
- **`CheckingAccount` and `SavingsAccount`**: Extensions of the `Account` class, each with specific methods to print statements.
- **`Bank`**: Manages the list of clients and their accounts, allowing for the addition and listing of clients.

### Example Execution

Here’s an example of how the system can be used:

```plaintext
Enter the client's name: 
John Doe
Client added: John Doe

Choose an operation:
1 - Deposit into Checking Account
2 - Withdraw from Checking Account
3 - Transfer from Checking to Savings Account
4 - Print Checking Account Statement
5 - Print Savings Account Statement
6 - Check Checking Account Balance
7 - List Clients
8 - Exit
```

### Operation Details

1. **Deposit into Checking Account**: Prompts the user for a value and adds it to the checking account balance.
2. **Withdraw from Checking Account**: Prompts the user for a value and attempts to perform the withdrawal. If the balance is insufficient, an exception is thrown, and a message is displayed.
3. **Transfer from Checking to Savings Account**: Prompts for a value and transfers it to the savings account, validating the balance.
4. **Print Statement**: Displays information such as account holder, agency, account number, and balance.
5. **Check Balance**: Shows the current balance of the checking account.
6. **List Clients**: Displays all registered clients in the bank.

## Conclusion

This project aims to enhance programming and system design skills, serving as a foundation for future implementations and learning. Feel free to contribute or expand the functionalities!
