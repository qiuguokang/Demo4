package com.qiu.demo;

public class Demo4 {
	public void arr1(){
		int[] arr = {12,98,76,54,30};
		
		for(int i = 0;i<arr.length/2;i++){
			int etmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-1-i] = etmp ;
		}	
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
