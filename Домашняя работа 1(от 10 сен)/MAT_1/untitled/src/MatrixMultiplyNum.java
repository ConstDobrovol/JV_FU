import java.util.Scanner;

public class MatrixMultiplyNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input str: ");
        int lines = in.nextInt(); //кол-во строк
        System.out.print("Input colums: ");
        int col = in.nextInt();//кол-во столбцов
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int[][] M = new int[lines][col];
        int[][] MM = new int[lines][col];
        C_M(M);
        c_matrix(M);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < col; j++) {
                MM[i][j] = M[i][j] * num;
            }
        }
        System.out.println("    =    ");
        c_matrix(MM);
    }

    static void C_M(int[][] Matrix_x) {
        for (int i = 0; Matrix_x.length > i; i++) {
            for (int j = 0; Matrix_x[i].length > j; j++)
                Matrix_x[i][j] = (int) (Math.random() * 10); //ходим циклом по матрице и заполняем рандомными цифрами
        }
    }

    //создадим метод для вывода матрицы
    static void c_matrix(int[][] Matrix_y) {
        for (int[] ints : Matrix_y) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();//перенос строки
        }
    }
}