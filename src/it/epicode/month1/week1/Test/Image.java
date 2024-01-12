package it.epicode.month1.week1.Test;

public class Image extends MediaElement implements IGamma{
    private int gamma;
    public Image(String title,int gamma) {
        super(title);
        this.gamma=gamma;
    }

    public void show(){
        System.out.print(title);
        for(int i=0;i<gamma;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    @Override
    public String setGamma(int gamma) {
        if(gamma<0) return "This value isn't valid";
        this.gamma = gamma;
        return "Gamma has been set to " + this.gamma;
    }
    @Override
    public String increaseGamma() {
        gamma++;
        return "Gamma has been increased to " + gamma;
    }
    @Override
    public String decreaseGamma() {
        if(gamma==0) return "Can't decrease gamma";
        gamma--;
        return "Gamma has been decreased to " + gamma;
    }
}
