package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.InnerError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InnerErrorTests {
    @Test
    public void testDeserialize() {
        InnerError model =
                BinaryData.fromString(
                                "{\"code\":\"qzvszjf\",\"message\":\"vjfdx\",\"errorDetail\":\"vetvt\",\"innerError\":{\"code\":\"aqtdoqmcbx\",\"message\":\"vxysl\",\"errorDetail\":\"hsfxoblytkb\",\"innerError\":{\"code\":\"pe\",\"message\":\"wfbkrvrns\",\"errorDetail\":\"hqjohxcrsbfova\",\"innerError\":{\"code\":\"ruvw\",\"message\":\"sqfsubcgjbirxb\",\"errorDetail\":\"bsrfbj\",\"innerError\":{\"code\":\"twss\",\"message\":\"ftpvjzbexil\",\"errorDetail\":\"nfqqnvwp\",\"innerError\":{\"code\":\"taruoujmkcj\",\"message\":\"qytjrybnwjewgd\",\"errorDetail\":\"ervnaenqpehi\"}}}}}}")
                        .toObject(InnerError.class);
        Assertions.assertEquals("qzvszjf", model.getCode());
        Assertions.assertEquals("vjfdx", model.getMessage());
        Assertions.assertEquals("vetvt", model.getErrorDetail());
        Assertions.assertEquals("aqtdoqmcbx", model.getInnerError().getCode());
        Assertions.assertEquals("vxysl", model.getInnerError().getMessage());
        Assertions.assertEquals("hsfxoblytkb", model.getInnerError().getErrorDetail());
        Assertions.assertEquals("pe", model.getInnerError().getInnerError().getCode());
        Assertions.assertEquals("wfbkrvrns", model.getInnerError().getInnerError().getMessage());
        Assertions.assertEquals("hqjohxcrsbfova", model.getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals("ruvw", model.getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals("sqfsubcgjbirxb", model.getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals("bsrfbj", model.getInnerError().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                "twss", model.getInnerError().getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "ftpvjzbexil", model.getInnerError().getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "nfqqnvwp", model.getInnerError().getInnerError().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                "taruoujmkcj",
                model.getInnerError().getInnerError().getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "qytjrybnwjewgd",
                model.getInnerError().getInnerError().getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "ervnaenqpehi",
                model.getInnerError().getInnerError().getInnerError().getInnerError().getInnerError().getErrorDetail());
    }
}
