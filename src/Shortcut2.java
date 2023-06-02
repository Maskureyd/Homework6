import java.util.Scanner;

public class Shortcut2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metin girin: ");
        String metin = scanner.nextLine();


        if (metin.startsWith("WWW")) {
            metin = metin.replaceFirst("WWW", "www");
        }


        if (metin.endsWith(".com.tr")) {
            metin += " - Ticari";
        }

        int ilkZIndex = metin.indexOf('z');

        int sonZIndex = metin.lastIndexOf('z');

        String yeniMetin = metin.substring(ilkZIndex, sonZIndex + 1);

        metin += " " + yeniMetin;

        metin = metin.toLowerCase();

        metin = metin.trim();

        System.out.println("İlk indeks: " + ilkZIndex);
        System.out.println("Son indeks: " + sonZIndex);
        System.out.println("İşlemler sonucu elde edilen metin: " + metin);
    }
}
