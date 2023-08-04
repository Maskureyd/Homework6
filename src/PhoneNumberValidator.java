import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Telefon numarasını girin:  ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Geçerli telefon numarası.");
            System.out.println("Alan kodu: " + getAreaCode(phoneNumber));
            System.out.println("Telefon numarası:  " + getPhoneNumber(phoneNumber));
        } else {
            System.out.println("Geçerli bir telefon numarası değil.");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {

        String pattern = "^\\(?(5[0-9]{2})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";


        return phoneNumber.matches(pattern);
    }

    public static String getAreaCode(String phoneNumber) {

        String pattern = "^\\(?(5[0-9]{2})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        String areaCode = "";

        if (phoneNumber.matches(pattern)) {
            areaCode = phoneNumber.replaceAll(pattern, "$1");
        }

        return areaCode;
    }

    public static String getPhoneNumber(String phoneNumber) {

        String pattern = "^\\(?(5[0-9]{2})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        String number = "";

        if (phoneNumber.matches(pattern)) {
            number = phoneNumber.replaceAll(pattern, "$2$3");
        }

        return number;
    }
}
