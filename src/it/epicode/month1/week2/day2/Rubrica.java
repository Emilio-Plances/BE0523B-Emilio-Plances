package it.epicode.month1.week2.day2;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private static final HashMap<String, String> rubrica=new HashMap<>();
    public static void main(String[] args) {

        aggiungi("Emilio","3270779083");
        aggiungi("Mauro","3278880001");
        aggiungi("Emanuele","3279926375");

        stampaTutto();
        String nomeCercato="Emilio";
        System.out.println("Il numero di "+nomeCercato+ " è "+cercaPerNome("Emilio"));

        rimuovi("Mauro");
        String cercaNumero="3270779083";
        System.out.println("Il numero "+cercaNumero+" appartiene a "+cercaPerNumero("3270779083"));
        stampaTutto();
    }

    private static void aggiungi(String nome,String numero){
        rubrica.put(nome,numero);
    }
    private static void rimuovi(String nome){
        rubrica.remove(nome);
    }
    private static String cercaPerNumero(String numero){
        Set<String> chiavi=rubrica.keySet();
        for(String c:chiavi){
            if(rubrica.get(c).equals(numero)) return c;
        }
        return "nessuno";
    }
    private static String cercaPerNome(String nome){
        return rubrica.get(nome);
    }
    private static void stampaTutto(){
        Set<String> chiavi=rubrica.keySet();
        for(String c:chiavi){
            System.out.println(c+": "+rubrica.get(c));
        }
    }
}
