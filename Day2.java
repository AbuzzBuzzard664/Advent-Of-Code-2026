import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Day2 implements IDay{

    @Override
    public void run() {
        System.out.println("Part 1: " + part_1());
        System.out.println("Part 2: " + part_2());
    }

    @Override
    public Number part_1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Number part_2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<String> get_input() {
        try {
            List<String> input = Files.readAllLines(Paths.get("./inputs/input2.txt"));
            return input;
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    
}
