package racional;

import aleatorio.*;

public class NumeroRacional {

    private int numerador, denominador;

    public NumeroRacional() throws Exception {
        this(NumeroAleatorio.getAleatorio(), NumeroAleatorio.getAleatorio()+1);
    }

    public NumeroRacional(int numerador, int denominador) throws Exception {
        if(denominador==0)
            throw new Exception("Não dividirás por zero!");
        this.denominador = denominador;
        this.numerador = numerador;
        simplificar();
    }

    private int getMDC(int numerador, int denominador) {
        int menor = numerador < denominador ? numerador:denominador;
        int mdc = 1;
        for(int i=1; i<=menor; i++) {
            if((numerador%i==0) && (denominador%i==0))
                mdc=i;
        }
        return mdc;
    }

    private void simplificar() {
        int mdc = getMDC(this.numerador, this.denominador);
        this.numerador /= mdc;
        this.denominador /= mdc;
    }

    public void soma(NumeroRacional numeroRacional) {
        int _numerador = this.numerador * numeroRacional.denominador + numeroRacional.numerador * this.denominador;
        int _denominador = this.denominador * numeroRacional.denominador;
        this.numerador = _numerador;
        this.denominador = _denominador;
        simplificar();
    }

    public String getString() {
        return this.numerador + "/" + this.denominador;
    }
}