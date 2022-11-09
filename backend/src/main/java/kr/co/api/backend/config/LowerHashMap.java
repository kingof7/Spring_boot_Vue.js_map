package kr.co.api.backend.config;

import org.springframework.jdbc.support.JdbcUtils;

import java.util.HashMap;

public class LowerHashMap extends HashMap {
    @Override
    public Object put(Object key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName((String) key), value);
    }
}
