
public class OnlineBookstore {
    public static void main(String[] args) {
        // Testing the EBook class
        EBook ebook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", 9.99, 100, ".pdf");
        System.out.println("EBook Details:");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: $" + ebook.getPrice());
        System.out.println("Quantity: " + ebook.getQuantity());
        System.out.println("File Format: " + ebook.getFileFormat());
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("File format is valid: " + ebook.validateFormat());

        System.out.println("--------------------------");

        // Testing the PhysicalBook class
        PhysicalBook physicalBook = new PhysicalBook("To Kill a Mockingbird", "Harper Lee", 12.99, 50, 750);
        double shippingCost = physicalBook.calculateShippingCost();
        double weightInPounds = physicalBook.getWeightInPounds();
        System.out.println("Physical Book Details:");
        System.out.println("Title: " + physicalBook.getTitle());
        System.out.println("Author: " + physicalBook.getAuthor());
        System.out.println("Price: $" + physicalBook.getPrice());
        System.out.println("Quantity: " + physicalBook.getQuantity());
        System.out.println("Weight: " + physicalBook.getWeight() + " g");
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Weight in Pounds: " + weightInPounds + " lbs");

    }
}