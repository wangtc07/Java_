package Interface_01.Int_04;

public class Pingpong_Coach extends Coach implements English {

	public Pingpong_Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pingpong_Coach(String nameString, int age) {
		super(nameString, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Pingpong Coach teach");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Pingpong Coach eat");
	}

	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println("Pingpong Coach SpeakEnglish");
	}
	
	
}








