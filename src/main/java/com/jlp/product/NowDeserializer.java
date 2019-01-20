package com.jlp.product;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class NowDeserializer  extends JsonDeserializer <String> {
    @Override
    public String deserialize(JsonParser jsonParser,
                               DeserializationContext deserializationContext) throws
            IOException {

        String text = jsonParser.getText();
        //String dfs= new String(jsonParser.getBinaryValue());
        if(text.equalsIgnoreCase("{")) {
            text = "";
        }

        return text;
    }
}