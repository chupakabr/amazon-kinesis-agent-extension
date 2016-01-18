package com.amazon.kinesis.streaming.agent.extension;

import java.nio.ByteBuffer;

/**
 * Created by myltik on 12/01/2016.
 */
public interface IDataConverter {
    /**
     * Convert data from source to any other format
     * @param data    Source data
     * @return byte array of processed data
     * @throws DataConversionException
     */
    ByteBuffer convert(ByteBuffer data) throws DataConversionException;
}
