package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerOfPosterTest {
    ManagerOfPoster manager = new ManagerOfPoster();

    Film first = new Film(101, 1, "First", 1);
    Film second = new Film(201, 2, "Second", 1);
    Film third = new Film(301, 2, "Third", 1);
    Film four = new Film(401, 4, "Four", 1);
    Film five = new Film(501, 5, "Five", 1);
    Film six = new Film(601, 6, "Six", 1);
    Film seven = new Film(701, 7, "Seven", 1);
    Film eight = new Film(801, 8, "Eight", 1);
    Film nine = new Film(901, 9, "Nine", 1);
    Film ten = new Film(111, 10, "Ten", 1);
    Film eleven = new Film(121, 11, "Eleven", 1);


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
        Film first = new Film(101, 1, "First", 10);
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
