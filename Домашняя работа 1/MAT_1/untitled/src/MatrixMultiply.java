public class MatrixMultiply {
    public static void main(String[] args) {
        int[][] First = new int[2][3];
        int[][] Second = new int[3][2];
        int[][] RESULT = new int[2][2];
        C_V_M_R(First);
        C_V_M_R(Second);
        outputmatrix(First);
        System.out.println("    *    ");
        outputmatrix(Second);
        for (int i = 0; i < First.length; i++) {
            for (int u = 0; u < Second[0].length; u++) {
                for (int j = 0; j < Second.length; j++) {
                    RESULT[i][u] += First[i][j] * Second[j][u];
                }
            }
        }
        System.out.println("    =    ");
        outputmatrix(RESULT);
    }
    static void C_V_M_R(int[][] Vremenay_M) {
        for (int i = 0; i < Vremenay_M.length; i++) {
            for (int j = 0; j < Vremenay_M[i].length; j++) {
                Vremenay_M[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    static void outputmatrix(int[][] Vremenay_M) {
        for (int[] ints : Vremenay_M) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}