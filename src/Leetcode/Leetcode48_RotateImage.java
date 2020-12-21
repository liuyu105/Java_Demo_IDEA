package Leetcode;

public class Leetcode48_RotateImage {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Leetcode48_RotateImage.rotate2(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    //方法一：两次旋转--先转置，再左右翻转
    public static void rotate(int[][] matrix) {
        //转置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int a = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = a;
            }
        }

        //左右翻转
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int a = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = a;
            }
        }
    }

    //方法二：旋转四个矩形
    public static void rotate2(int[][] matrix) {
        int n = matrix.length;
        //先将最外围进行旋转 然后逐次到最内层
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                //第一个横坐标=第二个纵坐标；第一个纵坐标+第二个横坐标=n-1
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }

    }
}
