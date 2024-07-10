package javaarrays;

public class DizidekiTekrarEdenSayilariBulma {

    static boolean isFind(int[] arr, int value){ //tekrar eden sayilari yazdirmamasi icin bir metod yaziyoruz.
        for (int i : arr) {
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

//        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1};
        int[]list = {4, 7, 4, 3, 2, 9, 10, 12, 1, 12, 10, 1};
        int[] dublicate = new int[list.length];
        int startIndex = 0;


        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
//                if ((i != j) && (list[i] == list[j])){
//                    if (!isFind(dublicate, list[i])){ //burada dublicate icerisinde sorgu yapiyoruz.
//                        dublicate[startIndex++] = list[i];
//                    }
//                    break;
//                }
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0) && list[j] % 2 == 0){
                    if (!isFind(dublicate, list[i])){
                        dublicate[startIndex++] = list[i];
                    }
                }
            }
        }
        for (int value : dublicate){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
        //System.out.println(Arrays.toString(dublicate));

    }
}
