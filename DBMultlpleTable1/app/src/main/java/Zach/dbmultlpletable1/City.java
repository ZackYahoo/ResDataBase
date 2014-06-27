package Zach.dbmultlpletable1;

/**
 * Created by Zach on 27/06/2014.
 */
public class City {

    private int city_id;
    private int uid;
    private String title;


    public City() {
        this.city_id = 0;
        this.uid = 0;
        this.title = null;
    }

    public City(int uid, String title ) {

        this.uid = uid;
        this.title = title;
    }

    public City( int city_id, int uid, String title ) {
        this.city_id = city_id;
        this.uid = uid;
        this.title = title;
    }


    public void setID(int value) {
        this.city_id = value;
    }
    public int getID() {
        return this.city_id;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setUID(int value) {
        this.uid = value;
    }

    public int getUID() {
        return this.uid;
    }





    public String toString() {
        return city_id + " " + uid + " " + title ;
    }

} // end of class City