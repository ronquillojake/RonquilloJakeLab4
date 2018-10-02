package jake.ronquillo.com.ronquillojakelab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("4itf", "onCreate() has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf","onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf","onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","onDestroy() has executed...");

    }

    public void displayToast(View t) {
        Toast.makeText(this, "Toast is displayed.", Toast.LENGTH_SHORT).show();
    }
    public void displaySnackbar(View v){
        Snackbar.make(v, "Snackbar is displayed", Snackbar.LENGTH_SHORT).show();
    }
}
