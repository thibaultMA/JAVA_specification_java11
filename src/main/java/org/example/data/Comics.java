package org.example.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comics {
    private float id;
    private float digitalId;
    private String title;
    private float issueNumber;
    private String variantDescription;
    private String description = null;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private float pageCount;
    ArrayList < Object > textObjects = new ArrayList< Object >();
    private String resourceURI;
    ArrayList < Object > urls = new ArrayList < Object > ();
    Series SeriesObject;
    ArrayList < Object > variants = new ArrayList < Object > ();
    ArrayList < Object > collections = new ArrayList < Object > ();
    ArrayList < Object > collectedIssues = new ArrayList < Object > ();
    ArrayList < Object > dates = new ArrayList < Object > ();
    ArrayList < Object > prices = new ArrayList < Object > ();
    Thumbnail ThumbnailObject;
    ArrayList < Object > images = new ArrayList < Object > ();
    Creators CreatorsObject;
    Characters CharactersObject;
    Stories StoriesObject;
    Events EventsObject;


    // Getter Methods

    public float getId() {
        return id;
    }

    public float getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public float getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public float getPageCount() {
        return pageCount;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public Series getSeries() {
        return SeriesObject;
    }

    public Thumbnail getThumbnail() {
        return ThumbnailObject;
    }

    public Creators getCreators() {
        return CreatorsObject;
    }

    public Characters getCharacters() {
        return CharactersObject;
    }

    public Stories getStories() {
        return StoriesObject;
    }

    public Events getEvents() {
        return EventsObject;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setDigitalId(float digitalId) {
        this.digitalId = digitalId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueNumber(float issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPageCount(float pageCount) {
        this.pageCount = pageCount;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public void setSeries(Series seriesObject) {
        this.SeriesObject = seriesObject;
    }

    public void setThumbnail(Thumbnail thumbnailObject) {
        this.ThumbnailObject = thumbnailObject;
    }

    public void setCreators(Creators creatorsObject) {
        this.CreatorsObject = creatorsObject;
    }

    public void setCharacters(Characters charactersObject) {
        this.CharactersObject = charactersObject;
    }

    public void setStories(Stories storiesObject) {
        this.StoriesObject = storiesObject;
    }

    public void setEvents(Events eventsObject) {
        this.EventsObject = eventsObject;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "id=" + id +
                ", digitalId=" + digitalId +
                ", title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", variantDescription='" + variantDescription + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
                ", isbn='" + isbn + '\'' +
                ", upc='" + upc + '\'' +
                ", diamondCode='" + diamondCode + '\'' +
                ", ean='" + ean + '\'' +
                ", issn='" + issn + '\'' +
                ", format='" + format + '\'' +
                ", pageCount=" + pageCount +
                ", textObjects=" + textObjects +
                ", resourceURI='" + resourceURI + '\'' +
                ", urls=" + urls +
                ", SeriesObject=" + SeriesObject +
                ", variants=" + variants +
                ", collections=" + collections +
                ", collectedIssues=" + collectedIssues +
                ", dates=" + dates +
                ", prices=" + prices +
                ", ThumbnailObject=" + ThumbnailObject +
                ", images=" + images +
                ", CreatorsObject=" + CreatorsObject +
                ", CharactersObject=" + CharactersObject +
                ", StoriesObject=" + StoriesObject +
                ", EventsObject=" + EventsObject +
                '}';
    }
}

