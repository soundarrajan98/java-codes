package com.programs;

public class Largestbincount {

	public static void main(String[] args) {
		int n=897;
		int flag=0;
		int rem=n;
		int max=0;
		while(rem>0) {
			int a=rem%2;
			if(a==1) {
				flag++;
			}
			if(a==0) {
				if(flag>max) {
					max=flag;
				}
				flag=0;
			}
			rem=rem/2;
		}
		if(flag>max) {
			max=flag;
		}
		System.out.println(max);
	}

}
