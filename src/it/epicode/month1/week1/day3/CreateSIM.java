package it.epicode.month1.week1.day3;

public class CreateSIM {
    public static void main(String[] args) {
        SIM sim1=new SIM();

        sim1.addCredit(5);
        System.out.println(sim1.getInfo());

        sim1.call("1111111",30);
        sim1.call("2222222",100);
        sim1.call("3333333",145);
        sim1.call("4444444",180);

        System.out.println(sim1.getInfo());
    }
}
