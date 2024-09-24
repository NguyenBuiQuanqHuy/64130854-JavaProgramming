import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSSV {
	private ArrayList<SinhVien> dSinhViens =new ArrayList<SinhVien>();

	public DSSV(ArrayList<SinhVien> dSinhViens) {
		super();
		this.dSinhViens = dSinhViens;
	}

	public DSSV() {
		super();
	}
	
	public void ThemSV(SinhVien sv) {
		this.dSinhViens.add(sv);
	}
	
	public void inDS() {
		for(SinhVien sv:dSinhViens) {
			System.out.println(sv.toString());
		}
	}
	
	//Kiểm tra sinh viên có tồn tại ko
	public void KtSinhVien(String id) {
		int c=0;
		for(SinhVien sv:dSinhViens) {
			if(sv.getId().equals(id)) {
				c=1;
				break;
			}
			
		}
		if(c==1) {
			System.out.println("SV tồn tại!");
		}
		else {
			System.out.println("SV không tồn tại!");
		}
	}
	
	public void Xoa(String id) {
		int c=0;
		for(SinhVien sv:dSinhViens) {
			if(sv.getId().equals(id)) {
				dSinhViens.remove(sv);
				c=1;
				break;
			}
			
		}
		if(c==1) {
			System.out.println("Xóa SV thành công!");
		}
		else {
			System.out.println("Xóa SV không thành công!");
		}
	}
	
	// Tìm kiếm tất cả sinh viên có tên được nhập từ bàn phím
	public void Timkiem(String ten) {
		for(SinhVien sv:dSinhViens) {
			if(sv.getHoten().equals(ten)) System.out.println(sv.toString());
		}
	}
	
	// Sắp xếp điểm sinh viên từ cao đến thấp
	public void Sapxep() {
		Collections.sort(this.dSinhViens,new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				// TODO Auto-generated method stub
				if(sv1.getDiemTB()>sv2.getDiemTB()) return -1;
				if(sv1.getDiemTB()<sv2.getDiemTB()) return 1;
				else return 0;
			}
		});
	}
}
