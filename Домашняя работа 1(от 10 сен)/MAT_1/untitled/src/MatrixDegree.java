public class MatrixDegree {
    public static void main(String[] args) {
        int[][] First = new int[3][3];
        int[][] Second = new int[3][3];
        int[][] res = new int[3][3];
        C_M(First);
        Second = First;
        c_m(First);
        System.out.println("    ^    ");
        int n = 3;
        int power = 1;
        int[][] RESULT_0 = new int[3][3];
        System.out.println(n);
        while (power < n) {
            for (int i = 0; i < First.length; i++) {
                for (int u = 0; u < Second[0].length; u++) {
                    for (int j = 0; j < Second.length; j++) {

                        res[i][u] += Second[i][j] * First[j][u];
                    }
                }
            }
            Second = res;
            res = RESULT_0;
            power++;
        }
        System.out.println("    =    ");
        c_m(res);
    }
    static void C_M(int[][] Matrix_x) {
        for (int i = 0; i < Matrix_x.length; i++) {
            for (int j = 0; j < Matrix_x[i].length; j++) {
                Matrix_x[i][j] = (int) (Math.random() * 10);
            }
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