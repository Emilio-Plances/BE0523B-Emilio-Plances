package it.epicode.month1.week2.day1;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti=50;
    double saldo;

    public ContoCorrente(String titolare,double saldo){
        this.titolare=titolare;
        this.saldo=saldo;
        nMovimenti=0;
    }

    void preleva(double x) throws BancaException {
        if(nMovimenti<maxMovimenti) {
            saldo-=x;
            nMovimenti++;
            if(saldo<0) throw new BancaException("Il conto è in rosso!");
        }
        else saldo-=(x+0.50);
    }

    double restituisciSaldo(){
        return saldo;
    }
}
