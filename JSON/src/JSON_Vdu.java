import org.json.JSONObject;

public class JSON_Vdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JSONObject jsonObject = new JSONObject();
	        
	        // Thêm dữ liệu vào JSON
	        jsonObject.put("name", "Quang Huy");
	        jsonObject.put("age", 20);
	        jsonObject.put("city", "Nha Trang");
	        
	        // Tạo đối tượng JSON lồng nhau
	        JSONObject address = new JSONObject();
	        address.put("street", "Đoàn Trần Nghiệp");
	        address.put("city", "Nha Trang");
	        address.put("zipcode", "100000");

	        // Thêm đối tượng JSON lồng vào trong đối tượng chính
	        jsonObject.put("address", address);
	        
	        // In dữ liệu JSON ra màn hình
	        System.out.println(jsonObject.toString(4));
	    }
	}

