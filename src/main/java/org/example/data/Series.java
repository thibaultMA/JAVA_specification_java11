package org.example.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Series {
    private String resourceURI;
    private String name;


    // Getter Methods

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Series{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
