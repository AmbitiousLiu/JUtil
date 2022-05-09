package io.github.ambitiousliu.code.json;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

public class GsonHelperTest {

    @Test
    public void jsonElementToString() {
        GsonHelper.jsonElementToString(new JsonObject());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "abc");
        GsonHelper.stringToJsonObject("{'name': 'abc'}");
    }
}