package com.aode.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeIsNull() {
            addCriterion("comment_postTime is null");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeIsNotNull() {
            addCriterion("comment_postTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeEqualTo(Date value) {
            addCriterion("comment_postTime =", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeNotEqualTo(Date value) {
            addCriterion("comment_postTime <>", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeGreaterThan(Date value) {
            addCriterion("comment_postTime >", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_postTime >=", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeLessThan(Date value) {
            addCriterion("comment_postTime <", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_postTime <=", value, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeIn(List<Date> values) {
            addCriterion("comment_postTime in", values, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeNotIn(List<Date> values) {
            addCriterion("comment_postTime not in", values, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeBetween(Date value1, Date value2) {
            addCriterion("comment_postTime between", value1, value2, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_postTime not between", value1, value2, "commentPosttime");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridIsNull() {
            addCriterion("comment_ownerId is null");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridIsNotNull() {
            addCriterion("comment_ownerId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridEqualTo(Integer value) {
            addCriterion("comment_ownerId =", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridNotEqualTo(Integer value) {
            addCriterion("comment_ownerId <>", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridGreaterThan(Integer value) {
            addCriterion("comment_ownerId >", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_ownerId >=", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridLessThan(Integer value) {
            addCriterion("comment_ownerId <", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("comment_ownerId <=", value, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridIn(List<Integer> values) {
            addCriterion("comment_ownerId in", values, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridNotIn(List<Integer> values) {
            addCriterion("comment_ownerId not in", values, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridBetween(Integer value1, Integer value2) {
            addCriterion("comment_ownerId between", value1, value2, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_ownerId not between", value1, value2, "commentOwnerid");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNull() {
            addCriterion("comment_userId is null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNotNull() {
            addCriterion("comment_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridEqualTo(Integer value) {
            addCriterion("comment_userId =", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotEqualTo(Integer value) {
            addCriterion("comment_userId <>", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThan(Integer value) {
            addCriterion("comment_userId >", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_userId >=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThan(Integer value) {
            addCriterion("comment_userId <", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThanOrEqualTo(Integer value) {
            addCriterion("comment_userId <=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIn(List<Integer> values) {
            addCriterion("comment_userId in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotIn(List<Integer> values) {
            addCriterion("comment_userId not in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridBetween(Integer value1, Integer value2) {
            addCriterion("comment_userId between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_userId not between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNull() {
            addCriterion("comment_state is null");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNotNull() {
            addCriterion("comment_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStateEqualTo(Integer value) {
            addCriterion("comment_state =", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotEqualTo(Integer value) {
            addCriterion("comment_state <>", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThan(Integer value) {
            addCriterion("comment_state >", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_state >=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThan(Integer value) {
            addCriterion("comment_state <", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThanOrEqualTo(Integer value) {
            addCriterion("comment_state <=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateIn(List<Integer> values) {
            addCriterion("comment_state in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotIn(List<Integer> values) {
            addCriterion("comment_state not in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateBetween(Integer value1, Integer value2) {
            addCriterion("comment_state between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_state not between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameIsNull() {
            addCriterion("comment_usernname is null");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameIsNotNull() {
            addCriterion("comment_usernname is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameEqualTo(String value) {
            addCriterion("comment_usernname =", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameNotEqualTo(String value) {
            addCriterion("comment_usernname <>", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameGreaterThan(String value) {
            addCriterion("comment_usernname >", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_usernname >=", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameLessThan(String value) {
            addCriterion("comment_usernname <", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameLessThanOrEqualTo(String value) {
            addCriterion("comment_usernname <=", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameLike(String value) {
            addCriterion("comment_usernname like", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameNotLike(String value) {
            addCriterion("comment_usernname not like", value, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameIn(List<String> values) {
            addCriterion("comment_usernname in", values, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameNotIn(List<String> values) {
            addCriterion("comment_usernname not in", values, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameBetween(String value1, String value2) {
            addCriterion("comment_usernname between", value1, value2, "commentUsernname");
            return (Criteria) this;
        }

        public Criteria andCommentUsernnameNotBetween(String value1, String value2) {
            addCriterion("comment_usernname not between", value1, value2, "commentUsernname");
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