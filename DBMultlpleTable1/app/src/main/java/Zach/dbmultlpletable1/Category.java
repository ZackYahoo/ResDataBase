package Zach.dbmultlpletable1;

/**
 * Created by Zach on 27/06/2014.
 */
public class Category {

    private int category_id;
    private int uid;
    private String title;


    public Category() {
        this.category_id = 0;
        this.uid = 0;
        this.title = null;
    }

    public Category(int uid, String title ) {

        this.uid = uid;
        this.title = title;
    }

    public Category( int category_id, int uid, String title ) {
        this.category_id = category_id;
        this.uid = uid;
        this.title = title;
    }


    public void setID(int value) {
        this.category_id = value;
    }
    public int getID() {
        return this.category_id;
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
        return category_id + " " + uid + " " + title ;
    }
}
