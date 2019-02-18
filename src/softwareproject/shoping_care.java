package softwareproject;
import java.util.ArrayList;
public class shoping_care {
	static int s;
	public static ArrayList listbook= new ArrayList ();
	public int getcounter() {
		// TODO Auto-generated method stub
		  return listbook.size();
      
	}
	public void add(String string) {
		// TODO Auto-generated method stub
		listbook.add("string");
		
	}
	public int getprice() {
		// TODO Auto-generated method stub
		int s=listbook.size();
		if(s==1) {
			return 127;
		}
		else {

			return 227;
		}
	
	}

	public void clearp() {
		// TODO Auto-generated method stub
		listbook.clear();
		
		
		
	}

}
