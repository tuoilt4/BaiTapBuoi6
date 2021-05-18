import java.util.Scanner;

public class BaiTapBuoi6_1 {
    // Nhập mảng số nguyên
    public static void nhapmang (int mangsn[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            mangsn[i] = sc.nextInt();
        }
    }
    // In ra thông tin mangr
    public static void inmang(int mangsn[],int n){
        System.out.print("In mảng: ");
        for (int i=0; i< n; i++){
            System.out.print( mangsn[i] + "\t");
        }
    }

    // tìm số lần lớn nhất mảng và in ra vị trí của số
    public static void timsoln (int mangsn[], int n) {
        int soln = mangsn[0];
//        int index = 0;
        for (int i = 1; i < n; i++) {
            if (mangsn[i] > soln) {
                soln = mangsn[i];
//                index = i;
                }
            }
        System.out.print("\nSố lớn nhất của mảng là " + soln+ " và index của phần từ là: ");
        timvitri(mangsn,soln);
    }

    // tìm số nhỏ nhất mảng và in ra vị trí của số

    public static void timsonn (int mangsn[], int n){
        int sonn =mangsn[0];
//        int index1 = 0;
        for (int i= 1; i<mangsn.length;i++) {
            if (mangsn[i]< sonn){
                sonn =mangsn[i];
//                index1 = i;
                }
            }
        System.out.print("\nSố nhỏ nhất của mảng là " + sonn+" và index của phần từ là ");
        timvitri(mangsn,sonn);
    }

    // tìm số lớn thứ 2 và in ra vị trí
    public static void timsoln2(int mangsn[], int n){
        int soln1, soln2;
        if (mangsn[0] > mangsn[1]){
            soln1 = mangsn[0];
            soln2 = mangsn[1];
        }else{
            soln1 = mangsn[1];
            soln2 = mangsn[0];
        }
        for(int i = 2; i < n; i++){
            if(mangsn[i] >= soln1){
                soln2 = soln1;
                soln1 = mangsn[i];
            }else if (mangsn[i] > soln2){
                soln2 = mangsn[i];
            }
        }
            System.out.print("\nSố lớn thứ hai của mảng là " + soln2+" và index của phần từ là ");
        timvitri(mangsn,soln2);
    }
    public static void timvitri (int mangsn[], int n)
    {
        for (int i= 0; i<mangsn.length;i++) {
            if (mangsn[i] == n) {System.out.print (i + ",");}
            }
    }
}
