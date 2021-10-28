package ru.netology.manager;

import ru.netology.ListMovie;

public class ManagerMovie {

    int resultLength = 10;

    public ManagerMovie() {
    }

    public ManagerMovie(int resultLength) {
        this.resultLength = resultLength;
    }

    private ListMovie[] movies = new ListMovie[0];

    public void add(ListMovie movie) {
        int length = movies.length + 1;
        ListMovie[] all = new ListMovie[length];
        for (int i = 0; i < movies.length; i++) {
            all[i] = movies[i];
        }
        int lastIndex = all.length - 1;
        all[lastIndex] = movie;
        movies = all;
    }

    public ListMovie[] getAll() {
        if (movies.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = movies.length;
        }
        ListMovie[] result = new ListMovie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
