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
    private CardView genielogiciel,mava,logistique,iia,geniecivil,marketing,banque,comptabilite;
    private TextView textView4;
    private LinearLayout etudiant,cardTexte;
    int statut = 0;
    private static int splashTimeOut = 6000;
    Handler handler = new Handler();
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



//        stephane.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Accueil.this,McvActivity.class);
//                startActivity(intent);
//            }
//        });
//        ivan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Intent intent = new Intent(Accueil.this,Agronomie.class);
//               startActivity(intent);
//            }
//        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statut<100){
                    statut += 1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (statut>=0) {
                                cardTexte.setBackgroundResource(R.drawable.bleupub);
                                etudiant.setBackgroundResource(R.drawable.profil1);
                                textView4.setText("");
                            }
                            if (statut>=5) {
                                cardTexte.setBackgroundResource(R.drawable.photo);
                                textView4.setText("Licence GL");

                                Animation myanim = AnimationUtils.loadAnimation(Accueil.this,R.anim.myanim);
                                myanim.setDuration(2000);
                                textView4.startAnimation(myanim);
                            }
                            if (statut>=40) {
                                cardTexte.setBackgroundResource(R.drawable.bleupub);
                                etudiant.setBackgroundResource(R.drawable.profil2);
                                textView4.setText("");

                            }
                            if (statut>=45) {
                                cardTexte.setBackgroundResource(R.drawable.photo);
                                textView4.setText("Licence GLT");
                                Animation myanim = AnimationUtils.loadAnimation(Accueil.this,R.anim.myanim);
                                myanim.setDuration(2000);
                                textView4.startAnimation(myanim);
                            }
                            if (statut>=80) {
                                cardTexte.setBackgroundResource(R.drawable.bleupub);
                                etudiant.setBackgroundResource(R.drawable.profil3);
                                textView4.setText("");
                            }
                            if (statut>=85) {
                                cardTexte.setBackgroundResource(R.drawable.photo);
                                textView4.setText("Licence IIA");
                                Animation myanim = AnimationUtils.loadAnimation(Accueil.this,R.anim.myanim);
                                myanim.setDuration(2000);
                                textView4.startAnimation(myanim);

//                                ObjectAnimator moveAnim = ObjectAnimator.ofFloat(textView4,"X",70);
//                                moveAnim.setDuration(2000);
//                                moveAnim.setInterpolator(new BounceInterpolator());
//                                moveAnim.start();
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
    //public boolean onContextItemSelected(@NonNull MenuItem item)
    public boolean onOptionsItemSelected(MenuItem item) {
        //AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
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
                //return super.onContextItemSelected(item);
                return super.onOptionsItemSelected(item);
        }
    }
}