package com.programs;

public class Trapezium {

	public static void main(String[] args) {
		int n=2;
		int count=1;
		int flag=n*n+1;
		for(int i=n;i>0;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" "+" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(count+"*");
				count++;
			}
			for(int x=0;x<i;x++) {
				System.out.print(flag);
				flag++;
			if(x<i-1) {
				System.out.print("*");
			}
			}
			flag=flag-(2*(i-1))-1;
			System.out.println();
		}
	}

}
