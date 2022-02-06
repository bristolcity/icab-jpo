package cm.sigeris.icab;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private static int splashTimeOut = 6000;
    private TextView gl2,superv,teacher,textView3,textView2;
    int doplay = 2000;
    Handler handler;
    ArrayList<String> arrMessage = new ArrayList<>();
    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        logo = findViewById(R.id.logo);
        gl2 = findViewById(R.id.gl2);
        //teacher = findViewById(R.id.teacher);
        //superv = findViewById(R.id.superv);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        //animer texte

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,Accueil.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanim);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.anim2);
        /*ObjectAnimator moveAnim = ObjectAnimator.ofFloat(teacher, "Y", 1350);
        moveAnim.setDuration(2000);
        moveAnim.setInterpolator(new BounceInterpolator());
        moveAnim.start();*/
        ObjectAnimator scaleAnim = ObjectAnimator.ofFloat(textView2, "scaleX", 1.0f, 2.0f);
        scaleAnim.setDuration(3000);
        scaleAnim.setRepeatCount(ValueAnimator.INFINITE);
        scaleAnim.setRepeatMode(ValueAnimator.REVERSE);
        scaleAnim.start();

        logo.startAnimation(myanim);
        gl2.startAnimation(anim);
    }
        /*Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Accueil.class);
                startActivity(intent);
            }
        }, 5000L);
    }*/
}