import org.*;
import org.json.JSONObject;

import java.util.*;
public class JSON_VD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JSONObject jsonObject = new JSONObject();
	        
	        // Thêm dữ liệu vào JSON
	        jsonObject.put("name", "John Doe");
	        jsonObject.put("age", 30);
	        jsonObject.put("city", "Hanoi");
	        
	        // Tạo đối tượng JSON lồng nhau
	        JSONObject address = new JSONObject();
	        address.put("street", "123 Main St");
	        address.put("city", "Hanoi");
	        address.put("zipcode", "100000");

	        // Thêm đối tượng JSON lồng vào trong đối tượng chính
	        jsonObject.put("address", address);
	        
	        // In dữ liệu JSON ra màn hình
	        System.out.println(jsonObject.toString(4)); // In với format đẹp
	    }
	}

