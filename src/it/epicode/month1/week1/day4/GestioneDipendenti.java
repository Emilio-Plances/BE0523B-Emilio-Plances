package it.epicode.month1.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 =new Dipendente("AHUJHIHJG",Dipartimento.PRODUZIONE);
        Dipendente dipendente2 =new Dipendente("NUIGNJFGY",Dipartimento.PRODUZIONE);
        Dipendente dipendente3 =new Dipendente("FNSDJOHFS",Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente4 =new Dipendente("PDKMWIUHS",Dipartimento.VENDITE);

        System.out.println(dipendente3.promozione()+"\n");
        System.out.println(dipendente3.promozione()+"\n");


        System.out.println(dipendente1 +"\n");
        System.out.println(dipendente2 +"\n");
        System.out.println(dipendente3 +"\n");
        System.out.println(dipendente4 +"\n");

        System.out.println(sommaPaga(dipendente1, dipendente2, dipendente3, dipendente4));
    }

    public static double sommaPaga(Dipendente...operai){
        double totale=0;
        for(Dipendente i : operai){
            totale+= Dipendente.calcolaPaga(i);
        }
        return totale;
    }
}
