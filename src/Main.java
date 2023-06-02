import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            try {
                System.out.println("QUẢN LÝ CÁN BỘ GIÁO VIÊN");
                CBGV cbgv = new CBGV();
                System.out.println("NHẬP THÔNG TIN GIÁO VIÊN");
                System.out.println("nhập họ tên: ");
                Scanner scanner1 = new Scanner(System.in);
                String hoTen = scanner1.next();
                System.out.println("nhập năm sinh: ");
                Scanner scanner2 = new Scanner(System.in);
                int namSinh = scanner2.nextInt();
                System.out.println("nhập quê quán: ");
                Scanner scanner3 = new Scanner(System.in);
                String queQuan = scanner3.next();
                System.out.println("nhập lương cứng: ");
                Scanner scanner4 = new Scanner(System.in);
                double luongCung = scanner4.nextDouble();
                System.out.println("nhập tiền thưởng: ");
                Scanner scanner5 = new Scanner(System.in);
                double thuong = scanner5.nextDouble();
                System.out.println("nhập tiền phạt: ");
                Scanner scanner6 = new Scanner(System.in);
                double phat = scanner6.nextDouble();
                cbgv.NhapThongTin(hoTen, namSinh, queQuan, luongCung, thuong, phat);
                cbgv.HienThiThongTin();

            } catch (InputMismatchException e) {
                System.out.println("nhập sai kiểu");
            }
        }
    }
}