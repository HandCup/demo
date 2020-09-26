package com.feicaodemo.enumDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Caofei
 * @className SysTypeEnum
 * @description TODO
 * @date {2020/9/3} 20:30
 */
public enum SysTypeEnum {
    SYS_HOME_TYPE_CATEGORY(1, "0","首页分类"),
    SYS_HOME_TYPE_ADVERTISING(2, "1","首页广告");
    private Integer code;
    private String value;
    private String message;
    SysTypeEnum(Integer code, String value,String message) {
        this.code = code;
        this.value = value;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getValue() {
        return value;
    }
    public String getMessage(){return  message;}
    public void setValue(String value){
        this.value = value;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setCode(Integer code){
        this.code = code;
    }

    public static SysTypeEnum getEnumByKey(Integer value) {
        if (null == value) {
            return null;
        }
        for (SysTypeEnum temp : SysTypeEnum.values()) {
            if (temp.getCode().equals(value)) {
                return temp;
            }
        }
        return null;
    }

    public static Map<String,List<String>>getEnum(){
        Map item = new HashMap<String,List<String>>();
        for(SysTypeEnum sysTypeEnum : SysTypeEnum.values()){
            List<String> innerList = new ArrayList<>();
            innerList.add(sysTypeEnum.value);
            innerList.add(sysTypeEnum.message);
            item.put(sysTypeEnum.code,innerList);
        }
        return item;
    }

}
