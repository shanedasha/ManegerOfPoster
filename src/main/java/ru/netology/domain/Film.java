package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Film  {
    private int id;
    private int filmId;
    private String filmName;
    private int count = 10;
}
