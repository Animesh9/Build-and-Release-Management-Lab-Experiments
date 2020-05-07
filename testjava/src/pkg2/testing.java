package pkg2;
import pkg1.*;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 ob1 = new MyClass1();
		MyClass2 ob2 = new MyClass2();
		System.out.println("sum = " +ob1.sum(10,5));
		System.out.println("sub = " +ob1.sub(10,5));
		System.out.println("mul = " +ob2.mul(10,5));
		System.out.println("div = " +ob2.div(10,5));
	}

}
