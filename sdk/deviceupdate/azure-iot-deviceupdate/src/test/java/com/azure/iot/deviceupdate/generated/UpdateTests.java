package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.StepType;
import com.azure.iot.deviceupdate.models.Update;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UpdateTests {
    @Test
    public void testDeserialize() {
        Update model =
                BinaryData.fromString(
                                "{\"updateId\":{\"provider\":\"gjofjd\",\"name\":\"eqsrdeupewnwreit\",\"version\":\"zyf\"},\"description\":\"sarhmofc\",\"friendlyName\":\"smy\",\"isDeployable\":true,\"updateType\":\"tmlxhekuksjtx\",\"installedCriteria\":\"cdm\",\"compatibility\":[{\"cryuan\":\"w\",\"xzdxtayrlhmwh\":\"pmrqobm\",\"u\":\"knryrtihfxtij\",\"pzvgnwzsymglzufc\":\"zk\"},{\"dbihanufhfcbj\":\"s\",\"git\":\"xqhabi\"},{\"ikxwc\":\"byscnp\",\"x\":\"hiv\",\"qniwbybrkxvdumj\":\"rtfw\",\"ukxgaud\":\"cs\"},{\"s\":\"cnyejhkryhtnapcz\"}],\"instructions\":{\"steps\":[{\"type\":\"Inline\",\"description\":\"emkkvnipjox\",\"handler\":\"nchgej\",\"files\":[\"mailzydehojw\",\"ahuxinpm\",\"njaqwixjspro\",\"vcputegj\"],\"updateId\":{\"provider\":\"mfdatscmdvpj\",\"name\":\"u\",\"version\":\"suuv\"}},{\"type\":\"Reference\",\"description\":\"zkrwfn\",\"handler\":\"odjpslwejd\",\"files\":[\"yoqpsoaccta\"],\"updateId\":{\"provider\":\"kljla\",\"name\":\"bcryffdfd\",\"version\":\"sy\"}}]},\"referencedBy\":[{\"provider\":\"paojakhmsbzjh\",\"name\":\"rzevdphlxaol\",\"version\":\"hqtrgqjbpf\"},{\"provider\":\"fsinzgvfcjrwzoxx\",\"name\":\"tfell\",\"version\":\"wfzitonpeqfpjk\"},{\"provider\":\"lxofpdvhpfxxypin\",\"name\":\"nmayhuybb\",\"version\":\"podepoo\"}],\"scanResult\":\"nuvamiheogna\",\"manifestVersion\":\"xzxtheo\",\"importedDateTime\":\"2021-01-27T12:33:39Z\",\"createdDateTime\":\"2021-01-06T23:59:36Z\",\"etag\":\"vyevcciqi\"}")
                        .toObject(Update.class);
        Assertions.assertEquals("gjofjd", model.getUpdateId().getProvider());
        Assertions.assertEquals("eqsrdeupewnwreit", model.getUpdateId().getName());
        Assertions.assertEquals("zyf", model.getUpdateId().getVersion());
        Assertions.assertEquals("sarhmofc", model.getDescription());
        Assertions.assertEquals("smy", model.getFriendlyName());
        Assertions.assertEquals(true, model.isDeployable());
        Assertions.assertEquals("tmlxhekuksjtx", model.getUpdateType());
        Assertions.assertEquals("cdm", model.getInstalledCriteria());
        Assertions.assertEquals("w", model.getCompatibility().get(0).get("cryuan"));
        Assertions.assertEquals(StepType.INLINE, model.getInstructions().getSteps().get(0).getType());
        Assertions.assertEquals("emkkvnipjox", model.getInstructions().getSteps().get(0).getDescription());
        Assertions.assertEquals("nchgej", model.getInstructions().getSteps().get(0).getHandler());
        Assertions.assertEquals("mailzydehojw", model.getInstructions().getSteps().get(0).getFiles().get(0));
        Assertions.assertEquals("mfdatscmdvpj", model.getInstructions().getSteps().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("u", model.getInstructions().getSteps().get(0).getUpdateId().getName());
        Assertions.assertEquals("suuv", model.getInstructions().getSteps().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("paojakhmsbzjh", model.getReferencedBy().get(0).getProvider());
        Assertions.assertEquals("rzevdphlxaol", model.getReferencedBy().get(0).getName());
        Assertions.assertEquals("hqtrgqjbpf", model.getReferencedBy().get(0).getVersion());
        Assertions.assertEquals("nuvamiheogna", model.getScanResult());
        Assertions.assertEquals("xzxtheo", model.getManifestVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-27T12:33:39Z"), model.getImportedDateTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-06T23:59:36Z"), model.getCreatedDateTime());
        Assertions.assertEquals("vyevcciqi", model.getEtag());
    }
}
