public class TraiCay {
    int idAnh; //id của ảnh
    String tenTC;
    int giaTC;
    public TraiCay()
    {

    }

    public TraiCay(int idAnh, String tenTC, int giaTC) {
        this.idAnh = idAnh;
        this.tenTC = tenTC;
        this.giaTC = giaTC;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public String getTenTC() {
        return tenTC;
    }

    public void setTenTC(String tenTC) {
        this.tenTC = tenTC;
    }

    public int getGiaTC() {
        return giaTC;
    }

    public void setGiaTC(int giaTC) {
        this.giaTC = giaTC;
    }
}
