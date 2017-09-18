package com.liu.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MovieWeekExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieWeekExample() {
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

        public Criteria andMovieidIsNull() {
            addCriterion("movieID is null");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNotNull() {
            addCriterion("movieID is not null");
            return (Criteria) this;
        }

        public Criteria andMovieidEqualTo(String value) {
            addCriterion("movieID =", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotEqualTo(String value) {
            addCriterion("movieID <>", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThan(String value) {
            addCriterion("movieID >", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThanOrEqualTo(String value) {
            addCriterion("movieID >=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThan(String value) {
            addCriterion("movieID <", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThanOrEqualTo(String value) {
            addCriterion("movieID <=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLike(String value) {
            addCriterion("movieID like", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotLike(String value) {
            addCriterion("movieID not like", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidIn(List<String> values) {
            addCriterion("movieID in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotIn(List<String> values) {
            addCriterion("movieID not in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidBetween(String value1, String value2) {
            addCriterion("movieID between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotBetween(String value1, String value2) {
            addCriterion("movieID not between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovierankIsNull() {
            addCriterion("movieRank is null");
            return (Criteria) this;
        }

        public Criteria andMovierankIsNotNull() {
            addCriterion("movieRank is not null");
            return (Criteria) this;
        }

        public Criteria andMovierankEqualTo(Integer value) {
            addCriterion("movieRank =", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankNotEqualTo(Integer value) {
            addCriterion("movieRank <>", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankGreaterThan(Integer value) {
            addCriterion("movieRank >", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankGreaterThanOrEqualTo(Integer value) {
            addCriterion("movieRank >=", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankLessThan(Integer value) {
            addCriterion("movieRank <", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankLessThanOrEqualTo(Integer value) {
            addCriterion("movieRank <=", value, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankIn(List<Integer> values) {
            addCriterion("movieRank in", values, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankNotIn(List<Integer> values) {
            addCriterion("movieRank not in", values, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankBetween(Integer value1, Integer value2) {
            addCriterion("movieRank between", value1, value2, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovierankNotBetween(Integer value1, Integer value2) {
            addCriterion("movieRank not between", value1, value2, "movierank");
            return (Criteria) this;
        }

        public Criteria andMovienameIsNull() {
            addCriterion("movieName is null");
            return (Criteria) this;
        }

        public Criteria andMovienameIsNotNull() {
            addCriterion("movieName is not null");
            return (Criteria) this;
        }

        public Criteria andMovienameEqualTo(String value) {
            addCriterion("movieName =", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotEqualTo(String value) {
            addCriterion("movieName <>", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameGreaterThan(String value) {
            addCriterion("movieName >", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameGreaterThanOrEqualTo(String value) {
            addCriterion("movieName >=", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLessThan(String value) {
            addCriterion("movieName <", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLessThanOrEqualTo(String value) {
            addCriterion("movieName <=", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLike(String value) {
            addCriterion("movieName like", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotLike(String value) {
            addCriterion("movieName not like", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameIn(List<String> values) {
            addCriterion("movieName in", values, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotIn(List<String> values) {
            addCriterion("movieName not in", values, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameBetween(String value1, String value2) {
            addCriterion("movieName between", value1, value2, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotBetween(String value1, String value2) {
            addCriterion("movieName not between", value1, value2, "moviename");
            return (Criteria) this;
        }

        public Criteria andWeekamountIsNull() {
            addCriterion("weekAmount is null");
            return (Criteria) this;
        }

        public Criteria andWeekamountIsNotNull() {
            addCriterion("weekAmount is not null");
            return (Criteria) this;
        }

        public Criteria andWeekamountEqualTo(Long value) {
            addCriterion("weekAmount =", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountNotEqualTo(Long value) {
            addCriterion("weekAmount <>", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountGreaterThan(Long value) {
            addCriterion("weekAmount >", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountGreaterThanOrEqualTo(Long value) {
            addCriterion("weekAmount >=", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountLessThan(Long value) {
            addCriterion("weekAmount <", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountLessThanOrEqualTo(Long value) {
            addCriterion("weekAmount <=", value, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountIn(List<Long> values) {
            addCriterion("weekAmount in", values, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountNotIn(List<Long> values) {
            addCriterion("weekAmount not in", values, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountBetween(Long value1, Long value2) {
            addCriterion("weekAmount between", value1, value2, "weekamount");
            return (Criteria) this;
        }

        public Criteria andWeekamountNotBetween(Long value1, Long value2) {
            addCriterion("weekAmount not between", value1, value2, "weekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountIsNull() {
            addCriterion("sumWeekAmount is null");
            return (Criteria) this;
        }

        public Criteria andSumweekamountIsNotNull() {
            addCriterion("sumWeekAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSumweekamountEqualTo(Long value) {
            addCriterion("sumWeekAmount =", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountNotEqualTo(Long value) {
            addCriterion("sumWeekAmount <>", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountGreaterThan(Long value) {
            addCriterion("sumWeekAmount >", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountGreaterThanOrEqualTo(Long value) {
            addCriterion("sumWeekAmount >=", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountLessThan(Long value) {
            addCriterion("sumWeekAmount <", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountLessThanOrEqualTo(Long value) {
            addCriterion("sumWeekAmount <=", value, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountIn(List<Long> values) {
            addCriterion("sumWeekAmount in", values, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountNotIn(List<Long> values) {
            addCriterion("sumWeekAmount not in", values, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountBetween(Long value1, Long value2) {
            addCriterion("sumWeekAmount between", value1, value2, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andSumweekamountNotBetween(Long value1, Long value2) {
            addCriterion("sumWeekAmount not between", value1, value2, "sumweekamount");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andMoviedayIsNull() {
            addCriterion("movieDay is null");
            return (Criteria) this;
        }

        public Criteria andMoviedayIsNotNull() {
            addCriterion("movieDay is not null");
            return (Criteria) this;
        }

        public Criteria andMoviedayEqualTo(Integer value) {
            addCriterion("movieDay =", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayNotEqualTo(Integer value) {
            addCriterion("movieDay <>", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayGreaterThan(Integer value) {
            addCriterion("movieDay >", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayGreaterThanOrEqualTo(Integer value) {
            addCriterion("movieDay >=", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayLessThan(Integer value) {
            addCriterion("movieDay <", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayLessThanOrEqualTo(Integer value) {
            addCriterion("movieDay <=", value, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayIn(List<Integer> values) {
            addCriterion("movieDay in", values, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayNotIn(List<Integer> values) {
            addCriterion("movieDay not in", values, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayBetween(Integer value1, Integer value2) {
            addCriterion("movieDay between", value1, value2, "movieday");
            return (Criteria) this;
        }

        public Criteria andMoviedayNotBetween(Integer value1, Integer value2) {
            addCriterion("movieDay not between", value1, value2, "movieday");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNull() {
            addCriterion("avgPrice is null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNotNull() {
            addCriterion("avgPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceEqualTo(Integer value) {
            addCriterion("avgPrice =", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotEqualTo(Integer value) {
            addCriterion("avgPrice <>", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThan(Integer value) {
            addCriterion("avgPrice >", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("avgPrice >=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThan(Integer value) {
            addCriterion("avgPrice <", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThanOrEqualTo(Integer value) {
            addCriterion("avgPrice <=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIn(List<Integer> values) {
            addCriterion("avgPrice in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotIn(List<Integer> values) {
            addCriterion("avgPrice not in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceBetween(Integer value1, Integer value2) {
            addCriterion("avgPrice between", value1, value2, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("avgPrice not between", value1, value2, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleIsNull() {
            addCriterion("avgPeople is null");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleIsNotNull() {
            addCriterion("avgPeople is not null");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleEqualTo(Integer value) {
            addCriterion("avgPeople =", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleNotEqualTo(Integer value) {
            addCriterion("avgPeople <>", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleGreaterThan(Integer value) {
            addCriterion("avgPeople >", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("avgPeople >=", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleLessThan(Integer value) {
            addCriterion("avgPeople <", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("avgPeople <=", value, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleIn(List<Integer> values) {
            addCriterion("avgPeople in", values, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleNotIn(List<Integer> values) {
            addCriterion("avgPeople not in", values, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleBetween(Integer value1, Integer value2) {
            addCriterion("avgPeople between", value1, value2, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAvgpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("avgPeople not between", value1, value2, "avgpeople");
            return (Criteria) this;
        }

        public Criteria andAmountUpIsNull() {
            addCriterion("amount_Up is null");
            return (Criteria) this;
        }

        public Criteria andAmountUpIsNotNull() {
            addCriterion("amount_Up is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUpEqualTo(String value) {
            addCriterion("amount_Up =", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpNotEqualTo(String value) {
            addCriterion("amount_Up <>", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpGreaterThan(String value) {
            addCriterion("amount_Up >", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpGreaterThanOrEqualTo(String value) {
            addCriterion("amount_Up >=", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpLessThan(String value) {
            addCriterion("amount_Up <", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpLessThanOrEqualTo(String value) {
            addCriterion("amount_Up <=", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpLike(String value) {
            addCriterion("amount_Up like", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpNotLike(String value) {
            addCriterion("amount_Up not like", value, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpIn(List<String> values) {
            addCriterion("amount_Up in", values, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpNotIn(List<String> values) {
            addCriterion("amount_Up not in", values, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpBetween(String value1, String value2) {
            addCriterion("amount_Up between", value1, value2, "amountUp");
            return (Criteria) this;
        }

        public Criteria andAmountUpNotBetween(String value1, String value2) {
            addCriterion("amount_Up not between", value1, value2, "amountUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpIsNull() {
            addCriterion("screen_Up is null");
            return (Criteria) this;
        }

        public Criteria andScreenUpIsNotNull() {
            addCriterion("screen_Up is not null");
            return (Criteria) this;
        }

        public Criteria andScreenUpEqualTo(String value) {
            addCriterion("screen_Up =", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpNotEqualTo(String value) {
            addCriterion("screen_Up <>", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpGreaterThan(String value) {
            addCriterion("screen_Up >", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpGreaterThanOrEqualTo(String value) {
            addCriterion("screen_Up >=", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpLessThan(String value) {
            addCriterion("screen_Up <", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpLessThanOrEqualTo(String value) {
            addCriterion("screen_Up <=", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpLike(String value) {
            addCriterion("screen_Up like", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpNotLike(String value) {
            addCriterion("screen_Up not like", value, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpIn(List<String> values) {
            addCriterion("screen_Up in", values, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpNotIn(List<String> values) {
            addCriterion("screen_Up not in", values, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpBetween(String value1, String value2) {
            addCriterion("screen_Up between", value1, value2, "screenUp");
            return (Criteria) this;
        }

        public Criteria andScreenUpNotBetween(String value1, String value2) {
            addCriterion("screen_Up not between", value1, value2, "screenUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpIsNull() {
            addCriterion("people_Up is null");
            return (Criteria) this;
        }

        public Criteria andPeopleUpIsNotNull() {
            addCriterion("people_Up is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleUpEqualTo(String value) {
            addCriterion("people_Up =", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpNotEqualTo(String value) {
            addCriterion("people_Up <>", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpGreaterThan(String value) {
            addCriterion("people_Up >", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpGreaterThanOrEqualTo(String value) {
            addCriterion("people_Up >=", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpLessThan(String value) {
            addCriterion("people_Up <", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpLessThanOrEqualTo(String value) {
            addCriterion("people_Up <=", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpLike(String value) {
            addCriterion("people_Up like", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpNotLike(String value) {
            addCriterion("people_Up not like", value, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpIn(List<String> values) {
            addCriterion("people_Up in", values, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpNotIn(List<String> values) {
            addCriterion("people_Up not in", values, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpBetween(String value1, String value2) {
            addCriterion("people_Up between", value1, value2, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andPeopleUpNotBetween(String value1, String value2) {
            addCriterion("people_Up not between", value1, value2, "peopleUp");
            return (Criteria) this;
        }

        public Criteria andDefaultimageIsNull() {
            addCriterion("defaultImage is null");
            return (Criteria) this;
        }

        public Criteria andDefaultimageIsNotNull() {
            addCriterion("defaultImage is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultimageEqualTo(String value) {
            addCriterion("defaultImage =", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageNotEqualTo(String value) {
            addCriterion("defaultImage <>", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageGreaterThan(String value) {
            addCriterion("defaultImage >", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageGreaterThanOrEqualTo(String value) {
            addCriterion("defaultImage >=", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageLessThan(String value) {
            addCriterion("defaultImage <", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageLessThanOrEqualTo(String value) {
            addCriterion("defaultImage <=", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageLike(String value) {
            addCriterion("defaultImage like", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageNotLike(String value) {
            addCriterion("defaultImage not like", value, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageIn(List<String> values) {
            addCriterion("defaultImage in", values, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageNotIn(List<String> values) {
            addCriterion("defaultImage not in", values, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageBetween(String value1, String value2) {
            addCriterion("defaultImage between", value1, value2, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andDefaultimageNotBetween(String value1, String value2) {
            addCriterion("defaultImage not between", value1, value2, "defaultimage");
            return (Criteria) this;
        }

        public Criteria andRankUpIsNull() {
            addCriterion("rank_Up is null");
            return (Criteria) this;
        }

        public Criteria andRankUpIsNotNull() {
            addCriterion("rank_Up is not null");
            return (Criteria) this;
        }

        public Criteria andRankUpEqualTo(String value) {
            addCriterion("rank_Up =", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpNotEqualTo(String value) {
            addCriterion("rank_Up <>", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpGreaterThan(String value) {
            addCriterion("rank_Up >", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpGreaterThanOrEqualTo(String value) {
            addCriterion("rank_Up >=", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpLessThan(String value) {
            addCriterion("rank_Up <", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpLessThanOrEqualTo(String value) {
            addCriterion("rank_Up <=", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpLike(String value) {
            addCriterion("rank_Up like", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpNotLike(String value) {
            addCriterion("rank_Up not like", value, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpIn(List<String> values) {
            addCriterion("rank_Up in", values, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpNotIn(List<String> values) {
            addCriterion("rank_Up not in", values, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpBetween(String value1, String value2) {
            addCriterion("rank_Up between", value1, value2, "rankUp");
            return (Criteria) this;
        }

        public Criteria andRankUpNotBetween(String value1, String value2) {
            addCriterion("rank_Up not between", value1, value2, "rankUp");
            return (Criteria) this;
        }

        public Criteria andWomindexIsNull() {
            addCriterion("womIndex is null");
            return (Criteria) this;
        }

        public Criteria andWomindexIsNotNull() {
            addCriterion("womIndex is not null");
            return (Criteria) this;
        }

        public Criteria andWomindexEqualTo(Double value) {
            addCriterion("womIndex =", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexNotEqualTo(Double value) {
            addCriterion("womIndex <>", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexGreaterThan(Double value) {
            addCriterion("womIndex >", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexGreaterThanOrEqualTo(Double value) {
            addCriterion("womIndex >=", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexLessThan(Double value) {
            addCriterion("womIndex <", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexLessThanOrEqualTo(Double value) {
            addCriterion("womIndex <=", value, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexIn(List<Double> values) {
            addCriterion("womIndex in", values, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexNotIn(List<Double> values) {
            addCriterion("womIndex not in", values, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexBetween(Double value1, Double value2) {
            addCriterion("womIndex between", value1, value2, "womindex");
            return (Criteria) this;
        }

        public Criteria andWomindexNotBetween(Double value1, Double value2) {
            addCriterion("womIndex not between", value1, value2, "womindex");
            return (Criteria) this;
        }

        public Criteria andSdateIsNull() {
            addCriterion("sdate is null");
            return (Criteria) this;
        }

        public Criteria andSdateIsNotNull() {
            addCriterion("sdate is not null");
            return (Criteria) this;
        }

        public Criteria andSdateEqualTo(String value) {
            addCriterion("sdate =", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotEqualTo(String value) {
            addCriterion("sdate <>", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThan(String value) {
            addCriterion("sdate >", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThanOrEqualTo(String value) {
            addCriterion("sdate >=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThan(String value) {
            addCriterion("sdate <", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThanOrEqualTo(String value) {
            addCriterion("sdate <=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLike(String value) {
            addCriterion("sdate like", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotLike(String value) {
            addCriterion("sdate not like", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateIn(List<String> values) {
            addCriterion("sdate in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotIn(List<String> values) {
            addCriterion("sdate not in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateBetween(String value1, String value2) {
            addCriterion("sdate between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotBetween(String value1, String value2) {
            addCriterion("sdate not between", value1, value2, "sdate");
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