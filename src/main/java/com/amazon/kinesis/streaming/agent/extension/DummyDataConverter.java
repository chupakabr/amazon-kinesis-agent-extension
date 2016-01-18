package com.amazon.kinesis.streaming.agent.extension;

import java.nio.ByteBuffer;

/**
 * Return the same data without doing any data conversion at all.
 *
 * Created by myltik on 18/01/2016.
 */
public class DummyDataConverter implements IDataConverter {
    @Override
    public ByteBuffer convert(ByteBuffer data) throws DataConversionException {
        return data;
    }
}
