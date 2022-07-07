package org.example.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Characters {
    private float available;
    private String collectionURI;
    ArrayList<Object> items = new ArrayList<Object>();
    private float returned;


    // Getter Methods

    public float getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public float getReturned() {
        return returned;
    }

    // Setter Methods

    public void setAvailable(float available) {
        this.available = available;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public void setReturned(float returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", items=" + items +
                ", returned=" + returned +
                '}';
    }
}
