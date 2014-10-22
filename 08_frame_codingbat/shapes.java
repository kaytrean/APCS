public class shapes {
    public String frame(int r, int c) {
	String a = "";
	for (int i=0; i<r; i++){
	    for(int x=0; x<c; x++){
		if(i%(r-1)==0 || j%(c-1)==0) s+="*";
		else s+=" ";
	    }
	    s+="\n";
	}
	return a;
    }
    
    public String stringSplosion(String str){
	String a="";
	int b=str.length();
	for (int i=0;i<b;i++){
	    a+=str.substring(0,i+1);
	}
	return a;
    }

    public String stringX(String str){
	int a=str.length()-1;
	if(a<2) return str;
	String b="";
	for(int i=1;i<a;i++){
	    char c= str.charAt(i);
	    if (c! ='x') s+=c;
	}
	return str.charAt(0)+a+str.charAt(1);
    }
}