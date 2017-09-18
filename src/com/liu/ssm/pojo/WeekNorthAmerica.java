package com.liu.ssm.pojo;

public class WeekNorthAmerica {
    private Integer id;

    private Integer rank;

    private Integer lastRank;

    private Integer rankChange;

    private Integer weekNum;

    private String movieName;

    private Integer weekEndBoxOffice;

    private Integer boxOffice;

    private Integer cinema;

    private Integer cinemaBoxOffice;

    private String defaultImage;

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

    public Integer getLastRank() {
        return lastRank;
    }

    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }

    public Integer getRankChange() {
        return rankChange;
    }

    public void setRankChange(Integer rankChange) {
        this.rankChange = rankChange;
    }

    public Integer getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public Integer getWeekEndBoxOffice() {
        return weekEndBoxOffice;
    }

    public void setWeekEndBoxOffice(Integer weekEndBoxOffice) {
        this.weekEndBoxOffice = weekEndBoxOffice;
    }

    public Integer getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Integer boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Integer getCinema() {
        return cinema;
    }

    public void setCinema(Integer cinema) {
        this.cinema = cinema;
    }

    public Integer getCinemaBoxOffice() {
        return cinemaBoxOffice;
    }

    public void setCinemaBoxOffice(Integer cinemaBoxOffice) {
        this.cinemaBoxOffice = cinemaBoxOffice;
    }

    public String getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(String defaultImage) {
        this.defaultImage = defaultImage == null ? null : defaultImage.trim();
    }

    public Integer getBoxOfficePro() {
        return boxOfficePro;
    }

    public void setBoxOfficePro(Integer boxOfficePro) {
        this.boxOfficePro = boxOfficePro;
    }
}