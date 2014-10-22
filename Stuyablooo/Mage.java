import java.util.*;
import java.io.*;

public class Mage extends BaseChar {

    Random thing = new Random();

    
    public Mage(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	super(h,m,a,d,s,ac,c,n,w);
    }
    public String spell(Monster other, String userInput){
	if(userInput.equals( "1") && this.getACC() > 20 ) {
	    other.setHP(other.getHP() -  thing.nextInt(2)-10);
	    this.setMP(this.getMP() - 20);
	    return(this + " shot a fireball at " + other);
	       
	}else if(userInput.equals("2") && this.getACC() > 0) {
	    other.setHP(other.getHP() -10);
	    this.setMP(this.getMP() - 30);
	    return(this + " electrified " + other);
	}else if(userInput.equals("3") && this.getACC() > 20) {
	    other.setHP(other.getHP() - thing.nextInt(3) - 19);
	    this.setMP(this.getMP() - 40);
	    return(this + " froze " + other);
	} else{
	    this.setMP(this.getMP()-30);
	    return "The spell fizzled and died";
	}
    }

}
