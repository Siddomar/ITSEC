package com.its.itsec;

/**
 * Created by Siddharth Omar on 23-Oct-16.
 */

import android.Manifest;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.github.paolorotolo.appintro.AppIntro;

public class DefaultIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//Down here, we add the xml layouts into sample slide inflater.
        addSlide(IntroSlide.newInstance(R.layout.intro_slide1));
        addSlide(IntroSlide.newInstance(R.layout.intro_slide2));
        showStatusBar(true);
        setDepthAnimation();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        loadMainActivity();
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}




       




    
