#Triangle pattern
public class Trianglepattern {

	public static void main(String[] args) {
		int n=2;
		String s="ask happy word letter king rose sent";
		String str[]=s.split(" ");
		int x=0;
		int j=0;
		for(int i=0;x<str.length;i++) {
			for(j=0;j<=i;j++) {
				if(x<str.length) {
					String s1=str[x];
					x++;
					String s2=s1.substring(s1.length()-n,s1.length());
					System.out.print(s2+" ");
				}
				else {
					x++;
					for(int k=0;k<n;k++) {
					System.out.print("*");
					}
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
