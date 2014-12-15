public class Driver{
    public static void main(String[] args){
        Searching s = new Searching(15);
        for (int i=0;i<s.a.length;i++){
            s.additem(r.nextInt(20));
        }
        System.out.println(Arrays.toString(s.a));
        s.sort();
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.lsearch(7));
        System.out.println(s.bsearch(3));
        System.out.println(s.rbsearch(20));
    }
}