package _Java_016Class.Day_0504;

public abstract class Pat {
	private String nickname;
	private int age;
	private String color;

	abstract void talk();

	public Pat() {
		super();
	}

	public Pat(String nickname, int age, String color) {
		super();
		this.nickname = nickname;
		this.age = age;
		this.color = color;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
