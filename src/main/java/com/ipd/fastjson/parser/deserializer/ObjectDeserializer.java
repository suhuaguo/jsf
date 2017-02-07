package com.ipd.fastjson.parser.deserializer;

import java.lang.reflect.Type;

import com.ipd.fastjson.parser.DefaultJSONParser;
import com.ipd.fastjson.parser.DefaultJSONParser;

public interface ObjectDeserializer {
    <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName);
    
    int getFastMatchToken();
}
