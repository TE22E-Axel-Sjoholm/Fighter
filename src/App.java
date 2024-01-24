import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static int scene; 
    public static void main(String[] args) throws Exception {
        
        variabler();
        if(scene == 1){
            startmeny();
        }
        if(scene == 2){
            instmeny();
        }
    }

    static void variabler(){
        int livS = 10;
        int livF = 10;
        int skada1;
        int skada2;
        scene = 1;
        int difficulty;
    }
    static void startmeny(){
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
            scene = 1;
        }
    }
    static void instmeny(){
        System.out.println(" - - - - - Fighter - - - - - ");
        System.out.println(" - - - - - - - - - - - - - - ");
        System.out.println(" - - - - 1. Normal - - - - - ");
        System.out.println(" - - - - - 2. Svår - - - - - ");
        System.out.println(" - - - - 3. Avsluta - - - - -");
        System.out.println(" - - - - - - - - - - - - - - ");
    }
    
}


