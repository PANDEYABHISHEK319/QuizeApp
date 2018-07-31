package quiz.com.quizapp;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    CheckBox q1i;
    CheckBox q1ii;
    CheckBox q4i;
    CheckBox q4ii;
    CheckBox q5i;
    CheckBox q5ii;
    RadioGroup q2;
    RadioButton q2i;
    RadioGroup q3;
    RadioButton q3i;
    RadioGroup q6;
    RadioButton q6i;
    RadioGroup q7;
    RadioButton q7i;
    RadioGroup q9;
    RadioButton q9i;
    RadioGroup q10;
    RadioButton q10i;
    EditText q8;
    Button sub1;
    Button sub2;
    Button sub3;
    Button sub4;
    Button sub5;
    Button sub6;
    Button sub7;
    Button sub8;
    Button sub9;
    Button sub10;

    int score;
    int scorePerq = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findviewById
        init();

        //set listener
        q1i.setOnCheckedChangeListener(this);
        q1ii.setOnCheckedChangeListener(this);
        q4i.setOnCheckedChangeListener(this);
        q4ii.setOnCheckedChangeListener(this);
        q5i.setOnCheckedChangeListener(this);
        q5ii.setOnCheckedChangeListener(this);
        q2.setOnCheckedChangeListener(this);
        q3.setOnCheckedChangeListener(this);
        q6.setOnCheckedChangeListener(this);
        q7.setOnCheckedChangeListener(this);
        q9.setOnCheckedChangeListener(this);
        q10.setOnCheckedChangeListener(this);
        sub1.setOnClickListener(this);
        sub2.setOnClickListener(this);
        sub3.setOnClickListener(this);
        sub4.setOnClickListener(this);
        sub5.setOnClickListener(this);
        sub6.setOnClickListener(this);
        sub7.setOnClickListener(this);
        sub8.setOnClickListener(this);
        sub9.setOnClickListener(this);
        sub10.setOnClickListener(this);


    }

    private void init() {
        q1i = findViewById(R.id.q1i);
        q1ii = findViewById(R.id.q1ii);
        q2 = findViewById(R.id.q2);
        q2i = findViewById(R.id.q2i);
        q3 = findViewById(R.id.q3);
        q3i = findViewById(R.id.q3i);
        q4i = findViewById(R.id.q4i);
        q4ii = findViewById(R.id.q4ii);
        q5i = findViewById(R.id.q5i);
        q5ii = findViewById(R.id.q5ii);
        q6 = findViewById(R.id.q6);
        q6i = findViewById(R.id.q6i);
        q7 = findViewById(R.id.q7);
        q7i = findViewById(R.id.q7i);
        q9 = findViewById(R.id.q9);
        q9i = findViewById(R.id.q9i);
        q10 = findViewById(R.id.q10);
        q10i = findViewById(R.id.q10i);
        q8 = findViewById(R.id.q8);
        sub1 = findViewById(R.id.submitfirstquestion);
        sub2 = findViewById(R.id.secondsbmit);
        sub3 = findViewById(R.id.thirdSubmit);
        sub4 = findViewById(R.id.fourthSubmit);
        sub5 = findViewById(R.id.fifthSubmit);
        sub6 = findViewById(R.id.sixSubmit);
        sub7 = findViewById(R.id.sevenSubmit);
        sub8 = findViewById(R.id.eightSubit);
        sub9 = findViewById(R.id.nineSubmit);
        sub10 = findViewById(R.id.tenSubmit);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.submitfirstquestion:
                if (q1i.isChecked() && q1ii.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.secondsbmit:
                if (q2i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.thirdSubmit:
                if (q3i.isChecked() && q2i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.fourthSubmit:
                if (q4i.isChecked() && q4i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.fifthSubmit:
                if (q5i.isChecked() && q5i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.sixSubmit:
                if (q6i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.sevenSubmit:
                if (q7i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.eightSubit:
                if (q8.getText().toString().equalsIgnoreCase(getResources().getString(R.string.q8))) {
                    score = score + 10;
                    Toast.makeText(this, "congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry you lost this ", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.nineSubmit:
                if (q9i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.tenSubmit:
                if (q10i.isChecked()) {
                    score = score + 10;
                    Toast.makeText(this, "Congrats you got " + scorePerq, Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "your final score is "+score, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Sorry You lost this", Toast.LENGTH_SHORT).show();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        final Dialog dialog = new Dialog(MainActivity.this);
                        // Include dialog.xml file
                        dialog.setContentView(R.layout.dialog);
                        // Set dialog title
                        dialog.setTitle("Score Board ");
                        dialog.setCancelable(false);

//                         set values for custom dialog components - text, image and button
                        TextView message = dialog.findViewById(R.id.message);
                        message.setText(getResources().getString(R.string.congrats));
                        TextView score_ = dialog.findViewById(R.id.score);
                        score_.setText(getResources().getString(R.string.point) + " " + score);
                        TextView cancel = dialog.findViewById(R.id.cancel);
                        cancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                            }
                        });

                        dialog.show();

                    }
                }, 1500);

        }

    }
}
