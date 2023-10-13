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
	float average()
	{
		return (float)(num + num2)/2;
	}
	 void description()
	{
		System.out.println("Number one is " + num);
		System.out.println("Number two is " + num2);
	}
	public myNumber(int num1,int num2)
	{
		this.num = num1;
		this.num2 = num2; 
	}
}

public class myEaxmple {
	public static void main (String[] args) {
		myNumber A = new myNumber(10,15);
	
		A.description();
		System.out.println("The average is " + A.average());
		
		
	}
}
 
