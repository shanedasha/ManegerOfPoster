package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerOfPosterTest {
    ManagerOfPoster manager = new ManagerOfPoster();

    Film first = new Film(101, 1, "First");
    Film second = new Film(201, 2, "Second");
    Film third = new Film(301, 2, "Third");
    Film four = new Film(401, 4, "Four");
    Film five = new Film(501, 5, "Five");
    Film six = new Film(601, 6, "Six");
    Film seven = new Film(701, 7, "Seven");
    Film eight = new Film(801, 8, "Eight");
    Film nine = new Film(901, 9, "Nine");
    Film ten = new Film(111, 10, "Ten");
    Film eleven = new Film(121, 11, "Eleven");


    @Test
    void shouldAddFilm() {
        manager.addFilm(first);
        manager.addFilm(second);
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldGetFilms() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getOneFilmTen() {
        Film first = new Film(101, 1, "First");
        manager.addFilm(first);
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetFilmsTen() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{ten, nine, eight, seven, six, five, four, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetZeroFilms() {
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetFilmsMoreThenTen() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        Film[] expected = manager.getFilms();
        Film[] actual = new Film[]{eleven, ten, nine, eight, seven, six, five, four, third, second};
        assertArrayEquals(expected, actual);
    }
}
