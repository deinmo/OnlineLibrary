
package com.gads.onlinelibrary.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Epub {

    @SerializedName("isAvailable")
    @Expose
    private boolean isAvailable;
    @SerializedName("acsTokenLink")
    @Expose
    private String acsTokenLink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Epub() {
    }

    /**
     * 
     * @param isAvailable
     * @param acsTokenLink
     */
    public Epub(boolean isAvailable, String acsTokenLink) {
        super();
        this.isAvailable = isAvailable;
        this.acsTokenLink = acsTokenLink;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

}
