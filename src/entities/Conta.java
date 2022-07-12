package entities;

import utils.Utils;

public class Conta {
    private static int countConta = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroConta = countConta;
        this.pessoa = pessoa;
        countConta += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String toString(){
        return "\nNumero da Conta: " + getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(getSaldo()) +
                "\n";
    }

    public void depositar(Double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Seu deposito foi realizado com sucesso!");
        }
        else {
            System.out.println("Nao foi possivel realizar o deposito!");
        }
    }

    public void sacar(Double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }

    public void transferir(Conta contaParaDeposito, Double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            contaParaDeposito.saldo += valor;
            System.out.println("Transferencia realizada com sucesso!");
        }
        else {
            System.out.println("Nao foi possivel realizar a transferencia!");
        }
    }
}
