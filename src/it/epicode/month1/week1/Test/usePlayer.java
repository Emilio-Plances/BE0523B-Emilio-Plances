package it.epicode.month1.week1.Test;

import java.util.Scanner;
public class usePlayer {
    public static void main(String[] args) {
        MediaElement[] mediaArray=new MediaElement[5];

        for(int i=0; i<mediaArray.length; i++){
            mediaArray[i]=createMedia(i);
        }

        controllerPlayer(mediaArray);
    }

    private static MediaElement createMedia(int i){
        MediaType type;
        Scanner scanner=new Scanner(System.in);
        String title;
        int gamma,volume;

        System.out.println(++i+".");
        System.out.println("What kind of media do you want?");
        type= MediaType.valueOf(scanner.nextLine().toLowerCase());

        System.out.println("Enter a title");
        title=scanner.nextLine();

        switch(type){
            case music:
                volume=volumeData(scanner);
                return new Music(title,volume);
            case image:
                gamma=gammaData(scanner);
                return new Image(title,gamma);
            default:
                volume=volumeData(scanner);
                gamma=gammaData(scanner);
                return new Video(title,volume,gamma);
        }
    }
    private static int volumeData(Scanner scanner){
        int num;
        while(true){
            System.out.println("Enter volume");
            num= scanner.nextInt();
            if(num>=0) break;
            System.out.println("Not a valid number");
        }
        return num;
    }
    private static int gammaData(Scanner scanner){
        int num;
        while(true){
            System.out.println("Enter gamma");
            num= scanner.nextInt();
            if(num>=0) break;
            System.out.println("Not a valid number");
        }
        return num;
    }

    public static void controllerPlayer(MediaElement[] mediaArray){
        Scanner scanner=new Scanner(System.in);
        int input;
        do{
            System.out.println("Select a media:");
            printArray(mediaArray);
            input=scanner.nextInt();
            if(input!=0){
                control(input,mediaArray);
            }

            if(input>5){
                System.out.println("Enter a valid value");
            }
        }while(input!=0);
    }
    private static void printArray(MediaElement[] mediaArray){
        int index=1;
        for(MediaElement i : mediaArray){
            System.out.println(index+"."+i.title);
            index++;
        }
        System.out.println("0.Quit");
    }
    private static void control(int input, MediaElement[] mediaArray){
        MediaElement selected=mediaArray[input-1];
        System.out.println("You selected: "+selected.title);
        if(selected instanceof Music music){
            musicMode(music);
        }
        if (selected instanceof Video video){
            videoMode(video);
        }
        if (selected instanceof Image image){
            imageMode(image);
        }
    }

    private static void musicMode(Music music){
        int input,volume;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Select:\n1.Play\n2.Set volume\n3.Increase volume\n4.Decrease volume\n0.Quit");
            input=scanner.nextInt();

            if(input==0) break;

            switch(input){
                case 1:
                    music.play();
                    break;
                case 2:
                    volume=volumeData(scanner);
                    System.out.println(music.setVolume(volume));
                    break;
                case 3:
                    System.out.println(music.increaseVolume());
                    break;
                case 4:
                    System.out.println(music.decreaseVolume());
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
    }

    private static void videoMode(Video video){
        int input,volume,gamma;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Select:\n1.Play\n2.Set volume\n3.Increase volume\n4.Decrease volume\n" +
                    "5.Set gamma\n6.Increase gamma\n7.Decrease gamma\n0.Quit");
            input=scanner.nextInt();

            if(input==0) break;

            switch(input){
                case 1:
                    video.play();
                    break;
                case 2:
                    volume=volumeData(scanner);
                    System.out.println(video.setVolume(volume));
                    break;
                case 3:
                    System.out.println(video.increaseVolume());
                    break;
                case 4:
                    System.out.println(video.decreaseVolume());
                    break;
                case 5:
                    gamma=gammaData(scanner);
                    System.out.println(video.setGamma(gamma));
                    break;
                case 6:
                    System.out.println(video.increaseGamma());
                    break;
                case 7:
                    System.out.println(video.decreaseGamma());
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
    }

    private static void imageMode(Image image){
        int input,gamma;
        Scanner scanner=new Scanner(System.in);

        while(true) {
            System.out.println("Select:\n1.Show\n2.Set gamma\n3.Increase gamma\n4.Decrease gamma\n0.Quit");
            input = scanner.nextInt();

            if (input == 0) break;
            switch (input) {
                case 1:
                    image.show();
                    break;
                case 2:
                    gamma = gammaData(scanner);
                    System.out.println(image.setGamma(gamma));
                    break;
                case 3:
                    System.out.println(image.increaseGamma());
                    break;
                case 4:
                    System.out.println(image.decreaseGamma());
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
    }
}
