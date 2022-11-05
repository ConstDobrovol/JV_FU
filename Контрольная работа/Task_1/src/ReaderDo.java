public class ReaderDo {
    public static void main(String[] args) {
        Reader reader_1 = new Reader("Кондрашов С. К.", 1, "Прикладная Информатика", "23.12.2000", "+79685632121");
        Reader reader_2 = new Reader("Власов М.Д.", 2, "Информационная Безопасность", "08.05.1999", "+79358621415");
        Reader reader_3 = new Reader("Позднякова Е.Л.", 3, "Менеджмент", "01.01.2003", "+79602358779");
        Reader[] readers = {reader_1, reader_2, reader_3};

        Book_info book_info_1 = new Book_info("Война и мир 1 том", "Л. Н. Толстой");
        Book_info book_info_2 = new Book_info("Преступление и наказание", "Ф. М. Достоеввский");
        Book_info book_info_3 = new Book_info("Евгений Онегин", "А. С. Пушкин");
        Book_info[] bookInfos = {book_info_1, book_info_2, book_info_3};

        printReaders(readers);
        printBooks(bookInfos);

        reader_1.takeBook(3);
        System.out.println();
        reader_2.takeBook("Пиковая дама, Сердца в Атлантиде");
        reader_3.takeBook(book_info_1, book_info_2, book_info_3);

    }

    private static void printBooks(Book_info[] bookInfos) {
        System.out.println("Список книг:");
        for (Book_info bookInfo : bookInfos) {
            System.out.println(bookInfo.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}