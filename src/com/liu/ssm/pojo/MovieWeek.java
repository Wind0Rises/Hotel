package com.liu.ssm.pojo;

public class MovieWeek {
    private String movieid;

    private Integer movierank;

    private String moviename;

    private Long weekamount;

    private Long sumweekamount;

    private Integer people;

    private Integer movieday;

    private Integer avgprice;

    private Integer avgpeople;

    private String amountUp;

    private String screenUp;

    private String peopleUp;

    private String defaultimage;

    private String rankUp;

    private Double womindex;

    private String sdate;

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid == null ? null : movieid.trim();
    }

    public Integer getMovierank() {
        return movierank;
    }

    public void setMovierank(Integer movierank) {
        this.movierank = movierank;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename == null ? null : moviename.trim();
    }

    public Long getWeekamount() {
        return weekamount;
    }

    public void setWeekamount(Long weekamount) {
        this.weekamount = weekamount;
    }

    public Long getSumweekamount() {
        return sumweekamount;
    }

    public void setSumweekamount(Long sumweekamount) {
        this.sumweekamount = sumweekamount;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getMovieday() {
        return movieday;
    }

    public void setMovieday(Integer movieday) {
        this.movieday = movieday;
    }

    public Integer getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(Integer avgprice) {
        this.avgprice = avgprice;
    }

    public Integer getAvgpeople() {
        return avgpeople;
    }

    public void setAvgpeople(Integer avgpeople) {
        this.avgpeople = avgpeople;
    }

    public String getAmountUp() {
        return amountUp;
    }

    public void setAmountUp(String amountUp) {
        this.amountUp = amountUp == null ? null : amountUp.trim();
    }

    public String getScreenUp() {
        return screenUp;
    }

    public void setScreenUp(String screenUp) {
        this.screenUp = screenUp == null ? null : screenUp.trim();
    }

    public String getPeopleUp() {
        return peopleUp;
    }

    public void setPeopleUp(String peopleUp) {
        this.peopleUp = peopleUp == null ? null : peopleUp.trim();
    }

    public String getDefaultimage() {
        return defaultimage;
    }

    public void setDefaultimage(String defaultimage) {
        this.defaultimage = defaultimage == null ? null : defaultimage.trim();
    }

    public String getRankUp() {
        return rankUp;
    }

    public void setRankUp(String rankUp) {
        this.rankUp = rankUp == null ? null : rankUp.trim();
    }

    public Double getWomindex() {
        return womindex;
    }

    public void setWomindex(Double womindex) {
        this.womindex = womindex;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate == null ? null : sdate.trim();
    }
}