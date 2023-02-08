import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Reader reader = new Reader("Abduvokhob uulu Matmusa ", 609038, "philosophy", LocalDate.of(2001, 10, 12), 799567818);

        System.out.println("\nДОБРО ПОЖАЛОВАТЬ В БИБЛИОТЕКУ!" +
                "\nЕСЛИ ХОТИТЕ ВЗЯТЬ КНИГУ,ТО НАЖМИТЕ 1" +
                "\nЕСЛИ ХОТИТЕ ВЕРНУТЬ КНИГУ ,ТО НАЖМИТЕ 2");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("\nСКОЛЬКО КНИГ БУДЕТЕ БРАТЬ : ");
            reader.takeBook(scanner.nextInt());
        } else if (a == 2) {
            System.out.println("\nСКОЛЬКО КНИГ ХОТИТЕ  ВЕРНУТЬ  : ");
            reader.returnBook(scanner.nextInt());
        }


    }
}