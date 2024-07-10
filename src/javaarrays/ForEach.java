package javaarrays;

public class ForEach {
    public static void main(String[] args) {
//        int[] list = {1,2,3,4};
//        for (int i = 0; i < list.length; i++){
//          //  System.out.println(list[i]);
//        }
//
//        int sum = 0;
//        for (int i : list){
//            sum += i;
//        }
//        System.out.println(sum);
//
//    }

        //-------------------------------------STRING-------------------------

//        String[] cars = {"A", "B", "C", "D"};
//        for (String str : cars) {
//            System.out.println(str);
//        }
//
//        System.out.println("-----------------------------");
//        System.out.println(cars[2]);


        //-------------------------------------MATRIS-------------------------

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
//        for (int i = 0; i < matris.length; i++){ // cok boyutlu dizilerde dizinin length i onun satir sayisina esittir.
//            for (int k = 0; k < matris[i].length; k++){
//                System.out.print(matris[i][k] + " ");
//            }
//            System.out.println();
//        }

        for (int [] row : matris){
            for (int col : row){
                System.out.print( col + " ");
            }
            System.out.println();
        }
    }
}
