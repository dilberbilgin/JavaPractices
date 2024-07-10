package javaarrays;

public class CokBoyutluDizilerIleAharfiYazdirma {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++ ){
                if (i == 0 || i == 2){
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println();

        String[][] array = new String[5][4];
        for (int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++){
                if (i == 0 || i == 2 || i == 4){
                    array[i][j] = " * ";
                } else if (j ==0 || j == 3) {
                    array[i][j] = " * ";
                } else {
                    array[i][j] = "  ";
                }
            }
        }
        for (String[] row : array){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
