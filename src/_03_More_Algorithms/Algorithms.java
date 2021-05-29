package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i++) {
        	if (eggs.get(i).equals("cracked")) {
        		return i;
        	}
        }
        return -1;
    }
    public static int countPearls (List <Boolean> pearls) {
    	int count = 0;
    	for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i)) {
				count ++;
			}
		}
    	 return count;
    }
    public static double findTallest (List <Double> heights) {
    	double height = heights.get(0);
    	for (int i = 1; i < heights.size(); i++) {
			if (heights.get (i) > height) {
				height = heights.get(i);
			}
		}
    	return height;
    }
    public static String findLongestWord (List <String> words) {
    	int index = 0;
    	for (int i = 1; i < words.size (); i++) {
    		if (words.get(i).length() > words.get(index).length()) {
    			index = i;
    		}
    	}
    	return words.get(index);
    }
    public static boolean containsSOS (List <String> morse) {
    	for (int i = 0; i < morse.size(); i++) {
    		if (morse.get(i).equals("... --- ...")) {
    			return true;
    		}
    	}
    	return false;
    }
    public static List <Double> sortScores(List <Double> scores){
    	for (int i = 0; i < scores.size()-1; i++) {
    		int index = i;
    		for (int k = i+1; k < scores.size() -1; i++) {
    			if (scores.get(index) > scores.get(k)) {
    				index = k;
    			}
    		}
    		if (scores.get(i) > scores.get(index)) {
    			double temp = scores.get(i);
    			scores.set(i, scores.get(index));
    			scores.set(index, temp);
    		}
    	}
    	return scores;
    }
    public static List <String> sortDNA (List <String> dna){
    	for (int i = 0; i < dna.size(); i++) {
    		int index = i;
    		for (int j = i+1; j < dna.size(); j++) {
				if (dna.get(index).length() > dna.get(j).length()) {
					index = j;
				}
			}
    		String temp = dna.get(i);
    		dna.set(i, dna.get(index));
    		dna.set(index, temp);
    	}
    	return dna;
    }
    public static List <String> sortWords (List <String> words){
    	for (int i = 0; i < words.size(); i++) {
    		int index = i;
    		for (int j = i+1; j < words.size(); j++) {
				if (words.get(index).compareTo(words.get(j)) > 0) {
					index = j;
				}
			}
    		String temp = words.get(i);
    		words.set(i, words.get(index));
    		words.set(index, temp);
    	}
    	return words;
    }
    public static boolean isPrime (int num) {
    	for (int i = 2; i <= Math.sqrt(num); i++) {
    		if (num % i ==0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean isSquare (int num) {
    	return Math.sqrt(num) == (int)Math.sqrt(num);
    }
    public static boolean isCube (int num) {
    	return Math.cbrt(num) == (int)Math.cbrt(num);
    }
}
