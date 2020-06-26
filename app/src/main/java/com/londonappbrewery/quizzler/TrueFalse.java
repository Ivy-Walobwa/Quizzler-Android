package com.londonappbrewery.quizzler;

public class TrueFalse {
    int mQuestionId;
    boolean mAnswer;

    public TrueFalse(int questionResourceId, boolean trueOrFalse){
        mQuestionId = questionResourceId;
        mAnswer = trueOrFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
