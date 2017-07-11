package com.example.dongkibae.retrofit;

import android.content.ClipData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongkibae on 2017. 6. 27..
 */

public class Contributor {

//    String login;
//    String html_url;
//
//    int contributions;
//
//    @Override
//    public String toString() {
//        return login + " (" + contributions + ")";
//    }



    @SerializedName("contacts")
    @Expose
    private ArrayList<Contact> contacts = new ArrayList<>();

    /**
     * @return The contacts
     */
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts The contacts
     */
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }





}
