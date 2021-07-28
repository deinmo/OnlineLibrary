
package com.gads.onlinelibrary.Models;

import java.util.List;

import com.gads.onlinelibrary.Models.Item;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class BooksModel {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("totalItems")
    @Expose
    private int totalItems;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BooksModel() {
    }

    /**
     * 
     * @param totalItems
     * @param kind
     * @param items
     */
    public BooksModel(String kind, int totalItems, List<Item> items) {
        super();
        this.kind = kind;
        this.totalItems = totalItems;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
