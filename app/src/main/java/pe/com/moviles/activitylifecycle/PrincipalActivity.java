package pe.com.moviles.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PrincipalActivity extends AppCompatActivity {
    //    TODO 1: Crear constante con valor "Estado"
    final String TAG = "PrincipalActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Log.i(TAG, "MainActivity: onCreate()");
    }

    // TODO 2: Implementar los métodos del ciclo de vida
    // TODO 3: Imprimir en el log cada método para observar el comportamiento de la actividad "Log.i(TAG, "MainActivity: onRestart()")"
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity: onDestroy()");
    }

}
