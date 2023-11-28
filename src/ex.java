import java.util.Comparator;
import java.util.stream.Stream;

public class ex {
    public static void main(String[] args) {
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));
// before distinct: 0
// after distinct: 0
// after map: 0
// before distinct: 3
// after distinct: 3
// after map: 9
// before distinct: 1
// after distinct: 1
// after map: 1
// before distinct: 5
// before distinct: 0
// before distinct: 5
// after distinct: 5
// after map: 25

    }
}
