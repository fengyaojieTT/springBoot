package com.oneeth.game.common;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 统一JSON返回类
 * @author sxd
 * @since 2018/4/1
 */
@ApiModel(value="接口详情",description="接口全部返回值")
public class OneethResponse<T> implements Serializable{


    /**
	 * 
	 */
	private static final long serialVersionUID = -167640170044526764L;
	/**
     * 程序定义状态码
     */
	@ApiModelProperty(value="调用结果code",name="code")
    private int code;
    /**
     * 必要的提示信息
     */
	@ApiModelProperty(value="接口调用状态描述",name="message")
    private String message;
    
    /**
     * 业务数据
     */
	@ApiModelProperty(value="业务数据",name="message")
    private T data;
    
    public OneethResponse(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.setData(data);
	}
    
    public OneethResponse() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}