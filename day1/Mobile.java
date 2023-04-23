package week1.day1;

public class Mobile {

public void makeCall(String mobileModel,float mobileWeight) {
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}

	public void sendMessage(boolean fullCharged, int mobileCost) {
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	
	
	/*private void takeVideo() {
		System.out.println("Video looking fine");
		
	}*/
	
	public static void main(String[] args) {
		
		Mobile obj= new Mobile();
		
		obj.makeCall("VivoX50",300f);
		obj.sendMessage(true,35000);
		
		
	}
	
}
