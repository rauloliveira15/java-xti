package br.com.xti.poo;

public class Matematica {

    /**
     *
     * @param um
     * @param dois
     * @return o maior entre dois numeros
     */
    int maior(int um, int dois){
        if (um > dois){
            return um;
        } else if (dois > um){
            return dois;
        }
     return 0;

    }

    double soma(double um, double dois){
        return um + dois;
    }

    int raiz(int numero){
        int cont = 0;
        int fim = numero;
        for(int i = 1; i < fim; i++){
            if(!(i % 2 == 0)){
                numero -= i;
                cont++;
            }
            if(numero < i) break;
        }
        return cont;
    }
}
