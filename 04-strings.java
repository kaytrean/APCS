// mixStart
public boolean mixStrat(String str) {
    if (str.length() < 3) return false;
    String a = str.substring(1,3);
    if (a.equals("ix")) {
	return true;
    }
    else{
	return false;
    }
}

//firstHalf
public String firstHalf(String str) {
    int a = str.length();
    if (a < 2) return str;
    String b = str.substring(0, (str.length()/2));
    return b
	}

//makeOutWord
public String makeOutWord(String out, String word) {
    String a = out.substring(0,2);
    String b = out.substring(2,4);
    String f = a + word + b;
    return f;
}
