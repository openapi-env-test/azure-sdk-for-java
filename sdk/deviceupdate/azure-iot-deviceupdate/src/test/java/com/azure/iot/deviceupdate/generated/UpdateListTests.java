package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.StepType;
import com.azure.iot.deviceupdate.models.UpdateList;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateListTests {
    @Test
    public void testDeserialize() {
        UpdateList model =
                BinaryData.fromString(
                                "{\"value\":[{\"updateId\":{\"provider\":\"ygmi\",\"name\":\"thnzd\",\"version\":\"dslgnayqigynduh\"},\"description\":\"hqlkthumaqo\",\"friendlyName\":\"gycdu\",\"isDeployable\":false,\"updateType\":\"gccymvaolpssl\",\"installedCriteria\":\"fmmdnbbg\",\"compatibility\":[{\"swiydmcwyhzdx\":\"sadbz\",\"nvdfznuda\":\"dvxzbncblylpst\",\"bhhxsrzdzuc\":\"rsc\"},{\"t\":\"evfiwjmygt\",\"sslswtmweriof\":\"pyqs\"},{\"wab\":\"ets\",\"hszhedplvwiwu\":\"mwmbes\",\"dnkwwtppjflcxog\":\"okonzmnsikvmkqz\",\"qqkdltfzxmhhvhgu\":\"eodkwobda\"}],\"instructions\":{\"steps\":[{\"type\":\"Inline\",\"description\":\"dxbx\",\"handler\":\"kbogqxndlkzgx\",\"files\":[\"plbpodxun\",\"bebxmubyyntwl\",\"bqtkoievseotgqr\",\"ltmuwlauwzizx\"],\"updateId\":{\"provider\":\"pgcjefuzmuvp\",\"name\":\"ttdumorppxebmnzb\",\"version\":\"bhjpglkfgohdne\"}},{\"type\":\"Reference\",\"description\":\"phsdyhto\",\"handler\":\"ikdowwquuvx\",\"files\":[\"vithh\",\"zonosgg\",\"hcohfwdsjnk\",\"ljuti\"],\"updateId\":{\"provider\":\"wacf\",\"name\":\"gdkz\",\"version\":\"ewkfvhqcrai\"}},{\"type\":\"Inline\",\"description\":\"ppfufl\",\"handler\":\"dmhdlxyjr\",\"files\":[\"afcnih\",\"wqapnedgfbcvk\",\"vq\",\"pkeqdcvdrhvoo\"],\"updateId\":{\"provider\":\"otbobzdopcj\",\"name\":\"vnhdldwmgxcxr\",\"version\":\"lpmutwuoegrpkhj\"}}]},\"referencedBy\":[{\"provider\":\"yqsluic\",\"name\":\"dggkzzlvmbmpa\",\"version\":\"modfvuefywsbpfvm\"}],\"scanResult\":\"hrfou\",\"manifestVersion\":\"ft\",\"importedDateTime\":\"2021-03-21T19:22:18Z\",\"createdDateTime\":\"2021-05-16T02:46:56Z\",\"etag\":\"pwiyzvqtm\"},{\"updateId\":{\"provider\":\"ubex\",\"name\":\"pzk\",\"version\":\"mond\"},\"description\":\"quxvypomgkop\",\"friendlyName\":\"hojvpajqgxysmocm\",\"isDeployable\":false,\"updateType\":\"vmkcx\",\"installedCriteria\":\"apvhelxprgly\",\"compatibility\":[{\"dckcbc\":\"ejrjxgciqibrho\"},{\"sdqrhzoymibmrq\":\"ibahwflus\",\"dtmhrkwofyyvoqa\":\"piexpbtgiw\",\"wo\":\"nwashrtd\",\"kcnqxwbpo\":\"ulpiuj\"}],\"instructions\":{\"steps\":[{\"type\":\"Reference\",\"description\":\"qiiobyuqer\",\"handler\":\"lp\",\"files\":[\"iuqgbdbutauv\",\"btkuwhh\"],\"updateId\":{\"provider\":\"ykojoxafnndlpic\",\"name\":\"koymkcd\",\"version\":\"h\"}},{\"type\":\"Reference\",\"description\":\"pwdreqnovvqf\",\"handler\":\"ljxywsu\",\"files\":[\"s\",\"dsytgadgvr\",\"ea\",\"neqn\"],\"updateId\":{\"provider\":\"rrwlquuijfqkace\",\"name\":\"iipfpubj\",\"version\":\"bwwift\"}}]},\"referencedBy\":[{\"provider\":\"kvpuvksgplsaknyn\",\"name\":\"synljphuopxodl\",\"version\":\"iyntorzihle\"},{\"provider\":\"sjswsrms\",\"name\":\"yzrpzbchckqqzq\",\"version\":\"ox\"},{\"provider\":\"ysuiizynkedya\",\"name\":\"rwyhqmibzyhwitsm\",\"version\":\"pyy\"},{\"provider\":\"pcdpumnz\",\"name\":\"mwzn\",\"version\":\"abikns\"}],\"scanResult\":\"gj\",\"manifestVersion\":\"xbldtlwwrlkdmtn\",\"importedDateTime\":\"2021-03-24T05:19:20Z\",\"createdDateTime\":\"2021-05-19T09:18:43Z\",\"etag\":\"otllxdyhgsyo\"}],\"nextLink\":\"gjltdtbnnhado\"}")
                        .toObject(UpdateList.class);
        Assertions.assertEquals("ygmi", model.getValue().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("thnzd", model.getValue().get(0).getUpdateId().getName());
        Assertions.assertEquals("dslgnayqigynduh", model.getValue().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("hqlkthumaqo", model.getValue().get(0).getDescription());
        Assertions.assertEquals("gycdu", model.getValue().get(0).getFriendlyName());
        Assertions.assertEquals(false, model.getValue().get(0).isDeployable());
        Assertions.assertEquals("gccymvaolpssl", model.getValue().get(0).getUpdateType());
        Assertions.assertEquals("fmmdnbbg", model.getValue().get(0).getInstalledCriteria());
        Assertions.assertEquals("sadbz", model.getValue().get(0).getCompatibility().get(0).get("swiydmcwyhzdx"));
        Assertions.assertEquals(StepType.INLINE, model.getValue().get(0).getInstructions().getSteps().get(0).getType());
        Assertions.assertEquals("dxbx", model.getValue().get(0).getInstructions().getSteps().get(0).getDescription());
        Assertions.assertEquals(
                "kbogqxndlkzgx", model.getValue().get(0).getInstructions().getSteps().get(0).getHandler());
        Assertions.assertEquals(
                "plbpodxun", model.getValue().get(0).getInstructions().getSteps().get(0).getFiles().get(0));
        Assertions.assertEquals(
                "pgcjefuzmuvp",
                model.getValue().get(0).getInstructions().getSteps().get(0).getUpdateId().getProvider());
        Assertions.assertEquals(
                "ttdumorppxebmnzb",
                model.getValue().get(0).getInstructions().getSteps().get(0).getUpdateId().getName());
        Assertions.assertEquals(
                "bhjpglkfgohdne",
                model.getValue().get(0).getInstructions().getSteps().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("yqsluic", model.getValue().get(0).getReferencedBy().get(0).getProvider());
        Assertions.assertEquals("dggkzzlvmbmpa", model.getValue().get(0).getReferencedBy().get(0).getName());
        Assertions.assertEquals("modfvuefywsbpfvm", model.getValue().get(0).getReferencedBy().get(0).getVersion());
        Assertions.assertEquals("hrfou", model.getValue().get(0).getScanResult());
        Assertions.assertEquals("ft", model.getValue().get(0).getManifestVersion());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-03-21T19:22:18Z"), model.getValue().get(0).getImportedDateTime());
        Assertions.assertEquals(
                OffsetDateTime.parse("2021-05-16T02:46:56Z"), model.getValue().get(0).getCreatedDateTime());
        Assertions.assertEquals("pwiyzvqtm", model.getValue().get(0).getEtag());
        Assertions.assertEquals("gjltdtbnnhado", model.getNextLink());
    }
}
