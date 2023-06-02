import java.util.ArrayList;

public class CBGV {
    ArrayList<Nguoi> DsGiaoVien;
    public CBGV(){
        DsGiaoVien = new ArrayList<>();
    }
    public void NhapThongTin(String hoTen, int namSinh, String queQuan, double luongCung, double thuong, double phat){
        double luongThucLinh = luongCung + thuong - phat;
        Nguoi giaoVien = new Nguoi(hoTen, namSinh, queQuan, luongCung, thuong, phat, luongThucLinh);
        DsGiaoVien.add(giaoVien);
        System.out.println("thêm thành công");
    }
    public void HienThiThongTin(){
        for (int i = 0; i < DsGiaoVien.size(); i++){
            DsGiaoVien.get(i).HienThiGiaoVien();
        }
    }
}
