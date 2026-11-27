import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Day9 implements IDay{

    @Override
    public void run() {
        try{
            System.out.println("Part 1: " + part_1());
        } catch (UnsupportedOperationException e) {
            System.out.println("Part 1 not implemented yet");
        }
        try{
            System.out.println("Part 2: " + part_2());
        } catch (UnsupportedOperationException e) {
            System.out.println("Part 2 not implemented yet");
        }
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
            List<String> input = Files.readAllLines(Paths.get("./inputs/input9.txt"));
            return input;
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    
}
