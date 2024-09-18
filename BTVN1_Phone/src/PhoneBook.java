import java.util.ArrayList;


public class PhoneBook extends Phone{
	ArrayList<String[]> phoneList =  new ArrayList<>();
	@Override
	void insertPhone(String name, String phone) {
		// TODO Auto-generated method stub
		for(int i=0;i<phoneList.size();i++) {
			String[] entry = phoneList.get(i);
			if(entry[0].equals(name)) {
				if(!entry[1].contains(phone)) {
					entry[1]=entry[1]+":"+phone;
				}
				return;
			}
			
		}
		phoneList.add(new String[] {name, phone});
	}

	@Override
	void removePhone(String name) {
		// TODO Auto-generated method stub
		if(phoneList.isEmpty()) {
			System.out.print("Danh sách rỗng");
		}
		for(int i=0;i<phoneList.size();i++) {
			String[] entry = phoneList.get(i);
			if(entry[0].equals(name)) {
				phoneList.remove(i);
				return;
			}
		}
		System.out.print("Không có tên!");
	}

	@Override
	void updatePhone(String name, String newphone) {
		// TODO Auto-generated method stub
		for(int i=0;i<phoneList.size();i++) {
			String[] entry = phoneList.get(i);
			if(entry[0].equals(name)) {
				entry[1]=newphone;
				return;
			}
		}
		System.out.print("Không có tên!");
	}

	@Override
	void searchPhone(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<phoneList.size();i++) {
			String[] entry = phoneList.get(i);
			if(entry[0].equals(name)) {
				System.out.print(entry[0]+":"+entry[1]);
				return;
			}
		}
		System.out.print("Không có tên!");
	}

	@Override
	void sort() {
		// TODO Auto-generated method stub
		phoneList.sort((entry1, entry2) -> entry1[0].compareTo(entry2[0]));
        System.out.println("Đã sắp xếp danh bạ.");
	}

	public void Print() {
		for (String[] entry : phoneList) {
	        System.out.println("Tên: " + entry[0] + ", Số điện thoại: " + entry[1]);
	    }
	}
	
}
