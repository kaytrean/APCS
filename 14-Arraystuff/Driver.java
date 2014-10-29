public class Driver {
    public static void main(String[] args) {
	Arrays A1 = new Arrays();
	System.out.println(A1);
	int x = A1.find(120);
	System.out.println("120 is at index " + x);
	int y = A1.maxVal();
	System.out.println("the maximum value is " + y);
	String z = A1.freqString(3);
	System.out.println(z);
    }
}
