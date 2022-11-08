//ВЫчитание матриц
public class MitrixSubtraction {//Вычитание матриц
    public static void main(String[] args) {
        int[][] First = new int[3][3];
        int[][] Second = new int[3][3];
        int[][] Result = new int[3][3];
        C_M(First);
        C_M(Second);
        Out_Matrix(First);
        System.out.println("    -    ");
        Out_Matrix(Second);
        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < Result[i].length; j++) {
                Result[i][j] = First[i][j] - Second[i][j];
            }
        }
        System.out.println("    =    ");
        Out_Matrix(Result);
    }
    static void C_M(int[][] Matrix_x) {
        for (int i = 0; i < Matrix_x.length; i++) {
            for (int j = 0; j < Matrix_x[i].length; j++) {
                Matrix_x[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    static void Out_Matrix(int[][] Matrix_y) {
        for (int[] ints : Matrix_y) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


}