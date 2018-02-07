/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

/**
 *
 * @author INT105
 */
public class Movie {

    private String name;
    private String genre;
    private int season;
    private int lenght;

    public Movie() {
    }

    public Movie(String name, String genre, int season, int lenght) {
        this.name = name;
        this.genre = genre;
        this.season = season;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", genre=" + genre + ", season=" + season + ", lenght=" + lenght + '}';
    }

}
