package com.digicon_valley.fragment_to_fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment_Send_Message.OnMessageReadListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container)!=null){

            if (savedInstanceState!=null)
                return;
        }

        Fragment_Send_Message fragment_send_message=new Fragment_Send_Message();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container,fragment_send_message,null);
        fragmentTransaction.commit();

    }

    @Override
    public void onMessageRead(String message) {

        Fragment_Show_Message fragment_show_message=new Fragment_Show_Message();

        Bundle bundle=new Bundle();
        bundle.putString("message",message);
        fragment_show_message.setArguments(bundle);


        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction().
                replace(R.id.fragment_container,fragment_show_message,null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
