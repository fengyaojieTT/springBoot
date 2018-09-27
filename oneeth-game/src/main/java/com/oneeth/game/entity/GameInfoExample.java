package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameInfoExample() {
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

        public Criteria andMinimumMoneyIsNull() {
            addCriterion("minimum_money is null");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyIsNotNull() {
            addCriterion("minimum_money is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyEqualTo(BigDecimal value) {
            addCriterion("minimum_money =", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyNotEqualTo(BigDecimal value) {
            addCriterion("minimum_money <>", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyGreaterThan(BigDecimal value) {
            addCriterion("minimum_money >", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minimum_money >=", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyLessThan(BigDecimal value) {
            addCriterion("minimum_money <", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minimum_money <=", value, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyIn(List<BigDecimal> values) {
            addCriterion("minimum_money in", values, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyNotIn(List<BigDecimal> values) {
            addCriterion("minimum_money not in", values, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minimum_money between", value1, value2, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andMinimumMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minimum_money not between", value1, value2, "minimumMoney");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeIsNull() {
            addCriterion("default_code is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeIsNotNull() {
            addCriterion("default_code is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeEqualTo(String value) {
            addCriterion("default_code =", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeNotEqualTo(String value) {
            addCriterion("default_code <>", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeGreaterThan(String value) {
            addCriterion("default_code >", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("default_code >=", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeLessThan(String value) {
            addCriterion("default_code <", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeLessThanOrEqualTo(String value) {
            addCriterion("default_code <=", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeLike(String value) {
            addCriterion("default_code like", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeNotLike(String value) {
            addCriterion("default_code not like", value, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeIn(List<String> values) {
            addCriterion("default_code in", values, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeNotIn(List<String> values) {
            addCriterion("default_code not in", values, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeBetween(String value1, String value2) {
            addCriterion("default_code between", value1, value2, "defaultCode");
            return (Criteria) this;
        }

        public Criteria andDefaultCodeNotBetween(String value1, String value2) {
            addCriterion("default_code not between", value1, value2, "defaultCode");
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

        public Criteria andOwnerPrivateKeyIsNull() {
            addCriterion("owner_private_key is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyIsNotNull() {
            addCriterion("owner_private_key is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyEqualTo(String value) {
            addCriterion("owner_private_key =", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyNotEqualTo(String value) {
            addCriterion("owner_private_key <>", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyGreaterThan(String value) {
            addCriterion("owner_private_key >", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("owner_private_key >=", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyLessThan(String value) {
            addCriterion("owner_private_key <", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("owner_private_key <=", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyLike(String value) {
            addCriterion("owner_private_key like", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyNotLike(String value) {
            addCriterion("owner_private_key not like", value, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyIn(List<String> values) {
            addCriterion("owner_private_key in", values, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyNotIn(List<String> values) {
            addCriterion("owner_private_key not in", values, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyBetween(String value1, String value2) {
            addCriterion("owner_private_key between", value1, value2, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andOwnerPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("owner_private_key not between", value1, value2, "ownerPrivateKey");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNull() {
            addCriterion("game_type is null");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNotNull() {
            addCriterion("game_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameTypeEqualTo(String value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(String value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(String value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(String value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(String value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLike(String value) {
            addCriterion("game_type like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotLike(String value) {
            addCriterion("game_type not like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<String> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<String> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(String value1, String value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(String value1, String value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andEndPointIsNull() {
            addCriterion("end_point is null");
            return (Criteria) this;
        }

        public Criteria andEndPointIsNotNull() {
            addCriterion("end_point is not null");
            return (Criteria) this;
        }

        public Criteria andEndPointEqualTo(BigDecimal value) {
            addCriterion("end_point =", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotEqualTo(BigDecimal value) {
            addCriterion("end_point <>", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointGreaterThan(BigDecimal value) {
            addCriterion("end_point >", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_point >=", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointLessThan(BigDecimal value) {
            addCriterion("end_point <", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_point <=", value, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointIn(List<BigDecimal> values) {
            addCriterion("end_point in", values, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotIn(List<BigDecimal> values) {
            addCriterion("end_point not in", values, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_point between", value1, value2, "endPoint");
            return (Criteria) this;
        }

        public Criteria andEndPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_point not between", value1, value2, "endPoint");
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