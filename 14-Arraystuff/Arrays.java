import java.util.*;

public class Arrays {

    private int[] a;
    private Random rnd;
    public final int final_example = 123;
    
    public Arrays(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arrays() {
	this(100);
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n) {
	int x;
	for (x=0;x<a.length;x=x+1) {
	    if (n == a[x]) {
		return x;
	    }
	}
	return -1;
    }

    public int maxVal() {
	int x;
	int y = 0;
	for (x=0;x<a.length;x=x+1) {
	    if ( y < a[x] ) {
		y = a[x];
	    }
	}
	return y;
    }

    public int freq( int i ) {
	int count = 0;
	for (int x = 0;x<a.length;x=x+1) {
	    if ( a[x] == a[i] ) {
		count = count + 1;
	    }
	}
	return count;
    }

    public String freqString( int i ) {
	int count = 0;
	for (int x = 0;x<a.length;x=x+1) {
	    if ( a[x] == a[i] ) {
		count = count + 1;
	    }
	}
	String string = a[i] + " occurs " + count + " times";
	return string;
    }

}
