package softwareproject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class testing {

	@Test
	void test1() {
		 shoping_care obj1=new  shoping_care();
		int result=obj1.getcounter();
		assertEquals(0,result);
	
	}
	@Test
	void test2() {
		shoping_care obj2=new  shoping_care();
		obj2.add("Java Book");
		int result1=obj2.getcounter();
		int result2=obj2.getprice();
		assertEquals(1,result1);
		assertEquals(127,result2);
	}
	@Test
	void test3() {
		shoping_care obj3=new  shoping_care();
		obj3.clearp();
		obj3.add("Java Book");
		obj3.add("web design Book");
		int result3=obj3.getcounter();
		int result4=obj3.getprice();
		assertEquals(2,result3);
		assertEquals(227,result4);
	}
}