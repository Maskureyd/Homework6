import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk stringi girin: ");
        String firstString = scanner.nextLine();

        System.out.print("İkinci stringi girin: ");
        String secondString = scanner.nextLine();

        boolean equal = firstString.equals(secondString);
        if (equal) {
            System.out.println("İki string aynıdır.");
        } else {
            System.out.println("İki string farklıdır.");
        }

        boolean equalIgnoreCase = firstString.equalsIgnoreCase(secondString);
        if (equalIgnoreCase) {
            System.out.println("İki string büyük/küçük harf farkını yok sayarak aynıdır.");
        } else {
            System.out.println("İki string büyük/küçük harf farkını yok sayarak farklıdır.");
        }

        int comparisonResult = firstString.compareTo(secondString);
        if (comparisonResult < 0) {
            System.out.println("Birinci string, ikinci stringden leksikografik olarak öncedir.");
        } else if (comparisonResult > 0) {
            System.out.println("İkinci string, birinci stringden leksikografik olarak öncedir.");
        } else {
            System.out.println("İki string leksikografik olarak aynıdır.");
        }

        System.out.print("Karşılaştırma için başlangıç indisini girin: ");
        int startIndex = scanner.nextInt();

        System.out.print("Karşılaştırma için kaç karakterin kontrol edileceğini girin: ");
        int length = scanner.nextInt();

        boolean regionMatches = firstString.regionMatches(true, startIndex, secondString, startIndex, length);
        if (regionMatches) {
            System.out.println("Belirtilen bölgelerdeki karakterler aynıdır.");
        } else {
            System.out.println("Belirtilen bölgelerdeki karakterler farklıdır.");
        }
    }
}
