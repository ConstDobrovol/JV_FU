public class ReaderDo {
    public static void main(String[] args) {
        Reader reader_7 = new Reader("Добровольский К. П.", 7, "Прикладная Информатика", "07.06.2003", "+7902819453");
        Reader reader_17 = new Reader("Сафронов И.М", 17, "Прикладная математика и информатика", "08.05.1999", "+4(950)572-19-95");
        Reader reader_15 = new Reader("Петров В. В.", 15, "Менеджмент", "01.01.2003", "+00(839)614-33-08");
        Reader[] readers = {reader_7, reader_17, reader_15};

        Book_info book_info_1 = new Book_info("451 градус по Фаренгейту", "Рэй Брэдбери");
        Book_info book_info_2 = new Book_info("Мартин Иден", "Джек Лондон");
        Book_info book_info_3 = new Book_info("Титан", "Теодор Драйзер");
        Book_info[] bookInfos = {book_info_1, book_info_2, book_info_3};

        printReaders(readers);
        printBooks(bookInfos);

        reader_7.takeBook(3);
        System.out.println();
        reader_17.takeBook("Финансист");
        reader_15.takeBook(book_info_1, book_info_2, book_info_3);

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