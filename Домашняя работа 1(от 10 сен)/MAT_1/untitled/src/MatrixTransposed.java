public class MatrixTransposed {
    public static void main(String[] args) {
        int lines = 3;
        int col = 5;
        int[][] M = new int[lines][col];
        int[][] TransposedM = new int[col][lines];
        C_M(M);
        c_m(M);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < lines; j++) TransposedM[i][j] = M[j][i];
        }
        System.out.println("========");
        c_m(TransposedM);
    }
    static void C_M(int[][] Vremenay_M) {
        for (int i = 0; Vremenay_M.length > i; i++) {
            for (int j = 0; Vremenay_M[i].length > j; j++) {
                Vremenay_M[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    static void c_m(int[][] Vremenay_M) {
        for (int[] ints : Vremenay_M) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}