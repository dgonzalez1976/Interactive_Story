package com.dgonzalez.interactivestory.model;

/**
 * Created by dgonzalez on 4/3/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage)
    {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getPage() {
        return mNextPage;
    }

    public void setPage(int page) {
        mNextPage = page;
    }
}
