package com.liu.ssm.pojo;

public class WeekHongKong {
    private Integer id;

    private Integer rank;

    private Integer rankChange;

    private String movieName;

    private Integer weekBoxOffice;

    private Integer sumBoxOffice;

    private Integer movieDay;

    private String defaultImage;

    private Integer weekNum;

    private Integer boxOfficePro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRankChange() {
        return rankChange;
    }

    public void setRankChange(Integer rankChange) {
        this.rankChange = rankChange;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public Integer getWeekBoxOffice() {
        return weekBoxOffice;
    }

    public void setWeekBoxOffice(Integer weekBoxOffice) {
        this.weekBoxOffice = weekBoxOffice;
    }

    public Integer getSumBoxOffice() {
        return sumBoxOffice;
    }

    public void setSumBoxOffice(Integer sumBoxOffice) {
        this.sumBoxOffice = sumBoxOffice;
    }

    public Integer getMovieDay() {
        return movieDay;
    }

    public void setMovieDay(Integer movieDay) {
        this.movieDay = movieDay;
    }

    public String getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(String defaultImage) {
        this.defaultImage = defaultImage == null ? null : defaultImage.trim();
    }

    public Integer getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    public Integer getBoxOfficePro() {
        return boxOfficePro;
    }

    public void setBoxOfficePro(Integer boxOfficePro) {
        this.boxOfficePro = boxOfficePro;
    }
}