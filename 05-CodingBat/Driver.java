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