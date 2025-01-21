package com.challenge.literalura.main;

import com.challenge.literalura.entity.Author;
import com.challenge.literalura.entity.Book;
import com.challenge.literalura.entity.DataAuthor;
import com.challenge.literalura.entity.DataBook;
import com.challenge.literalura.repository.IAuthorRepository;
import com.challenge.literalura.repository.IBookRepository;
import com.challenge.literalura.service.ConsumoApi;
import com.challenge.literalura.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private IBookRepository iBookRepository;
    private IAuthorRepository iAuthorRepository;
    private Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String URL_BASE = "https://gutendex.com/books?search=";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DataBook> dataBookList = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private Optional<Book> bookSearched;
    private List<DataAuthor> dataAuthorList = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    priate Optional<Author> authorSearched;

    public Main (IBookRepository iBookRepository, IAuthorRepository iAuthorRepository) {
        this.iAuthorRepository = iAuthorRepository;
        this.iBookRepository = iBookRepository;
    }

    public void showMenu() {
        var opcion= -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por título 
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    getBookByTitle();
                    break;
                case 2:
                    getRegisteredBooks();
                    break;
                case 3:
                    getRegisteredAuthors();
                    break;
                case 4:
                    getAliveAuthorsIn();
                    break;
                case 5:
                    getBooksByLanguage();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }

    private DataBook getBookByTitle() {
        System.out.println("Escriba el título del libro que desea buscar: ");
        var nombreTitulo = scanner.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreTitulo.replace(" ", "%20"));
        System.out.println(json);
        DataBook data =conversor.obtenerDatos(json, DataBook.class);
        return data;
    }

    private void getRegisteredBooks() {

    }

    private void getRegisteredAuthors() {}

    private void getAliveAuthorsIn() {}

    private void getBooksByLanguage() {}
}
