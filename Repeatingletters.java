package com.programs;

public class Repeatingletters {

	public static void main(String[] args) {
		String input1="aabccbhhhh";
		int input2=2;
		int count=0;
		String str="";
		char c[]=input1.toCharArray();
		int j=0;
		for(int i=j;j<c.length;i++) {
			count=0;
			char ch=c[j];
			for(j=j;j<c.length;j++) {
				if(c[j]==ch) {
					count++;
				}
				else {
					break;
				}
			}
			if(count>=input2) {
				str=str+String.valueOf(ch);
			}
		}
		System.out.println(str);

	}

}
