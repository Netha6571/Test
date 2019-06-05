package com.word.test.numbertoword;

/**
 * Hello world!
 *
 */
public class NumberToWordConverter {

	  private String convertLessThanOneThousand(int number) {
	        String current;

	        if (number % 100 < 20) {
	            current = NumberToWordConstants.singleAndTwoDig[number % 100];
	            number /= 100;
	        } else {
	            current = NumberToWordConstants.singleAndTwoDig[number % 10];
	            number /= 10;

	            current = NumberToWordConstants.tenDig[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0)
	            return current;
	        return NumberToWordConstants.singleAndTwoDig[number] + " hundred and " + current;
	    }

	    public String convert(int number) {

	        if (number == 0) {
	            return "zero";
	        }

	        String prefix = "";

	        if (number < 0) {
	            number = -number;
	            prefix = "negative";
	        }

	        StringBuilder current = new StringBuilder();
	        int place = 0;

	        do {
	            int n = number % 1000;
	            if (n != 0) {
	                String s = convertLessThanOneThousand(n);
	                current.insert(0, s + NumberToWordConstants.specialDig[place]);
	            }
	            place++;
	            number /= 1000;
	        } while (number > 0);

	        return (prefix + current).trim();
	    }


}
