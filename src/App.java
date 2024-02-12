import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static Random Random = new Random();
    static int scene = 1; 
    static int livS = 10;
    static int livF = 10;
    static boolean igång = true;
    static boolean tur = true;
    static int Score[];
    static int strengthF;
    static int strengthS;
    static int damage1;
    static int damage2;
    static int highScore = 0;
    public static void main(String[] args) throws Exception {
        Score = new int[100];
        while(igång){
        if(scene == 1){
            startmeny();
        } else if(scene == 2){
            instmeny();
        } else if(scene == 3){
            spel();
        } 
    }
    }
    static void startmeny(){
        for(int i = 0; i < 20;i++){
            System.out.println(" ");
        }
        score();
        System.out.println(" - - - - - Fighter - - - - - ");
        System.out.println(" - - - - - - "+highScore+" - - - - - - - ");
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
    static void spel(){
        int e = 0;
        while(livF > 0 && livS > 0){
            System.out.println("Tryck enter för att slå din motsåndare!");
            input.nextLine();
            strengthS = Random.nextInt(5) + 1;
            strengthF = Random.nextInt(5) + 1;
            if(strengthS <= strengthF && tur){
                System.out.println("Du slog inte hårt nog");
                tur = false;
            } else if(strengthS > strengthF && tur){
                damage1 = strengthS - strengthF;
                Score[e] =+ damage1;
                System.out.println("Du slog hårt nog och gjorde "+damage1+" skada!");
                livF -= damage1;
                System.out.println("Du har nu "+livS+" HP och din fiende har "+livF+" HP");
                tur = false;
            }
            int strengthF2 = Random.nextInt(5) + 1;
            int strengthS2 = Random.nextInt(5) + 1;
            if(strengthS2 >= strengthF2 && tur == false){
                System.out.println("fienden slog inte hårt nog");
                tur = true;
            } else if(strengthS2 < strengthF2 && tur == false){
                damage2 = strengthF2 - strengthS2;
                System.out.println("fienden slog hårt nog och gjorde "+damage2+" skada!");
                livS -= damage2;
                System.out.println("Du har nu "+livS+" HP och din fiende har "+livF+" HP");
                tur = true;
            }
        }
        e++;
        score();
        if(livF>livS){
            System.out.println("Fienden har vunnit");
            livF = 10;
            livS = 10;
            scene = 1;
        } else if(livS>livF){
            System.out.println("Spelaren har vunnit");
            livS = 10;
            livF = 10;
            scene = 1;
        }
        
    }
        static void score() {
            int largest = Score[0];
            for (int i = 1; i < 10; i++) {
                if (Score[i] > largest) {
                    largest = Score[i];
                }
            }
            highScore = largest;
        }
    }