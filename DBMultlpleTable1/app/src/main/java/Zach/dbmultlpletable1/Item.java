package Zach.dbmultlpletable1;

import android.graphics.ImageFormat;

/**
 * Created by Zach on 27/06/2014.
 */
public class Item {

    private int Item_id;
    private int uid;
    private double latitude;
    private double longitude;
    private int category_id;
    private int city_id;
    private int image_id;
    private String title;
    private String description;


    public Item() {

        this.uid = 0;
        this.title = null;
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.category_id = 0;
        this.city_id = 0;
        this.description = null;
        this.image_id = 0;

    }

    public Item(int uid, String title, double latitude, double longitude, int category_id, int city_id,String description, int image_id ) {

        this.uid = uid;
        this.title = title;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category_id = category_id;
        this.city_id = city_id;
        this.description = description;
        this.image_id = image_id;
    }

    public Item( int Item_id, int uid, String title ) {
        this.Item_id = Item_id;
        this.uid = uid;
        this.title = title;
        this.uid = uid;
        this.title = title;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category_id = category_id;
        this.city_id = city_id;
        this.description = description;
        this.image_id = image_id;
    }


    public void setID(int value) {
        this.Item_id = value;
    }
    public int getID() {
        return this.Item_id;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() { return this.title; }

    public void setUID(int value) {
        this.uid = value;
    }

    public int getUID() { return this.uid; }

    public void setLatitude(double value) {
        this.latitude = value;
    }
    public int getLatitude() {
        return this.Item_id;
    }

    public void setLongitude(double value) {
        this.latitude = value;
    }
    public double getLongitude() {
        return this.longitude;
    }

    public int getCity_id() {
        return this.city_id;
    }

    public int getCategory_id() {
        return this.category_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
    public int getImage_id() {
        return this.image_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }



    public String toString() {
        return Item_id + " " + uid + " " + title+" " + latitude + " " + longitude+" " +category_id +" "+ city_id+" "+image_id;
    }
}
