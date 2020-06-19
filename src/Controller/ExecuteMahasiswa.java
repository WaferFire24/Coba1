package Controller;

import Connection.ConnManager;
import Model.Mahasiswa;
import java.util.List;
import java.security.cert.CertPathValidatorException.Reason;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.DocFlavor.STRING;

public class ExecuteMahasiswa {
    public String InsertMahasiswa(Mahasiswa mhs) {
        
        String query = "INSERT INTO mahasiswa(NRP, nama, gender, noHp, Alamat)"+"VALUES (?, ?, ?, ?, ?)";
        ConnManager connMan = new ConnManager();
        Connection conn = connMan.Logon();

        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNRP());
            pstm.setString(2, mhs.getNama());
            pstm.setString(3, mhs.getGender());
            pstm.setString(4, mhs.getNoHp());
            pstm.setString(5, mhs.getAlamat());
        } catch (SQLException ex) {
            Respon = "Insert Gagal";
            ex.printStackTrace();
        }
        connMan.LogOff();
        return Respon;     
    }
    public List<Mahasiswa> ListMhs() {
        List<Mahasiswa> arrList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        ConnManager connMan = new ConnManager();
        Connection conn = connMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            Connection conn = connMan.Logon();
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNRP(rs.getString("NRP"));
                mhs.setNama(rs.getString("nama"));
                mhs.setGender(rs.getString("gender"));
                mhs.setNoHp(rs.getString("noHp"));
                mhs.setAlamat(rs.getString("alamat"));
                
                arrList.add(mhs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        connMan.LogOff();
        return arrList;
    }
    /*public String UpdateMahasiswa(Mahasiswa mhs){
        String hasil="";
        String query = "update mahasiswa SET nama='"+mhs.getNama()(+"' ,gender='"+mhs.getGender()+"' ,noHp='"+mhs.getNoHp()+"' ,alamat='"+mhs.getAlamat()+"' WHERE NRP='"+mhs.getNRP()+"'";
        ConnManager connMan = new ConnManager();
        Connection conn = connMan.Logon();
        try {
            Statement sta = 
        } catch (Exception e) {
            //TODO: handle exception
        }
    }*/
}