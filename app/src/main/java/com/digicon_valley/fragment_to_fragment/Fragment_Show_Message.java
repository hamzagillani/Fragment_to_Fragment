package com.digicon_valley.fragment_to_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Show_Message extends Fragment {

    TextView textView;

    public Fragment_Show_Message() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__show__message, container, false);
            textView=view.findViewById(R.id.textView_Showmessage_id);

            Bundle bundle=getArguments();
            String message=bundle.getString("message");

           textView.setText(message);


        return view;
    }


}
