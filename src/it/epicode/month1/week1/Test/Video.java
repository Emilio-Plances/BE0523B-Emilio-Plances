package it.epicode.month1.week1.Test;

public class Video extends MediaElement implements IPlay,IVolume,IGamma{
    private int volume;
    private int gamma;
    public Video(String title,int volume,int gamma){
        super(title);
        this.volume=volume;
        this.gamma=gamma;
    }
    @Override
    public void play() {
        for(int i=0;i<duration;i++){
            System.out.print(title);
            for (int k=0;k<volume;k++){
                System.out.print("!");
            }
            for(int k=0;k<gamma;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    @Override
    public String setVolume(int volume) {
        if(volume<0) return "This value isn't valid";
        this.volume = volume;
        return "Volume has been set to " + this.volume;
    }
    @Override
    public String increaseVolume() {
        volume++;
        return "Volume has been increased to " + volume;
    }
    @Override
    public String decreaseVolume() {
        if(volume==0) return "Can't decrease volume";
        volume--;
        return "Volume has been decreased to " + volume;
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
