
public class SinhVien implements Comparable<SinhVien>{
	private String id;
	private String hoten;
	private int namsinh;
	private float diemTB;
	
	
	
	public SinhVien() {
		super();
	}
	public SinhVien(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", hoten=" + hoten + ", namsinh=" + namsinh + ", diemTB=" + diemTB + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	
	
	
}
