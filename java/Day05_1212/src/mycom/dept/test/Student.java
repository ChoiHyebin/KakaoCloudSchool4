package mycom.dept.test;

public class Student {
	// 인스턴스 변수
	private static int n = 0;
    private int num;
    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;

    public Student(){
    	n += 1;
    	this.num = n;
    }

    public Student(String name, int korean, int english, int math) {
    	// 인스턴스 변수 = 매개변수
    	n += 1;
		this.num = n;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public void calcTotal(){
		this.total = korean + english + math;
    }

    public void display(){
    	this.calcTotal();
    	System.out.println(num + "\t" + name + "\t" + total );
    }

    // getter-setter
    public int getNum(){
    	return this.num;
    }

    public void setNum(int num){
    	if(num > 0) {
    		this.num = num;
    	}
    	else {
    		System.out.println("잘못된 입력입니다.");
    	}
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

}
