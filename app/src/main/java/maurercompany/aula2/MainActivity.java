package maurercompany.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText v1;
    EditText v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.xBtn);
        v1 = (EditText) findViewById(R.id.xV1);
        v2 = (EditText) findViewById(R.id.xV2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                Random n = new Random();
                int minimo = Integer.parseInt(v1.getText().toString());
                int maximo= Integer.valueOf(v2.getText().toString());


                String result= String.valueOf(n.nextInt(maximo-minimo)+minimo);
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this,"O cabeça informa um numero", Toast.LENGTH_LONG);
                    Log.i("Projeto", e.getMessage());
                }


            }
        });






    }

    protected void onStart(){
        super.onStart();
        Log.i("projeto", "Metodo on Start");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("projeto", "Metodo on resStart");
    }

    protected void onPause(){
        super.onPause();
        Log.i("projeto", "Metodo on Pause");
    }

    protected void onStop(){
        super.onStop();
        Log.i("projeto", "Metodo on Stop");
    }
    protected void onResume(){
        super.onResume();
        Log.i("projeto", "Metodo on Resume");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("projeto", "Metodo on Destroy");
    }

}
