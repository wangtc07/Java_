package Collection_01._09_comparator.bili_ex1;

public class Student {
	private String name;
	private int chinese;
	private int math;
	
	public Student(String name, int chinese, int math) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name= " + name + ", chinese= " + chinese + ", math= " + math;
	}
	
	
}
