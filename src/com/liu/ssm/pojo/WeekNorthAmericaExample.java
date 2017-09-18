package com.liu.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class WeekNorthAmericaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeekNorthAmericaExample() {
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

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andLastRankIsNull() {
            addCriterion("last_rank is null");
            return (Criteria) this;
        }

        public Criteria andLastRankIsNotNull() {
            addCriterion("last_rank is not null");
            return (Criteria) this;
        }

        public Criteria andLastRankEqualTo(Integer value) {
            addCriterion("last_rank =", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotEqualTo(Integer value) {
            addCriterion("last_rank <>", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThan(Integer value) {
            addCriterion("last_rank >", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_rank >=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThan(Integer value) {
            addCriterion("last_rank <", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThanOrEqualTo(Integer value) {
            addCriterion("last_rank <=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankIn(List<Integer> values) {
            addCriterion("last_rank in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotIn(List<Integer> values) {
            addCriterion("last_rank not in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankBetween(Integer value1, Integer value2) {
            addCriterion("last_rank between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotBetween(Integer value1, Integer value2) {
            addCriterion("last_rank not between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andRankChangeIsNull() {
            addCriterion("rank_change is null");
            return (Criteria) this;
        }

        public Criteria andRankChangeIsNotNull() {
            addCriterion("rank_change is not null");
            return (Criteria) this;
        }

        public Criteria andRankChangeEqualTo(Integer value) {
            addCriterion("rank_change =", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeNotEqualTo(Integer value) {
            addCriterion("rank_change <>", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeGreaterThan(Integer value) {
            addCriterion("rank_change >", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_change >=", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeLessThan(Integer value) {
            addCriterion("rank_change <", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeLessThanOrEqualTo(Integer value) {
            addCriterion("rank_change <=", value, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeIn(List<Integer> values) {
            addCriterion("rank_change in", values, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeNotIn(List<Integer> values) {
            addCriterion("rank_change not in", values, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeBetween(Integer value1, Integer value2) {
            addCriterion("rank_change between", value1, value2, "rankChange");
            return (Criteria) this;
        }

        public Criteria andRankChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_change not between", value1, value2, "rankChange");
            return (Criteria) this;
        }

        public Criteria andWeekNumIsNull() {
            addCriterion("week_num is null");
            return (Criteria) this;
        }

        public Criteria andWeekNumIsNotNull() {
            addCriterion("week_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeekNumEqualTo(Integer value) {
            addCriterion("week_num =", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumNotEqualTo(Integer value) {
            addCriterion("week_num <>", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumGreaterThan(Integer value) {
            addCriterion("week_num >", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_num >=", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumLessThan(Integer value) {
            addCriterion("week_num <", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumLessThanOrEqualTo(Integer value) {
            addCriterion("week_num <=", value, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumIn(List<Integer> values) {
            addCriterion("week_num in", values, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumNotIn(List<Integer> values) {
            addCriterion("week_num not in", values, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumBetween(Integer value1, Integer value2) {
            addCriterion("week_num between", value1, value2, "weekNum");
            return (Criteria) this;
        }

        public Criteria andWeekNumNotBetween(Integer value1, Integer value2) {
            addCriterion("week_num not between", value1, value2, "weekNum");
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

        public Criteria andWeekEndBoxOfficeIsNull() {
            addCriterion("week_end_box_office is null");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeIsNotNull() {
            addCriterion("week_end_box_office is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeEqualTo(Integer value) {
            addCriterion("week_end_box_office =", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeNotEqualTo(Integer value) {
            addCriterion("week_end_box_office <>", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeGreaterThan(Integer value) {
            addCriterion("week_end_box_office >", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_end_box_office >=", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeLessThan(Integer value) {
            addCriterion("week_end_box_office <", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeLessThanOrEqualTo(Integer value) {
            addCriterion("week_end_box_office <=", value, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeIn(List<Integer> values) {
            addCriterion("week_end_box_office in", values, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeNotIn(List<Integer> values) {
            addCriterion("week_end_box_office not in", values, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeBetween(Integer value1, Integer value2) {
            addCriterion("week_end_box_office between", value1, value2, "weekEndBoxOffice");
            return (Criteria) this;
        }

        public Criteria andWeekEndBoxOfficeNotBetween(Integer value1, Integer value2) {
            addCriterion("week_end_box_office not between", value1, value2, "weekEndBoxOffice");
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

        public Criteria andCinemaIsNull() {
            addCriterion("cinema is null");
            return (Criteria) this;
        }

        public Criteria andCinemaIsNotNull() {
            addCriterion("cinema is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaEqualTo(Integer value) {
            addCriterion("cinema =", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaNotEqualTo(Integer value) {
            addCriterion("cinema <>", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaGreaterThan(Integer value) {
            addCriterion("cinema >", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cinema >=", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaLessThan(Integer value) {
            addCriterion("cinema <", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaLessThanOrEqualTo(Integer value) {
            addCriterion("cinema <=", value, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaIn(List<Integer> values) {
            addCriterion("cinema in", values, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaNotIn(List<Integer> values) {
            addCriterion("cinema not in", values, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaBetween(Integer value1, Integer value2) {
            addCriterion("cinema between", value1, value2, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaNotBetween(Integer value1, Integer value2) {
            addCriterion("cinema not between", value1, value2, "cinema");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeIsNull() {
            addCriterion("cinema_box_office is null");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeIsNotNull() {
            addCriterion("cinema_box_office is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeEqualTo(Integer value) {
            addCriterion("cinema_box_office =", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeNotEqualTo(Integer value) {
            addCriterion("cinema_box_office <>", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeGreaterThan(Integer value) {
            addCriterion("cinema_box_office >", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cinema_box_office >=", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeLessThan(Integer value) {
            addCriterion("cinema_box_office <", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeLessThanOrEqualTo(Integer value) {
            addCriterion("cinema_box_office <=", value, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeIn(List<Integer> values) {
            addCriterion("cinema_box_office in", values, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeNotIn(List<Integer> values) {
            addCriterion("cinema_box_office not in", values, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeBetween(Integer value1, Integer value2) {
            addCriterion("cinema_box_office between", value1, value2, "cinemaBoxOffice");
            return (Criteria) this;
        }

        public Criteria andCinemaBoxOfficeNotBetween(Integer value1, Integer value2) {
            addCriterion("cinema_box_office not between", value1, value2, "cinemaBoxOffice");
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

        public Criteria andBoxOfficeProIsNull() {
            addCriterion("box_office_pro is null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProIsNotNull() {
            addCriterion("box_office_pro is not null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProEqualTo(Integer value) {
            addCriterion("box_office_pro =", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProNotEqualTo(Integer value) {
            addCriterion("box_office_pro <>", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProGreaterThan(Integer value) {
            addCriterion("box_office_pro >", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_office_pro >=", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProLessThan(Integer value) {
            addCriterion("box_office_pro <", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProLessThanOrEqualTo(Integer value) {
            addCriterion("box_office_pro <=", value, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProIn(List<Integer> values) {
            addCriterion("box_office_pro in", values, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProNotIn(List<Integer> values) {
            addCriterion("box_office_pro not in", values, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProBetween(Integer value1, Integer value2) {
            addCriterion("box_office_pro between", value1, value2, "boxOfficePro");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeProNotBetween(Integer value1, Integer value2) {
            addCriterion("box_office_pro not between", value1, value2, "boxOfficePro");
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