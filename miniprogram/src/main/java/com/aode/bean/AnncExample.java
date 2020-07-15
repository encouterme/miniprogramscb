package com.aode.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnncExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnncExample() {
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

        public Criteria andAnncIdIsNull() {
            addCriterion("annc_id is null");
            return (Criteria) this;
        }

        public Criteria andAnncIdIsNotNull() {
            addCriterion("annc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnncIdEqualTo(Integer value) {
            addCriterion("annc_id =", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotEqualTo(Integer value) {
            addCriterion("annc_id <>", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdGreaterThan(Integer value) {
            addCriterion("annc_id >", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("annc_id >=", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdLessThan(Integer value) {
            addCriterion("annc_id <", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdLessThanOrEqualTo(Integer value) {
            addCriterion("annc_id <=", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdIn(List<Integer> values) {
            addCriterion("annc_id in", values, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotIn(List<Integer> values) {
            addCriterion("annc_id not in", values, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdBetween(Integer value1, Integer value2) {
            addCriterion("annc_id between", value1, value2, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("annc_id not between", value1, value2, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIsNull() {
            addCriterion("annc_title is null");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIsNotNull() {
            addCriterion("annc_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnncTitleEqualTo(String value) {
            addCriterion("annc_title =", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotEqualTo(String value) {
            addCriterion("annc_title <>", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleGreaterThan(String value) {
            addCriterion("annc_title >", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleGreaterThanOrEqualTo(String value) {
            addCriterion("annc_title >=", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLessThan(String value) {
            addCriterion("annc_title <", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLessThanOrEqualTo(String value) {
            addCriterion("annc_title <=", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLike(String value) {
            addCriterion("annc_title like", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotLike(String value) {
            addCriterion("annc_title not like", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIn(List<String> values) {
            addCriterion("annc_title in", values, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotIn(List<String> values) {
            addCriterion("annc_title not in", values, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleBetween(String value1, String value2) {
            addCriterion("annc_title between", value1, value2, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotBetween(String value1, String value2) {
            addCriterion("annc_title not between", value1, value2, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncContentIsNull() {
            addCriterion("annc_content is null");
            return (Criteria) this;
        }

        public Criteria andAnncContentIsNotNull() {
            addCriterion("annc_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnncContentEqualTo(String value) {
            addCriterion("annc_content =", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentNotEqualTo(String value) {
            addCriterion("annc_content <>", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentGreaterThan(String value) {
            addCriterion("annc_content >", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentGreaterThanOrEqualTo(String value) {
            addCriterion("annc_content >=", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentLessThan(String value) {
            addCriterion("annc_content <", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentLessThanOrEqualTo(String value) {
            addCriterion("annc_content <=", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentLike(String value) {
            addCriterion("annc_content like", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentNotLike(String value) {
            addCriterion("annc_content not like", value, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentIn(List<String> values) {
            addCriterion("annc_content in", values, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentNotIn(List<String> values) {
            addCriterion("annc_content not in", values, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentBetween(String value1, String value2) {
            addCriterion("annc_content between", value1, value2, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncContentNotBetween(String value1, String value2) {
            addCriterion("annc_content not between", value1, value2, "anncContent");
            return (Criteria) this;
        }

        public Criteria andAnncTimeIsNull() {
            addCriterion("annc_time is null");
            return (Criteria) this;
        }

        public Criteria andAnncTimeIsNotNull() {
            addCriterion("annc_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnncTimeEqualTo(Date value) {
            addCriterion("annc_time =", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeNotEqualTo(Date value) {
            addCriterion("annc_time <>", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeGreaterThan(Date value) {
            addCriterion("annc_time >", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("annc_time >=", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeLessThan(Date value) {
            addCriterion("annc_time <", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeLessThanOrEqualTo(Date value) {
            addCriterion("annc_time <=", value, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeIn(List<Date> values) {
            addCriterion("annc_time in", values, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeNotIn(List<Date> values) {
            addCriterion("annc_time not in", values, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeBetween(Date value1, Date value2) {
            addCriterion("annc_time between", value1, value2, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncTimeNotBetween(Date value1, Date value2) {
            addCriterion("annc_time not between", value1, value2, "anncTime");
            return (Criteria) this;
        }

        public Criteria andAnncMenberIsNull() {
            addCriterion("annc_menber is null");
            return (Criteria) this;
        }

        public Criteria andAnncMenberIsNotNull() {
            addCriterion("annc_menber is not null");
            return (Criteria) this;
        }

        public Criteria andAnncMenberEqualTo(String value) {
            addCriterion("annc_menber =", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberNotEqualTo(String value) {
            addCriterion("annc_menber <>", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberGreaterThan(String value) {
            addCriterion("annc_menber >", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberGreaterThanOrEqualTo(String value) {
            addCriterion("annc_menber >=", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberLessThan(String value) {
            addCriterion("annc_menber <", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberLessThanOrEqualTo(String value) {
            addCriterion("annc_menber <=", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberLike(String value) {
            addCriterion("annc_menber like", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberNotLike(String value) {
            addCriterion("annc_menber not like", value, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberIn(List<String> values) {
            addCriterion("annc_menber in", values, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberNotIn(List<String> values) {
            addCriterion("annc_menber not in", values, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberBetween(String value1, String value2) {
            addCriterion("annc_menber between", value1, value2, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncMenberNotBetween(String value1, String value2) {
            addCriterion("annc_menber not between", value1, value2, "anncMenber");
            return (Criteria) this;
        }

        public Criteria andAnncImg01IsNull() {
            addCriterion("annc_img01 is null");
            return (Criteria) this;
        }

        public Criteria andAnncImg01IsNotNull() {
            addCriterion("annc_img01 is not null");
            return (Criteria) this;
        }

        public Criteria andAnncImg01EqualTo(String value) {
            addCriterion("annc_img01 =", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01NotEqualTo(String value) {
            addCriterion("annc_img01 <>", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01GreaterThan(String value) {
            addCriterion("annc_img01 >", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01GreaterThanOrEqualTo(String value) {
            addCriterion("annc_img01 >=", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01LessThan(String value) {
            addCriterion("annc_img01 <", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01LessThanOrEqualTo(String value) {
            addCriterion("annc_img01 <=", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01Like(String value) {
            addCriterion("annc_img01 like", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01NotLike(String value) {
            addCriterion("annc_img01 not like", value, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01In(List<String> values) {
            addCriterion("annc_img01 in", values, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01NotIn(List<String> values) {
            addCriterion("annc_img01 not in", values, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01Between(String value1, String value2) {
            addCriterion("annc_img01 between", value1, value2, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg01NotBetween(String value1, String value2) {
            addCriterion("annc_img01 not between", value1, value2, "anncImg01");
            return (Criteria) this;
        }

        public Criteria andAnncImg02IsNull() {
            addCriterion("annc_img02 is null");
            return (Criteria) this;
        }

        public Criteria andAnncImg02IsNotNull() {
            addCriterion("annc_img02 is not null");
            return (Criteria) this;
        }

        public Criteria andAnncImg02EqualTo(String value) {
            addCriterion("annc_img02 =", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02NotEqualTo(String value) {
            addCriterion("annc_img02 <>", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02GreaterThan(String value) {
            addCriterion("annc_img02 >", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02GreaterThanOrEqualTo(String value) {
            addCriterion("annc_img02 >=", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02LessThan(String value) {
            addCriterion("annc_img02 <", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02LessThanOrEqualTo(String value) {
            addCriterion("annc_img02 <=", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02Like(String value) {
            addCriterion("annc_img02 like", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02NotLike(String value) {
            addCriterion("annc_img02 not like", value, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02In(List<String> values) {
            addCriterion("annc_img02 in", values, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02NotIn(List<String> values) {
            addCriterion("annc_img02 not in", values, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02Between(String value1, String value2) {
            addCriterion("annc_img02 between", value1, value2, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg02NotBetween(String value1, String value2) {
            addCriterion("annc_img02 not between", value1, value2, "anncImg02");
            return (Criteria) this;
        }

        public Criteria andAnncImg03IsNull() {
            addCriterion("annc_img03 is null");
            return (Criteria) this;
        }

        public Criteria andAnncImg03IsNotNull() {
            addCriterion("annc_img03 is not null");
            return (Criteria) this;
        }

        public Criteria andAnncImg03EqualTo(String value) {
            addCriterion("annc_img03 =", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03NotEqualTo(String value) {
            addCriterion("annc_img03 <>", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03GreaterThan(String value) {
            addCriterion("annc_img03 >", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03GreaterThanOrEqualTo(String value) {
            addCriterion("annc_img03 >=", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03LessThan(String value) {
            addCriterion("annc_img03 <", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03LessThanOrEqualTo(String value) {
            addCriterion("annc_img03 <=", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03Like(String value) {
            addCriterion("annc_img03 like", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03NotLike(String value) {
            addCriterion("annc_img03 not like", value, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03In(List<String> values) {
            addCriterion("annc_img03 in", values, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03NotIn(List<String> values) {
            addCriterion("annc_img03 not in", values, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03Between(String value1, String value2) {
            addCriterion("annc_img03 between", value1, value2, "anncImg03");
            return (Criteria) this;
        }

        public Criteria andAnncImg03NotBetween(String value1, String value2) {
            addCriterion("annc_img03 not between", value1, value2, "anncImg03");
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