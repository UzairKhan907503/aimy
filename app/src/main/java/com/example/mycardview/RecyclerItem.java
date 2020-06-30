package com.example.mycardview;

public class RecyclerItem {
    private int mImageResource;
    private String textViewText;
    private String buttonText;
    public RecyclerItem(int imageResource,String text1, String text2 ){
        mImageResource = imageResource;
        textViewText = text1;
        buttonText = text2;
    }
    public int getImageResource(){
        return mImageResource;
    }
    public String getText1(){
        return textViewText;
    }
    public String getText2(){
        return buttonText;
    }
}
