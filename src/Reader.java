import java.time.LocalDate;

public class Reader {

    String fullName;
    int libraryCardNumber;
    String facultaty;
    LocalDate localDate;
    int phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String facultaty, LocalDate localDate, int phoneNumber) {

        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.facultaty = facultaty;
        this.localDate = localDate;
        this.phoneNumber = phoneNumber;

    }

    public String getFullName() {
        return fullName;
    }

    public String getFacultaty() {
        return facultaty;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(int a) {
        Reader reader = new Reader("Abduvokhob uulu Matmusa ", 609038, "philosophy", LocalDate.of(2001, 10, 12), 799567818);
        System.out.println(reader.fullName + "из факультета " + reader.facultaty + "  и с картой библиотеки  " + reader.libraryCardNumber + " взял " + a + "  книг. ");

    }

    public void returnBook(int a) {
        Reader reader = new Reader("Abduvokhob uulu Matmusa ", 609038, "philosophy", LocalDate.of(2001, 10, 12), 799567818);
        System.out.println(reader.fullName + "из факультета " + reader.facultaty + "  и с картой библиотеки  " + reader.libraryCardNumber + "  вернул  " + a + " книг. ");

    }
}
