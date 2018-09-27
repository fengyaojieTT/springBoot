package com.oneeth.game.common;

import com.google.common.collect.Maps;
import com.oneeth.game.contorller.OneethController;


import java.lang.reflect.Field;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统一返回客户端数据格式
 * 
 * @author Mr.Feng
 */
public class ResponseFormat {
	private static final Logger LOG = LoggerFactory.getLogger(OneethController.class);
	private static Map<Integer, String> messageMap = Maps.newHashMap();
	// 初始化状态码与文字说明
	static {
		/* 成功状态码 */
		messageMap.put(200, "成功");
		/* 服务器错误 */
		messageMap.put(00000, "系统异常");
		/* 参数错误：10001-19999 */
		messageMap.put(10001, "参数无效");
		messageMap.put(10002, "参数为空");
		messageMap.put(10003, "参数类型错误");
		messageMap.put(10004, "参数缺失");

	}

	public static <T> OneethResponse<T> retParam(Integer status, T data) {
		if(data!=null&&data.equals("")){
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) data.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible( true );
			boolean fieldHasAnno = field.isAnnotationPresent(IgnoreFixed.class);
			if (fieldHasAnno) {
				try {
					field.set(data, null);
				} catch (IllegalArgumentException e) {
					LOG.error(e.getMessage(),e);
				} catch (IllegalAccessException e) {
					LOG.error(e.getMessage(),e);
				}
			}
		}
		}
		OneethResponse<T> json = new OneethResponse<T>(status, messageMap.get(status), data);
		return json;
	}

}