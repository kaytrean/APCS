import java.util.Random;

public class monster extends BaseChar {
    public void monster() {
	int hp = (80 + Random.nextInt(10));
	int def = (50 + Random.nextInt(20));
	int atk = (30 + Random.nextInt(20));
	int spd = (20 + Random.nextInt(50));
	int lck = (40 + Random.nextInt(10));
	String n = "Fowl Beast";
    }

    public void claws(BaseChar other){
	if Random.nextInt(10) <= 8 {
		int damage = 7;
		System.out.println(this + " swiped at " + other);
		System.out.println(other + " lost "+ damage+ " HP.");
	    }
	else {
	    System.out.println("Claws did not reach target...");
	}
    }

    public void teeth(BaseChar other) {
	if Random.nextInt(10) < 8 {
		int damage = 10;
		System.out.println(this + " savagely bit "+ other);
		System.out.println(other + " lost "+ damage+ " HP.");
	    }
	else {
	    System.out.println(other + " was out of biting reach...");
	}
    }
	
    public void wrath(BaseChar other) {
	if Random.nextInt(10) < 7 {
		int damage = 14;
		System.out.println(this + " howled into the moonlight, summoniong a great evil upon "+ other);
		System.out.println(other + "lost "+ damage+ " HP.");
		if Random.nextInt(2)== 1 {
			System.out.println(other + " was poisoned!");
		    }
	    }
	else {
	    System.out.println(other+ " blinded " + this + " with their beauty... attack missed.");
	}
    }
}