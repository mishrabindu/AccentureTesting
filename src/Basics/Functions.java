package Basics;

public class Functions {
	
	
	
	public String[] EmpDevices(String name) {
		
		if(name.equals("Abhi")) {
			String devices[]= { "Macbook" , "iPhone"};
			return devices;		
			}
		else if (name.equals("Varun")) {
			String devices[]= { "Macbook1" , "iPhone12"};
			return devices;
		}
		else {
			System.out.println("emp is not found");
			return null;
		}
		
		
	}


	public static void main(String[] args) {
		
		Functions f1 = new Functions();
		String[] name= f1.EmpDevices("Abhi"); 
		System.out.println(name);
		
		for ( String e : f1.EmpDevices("a")){
			System.out.println(e);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
