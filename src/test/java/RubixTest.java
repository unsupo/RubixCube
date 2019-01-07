import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class RubixTest {

    @Test public void testEachMoveTogether(){
        Rubix r = new Rubix();
        for(char c : new char[]{'r','L','U','D','F','b','r','l','u','d'})
            r = r.rotate(c);
        assertTrue(Arrays.deepEquals(new int[][]{
                {26,23,20,27,14,21,28,25,22},
                {66,63,60,31,24,57,18,15,12},
                {36,33,30,67,34,11,50,53,56},
                {16,13,10,51,44,37,68,65,62},
                {52,55,58,61,54,17,38,35,32},
                {42,45,48,41,64,47,40,43,46}
        },r.spots));
    }

    @Test public void testIsCubeSolved(){
        assertTrue(new Rubix().isSolved());
        assertFalse(new Rubix().rotate('R').isSolved());
    }

    /**
     * Fundamental Test of the 12 moves that can be made
     * If the below all work then everything should work
     */
    @Test public void testRight(){
        char v = 'R';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,32,13,14,35,16,17,38},
                {20,21,22,23,24,25,26,27,28},
                {30,31,62,33,34,65,36,37,68},
                {46,43,40,47,44,41,48,45,42},
                {18,51,52,15,54,55,12,57,58},
                {60,61,56,63,64,53,66,67,50}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testRightInverse(){
        char v = 'r';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,56,13,14,53,16,17,50},
                {20,21,22,23,24,25,26,27,28},
                {30,31,12,33,34,15,36,37,18},
                {42,45,48,41,44,47,40,43,46},
                {68,51,52,65,54,55,62,57,58},
                {60,61,32,63,64,35,66,67,38}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testLeft(){
        char v = 'l';
        assertTrue(Arrays.deepEquals(new int[][]{
                {30,11,12,33,14,15,36,17,18},
                {22,25,28,21,24,27,20,23,26},
                {60,31,32,63,34,35,66,37,38},
                {40,41,42,43,44,45,46,47,48},
                {50,51,16,53,54,13,56,57,10},
                {58,61,62,55,64,65,52,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testLeftInverse(){
        char v = 'L';
        assertTrue(Arrays.deepEquals(new int[][]{
                {58,11,12,55,14,15,52,17,18},
                {26,23,20,27,24,21,28,25,22},
                {10,31,32,13,34,35,16,37,38},
                {40,41,42,43,44,45,46,47,48},
                {50,51,66,53,54,63,56,57,60},
                {30,61,62,33,64,65,36,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testUp(){
        char v = 'U';
        assertTrue(Arrays.deepEquals(new int[][]{
                {16,13,10,17,14,11,18,15,12},
                {30,31,32,23,24,25,26,27,28},
                {40,41,42,33,34,35,36,37,38},
                {50,51,52,43,44,45,46,47,48},
                {20,21,22,53,54,55,56,57,58},
                {60,61,62,63,64,65,66,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }

    @Test public void testUpInverse(){
        char v = 'u';
        assertTrue(Arrays.deepEquals(new int[][]{
                {12,15,18,11,14,17,10,13,16},
                {50,51,52,23,24,25,26,27,28},
                {20,21,22,33,34,35,36,37,38},
                {30,31,32,43,44,45,46,47,48},
                {40,41,42,53,54,55,56,57,58},
                {60,61,62,63,64,65,66,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testDown(){
        char v = 'D';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,12,13,14,15,16,17,18},
                {20,21,22,23,24,25,56,57,58},
                {30,31,32,33,34,35,26,27,28},
                {40,41,42,43,44,45,36,37,38},
                {50,51,52,53,54,55,46,47,48},
                {66,63,60,67,64,61,68,65,62}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testDownInverse(){
        char v = 'd';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,12,13,14,15,16,17,18},
                {20,21,22,23,24,25,36,37,38},
                {30,31,32,33,34,35,46,47,48},
                {40,41,42,43,44,45,56,57,58},
                {50,51,52,53,54,55,26,27,28},
                {62,65,68,61,64,67,60,63,66}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testFront(){
        char v = 'F';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,12,13,14,15,28,25,22},
                {20,21,60,23,24,61,26,27,62},
                {36,33,30,37,34,31,38,35,32},
                {16,41,42,17,44,45,18,47,48},
                {50,51,52,53,54,55,56,57,58},
                {46,43,40,63,64,65,66,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testFrontInverse(){
        char v = 'f';
        assertTrue(Arrays.deepEquals(new int[][]{
                {10,11,12,13,14,15,40,43,46},
                {20,21,18,23,24,17,26,27,16},
                {32,35,38,31,34,37,30,33,36},
                {62,41,42,61,44,45,60,47,48},
                {50,51,52,53,54,55,56,57,58},
                {22,25,28,63,64,65,66,67,68}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testBack(){
        char v = 'B';
        assertTrue(Arrays.deepEquals(new int[][]{
                {42,45,48,13,14,15,16,17,18},
                {12,21,22,11,24,25,10,27,28},
                {30,31,32,33,34,35,36,37,38},
                {40,41,68,43,44,67,46,47,66},
                {56,53,50,57,54,51,58,55,52},
                {60,61,62,63,64,65,20,23,26}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
    @Test public void testBackInverse(){
        char v = 'b';
        assertTrue(Arrays.deepEquals(new int[][]{
                {26,23,20,13,14,15,16,17,18},
                {66,21,22,67,24,25,68,27,28},
                {30,31,32,33,34,35,36,37,38},
                {40,41,10,43,44,11,46,47,12},
                {52,55,58,51,54,57,50,53,56},
                {60,61,62,63,64,65,48,45,42}
        },new Rubix().rotate(v).spots));
        // test that 4 of the same move in a row results in a solved rubix cube
        assertTrue(new Rubix().rotate(v).rotate(v).rotate(v).rotate(v).isSolved());
    }
}
