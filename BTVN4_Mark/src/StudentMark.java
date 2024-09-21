
public class StudentMark implements IStudentMark{
	String fullname;
	int id;
	String Class;
	int semester;
	float averagemark;
	int [] listmark=new int[5];
	
	
	public StudentMark(String fullname, int id, String class1, int semester) {
		super();
		this.fullname = fullname;
		this.id = id;
		Class = class1;
		this.semester = semester;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Full name: "+fullname);
		System.out.println("ID: "+ id);
		System.out.println("Class: "+Class);
		System.out.println("Average: "+averagemark);
		System.out.println();
	}
	
	public void Calculate() {
		int sum=0;
		for(int mark : listmark) {
			sum+=mark;
		}
		averagemark=sum/5.0f;
	}


	public void setListmark(int[] listmark) {
		this.listmark = listmark;
	}


	
	
}
