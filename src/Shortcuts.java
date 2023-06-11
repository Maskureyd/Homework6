import java.util.Scanner;

public class Shortcuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Metin girin:  ");
        String metin = scanner.nextLine().toLowerCase();


        String[] kisaltmalar = {"merhaba", "selam", "teşekkürler", "evet"};
        String[] kisaltmaKodlari = {"mrb", "slm", "tşk", "evt"};


        StringBuilder stringBuilder = new StringBuilder(metin);
        for (int i = 0; i < kisaltmalar.length; i++) {
            String kisaltma = kisaltmalar[i].toLowerCase();
            String kisaltmaKodu = kisaltmaKodlari[i];
            int index = stringBuilder.indexOf(kisaltma);
            while (index != -1) {
                stringBuilder.replace(index, index + kisaltma.length(), kisaltmaKodu);
                index = stringBuilder.indexOf(kisaltma, index + kisaltmaKodu.length());
            }
        }
        metin = stringBuilder.toString();


        if (metin.length() > 40) {
            metin = metin.substring(0, 38) + "...";
        }

        int baslangic = 0;
        int adim = 40;
        while (baslangic < metin.length()) {
            String satir = metin.substring(baslangic, Math.min(baslangic + adim, metin.length()));
            System.out.println(satir);
            baslangic += adim;
        }
    }
}
