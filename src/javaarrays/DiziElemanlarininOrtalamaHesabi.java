package javaarrays;

public class DiziElemanlarininOrtalamaHesabi {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double sum = 0.0;

        for (int i = 0; i<list.length; i++){
            sum += list[i];
        }
        System.out.println("Toplam: " + sum);
        System.out.println("Liste Eleman Sayisi: " + list.length);

        double avarage = sum/list.length;
        System.out.println("Ortalama: " + avarage);
    }




}
