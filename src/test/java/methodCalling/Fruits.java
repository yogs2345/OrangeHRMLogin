package methodCalling;

public class Fruits {
	static Fruits sweet;
	Fruits salt;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static Fruits watermellon()
	{
		Fruits F=new Fruits();
		F.banana();
		return F.salt;
		
	}
	public Fruits banana() {
		watermellon();
		return salt;
		
		
	}
	public static Fruits watermellonSweets()
	{
		Fruits F=new Fruits();
		F.banana();
		Fruits Fru;
		Fru=
		 Fruits.sweet;
		Fru=sweet;
		Fru=F.sweet;
		 
		return F.sweet;
		
		
	}
	public Fruits bananaSweets() {
		watermellon();
		return sweet;
		
		
	}
	public Fruits grapes() {
		return sweet;
		
	}
	public Fruits Apple() {
		return sweet;
		
	}
	public Fruits pineApple() {
		return sweet;
		
	}
	public int num() {
		return 4;
		
	}
		

	}


