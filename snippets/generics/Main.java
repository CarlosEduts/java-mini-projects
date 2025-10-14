package snippets.generics;

import java.util.ArrayList;
import java.util.List;

import snippets.generics.domain.Book;
import snippets.generics.domain.Movie;
import snippets.generics.service.ContentRental;

/*
 * Conteúdo: Trabalhando com genéricos
 * Caso de uso: Criando uma locadora de conteúdos com uma classe genérica
 * Data de criação: 09/10/2025
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Animal Farm", "George Orwell");
        Movie movie1 = new Movie("Inception", "Christopher Nolan");
        Movie movie2 = new Movie("Interstellar", "Christopher Nolan");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        // Criando instâncias de ContentRental para Book e Movie
        ContentRental<Book> contentRentalBooks = new ContentRental<Book>(books);
        ContentRental<Movie> contentRentalMovies = new ContentRental<Movie>(movies);

        // Exibindo, alugando e devolvendo conteúdos
        contentRentalBooks.displayContent();
        contentRentalBooks.rentContent(book2);
        contentRentalBooks.returnContent(book2);

        contentRentalMovies.displayContent();
        contentRentalMovies.rentContent(movie1);
        contentRentalMovies.returnContent(movie1);
    }
}
