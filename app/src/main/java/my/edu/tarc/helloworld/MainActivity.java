package my.edu.tarc.helloworld;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Module level variable
    private TextView textViewMessage;
    private ImageView imageStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Link variable to UI component
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
        imageStar = (ImageView) findViewById(R.id.imageView);


    }

    public void showMessage(View v) {
        textViewMessage.setText("Hi my name is Boss Baby~~~");



    }

    public void clearMessage(View v){

        textViewMessage.setText("");
    }


}
