package com.qiu.demo;

import java.util.Arrays;

/**
 * 数组排序
 * 1)从大到小
 * 2)从小到大
 */
public class Demo2 {
/**
 * 从大到小排序
 */
	public void arrInt(){
		/**
		 * 定义一个数组
		 */
		int[] arr1 = {10,29,39,57,2,16,28,17};
		/**
		 * 利用for循环加if语句进行排序
		 */
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr1[i]>arr1[j]){
					int temp =arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
/**
 * 从小到大排序
 */
	public void arrInt1(){
		/**
		 * 定义一个数组
		 */
		int[] arr1 = {10,29,39,57,2,16,28,17};
		/**
		 * 利用for循环加if语句进行排序
		 */
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr1[i]<arr1[j]){
					int temp =arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
	
}

