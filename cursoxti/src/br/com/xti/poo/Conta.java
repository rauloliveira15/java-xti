package br.com.xti.poo;

public class Conta {

    String cliente;
    double saldo;

    void exibeSaldo(){
        System.out.println(cliente + " seu saldo é: " + saldo);
    }

    void saca(double valor){
        this.saldo -= valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
}
