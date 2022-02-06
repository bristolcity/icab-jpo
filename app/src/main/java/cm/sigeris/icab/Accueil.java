package cm.sigeris.icab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
    private Button agro,banque,IIA,GLT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        agro = findViewById(R.id.agro);
        banque= findViewById(R.id.banque);
        GLT= findViewById(R.id.GLT);
        IIA= findViewById(R.id.IIA);
        agro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Accueil.this,Agronomie.class);
               startActivity(intent);
            }
        });
        banque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Accueil.this,Banque.class);
                startActivity(intent);
            }
        });
        GLT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Accueil.this,GLT.class);
                startActivity(intent);
            }
        });
        IIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Accueil.this,IIA.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}