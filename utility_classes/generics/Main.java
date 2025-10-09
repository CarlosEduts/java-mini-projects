package utility_classes.generics;

import java.util.ArrayList;
import java.util.List;

import utility_classes.generics.domain.Book;
import utility_classes.generics.domain.Movie;
import utility_classes.generics.service.ContentRental;

/*
 * Conteúdo: Classes Utilitárias
 * Caso de uso: Trabalhando com genéricos, criando uma locadora de conteúdos com uma classe genérica
 * Data de criação: 09/10/2025
 */

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Book e Movie
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Animal Farm", "George Orwell");
        Movie movie1 = new Movie("Inception", "Christopher Nolan");
        Movie movie2 = new Movie("Interstellar", "Christopher Nolan");

        // Adicionando livros e filmes às listas
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
