package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.OperationStatus;
import com.azure.iot.deviceupdate.models.UpdateOperation;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateOperationTests {
    @Test
    public void testDeserialize() {
        UpdateOperation model =
                BinaryData.fromString(
                                "{\"operationId\":\"vkg\",\"status\":\"Failed\",\"updateId\":{\"provider\":\"gdknnqv\",\"name\":\"aznqntoru\",\"version\":\"sgsahmkycgr\"},\"resourceLocation\":\"wjue\",\"error\":{\"code\":\"eburu\",\"message\":\"dmovsm\",\"target\":\"xwabmqoe\",\"details\":[{\"code\":\"frvtpuqu\",\"message\":\"mqlgk\",\"target\":\"tndoaongbjc\",\"details\":[{\"code\":\"jitcjedftwwaez\",\"message\":\"ojvdcpzfoqo\",\"target\":\"cybxa\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"zuf\",\"message\":\"ciqopidoa\",\"errorDetail\":\"iodhkhazxkhnz\"},\"occurredDateTime\":\"2021-10-07T00:06:45Z\"},{\"code\":\"wntoegokdwbwh\",\"message\":\"szzcmrvexztv\",\"target\":\"qgsfraoyzkoow\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"guxawqaldsyuuxi\",\"message\":\"rqf\",\"errorDetail\":\"wyznkbyku\"},\"occurredDateTime\":\"2021-09-04T21:24:09Z\"},{\"code\":\"hpagm\",\"message\":\"r\",\"target\":\"dsnfdsdoakgtdl\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"evdlh\",\"message\":\"pusdstt\",\"errorDetail\":\"ogvbbejdcngq\"},\"occurredDateTime\":\"2021-04-13T09:49:16Z\"}],\"innererror\":{\"code\":\"ufgmjzrwrdg\",\"message\":\"wae\",\"errorDetail\":\"uzkopbminrfd\",\"innerError\":{\"code\":\"yuhhziu\",\"message\":\"fozbhdmsmlmzqhof\",\"errorDetail\":\"maequiahxicslfa\"}},\"occurredDateTime\":\"2021-04-27T14:59:29Z\"},{\"code\":\"iyylhalnswhccsp\",\"message\":\"kaivwit\",\"target\":\"cywuggwol\",\"details\":[{\"code\":\"zbwemh\",\"message\":\"i\",\"target\":\"brgz\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"weyp\",\"message\":\"dxggicccnxqhuexm\",\"errorDetail\":\"tlstvlzywem\"},\"occurredDateTime\":\"2021-05-25T03:52:53Z\"},{\"code\":\"csdtclusiypbs\",\"message\":\"gytguslfead\",\"target\":\"gq\",\"details\":[null,null,null],\"innererror\":{\"code\":\"ejhzisxg\",\"message\":\"elolppvksrpqvuj\",\"errorDetail\":\"aehtwd\"},\"occurredDateTime\":\"2021-05-05T12:21:29Z\"},{\"code\":\"swibyr\",\"message\":\"dl\",\"target\":\"shfwpracstwity\",\"details\":[null,null,null],\"innererror\":{\"code\":\"xccedcpnmdyodn\",\"message\":\"xltjcvnhltiu\",\"errorDetail\":\"xnavvwxq\"},\"occurredDateTime\":\"2021-05-18T05:36:02Z\"},{\"code\":\"unyowxwl\",\"message\":\"djrkvfgbvfvpd\",\"target\":\"daciz\",\"details\":[null],\"innererror\":{\"code\":\"hkr\",\"message\":\"bdeibqipqk\",\"errorDetail\":\"vxndz\"},\"occurredDateTime\":\"2021-03-09T14:00:26Z\"}],\"innererror\":{\"code\":\"fajpjorwk\",\"message\":\"yhgbijtjivfx\",\"errorDetail\":\"jabibsystawf\",\"innerError\":{\"code\":\"jpvkvpbjxbkzbzkd\",\"message\":\"cjabudurgkakmo\",\"errorDetail\":\"hjjklff\"}},\"occurredDateTime\":\"2021-11-22T20:11:40Z\"}],\"innererror\":{\"code\":\"qlgzrfzeeye\",\"message\":\"zi\",\"errorDetail\":\"yuhqlbjbsybbqwrv\",\"innerError\":{\"code\":\"dgmfpgvmpipasl\",\"message\":\"aqfxss\",\"errorDetail\":\"u\",\"innerError\":{\"code\":\"bdsrez\",\"message\":\"rhneuyowq\",\"errorDetail\":\"wyt\",\"innerError\":{\"code\":\"ib\",\"message\":\"cgpik\",\"errorDetail\":\"imejzanl\"}}}},\"occurredDateTime\":\"2021-05-28T04:48:51Z\"},\"traceId\":\"vrmbzono\",\"lastActionDateTime\":\"2020-12-23T05:41:54Z\",\"createdDateTime\":\"2021-09-27T16:09:30Z\",\"etag\":\"jq\"}")
                        .toObject(UpdateOperation.class);
        Assertions.assertEquals("vkg", model.getOperationId());
        Assertions.assertEquals(OperationStatus.FAILED, model.getStatus());
        Assertions.assertEquals("gdknnqv", model.getUpdateId().getProvider());
        Assertions.assertEquals("aznqntoru", model.getUpdateId().getName());
        Assertions.assertEquals("sgsahmkycgr", model.getUpdateId().getVersion());
        Assertions.assertEquals("wjue", model.getResourceLocation());
        Assertions.assertEquals("eburu", model.getError().getCode());
        Assertions.assertEquals("dmovsm", model.getError().getMessage());
        Assertions.assertEquals("xwabmqoe", model.getError().getTarget());
        Assertions.assertEquals("frvtpuqu", model.getError().getDetails().get(0).getCode());
        Assertions.assertEquals("mqlgk", model.getError().getDetails().get(0).getMessage());
        Assertions.assertEquals("tndoaongbjc", model.getError().getDetails().get(0).getTarget());
        Assertions.assertEquals("jitcjedftwwaez", model.getError().getDetails().get(0).getDetails().get(0).getCode());
        Assertions.assertEquals("ojvdcpzfoqo", model.getError().getDetails().get(0).getDetails().get(0).getMessage());
        Assertions.assertEquals("cybxa", model.getError().getDetails().get(0).getDetails().get(0).getTarget());
        Assertions.assertEquals(
                "zuf", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals(
                "ciqopidoa", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals(
                "iodhkhazxkhnz",
                model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-07T00:06:45Z"),
                model.getError().getDetails().get(0).getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("ufgmjzrwrdg", model.getError().getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals("wae", model.getError().getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals("uzkopbminrfd", model.getError().getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                "yuhhziu", model.getError().getDetails().get(0).getInnererror().getInnerError().getCode());
        Assertions.assertEquals(
                "fozbhdmsmlmzqhof", model.getError().getDetails().get(0).getInnererror().getInnerError().getMessage());
        Assertions.assertEquals(
                "maequiahxicslfa",
                model.getError().getDetails().get(0).getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-04-27T14:59:29Z"),
                model.getError().getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("qlgzrfzeeye", model.getError().getInnererror().getCode());
        Assertions.assertEquals("zi", model.getError().getInnererror().getMessage());
        Assertions.assertEquals("yuhqlbjbsybbqwrv", model.getError().getInnererror().getErrorDetail());
        Assertions.assertEquals("dgmfpgvmpipasl", model.getError().getInnererror().getInnerError().getCode());
        Assertions.assertEquals("aqfxss", model.getError().getInnererror().getInnerError().getMessage());
        Assertions.assertEquals("u", model.getError().getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals("bdsrez", model.getError().getInnererror().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "rhneuyowq", model.getError().getInnererror().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "wyt", model.getError().getInnererror().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                "ib", model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "cgpik", model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "imejzanl",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-28T04:48:51Z"), model.getError().getOccurredDateTime());
        Assertions.assertEquals("vrmbzono", model.getTraceId());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T05:41:54Z"), model.getLastActionDateTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T16:09:30Z"), model.getCreatedDateTime());
        Assertions.assertEquals("jq", model.getEtag());
    }
}
