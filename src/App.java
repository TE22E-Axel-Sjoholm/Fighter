import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static int scene = 1; 
    static int livS = 10;
    static int livF = 10;
    static boolean igång = true;
    static boolean fight = false;

    public static void main(String[] args) throws Exception {
        while(igång){
        if(scene == 1){
            startmeny();
        } else if(scene == 2){
            instmeny();
        } else if(scene == 3){
            fight = true;
        }
    }
    }
    static void startmeny(){
        for(int i = 0; i < 20;i++){
            System.out.println(" ");
        }
        System.out.println(" - - - - - Fighter - - - - - ");
        System.out.println(" - - - - - - - - - - - - - - ");
        System.out.println(" - - - - 1. Starta - - - - - ");
        System.out.println(" - - - 2. Iställningar - - - ");
        System.out.println(" - - - - 3. Avsluta - - - - -");
        System.out.println(" - - - - - - - - - - - - - - ");
        String userInput = input.nextLine();
        if(userInput.equals("1")){
            scene = 3;
        } else if(userInput.equals("2")){
            scene = 2;
        } else if(userInput.equals("3")){
            igång = false;
        }
    }
    static void instmeny(){
        for(int i = 0; i < 20;i++){
            System.out.println(" ");
        }
        System.out.println(" - - - - - Fighter - - - - - ");
        System.out.println(" - - - - - - - - - - - - - - ");
        System.out.println(" - - - - - 1. lätt - - - - - ");
        System.out.println(" - - - - 2. Normal - - - - - ");
        System.out.println(" - - - - - 3. Svår - - - - - ");
        System.out.println(" - - - -  4. back - - - - - -");
        System.out.println(" - - - - - - - - - - - - - - ");
        String userInput = input.nextLine();
        if(userInput.equals("1")){
            livF = 5;
            scene = 1;
        } else if(userInput.equals("2")){
            livF = 10;
            scene = 1;
        } else if(userInput.equals("3")){
            livF = 15;
            scene = 1;
        } else if(userInput.equals("4")){
            scene = 1;
        }
    }
}


