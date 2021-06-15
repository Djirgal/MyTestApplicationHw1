package keyone.keytwo.mytestapplicationhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//вызов родительского класса
        setContentView(R.layout.activity_main);//метод устанавливает содержимое activity из layout-файла
       // setContentView(R.layout.activity_main2);
    }
}