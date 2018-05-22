import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    private Tree tree;

    @BeforeEach
    void setup(){
        this.tree = new Tree();
    }

    @Test
    void findValueInRoot(){
        this.tree.buildTree(new ArrayList<>(Arrays.asList(1, 9, 0, 8, 0, 4)));
        assertTrue(this.tree.findValue(1));
    }

    @Test
    void findValueInTheMiddle(){
        this.tree.buildTree(new ArrayList<>(Arrays.asList(0, 9, 3, 9, 4)));
        assertTrue(this.tree.findValue(4));
    }

    @Test
    void findValueAtTheEnd(){
        this.tree.buildTree(new LinkedList<>(Arrays.asList(1, 2, 9, 0, 5)));
        assertTrue(this.tree.findValue(5));
    }

    @Test
    void testIfValueIsNotInTree(){
        this.tree.buildTree(new LinkedList<>(Arrays.asList(0, 9, 7, 5, 6)));
        assertFalse(this.tree.findValue(102));
    }

    @Test
    void testIfSizeIsCorrectWhenValuesDoNotRepeat(){
        this.tree.buildTree(new ArrayList<>(Arrays.asList(0, 1, 4, 5)));
        assertEquals(4, this.tree.getSize());
    }

    @Test
    void testIfSizeIsCorrectWhenValuesRepeat(){
        this.tree.buildTree(new ArrayList<>(Arrays.asList(0, 0, 0, 0)));
        assertEquals(1, this.tree.getSize());
    }


}