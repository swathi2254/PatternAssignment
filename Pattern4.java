package ineuron.assignments.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n=14;
		
		for(int i=0;i<=n;i++) {
			for(int j= 0; j<=n;j++) {
				if(i-j >= (n/2)-1 || i+j >= n+(n/2)-1)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
