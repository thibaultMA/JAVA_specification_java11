package org.example.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnail {
    private String path;
    private String extension;


    // Getter Methods

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    // Setter Methods

    public void setPath(String path) {
        this.path = path;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
