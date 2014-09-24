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

/* Classwork with Rong
diff21 */
public int diff21(int n) {
  if (n > 21) {
  return 2*(n - 21);
  }
  return 21 - n;

}

// public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
  (Math.abs(200 - n) <= 10));
  
}

//mixStart
public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String two = str.substring(1, 3);
   if (two.equals("ix")) {
    return true;
  } else {
    return false;
  }
}

//teaParty
public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5) {
  return 0;}
  if ( tea >= (2 * candy) || candy >= (2* tea)) {
  return 2;
  } else if (tea >= 5 && candy >= 5) {
  return 1;
  } else return 0;
}

//lastDigit
public boolean lastDigit(int a, int b, int c) {
	int A = a % 10;
	int B = b % 10;
	int C = c % 10;
	if ((A==B) || (B==A 
}
