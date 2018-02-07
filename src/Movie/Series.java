
package Movie;


public class Series extends Movie {
    private SeriesEp[] seriesEps;

    private SeriesEp[] generateEp() {
        SeriesEp[] eps = new SeriesEp[3];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = new SeriesEp("theater" + i++,40);
        }
        return eps;
    }
    
    public Series() {
    }

    public Series(String name, String genre, int season, int lenght) {
        super(name, genre, season, lenght);
    }

    public Series(SeriesEp[] seriesEps, String name, String genre, int season, int lenght) {
        super(name, genre, season, lenght);
        this.seriesEps = generateEp();
    }

    public SeriesEp[] getSeriesEps() {
        return seriesEps;
    }

    public void setSeriesEps(SeriesEp[] seriesEps) {
        this.seriesEps = seriesEps;
    }

    @Override
    public String toString() {
        return "Series{" + "seriesEps=" + seriesEps + '}';
    }
    
    
}
