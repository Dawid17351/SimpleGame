import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = false;
        int numberOfGuesses = 1;
        Random random = new Random();
        int number = random.nextInt(10);
        try{
            while(!result)
            {
                System.out.println("Wprowadź liczbę z zakresu 0-10: ");
                int guess = Integer.parseInt(reader.readLine());
                if(guess == number) {
                    System.out.println("Znalazłeś szukaną liczbę!!!");
                    result = true;
                }else if (guess > number) {
                    System.out.println("Podałeś większą liczbę.");
                    result = false;
                    numberOfGuesses++;
                }else if (guess < number){
                    System.out.println("Podałeś mniejszą liczbę.");
                    result = false;
                    numberOfGuesses++;
                }
            }
            System.out.println("Zgadłeś za " + numberOfGuesses + " razem.");

        }catch(NumberFormatException e){
            System.out.println("Upps podałeś jakiś innych znak. W grze można korzystać tylko z cyfr.");
        }
    }
}
