public class triangle {
    public String triangle1(int s){
	String triange = "";
	int h = s;
	int w = 1;
	int it = 1;
	while (h > 0){
	    while (it > 0){
		triangle = triangle + "*";
		it = it - 1;
	    }
	    w = w + 1;
	    it = w;
	    triangle = triangle + "\n";
	    h = h -1;
	}
	return triangle;
    }

    public String triangle2(int s){
	String triangle = "";
	int h = s;
	int w = 1;
	int it = 1;
	int q = s;
	while (h > 0) {
	    while (q > it){
		triangle = triangle + " "
		    q= q-1
		    }
	    while (it > 0){
		triangle = triangle + "*";
		it = it-1;
	    }
	    w = w + 1;
	    it = w;
	    triangle = triangle + "\n";
	    q = s;
	    h = h-1;
	}
	return triangle;
    }

    public String triangle3(int s){
	String triangle= "";
	int row=0;
	while(row < s){
	    int star= (2 * row) + 1;
	    int n = s-row-1;
	    while(n>=0){
		triangle= triangle + " ";
		n= n-1;
	    }
	    while (star>0){
		triangle= triangle+"*";
		star= star - 1;
	    }
	    triangle= triangle + "\n";
	    row = row + 1;
	}
	return triangle;
    }

    public String diamond(int s){
	String diamond= "";
	diamond = diamond + triangle3(s/2);
	for (int x=0;x<h;x+=1){
	    diamond+="*";
	}
	diamond = diamond + "\n";
    }

	
		