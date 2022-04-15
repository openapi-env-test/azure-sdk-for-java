package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.OperationStatus;
import com.azure.iot.deviceupdate.models.UpdateOperationsList;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateOperationsListTests {
    @Test
    public void testDeserialize() {
        UpdateOperationsList model =
                BinaryData.fromString(
                                "{\"value\":[{\"operationId\":\"i\",\"status\":\"NotStarted\",\"updateId\":{\"provider\":\"lxgwimfnjhf\",\"name\":\"xw\",\"version\":\"szkkfoqre\"},\"resourceLocation\":\"kzikfjawneaivxwc\",\"error\":{\"code\":\"lpcirelsf\",\"message\":\"aenwabf\",\"target\":\"kl\",\"details\":[{\"code\":\"bjhwuaan\",\"message\":\"zjosp\",\"target\":\"oulpjrv\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"rvimjwosytxitcsk\",\"message\":\"k\",\"errorDetail\":\"umiekkezzi\"},\"occurredDateTime\":\"2021-08-14T06:48:15Z\"},{\"code\":\"fjhdg\",\"message\":\"gge\",\"target\":\"unygaeqid\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"t\",\"message\":\"llrxcyjmoad\",\"errorDetail\":\"varmywdmj\"},\"occurredDateTime\":\"2021-02-01T02:42:06Z\"},{\"code\":\"jhhyxxrwlycoduhp\",\"message\":\"xkgymareqnajxqu\",\"target\":\"hky\",\"details\":[null,null,null],\"innererror\":{\"code\":\"ddg\",\"message\":\"ofwq\",\"errorDetail\":\"qal\"},\"occurredDateTime\":\"2021-08-03T18:11:10Z\"},{\"code\":\"jijpxac\",\"message\":\"qudf\",\"target\":\"yxbaaabjyvayf\",\"details\":[null],\"innererror\":{\"code\":\"zrtuzq\",\"message\":\"sexnevfdnw\",\"errorDetail\":\"mewzsyyc\"},\"occurredDateTime\":\"2021-08-15T01:34:53Z\"}],\"innererror\":{\"code\":\"i\",\"message\":\"ud\",\"errorDetail\":\"rx\",\"innerError\":{\"code\":\"thzvaytdwkqbrqu\",\"message\":\"axhexiilivp\",\"errorDetail\":\"iirqtd\"}},\"occurredDateTime\":\"2021-05-20T08:32:42Z\"},\"traceId\":\"r\",\"lastActionDateTime\":\"2021-10-06T16:31:40Z\",\"createdDateTime\":\"2021-06-25T23:16:19Z\",\"etag\":\"squyfxrxxlep\"},{\"operationId\":\"ramxjezwlwnw\",\"status\":\"NotStarted\",\"updateId\":{\"provider\":\"lcvydy\",\"name\":\"atdooaojkniod\",\"version\":\"oo\"},\"resourceLocation\":\"wnujhemmsbvdk\",\"error\":{\"code\":\"odtji\",\"message\":\"fw\",\"target\":\"fltkacjv\",\"details\":[{\"code\":\"dlfoakggkfp\",\"message\":\"gaowpulpqblylsyx\",\"target\":\"jnsjervtiagxsd\",\"details\":[null],\"innererror\":{\"code\":\"mpsbzkfzbeyv\",\"message\":\"qi\",\"errorDetail\":\"invkjjxdxrbuu\"},\"occurredDateTime\":\"2021-10-11T21:42:02Z\"},{\"code\":\"ewyhml\",\"message\":\"paztzpofncck\",\"target\":\"fz\",\"details\":[null],\"innererror\":{\"code\":\"xbuy\",\"message\":\"xzfe\",\"errorDetail\":\"tpp\"},\"occurredDateTime\":\"2021-04-24T16:36:38Z\"}],\"innererror\":{\"code\":\"or\",\"message\":\"lt\",\"errorDetail\":\"mncwsobqwcsdb\",\"innerError\":{\"code\":\"dcfhucqdpf\",\"message\":\"glsbjjc\",\"errorDetail\":\"vxb\"}},\"occurredDateTime\":\"2021-05-11T02:00:05Z\"},\"traceId\":\"utncorm\",\"lastActionDateTime\":\"2021-05-08T09:13:15Z\",\"createdDateTime\":\"2021-08-01T05:22:31Z\",\"etag\":\"tvcof\"}],\"nextLink\":\"f\"}")
                        .toObject(UpdateOperationsList.class);
        Assertions.assertEquals("i", model.getValue().get(0).getOperationId());
        Assertions.assertEquals(OperationStatus.NOT_STARTED, model.getValue().get(0).getStatus());
        Assertions.assertEquals("lxgwimfnjhf", model.getValue().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("xw", model.getValue().get(0).getUpdateId().getName());
        Assertions.assertEquals("szkkfoqre", model.getValue().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("kzikfjawneaivxwc", model.getValue().get(0).getResourceLocation());
        Assertions.assertEquals("lpcirelsf", model.getValue().get(0).getError().getCode());
        Assertions.assertEquals("aenwabf", model.getValue().get(0).getError().getMessage());
        Assertions.assertEquals("kl", model.getValue().get(0).getError().getTarget());
        Assertions.assertEquals("bjhwuaan", model.getValue().get(0).getError().getDetails().get(0).getCode());
        Assertions.assertEquals("zjosp", model.getValue().get(0).getError().getDetails().get(0).getMessage());
        Assertions.assertEquals("oulpjrv", model.getValue().get(0).getError().getDetails().get(0).getTarget());
        Assertions.assertEquals(
                "rvimjwosytxitcsk", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals(
                "k", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals(
                "umiekkezzi", model.getValue().get(0).getError().getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-08-14T06:48:15Z"),
                model.getValue().get(0).getError().getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("i", model.getValue().get(0).getError().getInnererror().getCode());
        Assertions.assertEquals("ud", model.getValue().get(0).getError().getInnererror().getMessage());
        Assertions.assertEquals("rx", model.getValue().get(0).getError().getInnererror().getErrorDetail());
        Assertions.assertEquals(
                "thzvaytdwkqbrqu", model.getValue().get(0).getError().getInnererror().getInnerError().getCode());
        Assertions.assertEquals(
                "axhexiilivp", model.getValue().get(0).getError().getInnererror().getInnerError().getMessage());
        Assertions.assertEquals(
                "iirqtd", model.getValue().get(0).getError().getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-20T08:32:42Z"), model.getValue().get(0).getError().getOccurredDateTime());
        Assertions.assertEquals("r", model.getValue().get(0).getTraceId());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-10-06T16:31:40Z"), model.getValue().get(0).getLastActionDateTime());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-06-25T23:16:19Z"), model.getValue().get(0).getCreatedDateTime());
        Assertions.assertEquals("squyfxrxxlep", model.getValue().get(0).getEtag());
        Assertions.assertEquals("f", model.getNextLink());
    }
}
