public class Main {
    public static void main(String[] args) {
        Author author = new Author("Донна", "Тартт");
        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book ( author, 2013, "Щегол");
        book1.setName("Щегол");
        book1.setYear(2013);
        System.out.println(book1.getAuthor() +" "+ book1.getName());
        System.out.println(book1.getYear());
        book1.setYear(2033);
        System.out.println(book1.getYear());



        Book book2 = new Book(author1, 1866, "Преступление и наказание");

        book2.setName("Преступление и наказание");
        book2.setYear(1866);
        System.out.println(author1 +" " +book2.getName());
        System.out.println(book2.getYear());
    }
}