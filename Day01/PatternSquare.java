
// import java.util.Scanner;
public class PatternSquare {
	public static void main(String[] args) {
		// Scanner sc= new Scanner(System.in);
		// System.out.println("Enter the number :");
System.err.println("--------------------");
	int ro = 1;
		
		for(int i= 1; i<=ro; i++) {
			for (int j=1; j<=ro; j++) {
				if(i==1 || i==ro || j ==1|| j==ro ) {
					System.out.print("|__|");
					
				}else {
					System.out.print("|__|");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		int rows = 2;
		
		for(int i= 1; i<=rows; i++) {
			for (int j=1; j<=rows; j++) {
				if(i==1 || i==rows || j ==1|| j==rows ) {
					System.out.print("|__|");
					
				}else {
					System.out.print("|__|");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		int row = 3;
		
		for(int i= 1; i<=row; i++) {
			for (int j=1; j<=row; j++) {
				if(i==1 || i==row || j ==1|| j==row ) {
					System.out.print("|__|");
					
				}else {
					System.out.print("|__|");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		int row1 = 4;
		
		for(int i= 1; i<=row1; i++) {
			for (int j=1; j<=row1; j++) {
				if(i==1 || i==row1 || j ==1|| j==row1 ) {
					System.out.print("|__|");
					
				}else {
					System.out.print("|__|");
				}
			}
			System.out.println();
		}
		
		
	}
}


