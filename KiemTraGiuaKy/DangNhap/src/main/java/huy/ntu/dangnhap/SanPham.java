package huy.ntu.dangnhap;

public class SanPham {
    int id;
    String name;
    float gia;
    String mota;

    public SanPham(int id, String name, float gia, String mota) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
