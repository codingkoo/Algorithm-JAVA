package data_structure.youtube.ch0201;

public class Code01 {

	public static void main(String[] args) {
		
		Person1 first;
		first = new Person1();  // Create Object
		
		first.name = "John";
		first.number = "01023439958";
		
		System.out.println("name = " + first.name + ", number = " + first.number);
		
		Person1[] members = new Person1[10];
		
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01029483857";
		
		System.out.println("name = " + members[1].name + ", number = " + members[1].number);
		 
	}

}
