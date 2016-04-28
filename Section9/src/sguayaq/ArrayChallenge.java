package sguayaq;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
	
	public ArrayChallenge(){
		
	}
	
	private static Scanner scanner = new Scanner(System.in);
	
	public int[] getIntegers(int size){
		
		int[] inputValues = new int[size];
		for(int i=0; i<inputValues.length; i++){
			inputValues[i] = scanner.nextInt();
		}
		
		return inputValues;
	}
	
	public void printArray(int[] intArray){
		
		for(int i=0; i<intArray.length; i++){
			System.out.println("Element at "+i+" is "+intArray[i]);
		}
	}
	
	public int[] sortIntegers(int[] intArray){

		int[] sortedInt = new int[intArray.length];
		for(int i=0;i<intArray.length;i++){
			sortedInt[i]=intArray[i];
		}
		
		//int[] sortedInt = Arrays.copyOf(intArray, intArray.length);
		
		boolean flag = true;
		int temp;
		
		while(flag){
			flag = false;
			for(int i =0; i<intArray.length-1;i++){
				if(sortedInt[i]<sortedInt[i+1]){
					temp = sortedInt[i];
					sortedInt[i] = sortedInt[i+1];
					sortedInt[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedInt;
	}
	
	
}
