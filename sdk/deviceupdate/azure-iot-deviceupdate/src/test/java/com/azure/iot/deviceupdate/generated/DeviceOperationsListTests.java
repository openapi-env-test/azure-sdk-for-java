package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceOperationsList;
import com.azure.iot.deviceupdate.models.OperationStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceOperationsListTests {
    @Test
    public void testDeserialize() {
        DeviceOperationsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"operationId\":\"norwmduvwpklvx\",\"status\":\"NotStarted\",\"error\":{\"code\":\"gdxpg\",\"message\":\"qchiszep\",\"target\":\"bjcrxgibbdaxco\",\"details\":[{\"code\":\"zauorsuk\",\"message\":\"kwbqplhlvnuu\",\"target\":\"zlrphwzs\",\"details\":[null,null,null],\"innererror\":{\"code\":\"eyuqdunvmnnrwr\",\"message\":\"ork\",\"errorDetail\":\"lywjhh\"},\"occurredDateTime\":\"2021-09-05T06:42:05Z\"},{\"code\":\"xmsivfomiloxggdu\",\"message\":\"iqndieuzaofj\",\"target\":\"vcyy\",\"details\":[null],\"innererror\":{\"code\":\"dotcubiipuip\",\"message\":\"qonmacj\",\"errorDetail\":\"nizshqvcim\"},\"occurredDateTime\":\"2020-12-31T19:03:55Z\"},{\"code\":\"gmblrri\",\"message\":\"bywdxsmicc\",\"target\":\"wfscjfn\",\"details\":[null,null,null],\"innererror\":{\"code\":\"qujizdvo\",\"message\":\"tiby\",\"errorDetail\":\"bblgyavut\"},\"occurredDateTime\":\"2021-08-30T13:25:29Z\"},{\"code\":\"oxoismsksbpim\",\"message\":\"qolj\",\"target\":\"cgxxlxs\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"vizqzdwl\",\"message\":\"lyoupfgfbkju\",\"errorDetail\":\"yhgk\"},\"occurredDateTime\":\"2021-06-14T22:14:58Z\"}],\"innererror\":{\"code\":\"g\",\"message\":\"zfttsttktlahb\",\"errorDetail\":\"ctxtgzukxi\",\"innerError\":{\"code\":\"m\",\"message\":\"gqqqxh\",\"errorDetail\":\"xrxc\"}},\"occurredDateTime\":\"2021-11-20T08:17:52Z\"},\"traceId\":\"av\",\"lastActionDateTime\":\"2021-08-17T06:46:10Z\",\"createdDateTime\":\"2021-06-09T06:42:10Z\",\"etag\":\"zfvazi\"},{\"operationId\":\"jlfrq\",\"status\":\"Succeeded\",\"error\":{\"code\":\"ajlkatnw\",\"message\":\"yiopi\",\"target\":\"qqfkuv\",\"details\":[{\"code\":\"kdmligovi\",\"message\":\"rxkpmloazuruoc\",\"target\":\"oorb\",\"details\":[null,null,null],\"innererror\":{\"code\":\"bfhjxakvvjgsl\",\"message\":\"dilmyww\",\"errorDetail\":\"gkxnyedabg\"},\"occurredDateTime\":\"2021-03-09T23:22:44Z\"},{\"code\":\"tjuewbcihx\",\"message\":\"uwhcjyxccybv\",\"target\":\"yakk\",\"details\":[null],\"innererror\":{\"code\":\"xgwjplmagstcyoh\",\"message\":\"kyrk\",\"errorDetail\":\"dg\"},\"occurredDateTime\":\"2021-08-08T01:57:36Z\"}],\"innererror\":{\"code\":\"kmnwqjnobaiyhddv\",\"message\":\"cegfnmntfp\",\"errorDetail\":\"memfnczdwvvbalxl\",\"innerError\":{\"code\":\"chp\",\"message\":\"bzevwrd\",\"errorDetail\":\"fukuvsjcswsmystu\"}},\"occurredDateTime\":\"2021-06-10T22:10:44Z\"},\"traceId\":\"fcvlerch\",\"lastActionDateTime\":\"2021-05-24T18:57:53Z\",\"createdDateTime\":\"2021-03-17T21:15:34Z\",\"etag\":\"f\"}],\"nextLink\":\"babwidfcxss\"}")
                        .toObject(DeviceOperationsList.class);
        Assertions.assertEquals("norwmduvwpklvx", model.getValue().get(0).getOperationId());
        Assertions.assertEquals(OperationStatus.NOT_STARTED, model.getValue().get(0).getStatus());
        Assertions.assertEquals("gdxpg", model.getValue().get(0).getError().getCode());
        Assertions.assertEquals("qchiszep", model.getValue().get(0).getError().getMessage());
        Assertions.assertEquals("bjcrxgibbdaxco", model.getValue().get(0).getError().getTarget());
        Assertions.assertEquals("zauorsuk", model.getValue().get(0).getError().getDetails().get(0).getCode());
        Assertions.assertEquals("kwbqplhlvnuu", model.getValue().get(0).getError().getDetails().get(0).getMessage());
        Assertions.assertEquals("zlrphwzs", model.getValue().get(0).getError().getDetails().get(0).getTarget());
        Assertions.assertEquals(
                "eyuqdunvmnnrwr", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals(
                "ork", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals(
                "lywjhh", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-09-05T06:42:05Z"),
                model.getValue().get(0).getError().getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("g", model.getValue().get(0).getError().getInnererror().getCode());
        Assertions.assertEquals("zfttsttktlahb", model.getValue().get(0).getError().getInnererror().getMessage());
        Assertions.assertEquals("ctxtgzukxi", model.getValue().get(0).getError().getInnererror().getErrorDetail());
        Assertions.assertEquals("m", model.getValue().get(0).getError().getInnererror().getInnerError().getCode());
        Assertions.assertEquals(
                "gqqqxh", model.getValue().get(0).getError().getInnererror().getInnerError().getMessage());
        Assertions.assertEquals(
                "xrxc", model.getValue().get(0).getError().getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-20T08:17:52Z"), model.getValue().get(0).getError().getOccurredDateTime());
        Assertions.assertEquals("av", model.getValue().get(0).getTraceId());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-17T06:46:10Z"), model.getValue().get(0).getLastActionDateTime());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-09T06:42:10Z"), model.getValue().get(0).getCreatedDateTime());
        Assertions.assertEquals("zfvazi", model.getValue().get(0).getEtag());
        Assertions.assertEquals("babwidfcxss", model.getNextLink());
    }
}
