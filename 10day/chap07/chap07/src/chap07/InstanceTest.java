package chap07;

//class Calculator{
//	private int num1,num2;
//	
//	
//	
//}

class Human{
	int eye;
	
	
	public void setEye(int count) {
		eye = count; 
	}
	
}


public class InstanceTest {
	
	public static void main(String[] args) {
		
		Human  human = new Human(); // ��ü ����
		human.setEye(2);
		
		System.out.println(human.eye);
		System.out.println(human);
		
		
	}
	
}
