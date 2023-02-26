package week1.day1;

public class Mobile {
	public void sendSMS() {
		System.out.println("Hi Sandeep");
		
	}
	public void snapShot() {
		System.out.println("How are You");
		
	}
	public static void main(String[] args) {
		Mobile msg=new Mobile();
		msg.sendSMS();
		msg.snapShot();
	}

}
