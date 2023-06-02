public class Nguoi extends GiaoVien{
    private String HoTen;
    private int NamSinh;
    private String QueQuan;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public Nguoi(String hoTen, int namSinh, String queQuan, double luongCung, double thuong, double phat, double luongThucLinh){
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setQueQuan(queQuan);
        setLuongCung(luongCung);
        setThuong(thuong);
        setPhat(phat);
        setLuongThucLinh(luongThucLinh);
    }
    public void HienThiGiaoVien(){
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Nam sinh: " + getNamSinh());
        System.out.println("Que quan: " + getQueQuan());
        System.out.println("Luong cung: " + getLuongCung());
        System.out.println("Thuong: " + getThuong());
        System.out.println("Phat: " + getPhat());
        System.out.println("Luong thuc linh: " + getLuongThucLinh());
    }
}
