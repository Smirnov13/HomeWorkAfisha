package ru.netology.HomeWorkObjectAfisha;

public class Afisha {

    private String[] films = new String[0];
//    private int id;
//    private String filmName;
//    private String filmCategory;
    private int limitFilms;

    public Afisha() {
        this.limitFilms = 5;
    }

    public Afisha(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void add(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (limitFilms < films.length) {
            resultLenght = limitFilms;
        } else {
            resultLenght = films.length;
        }
        String[] result = new String[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            result[i] = films[films.length - 1 - i];

        }
        return result;
    }
}

