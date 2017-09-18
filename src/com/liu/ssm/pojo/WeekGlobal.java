package com.liu.ssm.pojo;

public class WeekGlobal {
    private Integer id;

    private Integer weekId;

    private Integer rank;

    private Integer rankChange;

    private String movieName;

    private Integer boxOffice;

    private Integer sumBoxOffice;

    private Integer usaBoxOffice;

    private Integer countryNum;

    private Integer movieDay;

    private String defaultImage;

    private Integer weekNum;

    private Integer boxOfficePro;

    private Integer lastRank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeekId() {
        return weekId;
    }

    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
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

    public Integer getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Integer boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Integer getSumBoxOffice() {
        return sumBoxOffice;
    }

    public void setSumBoxOffice(Integer sumBoxOffice) {
        this.sumBoxOffice = sumBoxOffice;
    }

    public Integer getUsaBoxOffice() {
        return usaBoxOffice;
    }

    public void setUsaBoxOffice(Integer usaBoxOffice) {
        this.usaBoxOffice = usaBoxOffice;
    }

    public Integer getCountryNum() {
        return countryNum;
    }

    public void setCountryNum(Integer countryNum) {
        this.countryNum = countryNum;
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

    public Integer getLastRank() {
        return lastRank;
    }

    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }
}