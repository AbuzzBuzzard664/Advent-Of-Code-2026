import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input;
            IDay day = null;
            
            do {
                System.out.print("What day would you like to run (1..12): ");
                input = sc.nextLine();
                day = switch (input) {
                    case "1"  -> new Day1();
                    case "2"  -> new Day2();
                    case "3"  -> new Day3();
                    case "4"  -> new Day4();
                    case "5"  -> new Day5();
                    case "6"  -> new Day6();
                    case "7"  -> new Day7();
                    case "8"  -> new Day8();
                    case "9"  -> new Day9();
                    case "10" -> new Day10();
                    case "11" -> new Day11();
                    case "12" -> new Day12();
                    default -> null;
                };
            } while (day == null);
            
            System.out.println("Day " + input);
            day.run();
        }
    }
}
