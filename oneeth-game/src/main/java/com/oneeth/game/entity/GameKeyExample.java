package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameKeyExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNull() {
            addCriterion("get_type is null");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNotNull() {
            addCriterion("get_type is not null");
            return (Criteria) this;
        }

        public Criteria andGetTypeEqualTo(String value) {
            addCriterion("get_type =", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotEqualTo(String value) {
            addCriterion("get_type <>", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThan(String value) {
            addCriterion("get_type >", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("get_type >=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThan(String value) {
            addCriterion("get_type <", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThanOrEqualTo(String value) {
            addCriterion("get_type <=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLike(String value) {
            addCriterion("get_type like", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotLike(String value) {
            addCriterion("get_type not like", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeIn(List<String> values) {
            addCriterion("get_type in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotIn(List<String> values) {
            addCriterion("get_type not in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeBetween(String value1, String value2) {
            addCriterion("get_type between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotBetween(String value1, String value2) {
            addCriterion("get_type not between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGameCodeIsNull() {
            addCriterion("game_code is null");
            return (Criteria) this;
        }

        public Criteria andGameCodeIsNotNull() {
            addCriterion("game_code is not null");
            return (Criteria) this;
        }

        public Criteria andGameCodeEqualTo(String value) {
            addCriterion("game_code =", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotEqualTo(String value) {
            addCriterion("game_code <>", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThan(String value) {
            addCriterion("game_code >", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("game_code >=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThan(String value) {
            addCriterion("game_code <", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThanOrEqualTo(String value) {
            addCriterion("game_code <=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLike(String value) {
            addCriterion("game_code like", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotLike(String value) {
            addCriterion("game_code not like", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeIn(List<String> values) {
            addCriterion("game_code in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotIn(List<String> values) {
            addCriterion("game_code not in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeBetween(String value1, String value2) {
            addCriterion("game_code between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotBetween(String value1, String value2) {
            addCriterion("game_code not between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andTermNumberIsNull() {
            addCriterion("term_number is null");
            return (Criteria) this;
        }

        public Criteria andTermNumberIsNotNull() {
            addCriterion("term_number is not null");
            return (Criteria) this;
        }

        public Criteria andTermNumberEqualTo(String value) {
            addCriterion("term_number =", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotEqualTo(String value) {
            addCriterion("term_number <>", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThan(String value) {
            addCriterion("term_number >", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThanOrEqualTo(String value) {
            addCriterion("term_number >=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThan(String value) {
            addCriterion("term_number <", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThanOrEqualTo(String value) {
            addCriterion("term_number <=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLike(String value) {
            addCriterion("term_number like", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotLike(String value) {
            addCriterion("term_number not like", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberIn(List<String> values) {
            addCriterion("term_number in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotIn(List<String> values) {
            addCriterion("term_number not in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberBetween(String value1, String value2) {
            addCriterion("term_number between", value1, value2, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotBetween(String value1, String value2) {
            addCriterion("term_number not between", value1, value2, "termNumber");
            return (Criteria) this;
        }

        public Criteria andMinKeyIsNull() {
            addCriterion("min_key is null");
            return (Criteria) this;
        }

        public Criteria andMinKeyIsNotNull() {
            addCriterion("min_key is not null");
            return (Criteria) this;
        }

        public Criteria andMinKeyEqualTo(String value) {
            addCriterion("min_key =", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyNotEqualTo(String value) {
            addCriterion("min_key <>", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyGreaterThan(String value) {
            addCriterion("min_key >", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyGreaterThanOrEqualTo(String value) {
            addCriterion("min_key >=", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyLessThan(String value) {
            addCriterion("min_key <", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyLessThanOrEqualTo(String value) {
            addCriterion("min_key <=", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyLike(String value) {
            addCriterion("min_key like", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyNotLike(String value) {
            addCriterion("min_key not like", value, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyIn(List<String> values) {
            addCriterion("min_key in", values, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyNotIn(List<String> values) {
            addCriterion("min_key not in", values, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyBetween(String value1, String value2) {
            addCriterion("min_key between", value1, value2, "minKey");
            return (Criteria) this;
        }

        public Criteria andMinKeyNotBetween(String value1, String value2) {
            addCriterion("min_key not between", value1, value2, "minKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyIsNull() {
            addCriterion("max_key is null");
            return (Criteria) this;
        }

        public Criteria andMaxKeyIsNotNull() {
            addCriterion("max_key is not null");
            return (Criteria) this;
        }

        public Criteria andMaxKeyEqualTo(String value) {
            addCriterion("max_key =", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyNotEqualTo(String value) {
            addCriterion("max_key <>", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyGreaterThan(String value) {
            addCriterion("max_key >", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyGreaterThanOrEqualTo(String value) {
            addCriterion("max_key >=", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyLessThan(String value) {
            addCriterion("max_key <", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyLessThanOrEqualTo(String value) {
            addCriterion("max_key <=", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyLike(String value) {
            addCriterion("max_key like", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyNotLike(String value) {
            addCriterion("max_key not like", value, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyIn(List<String> values) {
            addCriterion("max_key in", values, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyNotIn(List<String> values) {
            addCriterion("max_key not in", values, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyBetween(String value1, String value2) {
            addCriterion("max_key between", value1, value2, "maxKey");
            return (Criteria) this;
        }

        public Criteria andMaxKeyNotBetween(String value1, String value2) {
            addCriterion("max_key not between", value1, value2, "maxKey");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNull() {
            addCriterion("park_time is null");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNotNull() {
            addCriterion("park_time is not null");
            return (Criteria) this;
        }

        public Criteria andParkTimeEqualTo(Date value) {
            addCriterion("park_time =", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotEqualTo(Date value) {
            addCriterion("park_time <>", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThan(Date value) {
            addCriterion("park_time >", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("park_time >=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThan(Date value) {
            addCriterion("park_time <", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThanOrEqualTo(Date value) {
            addCriterion("park_time <=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeIn(List<Date> values) {
            addCriterion("park_time in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotIn(List<Date> values) {
            addCriterion("park_time not in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeBetween(Date value1, Date value2) {
            addCriterion("park_time between", value1, value2, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotBetween(Date value1, Date value2) {
            addCriterion("park_time not between", value1, value2, "parkTime");
            return (Criteria) this;
        }

        public Criteria andIsLucklyIsNull() {
            addCriterion("is_luckly is null");
            return (Criteria) this;
        }

        public Criteria andIsLucklyIsNotNull() {
            addCriterion("is_luckly is not null");
            return (Criteria) this;
        }

        public Criteria andIsLucklyEqualTo(String value) {
            addCriterion("is_luckly =", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyNotEqualTo(String value) {
            addCriterion("is_luckly <>", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyGreaterThan(String value) {
            addCriterion("is_luckly >", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyGreaterThanOrEqualTo(String value) {
            addCriterion("is_luckly >=", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyLessThan(String value) {
            addCriterion("is_luckly <", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyLessThanOrEqualTo(String value) {
            addCriterion("is_luckly <=", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyLike(String value) {
            addCriterion("is_luckly like", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyNotLike(String value) {
            addCriterion("is_luckly not like", value, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyIn(List<String> values) {
            addCriterion("is_luckly in", values, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyNotIn(List<String> values) {
            addCriterion("is_luckly not in", values, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyBetween(String value1, String value2) {
            addCriterion("is_luckly between", value1, value2, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andIsLucklyNotBetween(String value1, String value2) {
            addCriterion("is_luckly not between", value1, value2, "isLuckly");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeIsNull() {
            addCriterion("luckly_code is null");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeIsNotNull() {
            addCriterion("luckly_code is not null");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeEqualTo(String value) {
            addCriterion("luckly_code =", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeNotEqualTo(String value) {
            addCriterion("luckly_code <>", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeGreaterThan(String value) {
            addCriterion("luckly_code >", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("luckly_code >=", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeLessThan(String value) {
            addCriterion("luckly_code <", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeLessThanOrEqualTo(String value) {
            addCriterion("luckly_code <=", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeLike(String value) {
            addCriterion("luckly_code like", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeNotLike(String value) {
            addCriterion("luckly_code not like", value, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeIn(List<String> values) {
            addCriterion("luckly_code in", values, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeNotIn(List<String> values) {
            addCriterion("luckly_code not in", values, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeBetween(String value1, String value2) {
            addCriterion("luckly_code between", value1, value2, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andLucklyCodeNotBetween(String value1, String value2) {
            addCriterion("luckly_code not between", value1, value2, "lucklyCode");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(BigDecimal value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressIsNull() {
            addCriterion("to_walletaddress is null");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressIsNotNull() {
            addCriterion("to_walletaddress is not null");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressEqualTo(String value) {
            addCriterion("to_walletaddress =", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressNotEqualTo(String value) {
            addCriterion("to_walletaddress <>", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressGreaterThan(String value) {
            addCriterion("to_walletaddress >", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_walletaddress >=", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressLessThan(String value) {
            addCriterion("to_walletaddress <", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressLessThanOrEqualTo(String value) {
            addCriterion("to_walletaddress <=", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressLike(String value) {
            addCriterion("to_walletaddress like", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressNotLike(String value) {
            addCriterion("to_walletaddress not like", value, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressIn(List<String> values) {
            addCriterion("to_walletaddress in", values, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressNotIn(List<String> values) {
            addCriterion("to_walletaddress not in", values, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressBetween(String value1, String value2) {
            addCriterion("to_walletaddress between", value1, value2, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andToWalletaddressNotBetween(String value1, String value2) {
            addCriterion("to_walletaddress not between", value1, value2, "toWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressIsNull() {
            addCriterion("from_walletaddress is null");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressIsNotNull() {
            addCriterion("from_walletaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressEqualTo(String value) {
            addCriterion("from_walletaddress =", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressNotEqualTo(String value) {
            addCriterion("from_walletaddress <>", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressGreaterThan(String value) {
            addCriterion("from_walletaddress >", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_walletaddress >=", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressLessThan(String value) {
            addCriterion("from_walletaddress <", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressLessThanOrEqualTo(String value) {
            addCriterion("from_walletaddress <=", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressLike(String value) {
            addCriterion("from_walletaddress like", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressNotLike(String value) {
            addCriterion("from_walletaddress not like", value, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressIn(List<String> values) {
            addCriterion("from_walletaddress in", values, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressNotIn(List<String> values) {
            addCriterion("from_walletaddress not in", values, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressBetween(String value1, String value2) {
            addCriterion("from_walletaddress between", value1, value2, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andFromWalletaddressNotBetween(String value1, String value2) {
            addCriterion("from_walletaddress not between", value1, value2, "fromWalletaddress");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashIsNull() {
            addCriterion("notionalPooling_hash is null");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashIsNotNull() {
            addCriterion("notionalPooling_hash is not null");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashEqualTo(String value) {
            addCriterion("notionalPooling_hash =", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashNotEqualTo(String value) {
            addCriterion("notionalPooling_hash <>", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashGreaterThan(String value) {
            addCriterion("notionalPooling_hash >", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashGreaterThanOrEqualTo(String value) {
            addCriterion("notionalPooling_hash >=", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashLessThan(String value) {
            addCriterion("notionalPooling_hash <", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashLessThanOrEqualTo(String value) {
            addCriterion("notionalPooling_hash <=", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashLike(String value) {
            addCriterion("notionalPooling_hash like", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashNotLike(String value) {
            addCriterion("notionalPooling_hash not like", value, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashIn(List<String> values) {
            addCriterion("notionalPooling_hash in", values, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashNotIn(List<String> values) {
            addCriterion("notionalPooling_hash not in", values, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashBetween(String value1, String value2) {
            addCriterion("notionalPooling_hash between", value1, value2, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andNotionalpoolingHashNotBetween(String value1, String value2) {
            addCriterion("notionalPooling_hash not between", value1, value2, "notionalpoolingHash");
            return (Criteria) this;
        }

        public Criteria andFree1IsNull() {
            addCriterion("free_1 is null");
            return (Criteria) this;
        }

        public Criteria andFree1IsNotNull() {
            addCriterion("free_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFree1EqualTo(String value) {
            addCriterion("free_1 =", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotEqualTo(String value) {
            addCriterion("free_1 <>", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThan(String value) {
            addCriterion("free_1 >", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThanOrEqualTo(String value) {
            addCriterion("free_1 >=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThan(String value) {
            addCriterion("free_1 <", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThanOrEqualTo(String value) {
            addCriterion("free_1 <=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Like(String value) {
            addCriterion("free_1 like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotLike(String value) {
            addCriterion("free_1 not like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1In(List<String> values) {
            addCriterion("free_1 in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotIn(List<String> values) {
            addCriterion("free_1 not in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Between(String value1, String value2) {
            addCriterion("free_1 between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotBetween(String value1, String value2) {
            addCriterion("free_1 not between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree2IsNull() {
            addCriterion("free_2 is null");
            return (Criteria) this;
        }

        public Criteria andFree2IsNotNull() {
            addCriterion("free_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFree2EqualTo(String value) {
            addCriterion("free_2 =", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotEqualTo(String value) {
            addCriterion("free_2 <>", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThan(String value) {
            addCriterion("free_2 >", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThanOrEqualTo(String value) {
            addCriterion("free_2 >=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThan(String value) {
            addCriterion("free_2 <", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThanOrEqualTo(String value) {
            addCriterion("free_2 <=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Like(String value) {
            addCriterion("free_2 like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotLike(String value) {
            addCriterion("free_2 not like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2In(List<String> values) {
            addCriterion("free_2 in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotIn(List<String> values) {
            addCriterion("free_2 not in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Between(String value1, String value2) {
            addCriterion("free_2 between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotBetween(String value1, String value2) {
            addCriterion("free_2 not between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andFree3IsNull() {
            addCriterion("free_3 is null");
            return (Criteria) this;
        }

        public Criteria andFree3IsNotNull() {
            addCriterion("free_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFree3EqualTo(String value) {
            addCriterion("free_3 =", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotEqualTo(String value) {
            addCriterion("free_3 <>", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThan(String value) {
            addCriterion("free_3 >", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThanOrEqualTo(String value) {
            addCriterion("free_3 >=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThan(String value) {
            addCriterion("free_3 <", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThanOrEqualTo(String value) {
            addCriterion("free_3 <=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Like(String value) {
            addCriterion("free_3 like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotLike(String value) {
            addCriterion("free_3 not like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3In(List<String> values) {
            addCriterion("free_3 in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotIn(List<String> values) {
            addCriterion("free_3 not in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Between(String value1, String value2) {
            addCriterion("free_3 between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotBetween(String value1, String value2) {
            addCriterion("free_3 not between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNull() {
            addCriterion("revision is null");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNotNull() {
            addCriterion("revision is not null");
            return (Criteria) this;
        }

        public Criteria andRevisionEqualTo(Integer value) {
            addCriterion("revision =", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotEqualTo(Integer value) {
            addCriterion("revision <>", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThan(Integer value) {
            addCriterion("revision >", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("revision >=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThan(Integer value) {
            addCriterion("revision <", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThanOrEqualTo(Integer value) {
            addCriterion("revision <=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionIn(List<Integer> values) {
            addCriterion("revision in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotIn(List<Integer> values) {
            addCriterion("revision not in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionBetween(Integer value1, Integer value2) {
            addCriterion("revision between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotBetween(Integer value1, Integer value2) {
            addCriterion("revision not between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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