package it.epicode.month1.week2.day1;

import org.slf4j.LoggerFactory;
import java.util.logging.Logger;

public class ContoOnline extends ContoCorrente{
    double maxPrelievo;
    ContoOnline(String titolare,double saldo,double maxPrelievo){
        super(titolare, saldo);
        this.maxPrelievo=maxPrelievo;
    }
    public String toString() {
        return "ContoOnline{" +
                "titolare='" + titolare + '\'' +
                ", nMovimenti=" + nMovimenti +
                ", maxMovimenti=" + maxMovimenti +
                ", saldo=" + saldo +
                '}';
    }

    void preleva(double x) throws BancaException {
        if(x<=maxPrelievo){
            super.preleva(x);
        }else{
            throw new BancaException("Il prelievo non è disponibile");
        }
    }
}
