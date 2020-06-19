package Model;

public class Mahasiswa {

    private String NRP, Nama, Alamat, Gender, NoHp, Aktif;
    
    public Mahasiswa(){
    }

    public Mahasiswa(String NRP, String Nama, String Alamat, String Gender, String NoHp, String Aktif) {
        this.Aktif = Aktif;
        this.Alamat = Alamat;
        this.Gender = Gender;
        this.NRP = NRP;
        this.Nama = Nama;
        this.NoHp = NoHp;
    }

    public Mahasiswa(String NRP, String Nama, String Alamat, String Gender, String NoHp) {
        this.Alamat = Alamat;
        this.Gender = Gender;
        this.NRP = NRP;
        this.Nama = Nama;
        this.NoHp = NoHp;
    }

    public String getNRP() {
        return this.NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNoHp() {
        return this.NoHp;
    }

    public void setNoHp(String NoHp) {
        this.NoHp = NoHp;
    }

    public String getAktif() {
        return this.Aktif;
    }

    public void setAktif(String Aktif) {
        this.Aktif = Aktif;
    }

    @Override
    public String toString() {
        return "Mahasiswa("+"NRP: "+NRP+", Nama: "+Nama+", Alamat: "+Alamat+", Gender: "+Gender+", NoHP: "+NoHp+")";
    }
}