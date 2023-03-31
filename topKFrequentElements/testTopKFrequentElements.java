package topKFrequentElements;
import org.junit.Test;
import static org.junit.Assert.*;

public class testTopKFrequentElements {

    @Test
    public void sanityOneElementTest() {
        assertArrayEquals(new int[]{1}, Solution.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void fourElementTest() {
        assertArrayEquals(new int[]{3}, Solution.topKFrequent(new int[]{1, 2, 3, 3}, 1));
    }

    @Test
    public void sixElementTestTwoFrequent() {
        assertArrayEquals(new int[]{3, 4}, Solution.topKFrequent(new int[]{1, 2, 4, 3, 4, 3}, 2));
    }
}
