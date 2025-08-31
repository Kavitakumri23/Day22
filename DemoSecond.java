public class DemoSecond {
    public static void main(String[] args) {
        Pattern2(5);
    }

    static void Pattern2(int n){
        for(int row=0; row<2*n; row++){
            int total = row>n ? 2*n - row: row;
            for(int col=0; col<total; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
