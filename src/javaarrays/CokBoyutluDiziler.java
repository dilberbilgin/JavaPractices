package javaarrays;

public class CokBoyutluDiziler {
    public static void main(String[] args) {

        int[][] matris = new int[3][4];

        System.out.println(matris.length); // matris.length diyince [3][4] ten 3'u length olarak kabul ediyor'
        System.out.println(matris[0].length); // ilk satir 0 yazinca satir uzunlugu 4 ciktisini veriyor

        // sirayla matrisleri gezecegiz. satir secip sutunleri geecegiz. for ile

        int number = 1;

        for (int i = 0; i < matris.length; i++){ //matris[i] elde edilmis oldu
            for (int j = 0; j< matris[i].length; j++){ ////matris[j] elde edilmis oldu
                matris[i][j] = number++;
              //  System.out.print(matris[i][j] + " ");

            }
           // System.out.println();
        }
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

}
