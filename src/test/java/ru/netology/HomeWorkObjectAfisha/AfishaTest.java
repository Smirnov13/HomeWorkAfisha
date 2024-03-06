package ru.netology.HomeWorkObjectAfisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    @Test
    public void testFinndAll() {
        Afisha afisha = new Afisha();
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
 //       String film6 = "Тролли";

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        String[] actual = afisha.findAll();
        String[] expected = {film1, film2, film3, film4, film5};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLast() {
        Afisha afisha = new Afisha();
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
     //   String film6 = "Тролли";

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        String[] actual = afisha.findLast();
        String[] expected = {film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastTop() {
        Afisha afisha = new Afisha();
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
        String film6 = "Тролли";

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        String[] actual = afisha.findLast();
        String[] expected = {film6, film5, film4, film3, film2};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastTop2() {
        Afisha afisha = new Afisha(6);
        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель Белград";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
        String film6 = "Тролли";
        String film7 = "Обитель зла";

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);
        String[] actual = afisha.findLast();
        String[] expected = {film7, film6, film5, film4, film3, film2};
        Assertions.assertArrayEquals(expected, actual);

    }

}
