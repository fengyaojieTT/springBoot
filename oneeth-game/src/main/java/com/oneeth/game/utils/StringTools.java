package com.oneeth.game.utils;

import java.util.Random;

/**
 * 字符串工具
 * Created by henrybit on 2017/7/19.
 * @version 1.0
 */
public class StringTools {

    static String[] wordArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    static String[] base58 = {"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","J","K","L","M","N","P", "Q","R", "S",
            "T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    static String[] invitationArray = {"0","1","2","3","4","5","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    static String codeTemplate = "AaBb0CcDd1EeFfG2gHhI3JjK4kLM5mN6nP7pQq8RrTt9UVWXYyZ";
    /**
     * Created by LHQ on 2018/3/2 0002.
     * @version 1.0
     * @Description 将十进制int转换为32进制的字符
     */
    public static String toInvitation(int codeInt) {
        int int1 = codeInt % 32;
        int int2 = (codeInt/32) % 32;
        int int3 = (codeInt/(32*32)) % 32;
        int int4 = (codeInt/(32*32*32)) % 32;

        String char1 = invitationArray[int1];
        String char2 = invitationArray[int2];
        String char3 = invitationArray[int3];
        String char4 = invitationArray[int4];

        String invitation = "" + char4 + char3 + char2 + char1;

        return invitation;
    }

    /**
     * Created by LHQ on 2018/6/27
     * @version 1.2
     * @Description 将十进制long转换为32进制的字符
     */
    public static String nickName(long code) {
        int codeInt = (int)code;
        int int1 = codeInt % 32;
        int int2 = (codeInt/32) % 32;
        int int3 = (codeInt/(32*32)) % 32;
        int int4 = (codeInt/(32*32*32)) % 32;
        int int5 = (codeInt/(32*32*32*32)) % 32;

        String char1 = invitationArray[int1];
        String char2 = invitationArray[int2];
        String char3 = invitationArray[int3];
        String char4 = invitationArray[int4];
        String char5 = invitationArray[int5];

        String nickName = "" + char5 + char4 + char3 + char2 + char1;

        return nickName;
    }
    
    /**
     * Created by WSJ on 2018/6/1
     * @version 1.2
     * @Description 将十进制long转换为58进制的字符 base58
     */
    public static String toBase58InvitationCode(long code) {
        int codeInt = (int)code;
        int int1 = codeInt % 58;
        int int2 = (codeInt/58) % 58;
        int int3 = (codeInt/(58*58)) % 58;
        int int4 = (codeInt/(58*58*58)) % 58;
        int int5 = (codeInt/(58*58*58*58)) % 58;
        int int6 = (codeInt/(58*58*58*58*58)) % 58;
        int int7 = (codeInt/(58*58*58*58*58*58)) % 58;
        int int8 = (codeInt/(58*58*58*58*58*58*58)) % 58;

        String char1 = base58[int1];
        String char2 = base58[int2];
        String char3 = base58[int3];
        String char4 = base58[int4];
        String char5 = base58[int5];
        String char6 = base58[int6];
        String char7 = base58[int7];
        String char8 = base58[int8];

        String toBase58 = "" + char4 + char3 + char2 + char1 + char5 + char6 + char7 + char8;

        return toBase58;
    }


    /**
     * Created by WSJ on 2018/6/1
     * @version 1.2
     * @Description 将十进制long转换为58进制的字符 base58
     */
    public static String toBase58(long code) {
        int codeInt = (int)code;
        int int1 = codeInt % 58;
        int int2 = (codeInt/58) % 58;
        int int3 = (codeInt/(58*58)) % 58;
        int int4 = (codeInt/(58*58*58)) % 58;

        String char1 = base58[int1];
        String char2 = base58[int2];
        String char3 = base58[int3];
        String char4 = base58[int4];

        String toBase58 = "" + char4 + char3 + char2 + char1;

        return toBase58;
    }
    /**
     * Created by WSJ on 2018/6/1
     * @version 1.2
     * @Description 将十进制long转换为58进制的字符 base58
     */
    public static String toBase58Five(long code) {
    	int codeInt = (int)code;
    	int int1 = codeInt % 58;
    	int int2 = (codeInt/58) % 58;
    	int int3 = (codeInt/(58*58)) % 58;
    	int int4 = (codeInt/(58*58*58)) % 58;
    	int int5 = (codeInt/(58*58*58*58)) % 58;
    	
    	String char1 = base58[int1];
    	String char2 = base58[int2];
    	String char3 = base58[int3];
    	String char4 = base58[int4];
    	String char5 = base58[int5];
    	
    	String toBase58 = ""+ char5+ char4 + char3 + char2 + char1;
    	
    	return toBase58;
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return boolean
     */
    public static boolean isEmpty(String str) {
        if (str == null)
            return true;
        if ("".equals(str))
            return true;
        return false;
    }

    /**
     * 判断字符串是否为非空
     * @param str
     * @return boolean
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }


    /**
     * 随机一个长度的字符串
     * @param length
     * @return
     */
    public static String randomString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<length; i++) {
            stringBuilder.append(random(9));
        }
        return stringBuilder.toString();
    }

    public static int random(int end) {
        Random random = new Random();
        return random.nextInt(end);
    }

    /**
     *@Author TSZ
     *@Date 2018/3/8
     *@Description 生成数字字母字符串
     */
    public static String randomComplex(int length){
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();
        for(int i=0; i<length; i++){
            stringBuilder.append(codeTemplate.charAt(r.nextInt(codeTemplate.length())));
        }
        return stringBuilder.toString();
    }




}
