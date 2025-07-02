public class matrix_mul {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] c = new int[3][3];

        // 矩陣相乘，逐步顯示詳細計算
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("計算 c[" + i + "][" + j + "]：");
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    int product = a[i][k] * b[k][j];
                    System.out.println("a[" + i + "][" + k + "] * b[" + k + "][" + j + "] = "
                            + a[i][k] + " * " + b[k][j] + " = " + product);
                    c[i][j] += product;
                }
                System.out.println("=> c[" + i + "][" + j + "] = " + c[i][j]);
                System.out.println();
            }
        }

        // 最後輸出整個結果矩陣
        System.out.println("最終結果矩陣 C：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



