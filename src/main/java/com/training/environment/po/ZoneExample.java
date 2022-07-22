package com.training.environment.po;

import java.util.ArrayList;
import java.util.List;

public class ZoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZoneExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAcCodeIsNull() {
            addCriterion("ac_code is null");
            return (Criteria) this;
        }

        public Criteria andAcCodeIsNotNull() {
            addCriterion("ac_code is not null");
            return (Criteria) this;
        }

        public Criteria andAcCodeEqualTo(String value) {
            addCriterion("ac_code =", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeNotEqualTo(String value) {
            addCriterion("ac_code <>", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeGreaterThan(String value) {
            addCriterion("ac_code >", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ac_code >=", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeLessThan(String value) {
            addCriterion("ac_code <", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeLessThanOrEqualTo(String value) {
            addCriterion("ac_code <=", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeLike(String value) {
            addCriterion("ac_code like", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeNotLike(String value) {
            addCriterion("ac_code not like", value, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeIn(List<String> values) {
            addCriterion("ac_code in", values, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeNotIn(List<String> values) {
            addCriterion("ac_code not in", values, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeBetween(String value1, String value2) {
            addCriterion("ac_code between", value1, value2, "acCode");
            return (Criteria) this;
        }

        public Criteria andAcCodeNotBetween(String value1, String value2) {
            addCriterion("ac_code not between", value1, value2, "acCode");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceIsNull() {
            addCriterion("temp_preference is null");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceIsNotNull() {
            addCriterion("temp_preference is not null");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceEqualTo(Integer value) {
            addCriterion("temp_preference =", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceNotEqualTo(Integer value) {
            addCriterion("temp_preference <>", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceGreaterThan(Integer value) {
            addCriterion("temp_preference >", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_preference >=", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceLessThan(Integer value) {
            addCriterion("temp_preference <", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("temp_preference <=", value, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceIn(List<Integer> values) {
            addCriterion("temp_preference in", values, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceNotIn(List<Integer> values) {
            addCriterion("temp_preference not in", values, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("temp_preference between", value1, value2, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andTempPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_preference not between", value1, value2, "tempPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceIsNull() {
            addCriterion("wind_speed_preference is null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceIsNotNull() {
            addCriterion("wind_speed_preference is not null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceEqualTo(Integer value) {
            addCriterion("wind_speed_preference =", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceNotEqualTo(Integer value) {
            addCriterion("wind_speed_preference <>", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceGreaterThan(Integer value) {
            addCriterion("wind_speed_preference >", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("wind_speed_preference >=", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceLessThan(Integer value) {
            addCriterion("wind_speed_preference <", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("wind_speed_preference <=", value, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceIn(List<Integer> values) {
            addCriterion("wind_speed_preference in", values, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceNotIn(List<Integer> values) {
            addCriterion("wind_speed_preference not in", values, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("wind_speed_preference between", value1, value2, "windSpeedPreference");
            return (Criteria) this;
        }

        public Criteria andWindSpeedPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("wind_speed_preference not between", value1, value2, "windSpeedPreference");
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