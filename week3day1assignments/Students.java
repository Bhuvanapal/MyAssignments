package overloading;

public class Students {

	public void getStudentinfo(int id) {
		
		System.out.println(id);
	}
	
    public void getStudentinfo(int id,String name) {
		System.out.println(id + name);
		
	}
	
    public void getStudentinfo(String email,int phonenumber) {
	
		System.out.println(email + phonenumber);
	}
	
	public static void main(String[] args) {
		
		Students stud = new Students();
				
			stud.getStudentinfo(23);
		    stud.getStudentinfo(16, " Bhuvana");
		    stud.getStudentinfo("abc@gmail.com ", 123456);
		
		
		
		
	}
	
}
