package myWeb;

//class Soup1{
//	private Soup1(){	}
//	//Allow creation via staic method
//	
//	public static Soup1 makeSoup(){
//		return new Soup1();
//	}
//}
//
//class Soup2{
//	private Soup2(){}
//	
//	private static Soup2 ps1 = new Soup2();
//	
//	public static Soup2 access(){
//		return ps1;
//	}
//	
//	public void f(){}
//}
//public class Lunch {
//
//	void testPrivate(){
//		//Can't do this : private constructor
//		//Soup1 soup = new Soup1();
//	}
//	
//	void testSatic(){
//	 Soup1 soup = Soup1.makeSoup();	
//	}
//	
//	void testSingleton(){
//		Soup2.access().f();
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

/**
 * 2015/11/12
 * @author YaoChen
 *
 */
//���Լ�дһ�²��ù��캯�����´���������

class Soup1{
	private Soup1(){}
	
	static int countSoup1 = 0;
	
	//����static�ǲ����ܵģ���Ϊ����static����ô�������󣬲�����������ô�����������
	//���������Ǹ�������static��ʹ��������ⲻ���������
	public static Soup1 makeSoup(){   //static ����ֻ��ʹ��static�ı���
		countSoup1++;
		System.out.println("Soup1 is created:" +countSoup1);
		return new Soup1();
	}	
}


class Soup2{
	private Soup2(){}
	
	private static Soup2 ps2 = new Soup2();
	
	public static Soup2 access(){
		return ps2;
	}
}

public class Lunch{
	public static void main(String[] args){
		Soup1 sp1 = Soup1.makeSoup();
		Soup1 sp2 = Soup1.makeSoup();
		Soup1 sp3 = Soup1.makeSoup();
		Soup1 sp4 = Soup1.makeSoup();
		
	}
}
