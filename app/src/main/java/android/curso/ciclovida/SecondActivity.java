package android.curso.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    //Aca comienza la app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("Estado: ", "SecondActivity.Create");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Estado: ","SecondActivity.Start");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Estado: ","SecondActivity.Pause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Estado: ","SecondActivity.Stop");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Estado: ","SecondActivity.Resume");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Estado: ","SecondActivity.Restart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Estado: ","SecondActivity.Destroy");
    }
}
