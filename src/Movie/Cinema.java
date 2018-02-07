
package Movie;


public class Cinema extends Movie {
    private Theater[] theaters;

    private Theater[] generateTheater() {
        Theater[] theaters = new Theater[3];
        for (int i = 0; i < theaters.length; i++) {
            theaters[i] = new Theater("theater" + i++);
        }
        return theaters;
    }

    public Cinema() {
    }

    public Cinema(String name, String genre, int season, int lenght) {
        super(name, genre, season, lenght);
        this.theaters = generateTheater();
    }

    public Cinema(Theater[] theater, String name, String genre, int season, int lenght) {
        super(name, genre, season, lenght);
        this.theaters = theater;
    }

    public Theater[] getTheater() {
        return theaters;
    }

    public void setTheater(Theater[] theater) {
        this.theaters = theater;
    }

    @Override
    public String toString() {
        return "Cinema{" + "theater=" + theaters + '}';
    }

}
