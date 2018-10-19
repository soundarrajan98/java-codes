import java.util.Arrays;
import java.util.Scanner;
public class spiral {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a=0;
		int b=0;
		int arr[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int inc=1;
		int inc1=1;
		int len=size*2-1;
		for(int x=1;x<=len;x++) {
			if(x%2==0) {
				if(inc%2==1) {
				for(int q=0;q<size;q++) {
					System.out.print(arr[a][b]+" ");
					a++;
				}
				a--;
				b--;
				}
				if(inc%2==0) {
					for(int q=0;q<size;q++) {
						System.out.print(arr[a][b]+" ");
						a--;
					}
					a++;
					b++;
				}
				inc++;
			}
			if(x%2==1) {
				if(inc1%2==1) {
				for(int p=0;p<size;p++) {
					System.out.print(arr[a][b]+" ");
					b++;
				}
				a++;
				b--;
				}
				if(inc1%2==0) {
					for(int p=0;p<size;p++) {
						System.out.print(arr[a][b]+" ");
						b--;
					}
					a--;
					b++;
					}
				size--;
				inc1++;
			}
		}	
  }
}
