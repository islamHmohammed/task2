package softwareproject;
import java.util.ArrayList;
public class shoping_care {

	ArrayList<Integer>listbook=new ArrayList<Integer>();
	private int s=0;
	
	public int getcounter() {
		
		  return listbook.size();
      
	}

	public int getprice() {
	for(int k=0; k <listbook.size();k++) {
		s=s+listbook.get(k);
	
	}
	return s;

	}

	public void clearp() {
		listbook.clear();
	}
	public void addbooks(String string, int i) {
		// TODO Auto-generated method stub

		listbook.add(i);
	}
	

}
