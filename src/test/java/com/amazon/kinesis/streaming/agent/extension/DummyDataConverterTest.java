package com.amazon.kinesis.streaming.agent.extension;

import org.junit.Assert;

import java.nio.ByteBuffer;

/**
 * Created by myltik on 18/01/2016.
 */
public class DummyDataConverterTest {

    @org.junit.Test
    public void testConvertDummy() throws Exception {
        final IDataConverter converter = new DummyDataConverter();
        final byte[] dataBin = "hello there!! :)".getBytes();

        ByteBuffer data = ByteBuffer.wrap(dataBin);
        ByteBuffer res = converter.convert(data);
        byte[] resBin = new byte[data.remaining()];
        res.get(resBin);

        Assert.assertArrayEquals(dataBin, resBin);
    }
}