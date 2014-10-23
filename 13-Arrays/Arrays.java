public class Arrays{
    
    public int sum13(int[] nums) {
	int a = 0;
	int x = 0;
	while (nums.length>x) {
	    if (nums[x] == 13) {
		if ((nums.length > x + 1) && (nums[x+1] != 13)) {
		    a = a - nums[x + 1];
		}
	    }
	    else {
		a = a + nums[x];}
	    x = x + 1;}
	return a;
    }

    public int[] frontPiece(int[] nums) {
	int[] a = new int[2];
	if (nums.length < 3){
	    return nums;}
	a[0]=nums[0];
	a[1]=nums[1];
	return a;
    }
}