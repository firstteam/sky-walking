package com.a.eye.skywalking.toolkit.log.log4j.v1.x;

import org.apache.log4j.helpers.PatternParser;

/**
 * Created by wusheng on 2016/12/7.
 */

public class TraceIdPatternParser extends PatternParser {
    public TraceIdPatternParser(String pattern) {
        super(pattern);
    }

    @Override
    protected void finalizeConverter(char c) {
        if ('T' == c) {
            addConverter(new TraceIdPatternConverter());
        } else {
            super.finalizeConverter(c);
        }
    }
}
