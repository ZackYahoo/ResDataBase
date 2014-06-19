package com.tripmoney.resdatabase.app;


 import net.epsilonlabs.datamanagementefficient.library.DataManager;

 import android.widget.TextView;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.EditText;
 import android.app.Activity;
 import android.database.Cursor;

 import java.util.Collection;

public class MainActivity extends Activity {


    private Cursor resultSet;

    private EditText edit_row_num;
    private EditText editTextCity;
    private EditText editTextRestaurant;
    private EditText editTextAttraction;
    private EditText editTextFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_row_num = (EditText)findViewById(R.id.edit_row_num);
        editTextCity = (EditText)findViewById(R.id.edit_row_city);
        editTextRestaurant = (EditText)findViewById(R.id.edit_row_restaurant);
        editTextAttraction = (EditText)findViewById(R.id.edit_row_attraction);
        editTextFood = (EditText)findViewById(R.id.edit_row_food);

        DataManager dm =DataManager.getInstance(this);

        dm.open();
       dm.add(City.class);




        for (City city : dm.getAll(City.class)) {

            city.getID();
            city.getAttraction();
            city.getFood();
            edit_row_num = (EditText)findViewById(R.id.edit_row_num);
            edit_row_num.setText(city.getID());



        }
        




        //resultSet.moveToFirst();

        //displayRow();
        dm.close();




    }

    private void displayRow() {
        //DataManager dm =DataManager.getInstance(this);

        City city = new City();
        //City city = dm.tblCities.cursorRowToCity( resultSet );
        edit_row_num.setText( resultSet.getPosition() + " / " + resultSet.getCount() );
        editTextCity.setText( city.getCity() );
        editTextRestaurant.setText( city.getRestaurant() );
        editTextAttraction.setText( city.getAttraction() );
        editTextFood.setText( city.getFood() );
    }

    public void gotoFirst(View v) {
        resultSet.moveToFirst();
        displayRow();
    }

    public void gotoNext(View v) {
        if ( !resultSet.moveToNext() ) {
            // moved to beyond the last entry in the result set
            resultSet.moveToLast();
        }
        displayRow();

    }

    public void gotoPrevious(View v) {
        if ( !resultSet.moveToPrevious() ) {
            // moved to before the first entry in the result set
            resultSet.moveToFirst();
        }
        displayRow();
    }

    public void gotoLast(View v) {
        resultSet.moveToLast();
        displayRow();
    }



}