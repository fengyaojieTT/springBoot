package com.oneeth.game.enums;

/**
 * 游戏状态enum
 * 
 * @author fengyaojie
 *
 */
public enum GameType {
	WINTREASURE("winTreasure", "夺宝"), DOUBLEFLIGHT("doubleFlight", "速配"), DREAMCOMETRUE("dreamComeTrue", "美梦成真");

	private String value;

	private String text;

	private GameType(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
