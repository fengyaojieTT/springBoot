package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameInitCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameInitCodeExample() {
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

        public Criteria andMyInvitCodeIsNull() {
            addCriterion("my_invit_code is null");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeIsNotNull() {
            addCriterion("my_invit_code is not null");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeEqualTo(String value) {
            addCriterion("my_invit_code =", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeNotEqualTo(String value) {
            addCriterion("my_invit_code <>", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeGreaterThan(String value) {
            addCriterion("my_invit_code >", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("my_invit_code >=", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeLessThan(String value) {
            addCriterion("my_invit_code <", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeLessThanOrEqualTo(String value) {
            addCriterion("my_invit_code <=", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeLike(String value) {
            addCriterion("my_invit_code like", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeNotLike(String value) {
            addCriterion("my_invit_code not like", value, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeIn(List<String> values) {
            addCriterion("my_invit_code in", values, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeNotIn(List<String> values) {
            addCriterion("my_invit_code not in", values, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeBetween(String value1, String value2) {
            addCriterion("my_invit_code between", value1, value2, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andMyInvitCodeNotBetween(String value1, String value2) {
            addCriterion("my_invit_code not between", value1, value2, "myInvitCode");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressIsNull() {
            addCriterion("invit_walletaddress is null");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressIsNotNull() {
            addCriterion("invit_walletaddress is not null");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressEqualTo(String value) {
            addCriterion("invit_walletaddress =", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressNotEqualTo(String value) {
            addCriterion("invit_walletaddress <>", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressGreaterThan(String value) {
            addCriterion("invit_walletaddress >", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressGreaterThanOrEqualTo(String value) {
            addCriterion("invit_walletaddress >=", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressLessThan(String value) {
            addCriterion("invit_walletaddress <", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressLessThanOrEqualTo(String value) {
            addCriterion("invit_walletaddress <=", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressLike(String value) {
            addCriterion("invit_walletaddress like", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressNotLike(String value) {
            addCriterion("invit_walletaddress not like", value, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressIn(List<String> values) {
            addCriterion("invit_walletaddress in", values, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressNotIn(List<String> values) {
            addCriterion("invit_walletaddress not in", values, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressBetween(String value1, String value2) {
            addCriterion("invit_walletaddress between", value1, value2, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andInvitWalletaddressNotBetween(String value1, String value2) {
            addCriterion("invit_walletaddress not between", value1, value2, "invitWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressIsNull() {
            addCriterion("recharge_walletaddress is null");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressIsNotNull() {
            addCriterion("recharge_walletaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressEqualTo(String value) {
            addCriterion("recharge_walletaddress =", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressNotEqualTo(String value) {
            addCriterion("recharge_walletaddress <>", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressGreaterThan(String value) {
            addCriterion("recharge_walletaddress >", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_walletaddress >=", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressLessThan(String value) {
            addCriterion("recharge_walletaddress <", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressLessThanOrEqualTo(String value) {
            addCriterion("recharge_walletaddress <=", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressLike(String value) {
            addCriterion("recharge_walletaddress like", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressNotLike(String value) {
            addCriterion("recharge_walletaddress not like", value, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressIn(List<String> values) {
            addCriterion("recharge_walletaddress in", values, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressNotIn(List<String> values) {
            addCriterion("recharge_walletaddress not in", values, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressBetween(String value1, String value2) {
            addCriterion("recharge_walletaddress between", value1, value2, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andRechargeWalletaddressNotBetween(String value1, String value2) {
            addCriterion("recharge_walletaddress not between", value1, value2, "rechargeWalletaddress");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyIsNull() {
            addCriterion("privtate_key is null");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyIsNotNull() {
            addCriterion("privtate_key is not null");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyEqualTo(String value) {
            addCriterion("privtate_key =", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyNotEqualTo(String value) {
            addCriterion("privtate_key <>", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyGreaterThan(String value) {
            addCriterion("privtate_key >", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("privtate_key >=", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyLessThan(String value) {
            addCriterion("privtate_key <", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyLessThanOrEqualTo(String value) {
            addCriterion("privtate_key <=", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyLike(String value) {
            addCriterion("privtate_key like", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyNotLike(String value) {
            addCriterion("privtate_key not like", value, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyIn(List<String> values) {
            addCriterion("privtate_key in", values, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyNotIn(List<String> values) {
            addCriterion("privtate_key not in", values, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyBetween(String value1, String value2) {
            addCriterion("privtate_key between", value1, value2, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andPrivtateKeyNotBetween(String value1, String value2) {
            addCriterion("privtate_key not between", value1, value2, "privtateKey");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNull() {
            addCriterion("is_recharge is null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNotNull() {
            addCriterion("is_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeEqualTo(String value) {
            addCriterion("is_recharge =", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotEqualTo(String value) {
            addCriterion("is_recharge <>", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThan(String value) {
            addCriterion("is_recharge >", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThanOrEqualTo(String value) {
            addCriterion("is_recharge >=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThan(String value) {
            addCriterion("is_recharge <", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThanOrEqualTo(String value) {
            addCriterion("is_recharge <=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLike(String value) {
            addCriterion("is_recharge like", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotLike(String value) {
            addCriterion("is_recharge not like", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIn(List<String> values) {
            addCriterion("is_recharge in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotIn(List<String> values) {
            addCriterion("is_recharge not in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeBetween(String value1, String value2) {
            addCriterion("is_recharge between", value1, value2, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotBetween(String value1, String value2) {
            addCriterion("is_recharge not between", value1, value2, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andLucklyCountIsNull() {
            addCriterion("luckly_count is null");
            return (Criteria) this;
        }

        public Criteria andLucklyCountIsNotNull() {
            addCriterion("luckly_count is not null");
            return (Criteria) this;
        }

        public Criteria andLucklyCountEqualTo(Integer value) {
            addCriterion("luckly_count =", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountNotEqualTo(Integer value) {
            addCriterion("luckly_count <>", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountGreaterThan(Integer value) {
            addCriterion("luckly_count >", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckly_count >=", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountLessThan(Integer value) {
            addCriterion("luckly_count <", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountLessThanOrEqualTo(Integer value) {
            addCriterion("luckly_count <=", value, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountIn(List<Integer> values) {
            addCriterion("luckly_count in", values, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountNotIn(List<Integer> values) {
            addCriterion("luckly_count not in", values, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountBetween(Integer value1, Integer value2) {
            addCriterion("luckly_count between", value1, value2, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("luckly_count not between", value1, value2, "lucklyCount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountIsNull() {
            addCriterion("luckly_amount is null");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountIsNotNull() {
            addCriterion("luckly_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountEqualTo(BigDecimal value) {
            addCriterion("luckly_amount =", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountNotEqualTo(BigDecimal value) {
            addCriterion("luckly_amount <>", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountGreaterThan(BigDecimal value) {
            addCriterion("luckly_amount >", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("luckly_amount >=", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountLessThan(BigDecimal value) {
            addCriterion("luckly_amount <", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("luckly_amount <=", value, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountIn(List<BigDecimal> values) {
            addCriterion("luckly_amount in", values, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountNotIn(List<BigDecimal> values) {
            addCriterion("luckly_amount not in", values, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("luckly_amount between", value1, value2, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andLucklyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("luckly_amount not between", value1, value2, "lucklyAmount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountIsNull() {
            addCriterion("partake_count is null");
            return (Criteria) this;
        }

        public Criteria andPartakeCountIsNotNull() {
            addCriterion("partake_count is not null");
            return (Criteria) this;
        }

        public Criteria andPartakeCountEqualTo(Integer value) {
            addCriterion("partake_count =", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountNotEqualTo(Integer value) {
            addCriterion("partake_count <>", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountGreaterThan(Integer value) {
            addCriterion("partake_count >", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("partake_count >=", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountLessThan(Integer value) {
            addCriterion("partake_count <", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountLessThanOrEqualTo(Integer value) {
            addCriterion("partake_count <=", value, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountIn(List<Integer> values) {
            addCriterion("partake_count in", values, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountNotIn(List<Integer> values) {
            addCriterion("partake_count not in", values, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountBetween(Integer value1, Integer value2) {
            addCriterion("partake_count between", value1, value2, "partakeCount");
            return (Criteria) this;
        }

        public Criteria andPartakeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("partake_count not between", value1, value2, "partakeCount");
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