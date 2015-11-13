package myWeb;
class Cleanser{
	private String s= "Cleanser";
	public void append(String a)
	{
		s += a;
	}
	public void dilute(){append("dilute()");}
	public void apply(){append("apply()");}
	public void scrub(){append("scrub()");}
	
	public String toString(){
			return s;
	}
	
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
	}
}

public class Detergent extends Cleanser {

	public void scrub(){
		append("Detergent.scrub()");
		super.scrub();
	}
	public void foam(){
		append("foam()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		//print(x);
		//print("Testing baseclass:");
		Cleanser.main(args);
	}

}
