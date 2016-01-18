package com.amazon.kinesis.streaming.agent.extension;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * This example converter just wraps resulting data into brackets.
 *
 * For example, input line "hello there" will after conversion will look like "{hello there}"
 *
 * Created by myltik on 12/01/2016.
 */
public class AgentConverterExample implements IDataConverter {

    @Override
    public ByteBuffer convert(ByteBuffer data) throws DataConversionException {
        final byte[] dataBin = new byte[data.remaining()];
        data.get(dataBin);

        StringBuilder sb = new StringBuilder(2 + dataBin.length);
        sb.append('{')
          .append(new String(dataBin, StandardCharsets.UTF_8))
          .append('}');

        return ByteBuffer.wrap(sb.toString().getBytes());
    }
}
