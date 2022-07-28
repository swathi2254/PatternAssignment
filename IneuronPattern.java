package ineuron.assignments.patterns;

public class IneuronPattern {

	public static void main(String[] args) {
int n =9;
		
		for(int i=0;i<n;i++) { //i
			for(int j=0;j<n;j++) {
				if(j==(n-1)/2  && i != 1) 
					System.out.print("* ");
					else System.out.print("  ");

			}
			System.out.print("  ");
			for(int j=0;j<n;j++) { //n
				if(j==0 || j == n-1 || i == j ) 
					System.out.print("* ");
					else System.out.print("  ");

			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) { //e
				if(i == 0  && j != 0 && j !=n-1  || i ==1 && i!= n-1   ||  i == n-1 ||  j ==0 && i != 0  )
					System.out.print("* ");
					else System.out.print("  ");

			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) { //u
				if(j==0 && i!= n-1  || i == n-1 && j !=0  && j!=n-1  || j == n-1 && i!=n-1) 
					System.out.print("* ");
					else System.out.print("  ");

			}
			System.out.print("  ");
			for(int j=0;j<n;j++) { //r
				if(j== (n-1)/2  ||  j == ((n-1)/2)+1  && i == 0) 
					System.out.print("* ");
					else System.out.print("  ");

			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) { //0  j==0 && i!=0 && i !=1 && i != n-2 || i ==0 || i== n-1|| j==n-1 && i !=1 && i != n-2 || j>1 && j<n-2 && i !=1 && i != n-2
				if(i!=0 && j==0 && i != n-1 || i!=0 && j==n-1 && i != n-1 || i == 0 && j!=0 && j!=n-1 || i == n-1 && j!=0 && j!=n-1 ) 
					System.out.print("* ");
					else System.out.print("  ");

			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( j==0 || j == n-1 && i >0 || i ==0  && j!=1 && j !=n-1 || i ==1 && j ==1) 
					System.out.print("* ");
					else System.out.print("  ");
	
			}
					
			System.out.println();
		}
		

	}

}
