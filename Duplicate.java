package com.programs;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {2,2,2,3,3,5,6,3,2,2,3};
		int size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i;j<size-1;j++) {
				if(arr[i]==arr[j+1]) {
					for(int k=j;k<size-2;k++) {
						arr[k+1]=arr[k+2];
					}
					size--;
					j--;
				}
			}
		}
		for(int x=0;x<size;x++) {
			System.out.print(arr[x]+" ");
		}
	}

}
