package cm.sigeris.icab;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class icab extends AppCompatActivity {
    private TextView textView3,textView2,textView,textView5,textView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icab);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.textView3);

        /*ObjectAnimator anim = ObjectAnimator.ofFloat(textView5, "rotation", 10f, 12f);
        anim.setDuration(2000);                  // Duration in milliseconds
         // E.g. Linear, Accelerate, Decelerate
        anim.start();*/
        @SuppressLint("ResourceType") Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanim);

        ObjectAnimator anima = ObjectAnimator.ofFloat(textView3, "rotation", 360);
        anima.setDuration(2000);
        anima.start();

        ObjectAnimator anime = ObjectAnimator.ofFloat(textView6, "rotation", 360);
        anime.setDuration(2000);
        anime.start();
        ObjectAnimator anim = ObjectAnimator.ofFloat(textView, "rotation", 360);
        anim.setDuration(2000);
        anim.start();
        textView5.startAnimation(myanim);
        textView2.startAnimation(myanim);


    }

}

