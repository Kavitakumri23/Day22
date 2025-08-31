public class MainPattern {
    public static void main(String[] args) {
        pattern3(4);
    }

//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            //When one row is printed , we need to add a newline
//            System.out.println();
//        }
//    }
//}
//    static void pattern2(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            //When one row is printed , we need to add a newline
//            System.out.println();
//        }


    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            //When one row is printed , we need to add a newline
            System.out.println();
        }
    }
}