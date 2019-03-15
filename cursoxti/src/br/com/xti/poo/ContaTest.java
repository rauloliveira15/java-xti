package br.com.xti.poo;

public class ContaTest {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.cliente = "Raul de Oliveira";
        conta.saldo = 1200;

        conta.exibeSaldo();

        Conta destino = new Conta();

        destino.cliente = "Caio";
        destino.saldo = 500;

        destino.exibeSaldo();

        conta.transferePara(destino, 700);
        conta.exibeSaldo();
        destino.exibeSaldo();
    }
}
