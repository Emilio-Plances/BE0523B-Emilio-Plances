package it.epicode.month1.week1.day4;

public class Dipendente {
    private double stipendioBase=1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    public Dipendente(String matricola, Dipartimento dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        stipendio=stipendioBase;
        importoOrarioStraordinario=30;
        livello=Livello.OPERAIO;
    }
    public Dipendente(
            double stipendio,
            String matricola,
            double importoOrarioStraordinario,
            Livello livello,
            Dipartimento dipartimento){

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

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setDipartimento(Dipartimento dipartimento) {
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
        if(livello==Livello.DIRIGENTE) return "Non può più salire di grado!";
        if(livello==Livello.QUADRO){
            livello=Livello.DIRIGENTE;
            stipendio=stipendioBase*2;
        }
        if(livello==Livello.IMPIEGATO){
            livello=Livello.QUADRO;
            stipendio=stipendioBase*1.5;
        }
        if(livello==Livello.OPERAIO){
            livello=Livello.IMPIEGATO;
            stipendio=stipendioBase*1.2;
        }
        return "Promozione a "+livello+" effettuata con successo!";
    }

    public static double calcolaPaga(Dipendente op){
        return op.stipendio;
    }
    public static double calcolaPaga(Dipendente op, double straordinari){
        return op.stipendio+(op.importoOrarioStraordinario*straordinari);
    }
}
