import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTest {

    @Test
    public void testFilterOut() {

        // arrange
       final Filter filter = new Filter(5);
       final List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.toList());

       final List<Integer> expended = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        // act
       final List<Integer> actual = filter.filterOut(list);

        // assert
       Assert.assertEquals(expended, actual);

    }
}