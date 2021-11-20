package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ManagerOfPoster {

    private Film[] films = new Film[0];
    private int count = 10;


    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getFilms() {
        int resultLength;
        if (films.length >= 10) {
            resultLength = 10;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}