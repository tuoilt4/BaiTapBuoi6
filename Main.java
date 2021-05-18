import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chuoia = "You only live once, but if you do it right, once is enough";

        System.out.print("Nhập chương trình muốn chạy: ");
        int o = scanner.nextInt();
        switch (o) {
            case 1: {
                Scanner sc = new Scanner(System.in);
                int mangsn[];
                System.out.print("Nhập kích thước mảng: ");
                int n = sc.nextInt();
                mangsn = new int[n];
                System.out.println("Bai tap 1");
                BaiTapBuoi6_1.nhapmang(mangsn,n);
                BaiTapBuoi6_1.inmang(mangsn,n);
                BaiTapBuoi6_1.timsoln(mangsn,n);
                BaiTapBuoi6_1.timsonn(mangsn,n);
                BaiTapBuoi6_1.timsoln2(mangsn,n);
                break;
            }
            case 2: {
                System.out.println("Bài tập 2");
                Scanner sc = new Scanner(System.in);
                String mangkt[];
                System.out.print("Nhập kích thước mảng: ");
                int n = sc.nextInt();
                mangkt = new String[n];
                BaiTapBuoi6_2.nhapmang(mangkt,n);
                BaiTapBuoi6_2.inmang(mangkt,n);
                BaiTapBuoi6_2.demchuoi(mangkt,n);
                BaiTapBuoi6_2.timchuoi(mangkt,n);
                break;
            }
            default: {
                System.out.print("Không có chương trình chạy");
            }
        }
    }
}