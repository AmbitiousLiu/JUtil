package io.github.ambitiousliu.code.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class GsonHelper {

    private final static Gson gson = new Gson();

    public static String jsonElementToString(JsonElement jsonElement) {
        return gson.toJson(jsonElement);
    }

    public static String objectToString(Object object) {
        return gson.toJson(object);
    }

    public static JsonObject stringToJsonObject(String jsonString) {
        return JsonParser.parseString(jsonString).getAsJsonObject();
    }

    public static JsonObject objectToJsonObject(Object object) {
        return gson.toJsonTree(object).getAsJsonObject();
    }

    public static <T> T stringToObject(String jsonString, TypeToken<T> typeToken) {
        return gson.fromJson(jsonString, typeToken.getType());
    }

    public static <T> T jsonElementToObject(JsonElement jsonElement, TypeToken<T> typeToken) {
        return gson.fromJson(jsonElement, typeToken.getType());
    }
}
