package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.ListMovie;
import ru.netology.manager.ManagerMovie;

import static org.junit.jupiter.api.Assertions.*;

class ManagerMovieTest {

    ManagerMovie man = new ManagerMovie();

    ListMovie first = new ListMovie("1", "https://afisha.yandex.ru/moscow/cinema/bloodshot", "Бладшот", "Боевик", false);
    ListMovie second = new ListMovie("2", "https://afisha.yandex.ru/moscow/cinema/forward", "Вперёд", "Мультфильм", false);
    ListMovie third = new ListMovie("3", "https://afisha.yandex.ru/moscow/cinema/hotelBelgrade", "Отель Белград", "Комедия", false);
    ListMovie fourth = new ListMovie("4", "https://afisha.yandex.ru/moscow/cinema/gentlemen", "Джентельмены", "Боевик", false);
    ListMovie fifth = new ListMovie("5", "https://afisha.yandex.ru/moscow/cinema/invisibleMan", "Человек-невидимка", "Ужасы", false);
    ListMovie sixth = new ListMovie("6", "https://afisha.yandex.ru/moscow/cinema/trolls", "Тролли.Мировой тур", "Мультфильм", true);
    ListMovie seventh = new ListMovie("7", "https://afisha.yandex.ru/moscow/cinema/numberOne", "Номер один", "Комедия", true);
    ListMovie eighth = new ListMovie("8", "https://afisha.yandex.ru/moscow/cinema/greenMile", "Зеленая миля", "Драма", false);
    ListMovie ninth = new ListMovie("9", "https://afisha.yandex.ru/moscow/cinema/escapeFromShawshank", "Побег из Шоушенка", "Драма", false);
    ListMovie tenth = new ListMovie("10", "https://afisha.yandex.ru/moscow/cinema/ForrestGump", "Форрест Гамп", "Комедия", false);
    ListMovie eleventh = new ListMovie("11", "https://afisha.yandex.ru/moscow/cinema/lionKing", "Король Лев", "Мультфильм", false);
    ListMovie twelve = new ListMovie("12", "https://afisha.yandex.ru/moscow/cinema/coco", "Тайна Коко", "Мультфильм", false);
    ListMovie thirteenth = new ListMovie("13", "https://afisha.yandex.ru/moscow/cinema/inception", "Начало", "Фантастика", true);
    ListMovie fourteenth = new ListMovie("14", "https://afisha.yandex.ru/moscow/cinema/klaus", "Клаус", "Мультфильм", true);
    ListMovie fifteenth = new ListMovie("15", "https://afisha.yandex.ru/moscow/cinema/snatch", "Большой куш", "Комедия", true);

    @Test
    void aboveMaximumValueMovies() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);
        man.add(thirteenth);
        man.add(fourteenth);
        man.add(fifteenth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifteenth, fourteenth, thirteenth, twelve, eleventh, tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie1() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie2() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie3() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void averageMovieValue() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie1() {
        ManagerMovie man = new ManagerMovie();
        man.add(first);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie2() {
        ManagerMovie man = new ManagerMovie();

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{};
        assertArrayEquals(actual, expected);
    }

    @Test
    void aboveMaximumValueMoviesDesigner12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);
        man.add(thirteenth);
        man.add(fourteenth);
        man.add(fifteenth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifteenth, fourteenth, thirteenth, twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie1Designer12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);
        man.add(thirteenth);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{thirteenth, twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie2Designer12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie3Designer12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void averageMovieValueDesigner12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie1Designer12() {
        ManagerMovie man = new ManagerMovie(12);
        man.add(first);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie2Designer12() {
        ManagerMovie man = new ManagerMovie(12);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{};
        assertArrayEquals(actual, expected);
    }

    @Test
    void aboveMaximumValueMoviesDesigner6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);
        man.add(thirteenth);
        man.add(fourteenth);
        man.add(fifteenth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifteenth, fourteenth, thirteenth, twelve, eleventh, tenth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie1Designer6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie2Designer6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie3Designer6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void averageMovieValueDesigner6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);
        man.add(second);
        man.add(third);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{third, second, first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie1Designer6() {
        ManagerMovie man = new ManagerMovie(6);
        man.add(first);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie2Designer6() {
        ManagerMovie man = new ManagerMovie(6);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{};
        assertArrayEquals(actual, expected);
    }

    @Test
    void aboveMaximumValueMoviesDesigner1() {
        ManagerMovie man = new ManagerMovie(1);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(fourth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);
        man.add(twelve);
        man.add(thirteenth);
        man.add(fourteenth);
        man.add(fifteenth);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{fifteenth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie1Designer1() {
        ManagerMovie man = new ManagerMovie(1);
        man.add(first);
        man.add(second);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void maximumBoundaryValueMovie2Designer1() {
        ManagerMovie man = new ManagerMovie(1);
        man.add(first);


        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void minimumBoundaryValueMovie2Designer1() {
        ManagerMovie man = new ManagerMovie(1);

        ListMovie[] actual = man.getAll();
        ListMovie[] expected = new ListMovie[]{};
        assertArrayEquals(actual, expected);
    }
}

