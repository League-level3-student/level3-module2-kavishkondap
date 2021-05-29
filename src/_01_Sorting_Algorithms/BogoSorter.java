package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
        for (int i = 0; i < array.length-1; i++) {
			if (array [i] > array [i+1]) {
				counter ++;
			}
		}
        if (counter == 0) {
        	isSorted = true;
        }else {
        	counter = 0;
        }
        if (!isSorted) {
        	int ind1 = (int) (Math.random() * array.length) + 1;
        	int ind2 = (int) (Math.random() * array.length) + 1;
        	int temp = array [ind1];
        	array [ind1] = array [ind2];
        	array [ind2] = temp;
        }
        }
    }
}
