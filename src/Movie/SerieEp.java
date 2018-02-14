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
public class SerieEp {
    private String title;
    private Integer length;

    public SerieEp() {
    }

    public SerieEp(String title, Integer length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SerieEp{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
