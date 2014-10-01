//stringBits - 7 minutes
public String stringBits(String str) {
    string f = "";
    int n = 0;
    while (n < str.length()) {
	a = a+str.charTa(n);
	n=n+2;
    }
    return f;
}

//frontTimes - 10 minutes
public String frontTimes(String str, int n) {
    String a = "";
    if (str.length() > 3) {
	a = str.substring(0,3);
    }
    else {
	a= str;
    }
    int i = 0;
    String f = "";
    while (i < n) {
	f = f + a;
	i = i + 1;
    }
    return answer;
}

//StringMatch - 20 minutes
public int stringMatch(String a, String b) {
    int n=0;
    int x=0;
    if (a.length()<b.length()) {
	while (n<a.length() -1) {
		String f1= a.substring(n,n+2);
		String f2= b.substring(n,n+2);
		if (f1.equals(f2)) {
		    x= x+1;
		}
		n = n+1;
	    }
    }
    else {
	while (n<b.length()-1) {
	    String f1= a.substring(n,n+2);
	    String f2= b.substring(n,n+2);
	    if (f1.equals(f2)) {
		x= x+1;
	    }
	    n = n+1;
	}
    }
	return x;
}
	    
//stringYak - 5 minutes
public String stringYak(String str) {
	int n=0;
	while (n<=str.length()-3){
	    if (str.substring(n,n+3).equals("yak")) {
		str= str.substring(0,n)+str.substring(n+3,str.length());
	    }
	    n=n+1;
	}
	return str;
    }
