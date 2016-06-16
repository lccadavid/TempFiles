package training;

public class Student {
	
	private int gradYear;
	private int score;
	private String sex;
	
	public Student(int gradYear, int score, String sex) {
		super();
		this.gradYear = gradYear;
		this.score = score;
		this.sex = sex;
	}
	
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [gradYear=" + gradYear + ", score=" + score + ", sex=" + sex + "]";
	}
	
	
	
	
}
