package Tasks;

import classes.a;

public class Book {
        private a.Title title;
        private a.Author author;
        private a.Content content;
        public Book(a.Title title, a.Author author, a.Content content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }
        public void show() {
            title.show();
            author.show();
            content.show();
        }
        public static void main(String[] args) {
            a.Title bookTitle = new a.Title("The Book");
            a.Author bookAuthor = new a.Author("F. Nizche");
            a.Content bookContent = new a.Content("Chapter 1...");
            Book book = new Book(bookTitle, bookAuthor, bookContent);
            book.show();
        }
    }
