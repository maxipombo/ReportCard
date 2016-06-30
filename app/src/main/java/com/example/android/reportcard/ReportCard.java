package com.example.android.reportcard;

import android.util.Log;

/**
 * Created by mpombos on 29/6/16.
 */
public class ReportCard {

    // Name of the person (e.g. John Doe, Max Pombo, Carlos Gómez)
    private String mName;

    // Grade of Ruby subject (e.g. 80, 90, 70)
    private int mRubyGrade;

    // Grade of Math subject (e.g. 50, 65, 90)
    private int mMathGrade;

    // Grade of Python subject (e.g. 10, 30, 15)
    private int mPythonGrade;

    /*
    * Create a new ReportCard object.
    *
    * @param name is the name of the person (e.g. John Doe, Max Pombo, Carlos Gómez)
    * @param rubyGrade is grade of the Ruby subject (e.g. 80, 90, 70)
    * @param mathGrade is grade of the Math subject (e.g. 50, 65, 90)
    * @param pythonGrade is grade of the Python subject (e.g. 10, 30, 15)
    * */

    public ReportCard(String name, int rubyGrade, int mathGrade, int pythonGrade) {
        mName = name;
        mRubyGrade = rubyGrade;
        mMathGrade = mathGrade;
        mPythonGrade = pythonGrade;
    }

    /**
     * Get the name of the person
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the grade of Ruby subject
     */
    public int getRubyGrade() {
        return mRubyGrade;
    }

    /**
     * Get the grade of Math subject
     */
    public int getMathGrade() {
        return mMathGrade;
    }

    /**
     * Get the grade of Python subject
     */
    public int getPythonGrade() {
        return mPythonGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mName='" + mName + '\'' +
                ", mRubyGrade=" + mRubyGrade +
                ", mMathGrade=" + mMathGrade +
                ", mPythonGrade=" + mPythonGrade +
                '}';
    }


}
