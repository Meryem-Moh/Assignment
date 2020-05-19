package com.utils.stats;




public class StatsApp {

		
	
		 
	 public static void testMean(int[] array) {
		 double arrayMean = 3.0;
		 
		 if (Stats.calculateMean(array) ==arrayMean ) {
			 System.out.println("Passes");
		 }
			 else
				 System.out.println("Failed");
			 
		 }
	 
	public static void testMedian(int[] array) {
		 int testMedian = 2;
		 if(testMedian == Stats.calculateMedian(array)) {
			 System.out.println("Passes");
			
		 }else {
			 System.out.println("Failed");
		 }
		
	}
	
	
	public static void testMode(int[] array) {
		int testMode = 1;
		if (testMode == Stats.calculateMode(array)) {
			System.out.println("Passes");
		}
		else {
			
			System.out.println("Failed");
		}
	}
	
	
	public static void testRange(int[] array) {
		
		int testRange = 2;
		if (testRange == Stats.calculateRange(array)) {
			System.out.println("Passes");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1,1,2,3,};

		testMean(array);
		
		testMedian(array);
		
		testMode(array);
		
		testRange(array);
	
		 
		 
		 
		 
	}

}
