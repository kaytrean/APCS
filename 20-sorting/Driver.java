public class Driver{
    public static void main(String[] args) {
	try{
	   
	    Sarray s = new Sarray();
	    System.out.println();
	    System.out.println("Regular Sarray: ");
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    for (int i=0;i<10;i++)  {
		s.add(i,"MAN");
	    }
	    s.set(3,"LIQUID");
	    s.set(8,"ZAMANSKY");
	    s.set(2,"CAR");
	    s.set(7,"APPLE");
	    s.set(9,"EUREKA");
	    System.out.println(s.toString());
	    s.ssortAscending();
	    System.out.println(s.toString());
	    s.ssortDescending();
	    System.out.println(s.toString());
	    
	    
	    
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}

	
    }
	
	
}