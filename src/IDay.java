import java.util.List;

public interface IDay {
    Number part_1(String input);
    Number part_2(String input);

    default List<String> get_lines(String input) {
        return input.lines().toList();
    }
}