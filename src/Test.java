package src;


public class Test {
	public static void main(String args[]) {
		
		// Q2: String immutable
		String product = new String("Pen");
		product.toLowerCase();
		System.out.println(product);
		String a = product.concat(" BOX".toLowerCase());
		System.out.println(a);
		//System.out.print(product.substring(4, 6));
	}
}