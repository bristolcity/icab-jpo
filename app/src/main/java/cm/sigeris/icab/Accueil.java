package cm.sigeris.icab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Accueil extends AppCompatActivity {
    private CardView genielogiciel,mava,logistique,iia,geniecivil,marketing,banque,comptabilite,agronomie;
    private TextView textView4;
    private LinearLayout etudiant,cardTexte;
    int statut = 0;
    private static int splashTimeOut = 6000;
    Handler handler = new Handler();
    private Button agro,banque,IIA,GLT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        textView4 = findViewById(R.id.textView4);
        etudiant = findViewById(R.id.etudiant);
        cardTexte = findViewById(R.id.cardTexte);

        genielogiciel = findViewById(R.id.card4);
        mava = findViewById(R.id.cardv9);
        logistique = findViewById(R.id.logistique);
        iia = findViewById(R.id.iia);
        geniecivil = findViewById(R.id.carduu);
        marketing = findViewById(R.id.marketing);
        banque = findViewById(R.id.banque);
        comptabilite = findViewById(R.id.comptabilite);

        genielogiciel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,GlActivity.class);
                startActivity(intent);
            }
        });
        mava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Accueil.this,MavaActivity.class);
               startActivity(intent);
            }
        });
        logistique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,Glt.class);
                startActivity(intent);
            }
        });
        iia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,Iia.class);
                startActivity(intent);
            }
        });
        geniecivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,GcActivity.class);
                startActivity(intent);
            }
        });
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,McvActivity.class);
                startActivity(intent);
            }
        });
        banque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,banque.class);
                startActivity(intent);
            }
        });
        banque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,comptabilite.class);
                startActivity(intent);
            }
        });
        agronomie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this,agronomie.class);
                startActivity(intent);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statut<100){
                    statut += 1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (statut>=0) {
                                etudiant.setBackgroundResource(R.drawable.profil1);
                                textView4.setText("");
                            }
                            if (statut>=5) {
                                textView4.setText("Licence GL");

                                ObjectAnimator moveAnim = ObjectAnimator.ofFloat(textView4,"X",70);
                                moveAnim.setDuration(2000);
                                moveAnim.setInterpolator(new BounceInterpolator());
                                moveAnim.start();
                            }
                            if (statut>=40) {
                                etudiant.setBackgroundResource(R.drawable.profil2);
                                textView4.setText("");

                            }
                            if (statut>=45) {
                                textView4.setText("Licence GLT");

                                ObjectAnimator moveAnim = ObjectAnimator.ofFloat(textView4,"X",70);
                                moveAnim.setDuration(2000);
                                moveAnim.setInterpolator(new BounceInterpolator());
                                moveAnim.start();
                            }
                            if (statut>=80) {
                                etudiant.setBackgroundResource(R.drawable.profil3);
                                textView4.setText("");
                            }
                            if (statut>=85) {
                                cardTexte.setBackgroundResource(R.drawable.photo);
                                textView4.setText("Licence IIA");

                                ObjectAnimator moveAnim = ObjectAnimator.ofFloat(textView4,"X",70);
                                moveAnim.setDuration(2000);
                                moveAnim.setInterpolator(new BounceInterpolator());
                                moveAnim.start();
                            }
                            if (statut>=99) {
                                statut = 0;
                            }

                        }
                    });try{
                        Thread.sleep(700);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
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
        }).start();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.menu_about:
                Intent i = new Intent(Accueil.this, Accueil.class);
                startActivity(i);
                return  true;
            case R.id.menu_edit_collectrice:
                Intent j = new Intent(Accueil.this,Accueil.class);
                startActivity(j);
                return  true;
            case R.id.menu_edit_collectrice_pass:
                Intent intent = new Intent(Accueil.this,Accueil.class);
                startActivity(intent);
                return  true;
            default:
                return super.onContextItemSelected(item);
                return super.onOptionsItemSelected(item);
        }
    }
}