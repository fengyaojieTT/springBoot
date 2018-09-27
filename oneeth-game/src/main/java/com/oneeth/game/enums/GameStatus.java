package com.oneeth.game.enums;

/**
 * 游戏状态enum
 * 
 * @author fengyaojie
 *
 */
public enum GameStatus {
	ING("ING", "进行中"), END("END", "已结束"), AWARD("AWARD", "派奖成功");

	private String value;

	private String text;

	private GameStatus(String value, String text) {
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
