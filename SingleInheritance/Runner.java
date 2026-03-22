package out.gla.Inheritance.SingleInheritance;
public class Runner {
    public static void main(String[] args) {

        Author book1 = new Author(
                "Java Programming",
                2022,
                "James Gosling",
                "Father of Java programming language"
        );

        book1.displayInfo();
    }
}