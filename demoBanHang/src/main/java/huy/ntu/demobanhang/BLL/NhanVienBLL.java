package huy.ntu.demobanhang.BLL;

import huy.ntu.demobanhang.DAO.NhanVienDAL;
import huy.ntu.demobanhang.ModelDTO.NhanVien;

public class NhanVienBLL {
    NhanVienDAL nvDAL;
    public boolean ThemMoi(NhanVien nv){
        boolean kq=nvDAL.AddNew(nv);
        return kq;
    }

    public boolean CheckLogin(String tenDN,String matKhau){
        //Kiem tra tính đúng đắn
        //Ten có rỗng hãy ko
        //Neu thoa thì goi dich vu ...
        return nvDAL.Login(tenDN,matKhau);
    }
}
