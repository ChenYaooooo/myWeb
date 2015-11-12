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
//能自己写一下不用构造函数来新创建对象吗？

class Soup1{
	private Soup1(){}
	
	static int countSoup1 = 0;
	
	//不用static是不可能的，因为不用static，怎么创建对象，不创建对象怎么调用这个函数
	//所以那天那个人问我static的使用情况，这不就是嘛！！！
	public static Soup1 makeSoup(){   //static 块中只能使用static的变量
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
