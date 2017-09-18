package com.liu.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class CinemaBoxOfficeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CinemaBoxOfficeExample() {
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

        public Criteria andRankNumIsNull() {
            addCriterion("rank_num is null");
            return (Criteria) this;
        }

        public Criteria andRankNumIsNotNull() {
            addCriterion("rank_num is not null");
            return (Criteria) this;
        }

        public Criteria andRankNumEqualTo(Integer value) {
            addCriterion("rank_num =", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumNotEqualTo(Integer value) {
            addCriterion("rank_num <>", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumGreaterThan(Integer value) {
            addCriterion("rank_num >", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_num >=", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumLessThan(Integer value) {
            addCriterion("rank_num <", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumLessThanOrEqualTo(Integer value) {
            addCriterion("rank_num <=", value, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumIn(List<Integer> values) {
            addCriterion("rank_num in", values, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumNotIn(List<Integer> values) {
            addCriterion("rank_num not in", values, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumBetween(Integer value1, Integer value2) {
            addCriterion("rank_num between", value1, value2, "rankNum");
            return (Criteria) this;
        }

        public Criteria andRankNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_num not between", value1, value2, "rankNum");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIsNull() {
            addCriterion("cinema_name is null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIsNotNull() {
            addCriterion("cinema_name is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameEqualTo(String value) {
            addCriterion("cinema_name =", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotEqualTo(String value) {
            addCriterion("cinema_name <>", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThan(String value) {
            addCriterion("cinema_name >", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cinema_name >=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThan(String value) {
            addCriterion("cinema_name <", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThanOrEqualTo(String value) {
            addCriterion("cinema_name <=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLike(String value) {
            addCriterion("cinema_name like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotLike(String value) {
            addCriterion("cinema_name not like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIn(List<String> values) {
            addCriterion("cinema_name in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotIn(List<String> values) {
            addCriterion("cinema_name not in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameBetween(String value1, String value2) {
            addCriterion("cinema_name between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotBetween(String value1, String value2) {
            addCriterion("cinema_name not between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andTodayBoxIsNull() {
            addCriterion("today_box is null");
            return (Criteria) this;
        }

        public Criteria andTodayBoxIsNotNull() {
            addCriterion("today_box is not null");
            return (Criteria) this;
        }

        public Criteria andTodayBoxEqualTo(Double value) {
            addCriterion("today_box =", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxNotEqualTo(Double value) {
            addCriterion("today_box <>", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxGreaterThan(Double value) {
            addCriterion("today_box >", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxGreaterThanOrEqualTo(Double value) {
            addCriterion("today_box >=", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxLessThan(Double value) {
            addCriterion("today_box <", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxLessThanOrEqualTo(Double value) {
            addCriterion("today_box <=", value, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxIn(List<Double> values) {
            addCriterion("today_box in", values, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxNotIn(List<Double> values) {
            addCriterion("today_box not in", values, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxBetween(Double value1, Double value2) {
            addCriterion("today_box between", value1, value2, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayBoxNotBetween(Double value1, Double value2) {
            addCriterion("today_box not between", value1, value2, "todayBox");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountIsNull() {
            addCriterion("today_show_count is null");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountIsNotNull() {
            addCriterion("today_show_count is not null");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountEqualTo(Integer value) {
            addCriterion("today_show_count =", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountNotEqualTo(Integer value) {
            addCriterion("today_show_count <>", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountGreaterThan(Integer value) {
            addCriterion("today_show_count >", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_show_count >=", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountLessThan(Integer value) {
            addCriterion("today_show_count <", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountLessThanOrEqualTo(Integer value) {
            addCriterion("today_show_count <=", value, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountIn(List<Integer> values) {
            addCriterion("today_show_count in", values, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountNotIn(List<Integer> values) {
            addCriterion("today_show_count not in", values, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountBetween(Integer value1, Integer value2) {
            addCriterion("today_show_count between", value1, value2, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayShowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_show_count not between", value1, value2, "todayShowCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountIsNull() {
            addCriterion("today_audience_count is null");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountIsNotNull() {
            addCriterion("today_audience_count is not null");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountEqualTo(Integer value) {
            addCriterion("today_audience_count =", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountNotEqualTo(Integer value) {
            addCriterion("today_audience_count <>", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountGreaterThan(Integer value) {
            addCriterion("today_audience_count >", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_audience_count >=", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountLessThan(Integer value) {
            addCriterion("today_audience_count <", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountLessThanOrEqualTo(Integer value) {
            addCriterion("today_audience_count <=", value, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountIn(List<Integer> values) {
            addCriterion("today_audience_count in", values, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountNotIn(List<Integer> values) {
            addCriterion("today_audience_count not in", values, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountBetween(Integer value1, Integer value2) {
            addCriterion("today_audience_count between", value1, value2, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTodayAudienceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_audience_count not between", value1, value2, "todayAudienceCount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andAvgPeopleEqualTo(Double value) {
            addCriterion("avg_people =", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotEqualTo(Double value) {
            addCriterion("avg_people <>", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleGreaterThan(Double value) {
            addCriterion("avg_people >", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_people >=", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleLessThan(Double value) {
            addCriterion("avg_people <", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleLessThanOrEqualTo(Double value) {
            addCriterion("avg_people <=", value, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleIn(List<Double> values) {
            addCriterion("avg_people in", values, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotIn(List<Double> values) {
            addCriterion("avg_people not in", values, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleBetween(Double value1, Double value2) {
            addCriterion("avg_people between", value1, value2, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAvgPeopleNotBetween(Double value1, Double value2) {
            addCriterion("avg_people not between", value1, value2, "avgPeople");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNull() {
            addCriterion("attendance is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNotNull() {
            addCriterion("attendance is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceEqualTo(Double value) {
            addCriterion("attendance =", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotEqualTo(Double value) {
            addCriterion("attendance <>", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThan(Double value) {
            addCriterion("attendance >", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThanOrEqualTo(Double value) {
            addCriterion("attendance >=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThan(Double value) {
            addCriterion("attendance <", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThanOrEqualTo(Double value) {
            addCriterion("attendance <=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceIn(List<Double> values) {
            addCriterion("attendance in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotIn(List<Double> values) {
            addCriterion("attendance not in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceBetween(Double value1, Double value2) {
            addCriterion("attendance between", value1, value2, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotBetween(Double value1, Double value2) {
            addCriterion("attendance not between", value1, value2, "attendance");
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