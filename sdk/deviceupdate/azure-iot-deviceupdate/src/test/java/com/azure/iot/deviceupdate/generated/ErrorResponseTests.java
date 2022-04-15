package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.ErrorResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ErrorResponseTests {
    @Test
    public void testDeserialize() {
        ErrorResponse model =
                BinaryData.fromString(
                                "{\"error\":{\"code\":\"mutduqktaps\",\"message\":\"wgcu\",\"target\":\"tumkdosvqwhbm\",\"details\":[{\"code\":\"bjf\",\"message\":\"dgmb\",\"target\":\"ex\",\"details\":[{\"code\":\"htqqrolfp\",\"message\":\"psalgbqux\",\"target\":\"jyj\",\"details\":[null,null,null],\"innererror\":{\"code\":\"o\",\"message\":\"hr\",\"errorDetail\":\"ilnerkujysvlejuv\"},\"occurredDateTime\":\"2021-11-11T16:20:30Z\"},{\"code\":\"rlyxwjkcprbnw\",\"message\":\"xgjvtbv\",\"target\":\"sszdnru\",\"details\":[null,null,null],\"innererror\":{\"code\":\"hmuouqfprwzwbn\",\"message\":\"itnwuizgazxufi\",\"errorDetail\":\"ckyfih\"},\"occurredDateTime\":\"2021-07-06T18:08:32Z\"},{\"code\":\"fvzwdzuhty\",\"message\":\"wisdkft\",\"target\":\"xmnteiwaop\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"jcmmxdcufufsrp\",\"message\":\"zidnsezcxtbzsgfy\",\"errorDetail\":\"sne\"},\"occurredDateTime\":\"2021-09-22T20:17:09Z\"},{\"code\":\"z\",\"message\":\"eiachboosflnr\",\"target\":\"fqpte\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"vypyqrimzinpv\",\"message\":\"jdkirsoodqx\",\"errorDetail\":\"rmnohj\"},\"occurredDateTime\":\"2020-12-26T05:08:12Z\"}],\"innererror\":{\"code\":\"dsoifiyipj\",\"message\":\"qwpgrjbzn\",\"errorDetail\":\"cjxvsnbyxqab\",\"innerError\":{\"code\":\"ocpcy\",\"message\":\"urzafb\",\"errorDetail\":\"j\"}},\"occurredDateTime\":\"2021-03-25T07:01:11Z\"},{\"code\":\"oq\",\"message\":\"jmkljavbqidtqajz\",\"target\":\"l\",\"details\":[{\"code\":\"dj\",\"message\":\"rlkhbzhfepgzgq\",\"target\":\"zloc\",\"details\":[null],\"innererror\":{\"code\":\"aierhhb\",\"message\":\"glu\",\"errorDetail\":\"a\"},\"occurredDateTime\":\"2021-08-25T02:16:19Z\"}],\"innererror\":{\"code\":\"dxob\",\"message\":\"dxkqpx\",\"errorDetail\":\"ajionpimexgstxg\",\"innerError\":{\"code\":\"odgmaajrmvdjwz\",\"message\":\"ovmclwhijcoejct\",\"errorDetail\":\"aqsqsycbkbfk\"}},\"occurredDateTime\":\"2021-04-20T10:26:18Z\"},{\"code\":\"kexxppof\",\"message\":\"xaxcfjpgddtocjjx\",\"target\":\"pmouexhdz\",\"details\":[{\"code\":\"qeojnxqbzvddntw\",\"message\":\"deicbtwnpzao\",\"target\":\"uhrhcffcyddgl\",\"details\":[null],\"innererror\":{\"code\":\"jqkwpyeicx\",\"message\":\"ciwqvhk\",\"errorDetail\":\"xuigdtopbobj\"},\"occurredDateTime\":\"2021-02-17T14:37:23Z\"}],\"innererror\":{\"code\":\"w\",\"message\":\"m\",\"errorDetail\":\"hrzayvvtpgvdf\",\"innerError\":{\"code\":\"otkftutqxlngx\",\"message\":\"fgugnxkrxdqmid\",\"errorDetail\":\"hzrvqd\"}},\"occurredDateTime\":\"2021-02-12T08:58:31Z\"},{\"code\":\"jybige\",\"message\":\"oqfbowskanyk\",\"target\":\"lcuiywgqywgndr\",\"details\":[{\"code\":\"hzgpphrcgyncocpe\",\"message\":\"fvm\",\"target\":\"oo\",\"details\":[null,null,null,null],\"innererror\":{\"code\":\"zevgb\",\"message\":\"jqabcypmivkwlzuv\",\"errorDetail\":\"fwnfnb\"},\"occurredDateTime\":\"2021-02-24T21:18:31Z\"},{\"code\":\"onlebxetqgtzxdpn\",\"message\":\"bqqwxrj\",\"target\":\"al\",\"details\":[null,null,null],\"innererror\":{\"code\":\"ubisnjampmng\",\"message\":\"scxaq\",\"errorDetail\":\"ochcbonqvpkvl\"},\"occurredDateTime\":\"2021-10-21T12:09:05Z\"},{\"code\":\"ea\",\"message\":\"eipheoflokeyy\",\"target\":\"nj\",\"details\":[null,null,null],\"innererror\":{\"code\":\"tgrhpdjpjumas\",\"message\":\"zj\",\"errorDetail\":\"yegu\"},\"occurredDateTime\":\"2021-08-02T07:39:45Z\"}],\"innererror\":{\"code\":\"xhejjzzvdud\",\"message\":\"dslfhotwmcy\",\"errorDetail\":\"wlbjnpgacftade\",\"innerError\":{\"code\":\"nltyfsoppusuesnz\",\"message\":\"ej\",\"errorDetail\":\"vorxzdmohct\"}},\"occurredDateTime\":\"2021-09-18T10:27:07Z\"}],\"innererror\":{\"code\":\"wxdndnvowgujjug\",\"message\":\"kcglhslaz\",\"errorDetail\":\"yggdtjixh\",\"innerError\":{\"code\":\"uofqwe\",\"message\":\"hmenevfyexfwhybc\",\"errorDetail\":\"vyvdcs\",\"innerError\":{\"code\":\"ynnaam\",\"message\":\"ctehfiqscjey\",\"errorDetail\":\"hezrkgq\",\"innerError\":{\"code\":\"jrefovgmkqsle\",\"message\":\"vxyqjpkcattpngjc\",\"errorDetail\":\"czsqpjhvm\"}}}},\"occurredDateTime\":\"2021-11-26T10:49:59Z\"}}")
                        .toObject(ErrorResponse.class);
        Assertions.assertEquals("mutduqktaps", model.getError().getCode());
        Assertions.assertEquals("wgcu", model.getError().getMessage());
        Assertions.assertEquals("tumkdosvqwhbm", model.getError().getTarget());
        Assertions.assertEquals("bjf", model.getError().getDetails().get(0).getCode());
        Assertions.assertEquals("dgmb", model.getError().getDetails().get(0).getMessage());
        Assertions.assertEquals("ex", model.getError().getDetails().get(0).getTarget());
        Assertions.assertEquals("htqqrolfp", model.getError().getDetails().get(0).getDetails().get(0).getCode());
        Assertions.assertEquals("psalgbqux", model.getError().getDetails().get(0).getDetails().get(0).getMessage());
        Assertions.assertEquals("jyj", model.getError().getDetails().get(0).getDetails().get(0).getTarget());
        Assertions.assertEquals(
                "o", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals(
                "hr", model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals(
                "ilnerkujysvlejuv",
                model.getError().getDetails().get(0).getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-11-11T16:20:30Z"),
                model.getError().getDetails().get(0).getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("dsoifiyipj", model.getError().getDetails().get(0).getInnererror().getCode());
        Assertions.assertEquals("qwpgrjbzn", model.getError().getDetails().get(0).getInnererror().getMessage());
        Assertions.assertEquals("cjxvsnbyxqab", model.getError().getDetails().get(0).getInnererror().getErrorDetail());
        Assertions.assertEquals(
                "ocpcy", model.getError().getDetails().get(0).getInnererror().getInnerError().getCode());
        Assertions.assertEquals(
                "urzafb", model.getError().getDetails().get(0).getInnererror().getInnerError().getMessage());
        Assertions.assertEquals(
                "j", model.getError().getDetails().get(0).getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-25T07:01:11Z"),
                model.getError().getDetails().get(0).getOccurredDateTime());
        Assertions.assertEquals("wxdndnvowgujjug", model.getError().getInnererror().getCode());
        Assertions.assertEquals("kcglhslaz", model.getError().getInnererror().getMessage());
        Assertions.assertEquals("yggdtjixh", model.getError().getInnererror().getErrorDetail());
        Assertions.assertEquals("uofqwe", model.getError().getInnererror().getInnerError().getCode());
        Assertions.assertEquals("hmenevfyexfwhybc", model.getError().getInnererror().getInnerError().getMessage());
        Assertions.assertEquals("vyvdcs", model.getError().getInnererror().getInnerError().getErrorDetail());
        Assertions.assertEquals("ynnaam", model.getError().getInnererror().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "ctehfiqscjey", model.getError().getInnererror().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "hezrkgq", model.getError().getInnererror().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(
                "jrefovgmkqsle",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getCode());
        Assertions.assertEquals(
                "vxyqjpkcattpngjc",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getMessage());
        Assertions.assertEquals(
                "czsqpjhvm",
                model.getError().getInnererror().getInnerError().getInnerError().getInnerError().getErrorDetail());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-26T10:49:59Z"), model.getError().getOccurredDateTime());
    }
}
