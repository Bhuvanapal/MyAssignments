package assignmentonabst;

public class Automations extends MultipleLanguage implements TestTool,Language {

	public void java() {
		
		System.out.println("Java is an OOPS Language");
		
		
	}

	public void selenium() {
		System.out.println("Selenium is a webdriver ");
		
	}

	@Override
	public void ruby() {
		System.out.println("Selenium supports ruby");
		
	}

	public static void main(String[] args) {
		
		Automations obj = new Automations();
		obj.java();
		obj.python();
		obj.ruby();
		obj.selenium();
		
		
		
	}
	
	
	
	
}
