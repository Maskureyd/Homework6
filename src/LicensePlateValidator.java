import java.util.Scanner;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Plakayı girin:  ");
        String licensePlate = scanner.nextLine();

        if (isValidLicensePlate(licensePlate)) {
            System.out.println("Plaka uygun formatta.");
        } else {
            System.out.println("Plaka uygun formatta değil.");
        }
    }

    public static boolean isValidLicensePlate(String licensePlate) {

        if (licensePlate.length() != 9) {
            return false;
        }


        String digits = licensePlate.substring(0, 2);
        for (char c : digits.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }


        String letters = licensePlate.substring(3, 5);
        for (char c : letters.toCharArray()) {
            if (!Character.isLetter(c) || !Character.isUpperCase(c)) {
                return false;
            }
        }


        String lastDigits = licensePlate.substring(6);
        for (char c : lastDigits.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }


        return true;
    }
}
