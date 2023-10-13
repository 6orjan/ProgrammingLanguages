package myExample;

class myNumber{
	private int num;
	public int num2;
	public myNumber() {
		num = 0;
		num2 = 100;
	}
	public int getNum() {
		return num;
	}
	
	void setNum(int i) {
		num = i;
		num2 = 10*i;
	}
	int getNum2() {
		return num2;
	}
	void description()
	{
		System.out.println(num);
		System.out.println(num2);
	}
	public myNumber(int num1,int num2)
	{
		this.num = num1;
		this.num2 = num2; 
	}
}

public class myEaxmple {
	public static void main (String[] args) {
		myNumber A = new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
	}
}
 
