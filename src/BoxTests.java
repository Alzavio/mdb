import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoxTests {
    Box box = new Box(5,2,6);

    @Test
    public void testAddItem() {
        String[] items = new String[10];
        items[0] = "test";

        assertArrayEquals(
            items,
            box.addItem("test")
        );
    }

    @Test
    public void testRemoveItem() {
        String[] items = new String[10];
        assertArrayEquals(
            items,
            box.removeItem("test")
        );
    }

    @Test
    public void testVolume() {
        assertEquals(60, box.volume(), 0.0001);
    }
}
