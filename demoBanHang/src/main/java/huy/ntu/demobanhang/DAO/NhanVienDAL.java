package huy.ntu.demobanhang.DAO;

import huy.ntu.demobanhang.ModelDTO.NhanVien;
import huy.ntu.demobanhang.Untils.DBUtils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.SQLException;

public class NhanVienDAL {
    Connection conn;

    public NhanVienDAL() throws SQLException, NoSuchAlgorithmException, InvalidKeySpecException, ClassNotFoundException {
        this.conn = DBUtils.DBConnect();
    }

    public boolean AddNew(NhanVien nv){
        return true;
    }

    public boolean Delete(int id){
        return true;
    }
    public boolean Login(String id,String matKhau){
        conn.
    }

}
