package com.java.eight.in.action;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by abelmeos on 2016/10/20.
 */
@FunctionalInterface
public interface BuffereedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
