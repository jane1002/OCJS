package src;


public class Test {
	public static void main(String args[]) {
		
		// Q2: String immutable
		String product = new String("Pen");
		product.toLowerCase();
		//System.out.println(product);
		String a = product.concat(" BOX".toLowerCase());
		//System.out.println(a);
		//System.out.print(product.substring(4, 6));

		/*
		Q.26
		 */
		int[] arr = {1, 2, 3};

		for(int var: arr) {
			int i = 1;

			while(i<=var) {
				System.out.println(i++);
			}
		}

		/*
		Q. 39
		 */
		char m;
		boolean am;
		System.out.println(m);
	}
}