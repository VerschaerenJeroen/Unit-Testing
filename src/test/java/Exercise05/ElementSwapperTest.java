package Exercise05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ElementSwapperTest {
    ElementSwapper elementSwapper = new ElementSwapper();

    @Test
    void arrayIsNull() {
        Integer[] inputArray = null;
        Integer[] expectedArray = null;
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void emptyArray() {
        Integer[] inputArray = new Integer[0];
        Integer[] expectedArray = new Integer[]{};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWith1Element() {
        Integer[] inputArray = new Integer[]{1};
        Integer[] expectedArray = new Integer[]{1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void outputArrayIsDifferentFromInput() {
        Integer[] inputArray = new Integer[]{1};
        assertNotEquals(inputArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWith2Elements() {
        Integer[] inputArray = new Integer[]{1, 2};
        Integer[] expectedArray = new Integer[]{2, 1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWith3Elements() {
        Integer[] inputArray = new Integer[]{1, 2, 3};
        Integer[] expectedArray = new Integer[]{3, 2, 1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithEqualSmallestElements() {
        Integer[] inputArray = new Integer[]{1, 1, 2};
        //int[] expected1Array = new int[]{2, 1, 1}; ???
        Integer[] expected2Array = new Integer[]{1, 2, 1};
        assertArrayEquals(expected2Array, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithEqualLargestElements() {
        Integer[] inputArray = new Integer[]{1, 2, 2};
        //Integer[] expected1Array = new Integer[]{2, 1, 2}; ???
        Integer[] expected2Array = new Integer[]{2, 2, 1};
        assertArrayEquals(expected2Array, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithNegativeNumbers() {
        Integer[] inputArray = new Integer[]{1, -1, 2};
        Integer[] expectedArray = new Integer[]{1, 2, -1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayContainingNull() {
        Integer[] inputArray = new Integer[]{1, null, 2};
        Integer[] expectedArray = new Integer[]{2, null, 1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithOnlyOneNull() {
        Integer[] inputArray = new Integer[]{null};
        Integer[] expectedArray = new Integer[]{null};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithFirstElementNull() {
        Integer[] inputArray = new Integer[]{null, 1, null, 2};
        Integer[] expectedArray = new Integer[]{null, 2, null, 1};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }

    @Test
    void arrayWithOnlyNulls() {
        Integer[] inputArray = new Integer[]{null, null};
        Integer[] expectedArray = new Integer[]{null, null};
        assertArrayEquals(expectedArray, elementSwapper.swapSmallestAndLargestElement(inputArray));
    }
}