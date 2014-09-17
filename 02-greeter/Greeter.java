import java.io.*;
import java.util.*;

public class Greeter{
    private String greeting = new String ("Hello Knaves");

    public void setGreeting (String s){
	greeting = s;
    }
    
    public void greet(){
	System.out.println(greeting);
	ungreet();
    }


    private void ungreet(){
	System.out.println(greeting);
    }
}
