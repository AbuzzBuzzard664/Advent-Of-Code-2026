import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        do {
            IDay day;
            System.out.print("What day would you like to run (1..12): ");
            input = sc.nextLine();
            switch (input) {
                case "1": 
                    day = new Day1();
                    day.run(); 
            }    
        } while (input == null);
    }


}
