package it.epicode.month1.week2.day1;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Banca {
    private static final Logger logger= LoggerFactory.getLogger(Banca.class);
    public static void main(String[] args) {

        ContoCorrente conto1=new ContoCorrente("Grossi Mario", 20000);
        System.out.println("Saldo conto: "+conto1.restituisciSaldo());

        try{
            conto1.preleva(21750.5);
            System.out.println("Saldo conto: "+conto1.restituisciSaldo());
        }catch(BancaException e){
            System.out.println("Errore durante il prelievo"+e);
            e.printStackTrace();
            logger.error("Errore durante il prelievo");
        }

        ContoOnline conto2= new ContoOnline("Rossi Luigi",50350,1500);
        System.out.println(conto2);

        try{
            conto2.preleva(2000);
            System.out.println(conto2);
        }catch(BancaException e){
            System.out.println("Errore durante il prelievo "+e);
            e.printStackTrace();
            logger.error("Errore durante il prelievo");

        }

    }
}
