package com.liu.ssm.pojo;

public class CinemaBoxOffice {
    private Integer id;

    private Integer rankNum;

    private String cinemaName;

    private Double todayBox;

    private Integer todayShowCount;

    private Integer todayAudienceCount;

    private Double price;

    private Double avgPeople;

    private Double attendance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRankNum() {
        return rankNum;
    }

    public void setRankNum(Integer rankNum) {
        this.rankNum = rankNum;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName == null ? null : cinemaName.trim();
    }

    public Double getTodayBox() {
        return todayBox;
    }

    public void setTodayBox(Double todayBox) {
        this.todayBox = todayBox;
    }

    public Integer getTodayShowCount() {
        return todayShowCount;
    }

    public void setTodayShowCount(Integer todayShowCount) {
        this.todayShowCount = todayShowCount;
    }

    public Integer getTodayAudienceCount() {
        return todayAudienceCount;
    }

    public void setTodayAudienceCount(Integer todayAudienceCount) {
        this.todayAudienceCount = todayAudienceCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAvgPeople() {
        return avgPeople;
    }

    public void setAvgPeople(Double avgPeople) {
        this.avgPeople = avgPeople;
    }

    public Double getAttendance() {
        return attendance;
    }

    public void setAttendance(Double attendance) {
        this.attendance = attendance;
    }
}