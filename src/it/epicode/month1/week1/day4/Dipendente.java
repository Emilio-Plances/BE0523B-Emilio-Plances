package it.epicode.month1.week1.day4;

public class Dipendente {
    private double stipendioBase=1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private String livello;
    private String dipartimento;
    public Dipendente(String matricola, String dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        stipendio=stipendioBase;
        importoOrarioStraordinario=30;
        livello="OPERAIO";
    }
    public Dipendente(
            double stipendio,
            String matricola,
            double importoOrarioStraordinario,
            String livello,
            String dipartimento){

        this.stipendio=stipendio;
        this.matricola=matricola;
        this.importoOrarioStraordinario=importoOrarioStraordinario;
        this.livello=livello;
        this.dipartimento=dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getLivello() {
        return livello;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public String toString(){
        return "Matricola: "+matricola+
               "\nLivello: "+livello+
               "\nDipartimento: "+dipartimento+
               "\nStipendio:"+stipendio+
               "\nStraordinari: "+importoOrarioStraordinario;
    }

    public String promozione(){
        if(livello.equals("DIRIGENTE")) return "Non può più salire di grado!";
        if(livello.equals("QUADRO")){
            livello="DIRIGENTE";
            stipendio=stipendioBase*2;
        }
        if(livello.equals("IMPIEGATO")){
            livello="QUADRO";
            stipendio=stipendioBase*1.5;
        }
        if(livello.equals("OPERAIO")){
            livello="IMPIEGATO";
            stipendio=stipendioBase*1.2;
        }
        return "Promozione a "+livello.toLowerCase()+" effettuata con successo!";
    }

    public static double calcolaPaga(Dipendente op){
        return op.stipendio;
    }
    public static double calcolaPaga(Dipendente op, double straordinari){
        return op.stipendio+(op.importoOrarioStraordinario*straordinari);
    }
}
