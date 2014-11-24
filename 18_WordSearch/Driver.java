public class Driver{
    public static void main(String[] args){
	WordSearch ws = new WordSearch();
	ws.addWordH("right","hello",4,3);
	ws.addWordV("up", "wowe",12,2);
	ws.addWordD("southeast","karma",1,2);
	ws.addWordH("right","mocasins",18,2);
	ws.addWordV("up","baby",14,2);
	ws.addWordD("northeast","spork",5,5);
	ws.addWordH("left","poke",1,5);
	ws.addWordV("down","smash",45,23);
	ws.addWordD("northwest","quest",10,2);
	ws.addWordH("left","nah",13,12);
	ws.addWordV("down","woot",20,29);
	ws.addWordD("southwest","maybe",4,21);
	System.out.println(ws);
    }
}
