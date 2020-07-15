package com.aode.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeIsNull() {
            addCriterion("reply_postTime is null");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeIsNotNull() {
            addCriterion("reply_postTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeEqualTo(Date value) {
            addCriterion("reply_postTime =", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeNotEqualTo(Date value) {
            addCriterion("reply_postTime <>", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeGreaterThan(Date value) {
            addCriterion("reply_postTime >", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_postTime >=", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeLessThan(Date value) {
            addCriterion("reply_postTime <", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_postTime <=", value, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeIn(List<Date> values) {
            addCriterion("reply_postTime in", values, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeNotIn(List<Date> values) {
            addCriterion("reply_postTime not in", values, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeBetween(Date value1, Date value2) {
            addCriterion("reply_postTime between", value1, value2, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_postTime not between", value1, value2, "replyPosttime");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyUseridIsNull() {
            addCriterion("reply_userId is null");
            return (Criteria) this;
        }

        public Criteria andReplyUseridIsNotNull() {
            addCriterion("reply_userId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUseridEqualTo(Integer value) {
            addCriterion("reply_userId =", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridNotEqualTo(Integer value) {
            addCriterion("reply_userId <>", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridGreaterThan(Integer value) {
            addCriterion("reply_userId >", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_userId >=", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridLessThan(Integer value) {
            addCriterion("reply_userId <", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridLessThanOrEqualTo(Integer value) {
            addCriterion("reply_userId <=", value, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridIn(List<Integer> values) {
            addCriterion("reply_userId in", values, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridNotIn(List<Integer> values) {
            addCriterion("reply_userId not in", values, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridBetween(Integer value1, Integer value2) {
            addCriterion("reply_userId between", value1, value2, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_userId not between", value1, value2, "replyUserid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidIsNull() {
            addCriterion("reply_commentId is null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidIsNotNull() {
            addCriterion("reply_commentId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidEqualTo(Integer value) {
            addCriterion("reply_commentId =", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidNotEqualTo(Integer value) {
            addCriterion("reply_commentId <>", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidGreaterThan(Integer value) {
            addCriterion("reply_commentId >", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_commentId >=", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidLessThan(Integer value) {
            addCriterion("reply_commentId <", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("reply_commentId <=", value, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidIn(List<Integer> values) {
            addCriterion("reply_commentId in", values, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidNotIn(List<Integer> values) {
            addCriterion("reply_commentId not in", values, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidBetween(Integer value1, Integer value2) {
            addCriterion("reply_commentId between", value1, value2, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_commentId not between", value1, value2, "replyCommentid");
            return (Criteria) this;
        }

        public Criteria andReplyStateIsNull() {
            addCriterion("\"reply _state\" is null");
            return (Criteria) this;
        }

        public Criteria andReplyStateIsNotNull() {
            addCriterion("\"reply _state\" is not null");
            return (Criteria) this;
        }

        public Criteria andReplyStateEqualTo(Integer value) {
            addCriterion("\"reply _state\" =", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateNotEqualTo(Integer value) {
            addCriterion("\"reply _state\" <>", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateGreaterThan(Integer value) {
            addCriterion("\"reply _state\" >", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"reply _state\" >=", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateLessThan(Integer value) {
            addCriterion("\"reply _state\" <", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateLessThanOrEqualTo(Integer value) {
            addCriterion("\"reply _state\" <=", value, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateIn(List<Integer> values) {
            addCriterion("\"reply _state\" in", values, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateNotIn(List<Integer> values) {
            addCriterion("\"reply _state\" not in", values, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateBetween(Integer value1, Integer value2) {
            addCriterion("\"reply _state\" between", value1, value2, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("\"reply _state\" not between", value1, value2, "replyState");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridIsNull() {
            addCriterion("reply_for_userId is null");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridIsNotNull() {
            addCriterion("reply_for_userId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridEqualTo(Integer value) {
            addCriterion("reply_for_userId =", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridNotEqualTo(Integer value) {
            addCriterion("reply_for_userId <>", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridGreaterThan(Integer value) {
            addCriterion("reply_for_userId >", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_for_userId >=", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridLessThan(Integer value) {
            addCriterion("reply_for_userId <", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridLessThanOrEqualTo(Integer value) {
            addCriterion("reply_for_userId <=", value, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridIn(List<Integer> values) {
            addCriterion("reply_for_userId in", values, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridNotIn(List<Integer> values) {
            addCriterion("reply_for_userId not in", values, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridBetween(Integer value1, Integer value2) {
            addCriterion("reply_for_userId between", value1, value2, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_for_userId not between", value1, value2, "replyForUserid");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameIsNull() {
            addCriterion("reply_for_username is null");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameIsNotNull() {
            addCriterion("reply_for_username is not null");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameEqualTo(String value) {
            addCriterion("reply_for_username =", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameNotEqualTo(String value) {
            addCriterion("reply_for_username <>", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameGreaterThan(String value) {
            addCriterion("reply_for_username >", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_for_username >=", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameLessThan(String value) {
            addCriterion("reply_for_username <", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameLessThanOrEqualTo(String value) {
            addCriterion("reply_for_username <=", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameLike(String value) {
            addCriterion("reply_for_username like", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameNotLike(String value) {
            addCriterion("reply_for_username not like", value, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameIn(List<String> values) {
            addCriterion("reply_for_username in", values, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameNotIn(List<String> values) {
            addCriterion("reply_for_username not in", values, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameBetween(String value1, String value2) {
            addCriterion("reply_for_username between", value1, value2, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyForUsernameNotBetween(String value1, String value2) {
            addCriterion("reply_for_username not between", value1, value2, "replyForUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameIsNull() {
            addCriterion("reply_username is null");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameIsNotNull() {
            addCriterion("reply_username is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameEqualTo(String value) {
            addCriterion("reply_username =", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameNotEqualTo(String value) {
            addCriterion("reply_username <>", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameGreaterThan(String value) {
            addCriterion("reply_username >", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_username >=", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameLessThan(String value) {
            addCriterion("reply_username <", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameLessThanOrEqualTo(String value) {
            addCriterion("reply_username <=", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameLike(String value) {
            addCriterion("reply_username like", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameNotLike(String value) {
            addCriterion("reply_username not like", value, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameIn(List<String> values) {
            addCriterion("reply_username in", values, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameNotIn(List<String> values) {
            addCriterion("reply_username not in", values, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameBetween(String value1, String value2) {
            addCriterion("reply_username between", value1, value2, "replyUsername");
            return (Criteria) this;
        }

        public Criteria andReplyUsernameNotBetween(String value1, String value2) {
            addCriterion("reply_username not between", value1, value2, "replyUsername");
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