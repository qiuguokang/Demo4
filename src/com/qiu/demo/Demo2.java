package com.qiu.demo;

import java.util.Arrays;

/**
 * ��������
 * 1)�Ӵ�С
 * 2)��С����
 */
public class Demo2 {
/**
 * �Ӵ�С����
 */
	public void arrInt(){
		/**
		 * ����һ������
		 */
		int[] arr1 = {10,29,39,57,2,16,28,17};
		/**
		 * ����forѭ����if����������
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
 * ��С��������
 */
	public void arrInt1(){
		/**
		 * ����һ������
		 */
		int[] arr1 = {10,29,39,57,2,16,28,17};
		/**
		 * ����forѭ����if����������
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

