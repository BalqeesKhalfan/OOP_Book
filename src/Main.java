import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the publication year of the book: ");
        int publicationYear = scanner.nextInt();

        // Creating a Book object using the provided information
        Book book = new Book(title, author, publicationYear);

        book.displayBookDetails();//call method from book class to display the details
        scanner.close();
    }
}