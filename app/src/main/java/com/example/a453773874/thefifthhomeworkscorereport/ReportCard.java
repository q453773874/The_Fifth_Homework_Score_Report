package com.example.a453773874.thefifthhomeworkscorereport;

/**
 * Created by 45377 on 2017/1/19.
 */


/**
 * define the variables
 */
public class ReportCard {
    private int mYear;
    private String mName;
    private int mScore;

    /**
     * define the method of the class
     * @param year
     * @param name
     * @param score
     */
    public ReportCard(int year, String name, int score){
        mYear = year;
        mName = name;
        mScore = score;
    }

    /**
     * get the year
     * @return
     */
    public int getYear(){
        return mYear;
    }

    /**
     * get the sudents' name
     * @return
     */
    public String getName(){
        return mName;
    }

    /**
     * get the score
     * @return
     */
    public int getmScore(){
        return mScore;
    }

    /**
     * set the students' score
     */
    public void setScore(int newScore){
        mScore = newScore;
    }

    /**
     * set the students' name
     */
    public void setName(String newName){
        mName = newName;
    }

    /**
     * set the students' year
     */
    public void setYear(int newYear){
        mYear = newYear;
    }

    /**
     * the output
     */
    @Override
    public String toString(){
        return String.format("The score of "+ mName + " is "+ mScore + " in " + mYear);
    }

}

