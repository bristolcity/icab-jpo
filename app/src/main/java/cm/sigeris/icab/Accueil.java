package cm.sigeris.icab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
    private Button ivan, stephane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        ivan = findViewById(R.id.ivan);
        stephane = findViewById(R.id.stephane);

        stephane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(Accueil.this,Agronomie.class);
            }
        });
        ivan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(Accueil.this,Main2Activity.class);
            }
        });
    }
}