package com.amazon.kinesis.streaming.agent.extension;

import org.junit.Assert;

import java.nio.*;

/**
 * Created by myltik on 18/01/2016.
 */
public class AgentConverterExampleTest {

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

    @org.junit.Test
    public void testConvertString() throws Exception {
        final IDataConverter converter = new AgentConverterExample();
        final String dataStr = "hello there!! :)";
        final byte[] dataBin = dataStr.getBytes();
        final byte[] expectedBin = ("{" + dataStr + "}").getBytes();
        Assert.assertEquals(dataBin.length+2, expectedBin.length);

        ByteBuffer data = ByteBuffer.wrap(dataBin);
        ByteBuffer res = converter.convert(data);
        byte[] resBin = new byte[res.remaining()];
        res.get(resBin);

        Assert.assertArrayEquals(expectedBin, resBin);
    }
}