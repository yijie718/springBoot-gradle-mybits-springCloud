package com.example.web.responsebean;

import com.google.common.collect.Maps;
import lombok.*;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {

    /**
     * 返回code
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Map<String, Object> data;

    public void setCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setData(Map<String, Object> map, String key, Object value) {
        if (null == this.data) {
            data = Maps.newHashMap();
        }
        data.putAll(map);
        if (StringUtils.isNotEmpty(key)) {
            data.put(key, value);
        }
    }
}
