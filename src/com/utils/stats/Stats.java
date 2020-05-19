package com.utils.stats;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Meryem Mohammed
 */

public  class Stats {
	
	//instance variables
	static double mean;
	static int mode;
	static int median;
	static int range;
	
	//static int array[] ;
	
	public Stats () {
		
	}
	
	//Mean
	public static double getMean() {
		return mean;
	}

	public static void setMean(double mean) {
		Stats.mean = mean;
	}

	public static int getMode() {
		return mode;
	}

	public static void setMode(int mode) {
		Stats.mode = mode;
	}

	public static int getMedian() {
		return median;
	}

	public static void setMedian(int median) {
		Stats.median = median;
	}

	public static int getRange() {
		return range;
	}

	public static void setRange(int range) {
		Stats.range = range;
	}



	public static double calculateMean( int array[] ) {
		
		int total = 0;
		for (int i= 0; i<array.length; i++) {
			total+= array[i];	
			double avg = total/array.length;
			mean = avg;
		}
	
		return mean;
	}

	public static int calculateMedian(int[] array) {
		Arrays.sort(array);
		int size = array.length;
		
		if (size % 2 == 0) {
			for (int i =0; i< array.length; i++) {
				int x =size/2;
			median =array[x];
			}
	
		}
		else {
		
			for (int i =0; i< array.length; i++) {
				int x =size/2;
			int	middle =( array[x] + array[x+1] /2) ;
			median = array[middle];
			
			}	

		}
		return median;
	}
	
	public static  int findMax(int[] array) {
		int max = array[0];
		for(int i = 0; i< array.length; i++) {
			if (array[i]> max) {
			max= array[i];
		}
		}
		return max;
		
	}
	
	public  static int findMin(int[] array) {
		int min = 0;
		for(int i=0; i< array.length; i++) {
			if (array[i]< min) {
				min =array[i];
			}
		}
			
	return min;
	}
	
	
	public static int calculateRange(int[] array) {
		int range = ( findMax(array)-findMin(array) );
	
		return range;
	}
	

	
	public static int calculateMode( int[] array)
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer> ();
		int max = 1;
		int temp = 0;
		int count;
		 for(int i = 0; i <array.length; i++) {
			 if (hmap.get(array[i]) != null) { 
				  count = hmap.get(array[i]);
				 count++;
				 hmap.put(array[i], count);
				 
				 if (count>max) {
					 max = count;
					 temp = array[i];
				 }
				 
			 }
			 else 
				 hmap.put(array[i],1);
		 }
		return temp;
	}
	














}
