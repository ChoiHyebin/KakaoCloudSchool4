package management;

public class Member {
	private static int n = 0;
	private int id;
	private String name;
	private int date;
	private int num;
	private int point;
	private static int maxPoint = 0;
	private String grade;
	
	public Member() {
		n += 1;
		this.id = n;
	}
	
	public Member(String name, int date, int num) {
		n += 1;
		this.id = n;
		this.name = name;
		this.date = date;
		this.num = num;
		
		calcPoint();
		giveGrade();
		bonusPoint();
	}
	
	public void calcPoint() {
		if(num >= 10) {
			point = num * 100;
		}
		else if(num >= 5) {
			point = num * 50;
		}
		else if(num >= 3) {
			point = num * 30;
		}
		else {
			point = num * 20;
		}
		
		if(point > maxPoint) {
			maxPoint = point;
		}
	}
	
	public void giveGrade() {
		if(point < 100) {
			grade = "Family";
		}
		else if(100 <= point && point < 300) {
			grade = "Gold";
		}
		else if(300 <= point && point < 500) {
			grade = "VIP";
		}
		else if(500 <= point) {
			grade = "VVIP";
		}
	}
	
	public void bonusPoint() {
		if(this.point == maxPoint) {
			point += 10000;
			
			if(point > maxPoint) {
				maxPoint = point;
			}
			calcPoint();
		}
	}
	
	public void show() {
		calcPoint();
		giveGrade();
		bonusPoint();
		System.out.println(id + "\t" + name + "\t" + date + "\t" + num + "\t" + point + "\t" + grade);
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		Member.n = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
