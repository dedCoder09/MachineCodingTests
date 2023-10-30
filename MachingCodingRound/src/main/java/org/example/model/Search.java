package org.example.model;

public class Search {
    String from;
    String to;
    Integer deptDate;
    Integer paxCount;

    public Search(String from, String to, Integer deptDate, Integer paxCount) {
        this.from = from;
        this.to = to;
        this.deptDate = deptDate;
        this.paxCount = paxCount;
    }
}
