package com.example.russellroxburgh.gparoxbrrcalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    EditText editText1, editText2, editText3, editText4, editText5,                        //editText fields, computeBtn, textview declarations
             editText6, editText7, editText8, editText9, editText10;
    Button calcBtn;
    TextView tv1;
    String gpaFormulaAsString;


    int credits1, credits2, credits3, credits4, credits5;                                   //course credit value holders
    double gradePoints1, gradePoints2, gradePoints3, gradePoints4, gradePoints5;            //course grade-point value holders
    double A = 4.0, AMinus = 3.7, BPlus = 3.3, B = 3.0, BMinus = 2.7,                       //letter grade-point values
           CPlus = 2.3, C = 2.0, CMinus = 1.7, DPlus = 1.3, D = 1.0, F = 0.0;
    boolean isClear = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = findViewById(R.id.displayGPA);
        calcBtn = findViewById(R.id.calcBtn);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 =(EditText) findViewById(R.id.editText10);


        calcBtn.setOnClickListener(new OnClickListener(){                       //Calculates GPA on Button Click

        TableLayout layout = (TableLayout) findViewById(R.id.mainActivity);

            @Override
            public void onClick(View v) {

                int totalCredits = 0;
                double totalGradePoints = 0;
                double gpaFormula;

                String strGrade1 = editText1.getText().toString();              //assigns editText fields 1-5 to string variables FOR
                String strGrade2 = editText2.getText().toString();
                String strGrade3 = editText3.getText().toString();
                String strGrade4 = editText4.getText().toString();
                String strGrade5 = editText5.getText().toString();


                if (!(editText6.getText().toString().equals(""))) {              //if editText6 has value, parse to an int credit1
                    credits1 = Integer.parseInt(editText6.getText().toString());
                }

                if (!(editText7.getText().toString().equals(""))) {
                    credits2 = Integer.parseInt(editText7.getText().toString());
                }

                if (!(editText8.getText().toString().equals(""))) {
                    credits3 = Integer.parseInt(editText8.getText().toString());
                }

                if (!(editText9.getText().toString().equals(""))) {
                    credits4 = Integer.parseInt(editText9.getText().toString());
                }

                if (!(editText10.getText().toString().equals(""))) {
                    credits5 = Integer.parseInt(editText6.getText().toString());
                }
                    if (strGrade1.equalsIgnoreCase("A+")) {           //determines letter grade, uses value+credits to determine gradePoints for grade1
                        gradePoints1 = credits1 * A;
                    } else if (strGrade1.equalsIgnoreCase("A")) {
                        gradePoints1 = credits1 * A;
                    } else if (strGrade1.equalsIgnoreCase("A-")) {
                        gradePoints1 = credits1 * AMinus;
                    } else if (strGrade1.equalsIgnoreCase("B+")) {
                        gradePoints1 = credits1 * BPlus;
                    } else if (strGrade1.equalsIgnoreCase("B")) {
                        gradePoints1 = credits1 * B;
                    } else if (strGrade1.equalsIgnoreCase("B-")) {
                        gradePoints1 = credits1 * BMinus;
                    } else if (strGrade1.equalsIgnoreCase("C+")) {
                        gradePoints1 = credits1 * CPlus;
                    } else if (strGrade1.equalsIgnoreCase("C")) {
                        gradePoints1 = credits1 * C;
                    } else if (strGrade1.equalsIgnoreCase("C-")) {
                        gradePoints1 = credits1 * CMinus;
                    } else if (strGrade1.equalsIgnoreCase("D+")) {
                        gradePoints1 = credits1 * DPlus;
                    } else if (strGrade1.equalsIgnoreCase("D")) {
                        gradePoints1 = credits1 * D;
                    } else if (strGrade1.equalsIgnoreCase("F")) {
                        gradePoints1 = credits1 * F;
                    } else {
                        if ((strGrade1.equals("")))
                            Toast.makeText(getApplicationContext(),
                            "Missing Grade(s)", Toast.LENGTH_SHORT).show();     //Toast notifying user of missing grade input
                    }

                    if (strGrade2.equalsIgnoreCase("A+")) {        //determines letter grade, uses value+credits to determine gradePoints for grade2
                        gradePoints2 = credits2 * A;
                    } else if (strGrade2.equalsIgnoreCase("A")) {
                        gradePoints2 = credits2 * A;
                    } else if (strGrade2.equalsIgnoreCase("A-")) {
                        gradePoints2 = credits2 * AMinus;
                    } else if (strGrade2.equalsIgnoreCase("B+")) {
                        gradePoints2 = credits2 * BPlus;
                    } else if (strGrade2.equalsIgnoreCase("B")) {
                        gradePoints2 = credits2 * B;
                    } else if (strGrade2.equalsIgnoreCase("B-")) {
                        gradePoints2 = credits2 * BMinus;
                    } else if (strGrade2.equalsIgnoreCase("C+")) {
                        gradePoints2 = credits2 * CPlus;
                    } else if (strGrade2.equalsIgnoreCase("C")) {
                        gradePoints2 = credits2 * C;
                    } else if (strGrade2.equalsIgnoreCase("C-")) {
                        gradePoints2 = credits2 * CMinus;
                    } else if (strGrade2.equalsIgnoreCase("D+")) {
                        gradePoints2 = credits2 * DPlus;
                    } else if (strGrade2.equalsIgnoreCase("D")) {
                        gradePoints2 = credits2 * D;
                    } else if (strGrade2.equalsIgnoreCase("F")) {
                        gradePoints2 = credits2 * F;
                    } else {
                        if (strGrade2.equals(""))
                            Toast.makeText(getApplicationContext(),
                            "Missing Grade(s)", Toast.LENGTH_SHORT).show(); //Toast notifying user of missing grade input
                    }


                    if (strGrade3.equalsIgnoreCase("A+")) {        //determines letter grade, uses value+credits to determine gradePoints for grade3
                        gradePoints3 = credits3 * A;
                    } else if (strGrade3.equalsIgnoreCase("A")) {
                        gradePoints3 = credits3 * A;
                    } else if (strGrade3.equalsIgnoreCase("A-")) {
                        gradePoints3 = credits3 * AMinus;
                    } else if (strGrade3.equalsIgnoreCase("B+")) {
                        gradePoints3 = credits3 * BPlus;
                    } else if (strGrade3.equalsIgnoreCase("B")) {
                        gradePoints3 = credits3 * B;
                    } else if (strGrade3.equalsIgnoreCase("B-")) {
                        gradePoints3 = credits3 * BMinus;
                    } else if (strGrade3.equalsIgnoreCase("C+")) {
                        gradePoints3 = credits3 * CPlus;
                    } else if (strGrade3.equalsIgnoreCase("C")) {
                        gradePoints3 = credits3 * C;
                    } else if (strGrade3.equalsIgnoreCase("C-")) {
                        gradePoints3 = credits3 * CMinus;
                    } else if (strGrade3.equalsIgnoreCase("D+")) {
                        gradePoints3 = credits3 * DPlus;
                    } else if (strGrade3.equalsIgnoreCase("D")) {
                        gradePoints3 = credits3 * D;
                    } else if (strGrade3.equalsIgnoreCase("F")) {
                        gradePoints3 = credits3 * F;
                    } else {
                        if (strGrade3.equals(""))
                            Toast.makeText(getApplicationContext(),
                            "Missing Grade(s)", Toast.LENGTH_SHORT).show(); //Toast notifying user of missing grade input
                    }

                    if (strGrade4.equalsIgnoreCase("A+")) {
                        gradePoints4 = credits4 * A;
                    } else if (strGrade4.equalsIgnoreCase("A")) {
                        gradePoints4 = credits4 * A;
                    } else if (strGrade4.equalsIgnoreCase("A-")) {
                        gradePoints4 = credits4 * AMinus;
                    } else if (strGrade4.equalsIgnoreCase("B+")) {
                        gradePoints4 = credits4 * BPlus;
                    } else if (strGrade4.equalsIgnoreCase("B")) {
                        gradePoints4 = credits4 * B;
                    } else if (strGrade4.equalsIgnoreCase("B-")) {
                        gradePoints4 = credits4 * BMinus;
                    } else if (strGrade4.equalsIgnoreCase("C+")) {
                        gradePoints4 = credits4 * CPlus;
                    } else if (strGrade4.equalsIgnoreCase("C")) {
                        gradePoints4 = credits4 * C;
                    } else if (strGrade4.equalsIgnoreCase("C-")) {
                        gradePoints4 = credits4 * CMinus;
                    } else if (strGrade4.equalsIgnoreCase("D+")) {
                        gradePoints4 = credits4 * DPlus;
                    } else if (strGrade4.equalsIgnoreCase("D")) {
                        gradePoints4 = credits4 * D;
                    } else if (strGrade4.equalsIgnoreCase("F")) {
                        gradePoints4 = credits4 * F;
                    } else {
                        if (strGrade4.equals(""))
                            Toast.makeText(getApplicationContext(),
                            "Missing Grade(s)", Toast.LENGTH_SHORT).show(); //Toast notifying user of missing grade input
                    }


                    if (strGrade5.equalsIgnoreCase("A+")) {
                        gradePoints5 = credits5 * A;
                    } else if (strGrade5.equalsIgnoreCase("A")) {
                        gradePoints5 = credits5 * A;
                    } else if (strGrade5.equalsIgnoreCase("A-")) {
                        gradePoints5 = credits5 * AMinus;
                    } else if (strGrade5.equalsIgnoreCase("B+")) {
                        gradePoints5 = credits5 * BPlus;
                    } else if (strGrade5.equalsIgnoreCase("B")) {
                        gradePoints5 = credits5 * B;
                    } else if (strGrade5.equalsIgnoreCase("B-")) {
                        gradePoints5 = credits5 * BMinus;
                    } else if (strGrade5.equalsIgnoreCase("C+")) {
                        gradePoints5 = credits5 * CPlus;
                    } else if (strGrade5.equalsIgnoreCase("C")) {
                        gradePoints5 = credits5 * C;
                    } else if (strGrade5.equalsIgnoreCase("C-")) {
                        gradePoints5 = credits5 * CMinus;
                    } else if (strGrade5.equalsIgnoreCase("D+")) {
                        gradePoints5 = credits5 * DPlus;
                    } else if (strGrade5.equalsIgnoreCase("D")) {
                        gradePoints2 = credits2 * D;
                    } else if (strGrade5.equalsIgnoreCase("F")) {
                        gradePoints5 = credits5 * F;
                    } else {
                        if (strGrade5.equals(""))
                            Toast.makeText(getApplicationContext(),
                            "Missing Grades)", Toast.LENGTH_SHORT).show();  //Toast notifying user of missing grade input
                    }

                    totalGradePoints += gradePoints1 + gradePoints2 + gradePoints3 + gradePoints4 + gradePoints5;   //calculates total gradepoints
                    totalCredits += credits1 + credits2 + credits3 + credits4 + credits5;                           //calculate total credits

                    gpaFormula = (totalGradePoints / totalCredits);                                                 //calculates gpa
                    gpaFormulaAsString = Double.toString(gpaFormula);                                               //sets gpa results as a string for output
                    tv1.setText(gpaFormulaAsString);                                                                //shows gpa result on screen



                    if (gpaFormula >= 3.2) {                                                                        //sets background color according to gpa result
                        layout.setBackgroundColor(Color.GREEN);                                                     //and sets gpaBtn text to "Clear"
                        calcBtn.setText(R.string.clearForm);
                    } else if ((gpaFormula < 3.2) && (gpaFormula > 2.4)) {
                        layout.setBackgroundColor(Color.YELLOW);
                        calcBtn.setText(R.string.clearForm);
                    } else if (gpaFormula <= 2.4) {
                        layout.setBackgroundColor(Color.RED);
                        calcBtn.setText(R.string.clearForm);
                    } else layout.setBackgroundColor(Color.WHITE);



                }


        });


    }
}
