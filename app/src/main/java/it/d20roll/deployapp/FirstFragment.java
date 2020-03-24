package it.d20roll.deployapp;

import java.util.Random;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {
    // Total dice string
    String total = "";

    // Dice number
    private Integer n_d6 = 0;
    private Integer n_d8 = 0;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Graphical elements
        final TextView mTextView = (TextView) view.findViewById(R.id.dice);
        mTextView.setMovementMethod(new ScrollingMovementMethod());

        // D4 ON CLICK FUNCTION
        view.findViewById(R.id.button_d4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer i1 = r.nextInt(5 - 1) + 1;
                total += ("D4 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });

        // D6 ON CLICK FUNCTION
        view.findViewById(R.id.button_d6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n_d6++;
                Random r = new Random();
                Integer i1 = r.nextInt(7 - 1) + 1;
                total += ("D6 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);

            }
        });

        // D8 ON CLICK FUNCTION
        view.findViewById(R.id.button_d8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n_d8++;
                Random r = new Random();
                Integer i1 = r.nextInt(9 - 1) + 1;
                total += ("D8 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });

        // D10 ON CLICK FUNCTION
        view.findViewById(R.id.button_d10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer i1 = r.nextInt(11 - 1) + 1;
                total += ("D10 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });

        // D12 ON CLICK FUNCTION
        view.findViewById(R.id.button_d12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer i1 = r.nextInt(13 - 1) + 1;
                total += ("D12 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });

        // D20 ON CLICK FUNCTION
        view.findViewById(R.id.button_d20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer i1 = r.nextInt(21 - 1) + 1;
                total += ("D20 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });

        // D100 ON CLICK FUNCTION
        view.findViewById(R.id.button_d100).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer i1 = r.nextInt(101 - 1) + 1;
                total += ("D100 " + i1.toString() + "\n");
                mTextView.setText(total);

                // AUTO-SCROLL
                // find the amount we need to scroll.  This works by
                // asking the TextView's internal layout for the position
                // of the final line and then subtracting the TextView's height
                final int scrollAmount = mTextView.getLayout().getLineTop(mTextView.getLineCount()) - mTextView.getHeight();
                // if there is no need to scroll, scrollAmount will be <=0
                if (scrollAmount > 0)
                    mTextView.scrollTo(0, scrollAmount);
                else
                    mTextView.scrollTo(0, 0);
            }
        });
    }
}
