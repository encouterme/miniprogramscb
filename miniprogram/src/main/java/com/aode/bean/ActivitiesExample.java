package com.aode.bean;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivitiesExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNull() {
            addCriterion("activity_title is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("activity_title =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("activity_title <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("activity_title >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_title >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("activity_title <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("activity_title <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("activity_title like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("activity_title not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("activity_title in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("activity_title not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("activity_title between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("activity_title not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeIsNull() {
            addCriterion("activity_beginTime is null");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeIsNotNull() {
            addCriterion("activity_beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeEqualTo(String value) {
            addCriterion("activity_beginTime =", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeNotEqualTo(String value) {
            addCriterion("activity_beginTime <>", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeGreaterThan(String value) {
            addCriterion("activity_beginTime >", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_beginTime >=", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeLessThan(String value) {
            addCriterion("activity_beginTime <", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeLessThanOrEqualTo(String value) {
            addCriterion("activity_beginTime <=", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeLike(String value) {
            addCriterion("activity_beginTime like", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeNotLike(String value) {
            addCriterion("activity_beginTime not like", value, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeIn(List<String> values) {
            addCriterion("activity_beginTime in", values, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeNotIn(List<String> values) {
            addCriterion("activity_beginTime not in", values, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeBetween(String value1, String value2) {
            addCriterion("activity_beginTime between", value1, value2, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityBegintimeNotBetween(String value1, String value2) {
            addCriterion("activity_beginTime not between", value1, value2, "activityBegintime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeIsNull() {
            addCriterion("activity_endTime is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeIsNotNull() {
            addCriterion("activity_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeEqualTo(String value) {
            addCriterion("activity_endTime =", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeNotEqualTo(String value) {
            addCriterion("activity_endTime <>", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeGreaterThan(String value) {
            addCriterion("activity_endTime >", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_endTime >=", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeLessThan(String value) {
            addCriterion("activity_endTime <", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeLessThanOrEqualTo(String value) {
            addCriterion("activity_endTime <=", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeLike(String value) {
            addCriterion("activity_endTime like", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeNotLike(String value) {
            addCriterion("activity_endTime not like", value, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeIn(List<String> values) {
            addCriterion("activity_endTime in", values, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeNotIn(List<String> values) {
            addCriterion("activity_endTime not in", values, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeBetween(String value1, String value2) {
            addCriterion("activity_endTime between", value1, value2, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityEndtimeNotBetween(String value1, String value2) {
            addCriterion("activity_endTime not between", value1, value2, "activityEndtime");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedIsNull() {
            addCriterion("activity_isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedIsNotNull() {
            addCriterion("activity_isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedEqualTo(Integer value) {
            addCriterion("activity_isDeleted =", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedNotEqualTo(Integer value) {
            addCriterion("activity_isDeleted <>", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedGreaterThan(Integer value) {
            addCriterion("activity_isDeleted >", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_isDeleted >=", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedLessThan(Integer value) {
            addCriterion("activity_isDeleted <", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("activity_isDeleted <=", value, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedIn(List<Integer> values) {
            addCriterion("activity_isDeleted in", values, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedNotIn(List<Integer> values) {
            addCriterion("activity_isDeleted not in", values, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("activity_isDeleted between", value1, value2, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_isDeleted not between", value1, value2, "activityIsdeleted");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureIsNull() {
            addCriterion("activity_mainPicture is null");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureIsNotNull() {
            addCriterion("activity_mainPicture is not null");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureEqualTo(String value) {
            addCriterion("activity_mainPicture =", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureNotEqualTo(String value) {
            addCriterion("activity_mainPicture <>", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureGreaterThan(String value) {
            addCriterion("activity_mainPicture >", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureGreaterThanOrEqualTo(String value) {
            addCriterion("activity_mainPicture >=", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureLessThan(String value) {
            addCriterion("activity_mainPicture <", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureLessThanOrEqualTo(String value) {
            addCriterion("activity_mainPicture <=", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureLike(String value) {
            addCriterion("activity_mainPicture like", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureNotLike(String value) {
            addCriterion("activity_mainPicture not like", value, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureIn(List<String> values) {
            addCriterion("activity_mainPicture in", values, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureNotIn(List<String> values) {
            addCriterion("activity_mainPicture not in", values, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureBetween(String value1, String value2) {
            addCriterion("activity_mainPicture between", value1, value2, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andActivityMainpictureNotBetween(String value1, String value2) {
            addCriterion("activity_mainPicture not between", value1, value2, "activityMainpicture");
            return (Criteria) this;
        }

        public Criteria andisTimeoutIsNull() {
            addCriterion(" is_timeOut is null");
            return (Criteria) this;
        }

        public Criteria andisTimeoutIsNotNull() {
            addCriterion(" is_timeOut is not null");
            return (Criteria) this;
        }

        public Criteria andisTimeoutEqualTo(Integer value) {
            addCriterion(" is_timeOut =", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutNotEqualTo(Integer value) {
            addCriterion(" is_timeOut <>", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutGreaterThan(Integer value) {
            addCriterion(" is_timeOut >", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion(" is_timeOut >=", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutLessThan(Integer value) {
            addCriterion(" is_timeOut <", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion(" is_timeOut <=", value, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutIn(List<Integer> values) {
            addCriterion(" is_timeOut in", values, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutNotIn(List<Integer> values) {
            addCriterion(" is_timeOut not in", values, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutBetween(Integer value1, Integer value2) {
            addCriterion(" is_timeOut between", value1, value2, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andisTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion(" is_timeOut not between", value1, value2, " isTimeout");
            return (Criteria) this;
        }

        public Criteria andMemberNumIsNull() {
            addCriterion("member_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberNumIsNotNull() {
            addCriterion("member_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNumEqualTo(Integer value) {
            addCriterion("member_num =", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumNotEqualTo(Integer value) {
            addCriterion("member_num <>", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumGreaterThan(Integer value) {
            addCriterion("member_num >", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_num >=", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumLessThan(Integer value) {
            addCriterion("member_num <", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_num <=", value, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumIn(List<Integer> values) {
            addCriterion("member_num in", values, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumNotIn(List<Integer> values) {
            addCriterion("member_num not in", values, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumBetween(Integer value1, Integer value2) {
            addCriterion("member_num between", value1, value2, "memberNum");
            return (Criteria) this;
        }

        public Criteria andMemberNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_num not between", value1, value2, "memberNum");
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