
public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c1 =new Citizen();
		c1.setId("007");
		c1.setName("Quang Huy");
		c1.setGender("Male");
		c1.setNation("VietNam");
		c1.setYear((short)2004);
		System.out.print(c1.toString());
		
		Citizen c2 =new Citizen("009","Như Nguyệt",(short)2000,"Female","VietNam");
		System.out.print(c2.toString());
	}

}
