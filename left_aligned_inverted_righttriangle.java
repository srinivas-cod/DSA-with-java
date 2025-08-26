public class left_aligned_inverted_righttriangle {
    public static void main(String[] args) {
        pattern3(6);
    }
    static void pattern3(int n){
        for(int row =1;row<=n;row++) {
            for(int col = 1;col<=n-row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
