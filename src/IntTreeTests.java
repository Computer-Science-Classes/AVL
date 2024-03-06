import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntTreeTests {

    private IntTree newTree(int... values) {
        IntTree tree = new IntTree();
        for(int data : values) {
            tree.addValue(data);
        }
        return tree;
    }

    @Test
    public void test_bstTree() {
        IntTree tree = newTree(1,2,3,4,5,6);
        String expected = 
        "[1]               \n" +
        "   \\              \n" +
        "   [2]            \n" +
        "      \\           \n" +
        "      [3]         \n" +
        "         \\        \n" +
        "         [4]      \n" +
        "            \\     \n" +
        "            [5]   \n" +
        "               \\  \n" +
        "               [6]\n" +
        "                  \n";
        String output = tree.toPrettyPrint();
        System.out.println(output);
        assertEquals(expected, output);
    }

    @Test
    public void test_AVLTree() {
        IntTree tree = newTree(4, 2, 1, 10, 3, 7, 11, 12, 5, 9);
        // String expected = 
        // "[1]               \n" +
        // "   \\              \n" +
        // "   [2]            \n" +
        // "      \\           \n" +
        // "      [3]         \n" +
        // "         \\        \n" +
        // "         [4]      \n" +
        // "            \\     \n" +
        // "            [5]   \n" +
        // "               \\  \n" +
        // "               [6]\n" +
        // "                  \n";
        String output = tree.toPrettyPrint();
        System.out.println(output);
        tree.addAVLValue(8);
        System.out.println(tree.toPrettyPrint());
        //assertEquals(expected, output);
    }

    
    private IntTree newAVLTree(int... values) {
        IntTree tree = new IntTree();
        for(int data : values) {
            tree.addAVLValue(data);
        }
        return tree;
    }

    @Test
    public void test_AVL_LL_Rotation() {
        IntTree tree = newAVLTree(3, 2, 1);
        String expected = 
        "   [2]   \n" +
        "  /   \\  \n" +
        "[1]   [3] \n";
        String output = tree.toPrettyPrint();
        assertEquals(expected, output);
    }

    @Test
    public void test_AVL_RR_Rotation() {
        IntTree tree = newAVLTree(1, 2, 3);
        String expected = 
        "   [2]   \n" +
        "  /   \\  \n" +
        "[1]   [3] \n";
        String output = tree.toPrettyPrint();
        assertEquals(expected, output);
    }

    @Test
    public void test_AVL_LR_Rotation() {
        IntTree tree = newAVLTree(3, 1, 2);
        String expected = 
        "   [2]   \n" +
        "  /   \\  \n" +
        "[1]   [3] \n";
        String output = tree.toPrettyPrint();
        assertEquals(expected, output);
    }

    @Test
    public void test_AVL_RL_Rotation() {
        IntTree tree = newAVLTree(1, 3, 2);
        String expected = 
        "   [2]    \n" +
        "  /   \\  \n" +
        "[1]   [3] \n";
        String output = tree.toPrettyPrint();
        assertEquals(expected, output);
    }
}
