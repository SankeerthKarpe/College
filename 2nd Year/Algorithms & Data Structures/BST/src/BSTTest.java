import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

//-------------------------------------------------------------------------

/**
 *  Test class for Doubly Linked List
 *
 *  @version 3.1 09/11/15 11:32:15
 *
 *  @author Sankeerth Karpe
 */

@RunWith(JUnit4.class)
public class BSTTest {
	
	//TODO write more tests here.
	/** <p>Test {@link BST#prettyPrintKeys()}.</p> */

    @Test
    public void testPut(){
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.delete(1);
        assertEquals("Height of empty tree", -1, bst.height());

        bst.put(7, 7);
        bst.put(7, null);

        assertTrue("Set element to null so delete", bst.isEmpty());

        bst.put(8, 8);   //    /     \
        bst.put(3, 3);   //   3       8
        
        BST<Integer, Integer> bst2 = new BST<Integer, Integer>();
        bst2.put(1,5);
        bst2.put(3,null);
        bst2.put(5, 10);
        assertEquals("Testing put using get","5", bst2.get(1).toString());
        bst2.put(2,2);
        bst2.put(4,4);
        bst2.put(5,5);
        assertEquals("(()1((()2(()4()))5()))", bst2.printKeysInOrder().toString());
                
                BST<Integer, Integer> bst_1 = new BST<Integer, Integer>();

                bst_1.put(7, 7);
                bst_1.put(8, 8);
                bst_1.put(3, 3);
                bst_1.put(1, 1);
                bst_1.put(2, 2);
                bst_1.put(6, 6);
                bst_1.put(4, 4);
                bst_1.put(5, 5);
                assertEquals("(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst_1.printKeysInOrder());
                
                bst_1.put(7, 7);
                assertEquals("(((()1(()2()))3((()4(()5()))6()))7(()8()))",bst_1.printKeysInOrder());
                
                bst_1.put(7, 17);
                assertEquals((Object) 17, bst_1.get(7));

    }

    /** <p>Test {@link BST#height()}.</p> */
    @Test
    public void testHeight() {
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.delete(1);
        assertEquals("Height of empty tree", -1, bst.height());

        bst.put(7, 7);   //        _7_
        assertEquals("height of one node", 0, bst.height());

        bst.put(8, 8);   //      /     \
        bst.put(3, 3);   //    _3_      8
        bst.put(1, 1);   //  /     \
        bst.put(2, 2);   // 1       6
        bst.put(6, 6);   //  \     /
        bst.put(4, 4);   //   2   4
        bst.put(5, 5);   //        \
        				 //         5

        assertEquals("Checking height of constructed tree",
                4, bst.height());
    }

    /** <p>Test {@link BST#median()}.</p> */
    @Test
    public void testMedian() {
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.delete(1);
        assertNull("Median of empty tree", bst.median());

        assertNull("Median of null", null);

        bst.put(7, 7);   //        _7_
        bst.put(8, 8);   //      /     \
        bst.put(3, 3);   //    _3_      8
        bst.put(1, 1);   //  /     \
        bst.put(2, 2);   // 1       6
        bst.put(6, 6);   //  \     /
        bst.put(4, 4);   //   2   4
        bst.put(5, 5);   //        \
        				 //         5

        assertEquals("Checking median of constructed tree",
                1, bst.median().compareTo(1));
    }

    @Test
    public void testPrintKeysInOrder(){
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.put(7, 7);   //        _7_
        assertEquals("Checking order of constructed tree",
                "(()7())", bst.printKeysInOrder());
    }

    /** <p>Test {@link BST#prettyPrintKeys()}.</p> */

    @Test
    public void testPrettyPrint() {
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        assertEquals("Checking pretty printing of empty tree",
                "-null\n", bst.prettyPrintKeys());

        					 //  -7
        					 //   |-3
        					 //   | |-1
        					 //   | | |-null
        bst.put(7, 7);       //   | |  -2
        bst.put(8, 8);       //   | |   |-null
        bst.put(3, 3);       //   | |    -null
        bst.put(1, 1);       //   |  -6
        bst.put(2, 2);       //   |   |-4
        bst.put(6, 6);       //   |   | |-null
        bst.put(4, 4);       //   |   |  -5
        bst.put(5, 5);       //   |   |   |-null
        					 //   |   |    -null
        					 //   |    -null
        					 //    -8
        					 //     |-null
        					 //      -null

        String result = 
        "-7\n" +
        " |-3\n" +
        " | |-1\n" +
        " | | |-null\n" +
        " | |  -2\n" +
        " | |   |-null\n" +
        " | |    -null\n" +
        " |  -6\n" +
        " |   |-4\n" +
        " |   | |-null\n" +
        " |   |  -5\n" +
        " |   |   |-null\n" +
        " |   |    -null\n" +
        " |    -null\n" +
        "  -8\n" +
        "   |-null\n" +
        "    -null\n";
        String gotten = bst.prettyPrintKeys();
        assertEquals("Checking pretty printing of non-empty tree", result, gotten);
    }

    /** <p>Test {@link BST#delete(Comparable)}.</p> */
    @Test
    public void testDelete() {
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.delete(1);
        assertEquals("Deleting from empty tree", "()", bst.printKeysInOrder());

        bst.delete(null);

        bst.put(7, 7);   //        _7_
        bst.put(8, 8);   //      /     \
        bst.put(3, 3);   //    _3_      8
        bst.put(1, 1);   //  /     \
        bst.put(2, 2);   // 1       6
        bst.put(6, 6);   //  \     /
        bst.put(4, 4);   //   2   4
        bst.put(5, 5);   //        \
        				 //         5

        assertEquals("Checking order of constructed tree",
                "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder());

        bst.delete(9);
        assertEquals("Deleting non-existent key",
                "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder());

        bst.delete(8);
        assertEquals("Deleting leaf", "(((()1(()2()))3((()4(()5()))6()))7())", bst.printKeysInOrder());

        bst.delete(6);
        assertEquals("Deleting node with single child",
                "(((()1(()2()))3(()4(()5())))7())", bst.printKeysInOrder());

        bst.delete(3);
        assertEquals("Deleting node with two children",
                "(((()1())2(()4(()5())))7())", bst.printKeysInOrder());
    }
}