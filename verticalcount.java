package com.programs;

import java.util.Scanner;

public class verticalcount {

	public static void main(String[] args) {
		/*int i=5;
		int j=4;
		int arr[][]= {
				{1,0,1,1},
				{1,0,0,1},
				{0,1,1,1},
				{1,0,0,0},
				{1,1,1,1},
		};*/
		int i=5;
		int j=6;
		int arr[][]= {
				{0,0,1,1,0,1},
				{0,0,1,0,0,1},
				{0,1,1,1,0,0},
				{0,1,0,0,1,1},
				{0,0,0,0,0,1},
		};
		int flag=0;
		int count=0;
		for(int x=0;x<j;x++) {
			flag=0;
			for(int y=0;y<i;y++) {
				if(arr[y][x]==1) {
					flag++;
				}
				if(arr[y][x]==0) {
					if(flag>=2) {
						count++;
					}
					flag=0;
				}
			}
			if(flag>=2) {
				count++;
			}
		}
		System.out.println(count);
	}

}
