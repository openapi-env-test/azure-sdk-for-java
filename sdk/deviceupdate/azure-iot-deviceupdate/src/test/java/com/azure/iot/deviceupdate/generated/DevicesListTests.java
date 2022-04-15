package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.DeviceDeploymentState;
import com.azure.iot.deviceupdate.models.DevicesList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DevicesListTests {
    @Test
    public void testDeserialize() {
        DevicesList model =
                BinaryData.fromString(
                                "{\"value\":[{\"deviceId\":\"vuoy\",\"moduleId\":\"ccelve\",\"deviceClassId\":\"rypqlmfeo\",\"manufacturer\":\"erqwkyhkobopg\",\"model\":\"edkowepbqpcrfk\",\"groupId\":\"ccsnjvcdwxlpq\",\"lastAttemptedUpdateId\":{\"provider\":\"ftnkhtj\",\"name\":\"y\",\"version\":\"ngwfqatm\"},\"deploymentStatus\":\"Canceled\",\"installedUpdateId\":{\"provider\":\"mdvy\",\"name\":\"gikdgsz\",\"version\":\"w\"},\"onLatestUpdate\":true,\"lastDeploymentId\":\"rryuzhlhkjo\",\"lastInstallResult\":{\"resultCode\":1145336567,\"extendedResultCode\":1271536570,\"resultDetails\":\"aatjinrvgoupmfi\",\"stepResults\":[{\"updateId\":{\"provider\":\"gjio\",\"name\":\"lvrwxkvtkk\",\"version\":\"llqwjygvjayvblmh\"},\"description\":\"zuhbxvvyhgsopb\",\"resultCode\":792266928,\"extendedResultCode\":1164866415,\"resultDetails\":\"fegxuvwzfb\"},{\"updateId\":{\"provider\":\"lmctlpd\",\"name\":\"gitvg\",\"version\":\"mhrixkwmyijejve\"},\"description\":\"hbpnaixexccbd\",\"resultCode\":1956561787,\"extendedResultCode\":303838192,\"resultDetails\":\"hcexdrrvqa\"},{\"updateId\":{\"provider\":\"kghtpwijnh\",\"name\":\"jsvfycxzbfvoowv\",\"version\":\"vmtgjqppy\"},\"description\":\"tronzmyhgfi\",\"resultCode\":1358743575,\"extendedResultCode\":884290238,\"resultDetails\":\"kmcwaekrrjreafx\"}]}}],\"nextLink\":\"gumhjglikkxws\"}")
                        .toObject(DevicesList.class);
        Assertions.assertEquals("vuoy", model.getValue().get(0).getDeviceId());
        Assertions.assertEquals("ccelve", model.getValue().get(0).getModuleId());
        Assertions.assertEquals("rypqlmfeo", model.getValue().get(0).getDeviceClassId());
        Assertions.assertEquals("erqwkyhkobopg", model.getValue().get(0).getManufacturer());
        Assertions.assertEquals("edkowepbqpcrfk", model.getValue().get(0).getModel());
        Assertions.assertEquals("ccsnjvcdwxlpq", model.getValue().get(0).getGroupId());
        Assertions.assertEquals("ftnkhtj", model.getValue().get(0).getLastAttemptedUpdateId().getProvider());
        Assertions.assertEquals("y", model.getValue().get(0).getLastAttemptedUpdateId().getName());
        Assertions.assertEquals("ngwfqatm", model.getValue().get(0).getLastAttemptedUpdateId().getVersion());
        Assertions.assertEquals(DeviceDeploymentState.CANCELED, model.getValue().get(0).getDeploymentStatus());
        Assertions.assertEquals("mdvy", model.getValue().get(0).getInstalledUpdateId().getProvider());
        Assertions.assertEquals("gikdgsz", model.getValue().get(0).getInstalledUpdateId().getName());
        Assertions.assertEquals("w", model.getValue().get(0).getInstalledUpdateId().getVersion());
        Assertions.assertEquals(true, model.getValue().get(0).isOnLatestUpdate());
        Assertions.assertEquals("rryuzhlhkjo", model.getValue().get(0).getLastDeploymentId());
        Assertions.assertEquals(1145336567, model.getValue().get(0).getLastInstallResult().getResultCode());
        Assertions.assertEquals(1271536570, model.getValue().get(0).getLastInstallResult().getExtendedResultCode());
        Assertions.assertEquals("aatjinrvgoupmfi", model.getValue().get(0).getLastInstallResult().getResultDetails());
        Assertions.assertEquals(
                "gjio",
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getUpdateId().getProvider());
        Assertions.assertEquals(
                "lvrwxkvtkk",
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getUpdateId().getName());
        Assertions.assertEquals(
                "llqwjygvjayvblmh",
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getUpdateId().getVersion());
        Assertions.assertEquals(
                "zuhbxvvyhgsopb",
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getDescription());
        Assertions.assertEquals(
                792266928, model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getResultCode());
        Assertions.assertEquals(
                1164866415,
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getExtendedResultCode());
        Assertions.assertEquals(
                "fegxuvwzfb",
                model.getValue().get(0).getLastInstallResult().getStepResults().get(0).getResultDetails());
        Assertions.assertEquals("gumhjglikkxws", model.getNextLink());
    }
}
