package io.github.ambitiousliu.jutil.code.json;

import com.google.gson.JsonObject;
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