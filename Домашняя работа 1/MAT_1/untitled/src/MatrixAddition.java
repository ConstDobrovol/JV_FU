public class MatrixAddition {
    public static void main(String[] args) {
        int[][] One = new int[2][3];
        int[][] Two = new int[2][3];
        int[][] RESULT = new int[2][3];
        C_M(One);
        C_M(Two);
        c_m(One);
        System.out.println("    +    ");
        c_m(Two);
        for (int i = 0; i < RESULT.length; i++) {
            for (int j = 0; j < RESULT[i].length; j++) {
                RESULT[i][j] = One[i][j] + Two[i][j];
            }
        }
        System.out.println("    =    ");
        c_m(RESULT);
    }
    static void C_M(int[][] Matrix_x) {
        for (int i = 0; Matrix_x.length > i; i++) {
            for (int j = 0; Matrix_x[i].length > j; j++) Matrix_x[i][j] = (int) (Math.random() * 10);
        }
    }
    static void c_m(int[][] Matrix_y) {
        for (int[] ints : Matrix_y) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}