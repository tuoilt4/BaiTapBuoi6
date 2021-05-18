import java.util.Scanner;

public class BaiTapBuoi6_2 {
    // Nhập và in ra mảng
    public static void nhapmang (String mangkt[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            mangkt[i] = sc.next();
        }
    }
    //In mảng
    public static void inmang(String mangkt[], int n) {
        System.out.print("In mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mangkt[i] + "\t");
        }
    }
    public static void demchuoi (String mangkt[], int n) {

        // đếm số lần chuỗi java xuất hiện trong mảng
        int dem = 0;
        String s = "Java";
        for (int i = 0; i < n; i++) {
            if (mangkt[i].equals(s)) {
                dem = dem + 1;
            }
        }
        if (dem == 0) {
            System.out.println("\nKhông có từ Java trong mảng ký tự");
        } else {
            System.out.println("\nSố lần từ Java xuất hiện trong mảng là " + dem);
        }
    }
        // tim vị trí của từ được nhập từ bàn phím
    public static void timchuoi (String mangkt[], int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần tìm trong mảng:");
        String tu = sc.next();
        System.out.print("Vị trị xuất hiện của chuỗi " +tu+ " trong mảng là: ");
        for (int i=0; i< n; i++){
            if (mangkt[i].equals(tu)) {
                System.out.print(i + ",");
            }
        }
    }
}
