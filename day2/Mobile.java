package week1.day2;

public class Mobile {
public void sendSms() {
	System.out.println("From oppo");
}
public long makecall(long phno) {
	return phno;
	
}
	public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.sendSms();
	System.out.println(mob.makecall(887082333l));
	
	

}
}
