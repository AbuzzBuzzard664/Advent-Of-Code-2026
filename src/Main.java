import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.function.Supplier;

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

            System.out.print("Use sample input? (y/N): ");
            boolean useSample = sc.nextLine().trim().equalsIgnoreCase("y");
            
            // Matches your existing "./inputs/input1.txt" naming convention
            String fileName = useSample 
                    ? "inputs/sample" + input + ".txt" 
                    : "inputs/input" + input + ".txt";

            final IDay selectedDay = day;

            try {
                String fileInput = Files.readString(Path.of(fileName));
                System.out.println("\n=== Day " + input + (useSample ? " [SAMPLE]" : " [REAL]") + " ===");

                runPart("Part 1", () -> selectedDay.part_1(fileInput));
                runPart("Part 2", () -> selectedDay.part_2(fileInput));

            } catch (IOException e) {
                System.err.println("Missing input file: " + Path.of(fileName).toAbsolutePath());
            }
        }
    }

    private static void runPart(String label, Supplier<Number> part) {
        try {
            long start = System.nanoTime();
            Number result = part.get();
            double ms = (System.nanoTime() - start) / 1_000_000.0;
            System.out.printf("%s: %s (%.2f ms)%n", label, result, ms);
        } catch (UnsupportedOperationException e) {
            System.out.println(label + ": not implemented yet");
        }
    }
}