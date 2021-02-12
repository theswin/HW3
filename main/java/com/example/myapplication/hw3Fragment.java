package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class hw3Fragment extends Fragment {
    private Button mPlus1;
    private Button mPlus5;
    private Button mReset;
    private Button mNeg1;
    private Button mNeg5;
    public int mCurCount=0;
    public String Cur= (Integer.toString(mCurCount));
    public TextView mCount;



    private void updateCount() {

        Cur= (Integer.toString(mCurCount));
        mCount.setText(Cur);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(
                R.layout.fragment_hw3,    // layout resource id
                container,                  // the view's parent
                false);                     // view gets added in view activity's code.
        mPlus1.setText(R.string.counter1);
        mPlus5.setText(R.string.counter5);
        mReset.setText(R.string.reset);
        mNeg1.setText(R.string.counterNeg1);
        mNeg5.setText(R.string.counterNeg5);
        mCount=(TextView)v.findViewById(R.id.AnsVal);
        mCount.setText(Cur);



        mPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurCount+=1;
                updateCount();
            }
        });
        mPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurCount+=5;
                updateCount();
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurCount=0;
                updateCount();
            }
        });
        mNeg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurCount-=1;
                updateCount();
            }
        });
        mNeg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurCount-=5;
                updateCount();
            }
        });



        return v;
    }

}