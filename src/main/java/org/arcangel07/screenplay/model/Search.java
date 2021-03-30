package org.arcangel07.screenplay.model;

public class Search {
    private final String origin;
    private final String destination;

    public Search(String source, String destination) {
        this.origin = source;
        this.destination = destination;
    }

    public Search(String destination) {
        this.origin = null;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

}
