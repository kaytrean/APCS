public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean illegalOverlap(String d, String w, int row, int col){
	boolean result=false;
	int c = col;
	int r = row;
	if (d.equals("right")){
	    for (int i=0;i<w.length();i++){
		if(!(board[row][c]=='.' || board[row][c]==w.charAt(i))){
		    result=true;
		}
	        c++;
	    }
	}
	else if (d.equals("left")){
	    for (int i=0;i<w.length();i++){
		if(!(board[row][c]=='.' || board[row][c]==w.charAt(i))){
		    result=true;
		}
	        c--;
	    }
	}
	else if (d.equals("down")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][col]=='.' || board[r][col]==w.charAt(i))){
		    result=true;
		}
		r++;
	    }
	}
	else if (d.equals("up")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][col]=='.' || board[r][col]==w.charAt(i))){
		    result=true;
		}
		r--;
	    }
	}
	else if (d.equals("southwest")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    result=true;
		}
		r++;
		c--;
	    }
	}
	return result;
    }
     public void addWordH(String d, String w, int row,int col){
	int c = col;
	if (row>=board.length){
	    row=board.length-1;
	}
	else if(row<0){
	    row=0;
	}
	if (d.equals("right")){
	    if (c<0){
		c=0;
	    }
	    if ((w.length()+c)>board[0].length){
		c=board[0].length-w.length();
	    }
	    if (illegalOverlap(d, w, row, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for (int i=0;i< w.length();i++){
		board[row][c]=w.charAt(i);
		c++;
	    }
	}
	else{
	    if(c>board[0].length){
		c=board[0].length-1;
	    }
	    if (c-(w.length())<0){
		c=w.length()-1;
	    }
	    if (illegalOverlap(d, w, row, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for (int i=0;i< w.length();i++){
		board[row][c]=w.charAt(i);
		c--;
	    }
		
	}
     }
     
      public void addWordV(String d, String w, int row, int col){
	int r = row;
	if (col>board[0].length){
	    col=board[0].length-1;
	}
	else if(col<0){
	    col=0;
	}
	if (d.equals("down")){
	    if(r<0){
		r=0;
	    }
	    if((w.length()+r)>board.length){
		r=board.length-w.length();
	    }
	    if (illegalOverlap(d, w, r, col)){
		System.out.println("Cannot overlap at row"+r+" column"+col+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][col]=w.charAt(i);
		r++;
	    }
	}
	else {
	    if(r>=board.length){
		r=board.length-1;
	    }
	    if((r-w.length())<0){
		r=w.length()-1;
	    }
	    if (illegalOverlap(d, w, r, col)){
		System.out.println("Cannot overlap at row"+r+" column"+col+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][col]=w.charAt(i);
		r--;
	    }
	}
    }
    
     public void addWordD(String d, String w, int row, int col){
	int r=row;
	int c=col;
	if (c>board[0].length){
	    c=board[0].length-1;
	}
	else if(col<0){
	    c=0;
	}
	if (r>=board.length){
	    r=board.length-1;
	}
	else if(r<0){
	    r=0;
	}
	if (d.equals("southwest")){
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r++;
		c--;
	    }
	}
	if (d.equals("southeast")){
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r++;
		c++;
	    }
	}
	if (d.equals("northeast")){
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r--;
		c++;
	    }
	}
	if (d.equals("northwest")){
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r--;
		c--;
	    }
	}
     }
}
    
