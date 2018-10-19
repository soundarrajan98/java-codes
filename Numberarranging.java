package com.programs;

public class Numberarranging {

	public static void main(String[] args) {
		int n=6;
		int n1=n/2;
		int c=1;
		for(int i=0;i<n1;i++) {
			if(i==0) {
			for(int j=0;j<n;j++) {
			System.out.print(c);
			if(j!=(n-1)) {
			System.out.print("*");
			}
			c++;
			}
		}
			else {
				c=n+c;
				for(int x=0;x<n;x++) {
					System.out.print(c);
					if(x!=(n-1)) {
						System.out.print("*");
					}
					c++;
				}
			}
			System.out.println();
		}
		for(int a=0;a<n1;a++) {
			if(a==0) {
				for(int b=0;b<n;b++) {
					System.out.print(c);
					if(b!=(n-1)) {
						System.out.print("*");
					}
					c++;
				}
			}
			else {
				c=c-(3*n);
				for(int y=0;y<n;y++) {
					System.out.print(c);
					if(y!=(n-1)) {
						System.out.print("*");
					}
					c++;
				}
			}
			System.out.println();
		}

	}

}
