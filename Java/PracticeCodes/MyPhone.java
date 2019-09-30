package PracticeCodes;

public class MyPhone {

	public static void main(String[] args) {
		Mobile m=new Mobile();		
		String brand = m.brand;
		String model = m.model;
		//String model1=m.model1;
		//System.out.println(model1);
		System.out.println(brand +" "+model);
		m.sendSMS();
		long phoneNum=m.dialNumber();
		System.out.println(phoneNum);
	}

}
