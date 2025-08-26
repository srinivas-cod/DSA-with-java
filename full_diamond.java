public class full_diamond {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColinrow = row > n ? 2 * n - row : row;
            int spaces = n - totalColinrow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}