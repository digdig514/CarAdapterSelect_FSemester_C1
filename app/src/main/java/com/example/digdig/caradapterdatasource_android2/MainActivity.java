package com.example.digdig.caradapterdatasource_android2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.digdig.caradapterdatasource_android2.model.Car;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listViewCars;
    ImageView imageViewCar;
    ArrayList<Car> listOfCars;
    ArrayAdapter<Car> carAdapter;
    int carPictures[]={R.drawable.car0,R.drawable.car1,R.drawable.car2,R.drawable.car3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        listViewCars = (ListView) findViewById(R.id.listViewCars);
        listViewCars.setOnItemClickListener(this);
        imageViewCar = (ImageView) findViewById(R.id.imageViewCar);
        listOfCars = new ArrayList<Car>();
        Car car0 = new Car(carPictures[0],"Toyota","Corolla",12000),
            car1 = new Car(carPictures[1],"Honda","Civic",14000),
            car2 =  new Car(carPictures[2],"Toyota","Camery",19000),
            car3 = new Car(carPictures[3],"Toyota","Yaris",1100);
        //add a object in the array
        listOfCars.add(car0);
        listOfCars.add(car1);
        listOfCars.add(car2);
        listOfCars.add(car3);
        //define adapter this, IF ISN'T IS US LAYOUTE -> android.layout.simple.., database
        //carAdapter = new ArrayAdapter<Car>(this,R.layout.one_element,listOfCars);
        carAdapter = new ArrayAdapter<Car>(this,android.R.layout.simple_list_item_1,listOfCars);
        listViewCars.setAdapter(carAdapter);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        // ArrayListOfCars get(i) take the position and select the image
        imageViewCar.setImageResource(listOfCars.get(i).getPicture());
        /*TextView selectedText = (TextView)view;
        Toast.makeText(this,selectedText.getText().toString(),Toast.LENGTH_LONG).show();*/


        int id = adapterView.getId();
        if (id == R.id.listViewCars)
            Toast.makeText(this,"List View Seleted",Toast.LENGTH_LONG).show();

    }
}
