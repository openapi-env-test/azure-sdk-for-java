package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.InstallResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InstallResultTests {
    @Test
    public void testDeserialize() {
        InstallResult model =
                BinaryData.fromString(
                                "{\"resultCode\":1650816079,\"extendedResultCode\":1872993536,\"resultDetails\":\"lmcuvhixb\",\"stepResults\":[{\"updateId\":{\"provider\":\"w\",\"name\":\"yl\",\"version\":\"coolsttpkiwkkb\"},\"description\":\"jrywvtylbfpnc\",\"resultCode\":296163908,\"extendedResultCode\":1137820563,\"resultDetails\":\"iwii\"},{\"updateId\":{\"provider\":\"tywubxcbihwq\",\"name\":\"nfdn\",\"version\":\"wjchrdg\"},\"description\":\"hxumwctondzj\",\"resultCode\":518244659,\"extendedResultCode\":2109639729,\"resultDetails\":\"fdlwg\"}]}")
                        .toObject(InstallResult.class);
        Assertions.assertEquals(1650816079, model.getResultCode());
        Assertions.assertEquals(1872993536, model.getExtendedResultCode());
        Assertions.assertEquals("lmcuvhixb", model.getResultDetails());
        Assertions.assertEquals("w", model.getStepResults().get(0).getUpdateId().getProvider());
        Assertions.assertEquals("yl", model.getStepResults().get(0).getUpdateId().getName());
        Assertions.assertEquals("coolsttpkiwkkb", model.getStepResults().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("jrywvtylbfpnc", model.getStepResults().get(0).getDescription());
        Assertions.assertEquals(296163908, model.getStepResults().get(0).getResultCode());
        Assertions.assertEquals(1137820563, model.getStepResults().get(0).getExtendedResultCode());
        Assertions.assertEquals("iwii", model.getStepResults().get(0).getResultDetails());
    }
}
