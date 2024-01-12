package it.epicode.month1.week1.Test;

public class Music extends MediaElement implements IPlay,IVolume {
    private int volume;

    public Music(String title,int volume){
        super(title);
        this.volume=volume;
    }
    @Override
    public void play() {
        for (int i=0;i<duration;i++){
            System.out.print(title);
            for(int k=0;k<volume;k++){
                System.out.print("!");
            }
            System.out.print("\n");
        }
    }

    @Override
    public String setVolume(int volume) {
        if(volume<0) return "This value isn't valid";
        this.volume=volume;
        return "Volume has been set to "+this.volume;
    }
    @Override
    public String increaseVolume() {
        volume++;
        return "Volume has been increased to "+volume;
    }
    @Override
    public String decreaseVolume() {
        if(volume==0) return "Can't decrease volume";
        volume--;
        return "Volume has been decreased to "+volume;
    }
}
