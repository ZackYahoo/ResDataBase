package com.tripmoney.resdatabase.app;
import net.epsilonlabs.datamanagementefficient.annotations.Id;
/**
 * Created by Zach on 18/06/2014.
 */
public class City {

    @Id
    private int id;
    private String city;
    private String restaurant;
    private String attraction;
    private String food;

    public City() {
        this.city = null;
        this.restaurant = null;
        this.attraction = null;
        this.food = null;
    }

    public City( String city, String restaurant, String attraction, String food ) {
        this.city = city;
        this.restaurant = restaurant;
        this.attraction = attraction;
        this.food = food;
    }

    public City( int id, String city, String restaurant, String attraction, String food ) {
        this.id = id;
        this.city = city;
        this.restaurant = restaurant;
        this.attraction = attraction;
        this.food = food;
    }

    public int getID() {
        return this.id;
    }


    public String getCity() {
        return this.city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getRestaurant() {
        return this.restaurant;
    }

    public void setRestaurant(String value) {
        this.restaurant = value;
    }

    public String getAttraction() {
        return this.attraction;
    }

    public void setAttraction(String value) {
        this.attraction = value;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String value) {
        this.food = value;
    }

    public String toString() {
        return id + " " + city + " " + restaurant + " " + attraction + " " + food;
    }

} // end of class City