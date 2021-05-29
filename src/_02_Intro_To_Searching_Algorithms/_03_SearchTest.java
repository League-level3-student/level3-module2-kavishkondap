package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String [] arr = {"food", "more food", "FOOD", "fOoD"};
        assertEquals(0, _01_LinearSearch.linearSearch(arr, "food"));
        String [] arr2 = {"a", "b", "c", "d", "e"};
        assertEquals (2, _01_LinearSearch.linearSearch(arr2, "c"));
        String [] arr3 =  {"In the array", "Still in the array", "even this is in the array"};
        assertEquals (-1, _01_LinearSearch.linearSearch(arr3, "not in the array"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int [] arr = {1, 2, 3, 4, 5, 5, 5, 6, 6, 8, 9, 9, 10};
        assertEquals(3, _02_BinarySearch.binarySearch(arr, 0, 9, 4));
        int [] arr2 = {1, 2, 3, 4, 5, 21, 199999, 222222222};
        assertEquals(6, _02_BinarySearch.binarySearch(arr2, 0, 7, 199999));
        int [] arr3 = {1, 2, 3, 4, 10};
        assertEquals(-1, _02_BinarySearch.binarySearch(arr3, 0, 3, 1010101));
    }
}
