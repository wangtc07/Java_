package Interface_01.Int_04;

public class Demo {
	public static void main(String[] args) {
		Pingpong_Coach pinCoach = new Pingpong_Coach();
		pinCoach = new Pingpong_Coach("PINGPONG", 2);
		pinCoach.eat();
		pinCoach.speakEnglish();
		pinCoach.teach();
		System.out.println(pinCoach.getAge());
		System.out.println(pinCoach.getNameString());
	}
}
