package android.curso.ciclovida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Prueba con GIT
    //Aca comienza la app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Estado: ", "MainActivity.Create");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Estado: ","MainActivity.Start");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Estado: ","MainActivity.Resume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.e("Estado: ","MainActivity.Pause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.w("Estado: ","MainActivity.Stop");
    }



    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Estado: ","MainActivity.Restart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Estado: ","MainActivity.Destroy");
    }

    public void clickAbrir(View view){
        Log.d("Estado: ","Click en boton");
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
