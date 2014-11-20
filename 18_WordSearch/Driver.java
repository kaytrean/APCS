public class Driver{
    public static void main(String[] args){
	WordSearch ws = new WordSearch();
	ws.addWordV1("hello", 2, 1);
	ws.addWordH1("hello", 13, 10);
	ws.addWordH1("hello", 2, 9);
	ws.addWordH2("hello", 3, 20);
	ws.addWordH2("hello", 15, 15);
	ws.addWordH2("hello", 14, 15);
	System.out.println(ws.toString());
    }
}