import java.util.HashMap;
import java.util.Iterator;

public class Vidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo
		HashMap<String, Integer> year=new HashMap<String, Integer>();
		//Thêm phần tử
		year.put("Quang Huy", 2004);
		year.put("Nguyên Quang", 2005);
		year.put("Văn Trung", 2000);
		//Xuất
		System.out.println(year);
		//Lấy giá trị của key
		System.out.println(year.get("Quang Huy"));
		//Lấy tất cả giá trị của Map
		System.out.println(year.values());
		//Lấy tất cả cặp key-value của map
		for(String name: year.keySet()) {
			System.out.println(name +"- "+year.get(name));
		}
		//Kiểm tra key có trong map ko
		System.out.println(year.containsKey("Như Nguyệt"));
		//Kiểm tra value có trong map ko
		System.out.println(year.containsValue(2000));
		//Cập nhật giá trị của key
		year.replace("Quang Huy", 1999);
		System.out.println(year);
		//Tạo cặp key-value mới với điều kiện key chưa tồn tại
		year.putIfAbsent("Liên Hoa", 1997);
		//Số cặp của Map
		System.out.println(year.size());
		//Xóa 1 cặp key-value
		year.remove("Quang Huy");
		System.out.println(year);
	}

}
