public class MitrixSubtraction {//Вычитание матриц
    public static void main(String[] args) {
        int[][] First = new int[3][3];
        int[][] Second = new int[3][3];
        int[][] Result = new int[3][3];
        C_M(First);
        C_M(Second);
        outputmatrix(First);
        System.out.println("    -    ");
        outputmatrix(Second);
        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < Result[i].length; j++) {
                Result[i][j] = First[i][j] - Second[i][j];
            }
        }
        System.out.println("    =    ");
        outputmatrix(Result);
    }
    static void C_M(int[][] Vremenay_M) {
        for (int i = 0; i < Vremenay_M.length; i++) {
            for (int j = 0; j < Vremenay_M[i].length; j++) {
                Vremenay_M[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    static void outputmatrix(int[][] Vremenay_M) {
        for (int[] ints : Vremenay_M) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


}