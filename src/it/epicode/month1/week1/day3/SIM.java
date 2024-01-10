package it.epicode.month1.week1.day3;

public class SIM {
    private String number;
    private double credit;
    private double cost;
    private String[] lastCalls;
    public SIM(){
        credit=0;
        cost=0.10;
        lastCalls = new String[5];
        number= "3270779083";
    }

    public String getInfo(){
        StringBuilder chiamate= new StringBuilder();
        for(int i=0;i< lastCalls.length;i++){
            chiamate.append(i+1).append(".").append(lastCalls[i]).append("\n");
        }
        return "Numero:"+getNumber()+"\nCredito:"+getCredit()+"€\nRecenti:\n"+chiamate;
    }
    public double getCredit() {
        return credit;
    }

    public double getCost() {
        return cost;
    }

    public String getNumber() {
        return number;
    }

    public void addCredit(double num){
        credit+=num;
    }

    public void removeCredit(double num){
        credit-=num;
    }

    public void call(String num,int time){
        double costoChiamata=cost*(time/60);
        removeCredit(costoChiamata);
        if(getCredit()<0){
            addCredit(costoChiamata);
            System.out.println("Chiamata non effettuata");
            return;
        }
        addToCallHistory(num,time);
    }

    private void addToCallHistory(String num, int time){
        String tempo=(time/60)+":"+(time-(time/60*60));
        String call="Numero:"+num+" Durata:"+tempo;

        for(int i=lastCalls.length-1;i>0;i--){
            lastCalls[i]=lastCalls[i-1];
        }
        lastCalls[0]=call;
    }
}
