package it.epicode.month1.week1.day3;

public class Rettangolo{
    private int base;
    private int h;
    private double p;
    private double a;
    public Rettangolo(int base,int h){
        this.base=base;
        this.h=h;
        this.p=(this.base+this.h)*2;
        this.a=this.base*this.h;
    }

    public double getPerimetro() {
        return p;
    }

    public double getArea() {
        return a;
    }

    public static String stampaPerArea(Rettangolo rett1,Rettangolo rett2){
        double p1=rett1.p;
        double p2=rett2.p;
        double a1=rett1.a;
        double a2=rett2.a;
        return "P1="+p1 +"cm A1="+a1+"cm^2\nP2="+p2+"cm A2="
                +a2+"cm^2\nP1+P2="+(p1+p2)+"cm\nA1+A2="+(a1+a2)+"cm^2";
    }
}
