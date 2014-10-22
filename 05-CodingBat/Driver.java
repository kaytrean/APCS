//nonStart
public String nonStart(String a, String b) {
    String que = a.substring(1);
    String q = b.substring(1);
    return (que + q);
}

//makeAbba
public String makeAbba(String a, String b) {
    return (a+ b + b+ a);
}

//diff21
public int diff21(int n){
    if (n > 21) {
	return 2*(n - 21);
    }
    return 21 - n;
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
	if (A==B) {
		return true;
	} else if (A==C){
		return true;
	} else if (B==C) {
		return true;
	} else return false;
}
