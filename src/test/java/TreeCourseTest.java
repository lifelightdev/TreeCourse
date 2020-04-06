import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeCourseTest {

    @Test
    public void givenABinaryTree__WhenAddingElements__ThenTreeContainsThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }
}
