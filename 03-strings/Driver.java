public class Driver {
    public static void main(String[] args){
	String str="kathryn hlynsky";
	int m=str.indexOf(" ");
	String a=str.substring(0,m);
	System.out.println("First name: " + a);
	String b=str.substring(m, str.length());
	System.out.println("Last name:" + b);
    }
}