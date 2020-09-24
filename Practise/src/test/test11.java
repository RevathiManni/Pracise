package test;

import org.testng.annotations.Test;

public class test11 {
	
	
		
		int A = 3;
		int B = 6;
		@Test
		public void addMethod() {
			int C = A+B;
			System.out.println(C);
		}
				
		
		public static void main() {
			Add a = new Add();
			a.addMethod();
		}

	}


}
