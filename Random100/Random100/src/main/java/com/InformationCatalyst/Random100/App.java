package com.InformationCatalyst.Random100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

	public class App {
		
		private static final Logger logger = LoggerFactory.getLogger(App.class);

		public static void main(String[] args) {
			int[] randomNum = new int[110];
			
			Random ran = new Random();
	    	int q = 0;
	    	int j =0;

			for(int i = 0; i <= 100; i++) {
	    		int answer = ran.nextInt(100) + 1;
						randomNum[i] = answer;
						int element = randomNum[q];
						q++;
						String numberAsString = String.valueOf(element);
				         logger.info(j +" = "+ numberAsString);
				         j++;
			}
			
		 }
	}