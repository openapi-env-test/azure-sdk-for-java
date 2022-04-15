package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceOperation;
import com.azure.iot.deviceupdate.models.OperationStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceOperationTests {
    @Test
    public void testDeserialize() {
        DeviceOperation model =
                BinaryData.fromString(
                                "{\"operationId\":\"ql\",\"status\":\"Succeeded\",\"error\":{\"code\":\"gtczheydb\",\"message\":\"dshmkxmaehvbbx\",\"target\":\"iplt\",\"details\":[{\"code\":\"tbaxk\",\"message\":\"xywr\",\"target\":\"pyklyhpluodpvru\",\"details\":[{\"code\":\"gzibthostgktstv\",\"message\":\"xeclzedqbcvhzlhp\",\"target\":\"dqkdlwwqfbu\",\"details\":[null,null],\"innererror\":{\"code\":\"trqjfsmlmbtx\",\"message\":\"gfwsrtaw\",\"errorDetail\":\"ezbrhubskh\"},\"occurredDateTime\":\"2021-09-21T02:12:50Z\"}],\"innererror\":{\"code\":\"ookk\",\"message\":\"qjbvleorfmlu\",\"errorDetail\":\"tqzfavyv\",\"innerError\":{\"code\":\"qybaryeua\",\"message\":\"kq\",\"errorDetail\":\"qgzsles\"}},\"occurredDateTime\":\"2021-02-02T16:40:39Z\"}],\"innererror\":{\"code\":\"rnntiewdjcv\",\"message\":\"uwrbehwagoh\",\"errorDetail\":\"f\",\"innerError\":{\"code\":\"mrqemvvhmx\",\"message\":\"rjfut\",\"errorDetail\":\"oe\",\"innerError\":{\"code\":\"vewzcj\",\"message\":\"m\",\"errorDetail\":\"pmguaadraufac\",\"innerError\":{\"code\":\"ahzovajjziuxxp\",\"message\":\"neekulfg\",\"errorDetail\":\"qubkw\"}}}},\"occurredDateTime\":\"2021-11-08T16:30:24Z\"},\"traceId\":\"d\",\"lastActionDateTime\":\"2021-04-26T16:34:12Z\",\"createdDateTime\":\"2021-03-05T15:56:58Z\",\"etag\":\"jbazpjuohminy\"}")
                        .toObject(DeviceOperation.class);
        Assertions.assertEquals("ql", model.getOperationId());
        Assertions.assertEquals(OperationStatus.SUCCEEDED, model.getStatus());
        Assertions.assertEquals("gtczheydb", model.getError().getCode());
        Assertions.assertEquals("dshmkxmaehvbbx", model.getError().getMessage());
        Assertions.assertEquals("iplt", model.getError().getTarget());
        Assertions.assertEquals("tbaxk", model.getError().getDetails().get(0).getCode());
        Assertions.assertEquals("xywr", model.getError().getDetails().get(0).getMessage());
        Assertions.assertEquals("pyklyhpluodpvru", model.getError().getDetails().get(0).getTarget());
        Assertions.assertEquals("gzibthostgktstv", model.getError().getDetails().get(0).getDetails().get(0).getCode());
        Assertions.assertEquals(
                "xeclzedqbcvhzlhp", model.getError().getDetails().get(0).getDetails().get(0).getMessage());
        Assertions.assertEquals("dqkdlwwqfbu", model.getError().getDetails().get(0).getDetails().get(0).getTarget());
        Assertions.assertEquals(
                "trqjfsmlmbtx", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals(
                "gfwsrtaw", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals(
                "ezbrhubskh",
                model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-21T02:12:50Z"),
                model.getError().getDetails().get(0).getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("ookk", model.getError().getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals("qjbvleorfmlu", model.getError().getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals("tqzfavyv", model.getError().getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                "qybaryeua", model.getError().getDetails().get(0).getInnererror().getInnerError().getCode());
        Assertions.assertEquals(
                "kq", model.getError().getDetails().get(0).getInnererror().getInnerError().getMessage());
        Assertions.assertEquals(
                "qgzsles", model.getError().getDetails().get(0).getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-02-02T16:40:39Z"),
                model.getError().getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("rnntiewdjcv", model.getError().getInnererror().getCode());
        Assertions.assertEquals("uwrbehwagoh", model.getError().getInnererror().getMessage());
        Assertions.assertEquals("f", model.getError().getInnererror().getErrorDetail());
        Assertions.assertEquals("mrqemvvhmx", model.getError().getInnererror().getInnerError().getCode());
        Assertions.assertEquals("rjfut", model.getError().getInnererror().getInnerError().getMessage());
        Assertions.assertEquals("oe", model.getError().getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals("vewzcj", model.getError().getInnererror().getInnerError().getInnerError().getCode());
        Assertions.assertEquals("m", model.getError().getInnererror().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "pmguaadraufac", model.getError().getInnererror().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                "ahzovajjziuxxp",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "neekulfg",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "qubkw",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T16:30:24Z"), model.getError().getOccurredDateTime());
        Assertions.assertEquals("d", model.getTraceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T16:34:12Z"), model.getLastActionDateTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-05T15:56:58Z"), model.getCreatedDateTime());
        Assertions.assertEquals("jbazpjuohminy", model.getEtag());
    }
}
