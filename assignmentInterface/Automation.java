package assignmentInterface;

public class Automation extends MultipleLanguage {
	

	public static void main(String[] args) {
		
		Automation lan = new Automation();
		lan.Java();
		lan.python();
		lan.ruby();
		lan.selenium();
		
		
	}

	public void selenium() {
		System.out.println("Language Selenium");
		
	}

	public void Java() {
		System.out.println("Language Java");
		
	}

	@Override
	public void python() {
		System.out.println("Language Python");
		
	}

}
