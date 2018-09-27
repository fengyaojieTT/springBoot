package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameLogExample() {
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

        public Criteria andTermNumberEqualTo(Integer value) {
            addCriterion("term_number =", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotEqualTo(Integer value) {
            addCriterion("term_number <>", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThan(Integer value) {
            addCriterion("term_number >", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_number >=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThan(Integer value) {
            addCriterion("term_number <", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThanOrEqualTo(Integer value) {
            addCriterion("term_number <=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberIn(List<Integer> values) {
            addCriterion("term_number in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotIn(List<Integer> values) {
            addCriterion("term_number not in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberBetween(Integer value1, Integer value2) {
            addCriterion("term_number between", value1, value2, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("term_number not between", value1, value2, "termNumber");
            return (Criteria) this;
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

        public Criteria andCurrCountIsNull() {
            addCriterion("curr_count is null");
            return (Criteria) this;
        }

        public Criteria andCurrCountIsNotNull() {
            addCriterion("curr_count is not null");
            return (Criteria) this;
        }

        public Criteria andCurrCountEqualTo(Integer value) {
            addCriterion("curr_count =", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotEqualTo(Integer value) {
            addCriterion("curr_count <>", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountGreaterThan(Integer value) {
            addCriterion("curr_count >", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_count >=", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountLessThan(Integer value) {
            addCriterion("curr_count <", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountLessThanOrEqualTo(Integer value) {
            addCriterion("curr_count <=", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountIn(List<Integer> values) {
            addCriterion("curr_count in", values, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotIn(List<Integer> values) {
            addCriterion("curr_count not in", values, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountBetween(Integer value1, Integer value2) {
            addCriterion("curr_count between", value1, value2, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_count not between", value1, value2, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyIsNull() {
            addCriterion("curr_money is null");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyIsNotNull() {
            addCriterion("curr_money is not null");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyEqualTo(BigDecimal value) {
            addCriterion("curr_money =", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyNotEqualTo(BigDecimal value) {
            addCriterion("curr_money <>", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyGreaterThan(BigDecimal value) {
            addCriterion("curr_money >", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("curr_money >=", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyLessThan(BigDecimal value) {
            addCriterion("curr_money <", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("curr_money <=", value, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyIn(List<BigDecimal> values) {
            addCriterion("curr_money in", values, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyNotIn(List<BigDecimal> values) {
            addCriterion("curr_money not in", values, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("curr_money between", value1, value2, "currMoney");
            return (Criteria) this;
        }

        public Criteria andCurrMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("curr_money not between", value1, value2, "currMoney");
            return (Criteria) this;
        }

        public Criteria andGameStatusIsNull() {
            addCriterion("game_status is null");
            return (Criteria) this;
        }

        public Criteria andGameStatusIsNotNull() {
            addCriterion("game_status is not null");
            return (Criteria) this;
        }

        public Criteria andGameStatusEqualTo(String value) {
            addCriterion("game_status =", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotEqualTo(String value) {
            addCriterion("game_status <>", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusGreaterThan(String value) {
            addCriterion("game_status >", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusGreaterThanOrEqualTo(String value) {
            addCriterion("game_status >=", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusLessThan(String value) {
            addCriterion("game_status <", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusLessThanOrEqualTo(String value) {
            addCriterion("game_status <=", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusLike(String value) {
            addCriterion("game_status like", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotLike(String value) {
            addCriterion("game_status not like", value, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusIn(List<String> values) {
            addCriterion("game_status in", values, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotIn(List<String> values) {
            addCriterion("game_status not in", values, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusBetween(String value1, String value2) {
            addCriterion("game_status between", value1, value2, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andGameStatusNotBetween(String value1, String value2) {
            addCriterion("game_status not between", value1, value2, "gameStatus");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressIsNull() {
            addCriterion("luckly_address is null");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressIsNotNull() {
            addCriterion("luckly_address is not null");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressEqualTo(String value) {
            addCriterion("luckly_address =", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressNotEqualTo(String value) {
            addCriterion("luckly_address <>", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressGreaterThan(String value) {
            addCriterion("luckly_address >", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("luckly_address >=", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressLessThan(String value) {
            addCriterion("luckly_address <", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressLessThanOrEqualTo(String value) {
            addCriterion("luckly_address <=", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressLike(String value) {
            addCriterion("luckly_address like", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressNotLike(String value) {
            addCriterion("luckly_address not like", value, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressIn(List<String> values) {
            addCriterion("luckly_address in", values, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressNotIn(List<String> values) {
            addCriterion("luckly_address not in", values, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressBetween(String value1, String value2) {
            addCriterion("luckly_address between", value1, value2, "lucklyAddress");
            return (Criteria) this;
        }

        public Criteria andLucklyAddressNotBetween(String value1, String value2) {
            addCriterion("luckly_address not between", value1, value2, "lucklyAddress");
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

        public Criteria andLucklyHashIsNull() {
            addCriterion("luckly_hash is null");
            return (Criteria) this;
        }

        public Criteria andLucklyHashIsNotNull() {
            addCriterion("luckly_hash is not null");
            return (Criteria) this;
        }

        public Criteria andLucklyHashEqualTo(String value) {
            addCriterion("luckly_hash =", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashNotEqualTo(String value) {
            addCriterion("luckly_hash <>", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashGreaterThan(String value) {
            addCriterion("luckly_hash >", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashGreaterThanOrEqualTo(String value) {
            addCriterion("luckly_hash >=", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashLessThan(String value) {
            addCriterion("luckly_hash <", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashLessThanOrEqualTo(String value) {
            addCriterion("luckly_hash <=", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashLike(String value) {
            addCriterion("luckly_hash like", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashNotLike(String value) {
            addCriterion("luckly_hash not like", value, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashIn(List<String> values) {
            addCriterion("luckly_hash in", values, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashNotIn(List<String> values) {
            addCriterion("luckly_hash not in", values, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashBetween(String value1, String value2) {
            addCriterion("luckly_hash between", value1, value2, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andLucklyHashNotBetween(String value1, String value2) {
            addCriterion("luckly_hash not between", value1, value2, "lucklyHash");
            return (Criteria) this;
        }

        public Criteria andGameContractIsNull() {
            addCriterion("game_contract is null");
            return (Criteria) this;
        }

        public Criteria andGameContractIsNotNull() {
            addCriterion("game_contract is not null");
            return (Criteria) this;
        }

        public Criteria andGameContractEqualTo(String value) {
            addCriterion("game_contract =", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractNotEqualTo(String value) {
            addCriterion("game_contract <>", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractGreaterThan(String value) {
            addCriterion("game_contract >", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractGreaterThanOrEqualTo(String value) {
            addCriterion("game_contract >=", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractLessThan(String value) {
            addCriterion("game_contract <", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractLessThanOrEqualTo(String value) {
            addCriterion("game_contract <=", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractLike(String value) {
            addCriterion("game_contract like", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractNotLike(String value) {
            addCriterion("game_contract not like", value, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractIn(List<String> values) {
            addCriterion("game_contract in", values, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractNotIn(List<String> values) {
            addCriterion("game_contract not in", values, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractBetween(String value1, String value2) {
            addCriterion("game_contract between", value1, value2, "gameContract");
            return (Criteria) this;
        }

        public Criteria andGameContractNotBetween(String value1, String value2) {
            addCriterion("game_contract not between", value1, value2, "gameContract");
            return (Criteria) this;
        }

        public Criteria andAwardHashIsNull() {
            addCriterion("award_hash is null");
            return (Criteria) this;
        }

        public Criteria andAwardHashIsNotNull() {
            addCriterion("award_hash is not null");
            return (Criteria) this;
        }

        public Criteria andAwardHashEqualTo(String value) {
            addCriterion("award_hash =", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashNotEqualTo(String value) {
            addCriterion("award_hash <>", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashGreaterThan(String value) {
            addCriterion("award_hash >", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashGreaterThanOrEqualTo(String value) {
            addCriterion("award_hash >=", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashLessThan(String value) {
            addCriterion("award_hash <", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashLessThanOrEqualTo(String value) {
            addCriterion("award_hash <=", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashLike(String value) {
            addCriterion("award_hash like", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashNotLike(String value) {
            addCriterion("award_hash not like", value, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashIn(List<String> values) {
            addCriterion("award_hash in", values, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashNotIn(List<String> values) {
            addCriterion("award_hash not in", values, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashBetween(String value1, String value2) {
            addCriterion("award_hash between", value1, value2, "awardHash");
            return (Criteria) this;
        }

        public Criteria andAwardHashNotBetween(String value1, String value2) {
            addCriterion("award_hash not between", value1, value2, "awardHash");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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