package javaarrays;

public class MatrisTranspozunuBulma {

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };

        int row = matris.length;
        int col = matris[0].length;

        //Transpoz matrisi icin yeni bir dizi olusturulur
        int[][] transpose = new int[col][row];
        //Transpoz matrisi hesaplanir.
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                transpose[j][i] = matris[i][j];
            }
        }
       // Transpoz matrisi yazdirilir. yazdirma metodu yukarida olusturldu.
        System.out.println("Orijinal matris: ");
        printMatrix(matris);
        System.out.println("Transpoz matris: ");
        printMatrix(transpose);


    }
}
