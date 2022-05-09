package io.github.ambitiousliu.code.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class FastJsonHelper {

    public static String jsonObjectToString(JSONObject jsonObject) {
        return jsonObject.toString();
    }

    public static String objectToString(Object object) {
        return JSON.toJSONString(object);
    }

    public static Object stringToJsonObject(String jsonString) {
        return JSONObject.parseObject(jsonString);
    }

    public static Object objectToJsonObject(Object object) {
        return stringToJsonObject(objectToString(object));
    }

    public static <T> T stringToObject(String jsonString, TypeReference<T> typeReference) {
        return JSON.parseObject(jsonString, typeReference);
    }

    public static <T> T jsonObjectToObject(JSONObject jsonObject, TypeReference<T> typeReference) {
        return stringToObject(jsonObjectToString(jsonObject), typeReference);
    }
}
