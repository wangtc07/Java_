package IO.ArrayListToTxt;

public class Student_Score {
	private String name;
	private int math;
	private int english;
	private int chinese;
	public Student_Score(String name, int math, int english, int chinese) {
		super();
		this.name = name;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public Student_Score() {
		super();
	}
	
	public int getSum() {
		return this.math + this.chinese + this.english;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student_Score [name=");
		builder.append(name);
		builder.append(", math=");
		builder.append(math);
		builder.append(", english=");
		builder.append(english);
		builder.append(", chinese=");
		builder.append(chinese);
		builder.append("]");
		return builder.toString();
	}
	
}
