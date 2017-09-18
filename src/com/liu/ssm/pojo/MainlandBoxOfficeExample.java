package com.liu.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MainlandBoxOfficeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainlandBoxOfficeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andGenreMainIsNull() {
            addCriterion("genre_main is null");
            return (Criteria) this;
        }

        public Criteria andGenreMainIsNotNull() {
            addCriterion("genre_main is not null");
            return (Criteria) this;
        }

        public Criteria andGenreMainEqualTo(String value) {
            addCriterion("genre_main =", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainNotEqualTo(String value) {
            addCriterion("genre_main <>", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainGreaterThan(String value) {
            addCriterion("genre_main >", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainGreaterThanOrEqualTo(String value) {
            addCriterion("genre_main >=", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainLessThan(String value) {
            addCriterion("genre_main <", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainLessThanOrEqualTo(String value) {
            addCriterion("genre_main <=", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainLike(String value) {
            addCriterion("genre_main like", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainNotLike(String value) {
            addCriterion("genre_main not like", value, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainIn(List<String> values) {
            addCriterion("genre_main in", values, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainNotIn(List<String> values) {
            addCriterion("genre_main not in", values, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainBetween(String value1, String value2) {
            addCriterion("genre_main between", value1, value2, "genreMain");
            return (Criteria) this;
        }

        public Criteria andGenreMainNotBetween(String value1, String value2) {
            addCriterion("genre_main not between", value1, value2, "genreMain");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIsNull() {
            addCriterion("box_office is null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIsNotNull() {
            addCriterion("box_office is not null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeEqualTo(Integer value) {
            addCriterion("box_office =", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotEqualTo(Integer value) {
            addCriterion("box_office <>", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeGreaterThan(Integer value) {
            addCriterion("box_office >", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_office >=", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeLessThan(Integer value) {
            addCriterion("box_office <", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeLessThanOrEqualTo(Integer value) {
            addCriterion("box_office <=", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIn(List<Integer> values) {
            addCriterion("box_office in", values, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotIn(List<Integer> values) {
            addCriterion("box_office not in", values, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeBetween(Integer value1, Integer value2) {
            addCriterion("box_office between", value1, value2, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotBetween(Integer value1, Integer value2) {
            addCriterion("box_office not between", value1, value2, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andShowCountIsNull() {
            addCriterion("show_count is null");
            return (Criteria) this;
        }

        public Criteria andShowCountIsNotNull() {
            addCriterion("show_count is not null");
            return (Criteria) this;
        }

        public Criteria andShowCountEqualTo(Integer value) {
            addCriterion("show_count =", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountNotEqualTo(Integer value) {
            addCriterion("show_count <>", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountGreaterThan(Integer value) {
            addCriterion("show_count >", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_count >=", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountLessThan(Integer value) {
            addCriterion("show_count <", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountLessThanOrEqualTo(Integer value) {
            addCriterion("show_count <=", value, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountIn(List<Integer> values) {
            addCriterion("show_count in", values, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountNotIn(List<Integer> values) {
            addCriterion("show_count not in", values, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountBetween(Integer value1, Integer value2) {
            addCriterion("show_count between", value1, value2, "showCount");
            return (Criteria) this;
        }

        public Criteria andShowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("show_count not between", value1, value2, "showCount");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andAudienceCountIsNull() {
            addCriterion("audience_count is null");
            return (Criteria) this;
        }

        public Criteria andAudienceCountIsNotNull() {
            addCriterion("audience_count is not null");
            return (Criteria) this;
        }

        public Criteria andAudienceCountEqualTo(Integer value) {
            addCriterion("audience_count =", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountNotEqualTo(Integer value) {
            addCriterion("audience_count <>", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountGreaterThan(Integer value) {
            addCriterion("audience_count >", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("audience_count >=", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountLessThan(Integer value) {
            addCriterion("audience_count <", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountLessThanOrEqualTo(Integer value) {
            addCriterion("audience_count <=", value, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountIn(List<Integer> values) {
            addCriterion("audience_count in", values, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountNotIn(List<Integer> values) {
            addCriterion("audience_count not in", values, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountBetween(Integer value1, Integer value2) {
            addCriterion("audience_count between", value1, value2, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAudienceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("audience_count not between", value1, value2, "audienceCount");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceEqualTo(Integer value) {
            addCriterion("avg_price =", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotEqualTo(Integer value) {
            addCriterion("avg_price <>", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThan(Integer value) {
            addCriterion("avg_price >", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_price >=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThan(Integer value) {
            addCriterion("avg_price <", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("avg_price <=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIn(List<Integer> values) {
            addCriterion("avg_price in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotIn(List<Integer> values) {
            addCriterion("avg_price not in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceBetween(Integer value1, Integer value2) {
            addCriterion("avg_price between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_price not between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(String value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(String value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(String value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(String value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(String value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLike(String value) {
            addCriterion("release_time like", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotLike(String value) {
            addCriterion("release_time not like", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<String> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<String> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(String value1, String value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(String value1, String value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleIsNull() {
            addCriterion("avg_people is null");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleIsNotNull() {
            addCriterion("avg_people is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleEqualTo(Integer value) {
            addCriterion("avg_people =", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotEqualTo(Integer value) {
            addCriterion("avg_people <>", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleGreaterThan(Integer value) {
            addCriterion("avg_people >", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_people >=", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleLessThan(Integer value) {
            addCriterion("avg_people <", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("avg_people <=", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleIn(List<Integer> values) {
            addCriterion("avg_people in", values, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotIn(List<Integer> values) {
            addCriterion("avg_people not in", values, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleBetween(Integer value1, Integer value2) {
            addCriterion("avg_people between", value1, value2, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_people not between", value1, value2, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andDefaultImageIsNull() {
            addCriterion("default_image is null");
            return (Criteria) this;
        }

        public Criteria andDefaultImageIsNotNull() {
            addCriterion("default_image is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultImageEqualTo(String value) {
            addCriterion("default_image =", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageNotEqualTo(String value) {
            addCriterion("default_image <>", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageGreaterThan(String value) {
            addCriterion("default_image >", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageGreaterThanOrEqualTo(String value) {
            addCriterion("default_image >=", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageLessThan(String value) {
            addCriterion("default_image <", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageLessThanOrEqualTo(String value) {
            addCriterion("default_image <=", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageLike(String value) {
            addCriterion("default_image like", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageNotLike(String value) {
            addCriterion("default_image not like", value, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageIn(List<String> values) {
            addCriterion("default_image in", values, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageNotIn(List<String> values) {
            addCriterion("default_image not in", values, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageBetween(String value1, String value2) {
            addCriterion("default_image between", value1, value2, "defaultImage");
            return (Criteria) this;
        }

        public Criteria andDefaultImageNotBetween(String value1, String value2) {
            addCriterion("default_image not between", value1, value2, "defaultImage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}