import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a= ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b= ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c= ");
        double c = scanner.nextDouble();
        System.out.println(KiemTraDayLaTamGiac(a, b, c));
    }

    public static String KiemTraDayLaTamGiac(double a, double b, double c) throws Exception {
        try {
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception(" so canh nhap vao ko duoc am");
            } else if ((a + b) < c || (a + c) < b || (c + b) < a) {
                throw new Exception(" tong so canh ko duoc nho hon canh con lai");
            } else {
                return "Day la tam giac";
            }
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

}
