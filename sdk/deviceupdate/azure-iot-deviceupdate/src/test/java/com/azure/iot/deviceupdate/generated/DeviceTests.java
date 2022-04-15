package com.azure.iot.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.models.Device;
import com.azure.iot.deviceupdate.models.DeviceDeploymentState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeviceTests {
    @Test
    public void testDeserialize() {
        Device model =
                BinaryData.fromString(
                                "{\"deviceId\":\"olbq\",\"moduleId\":\"uzlm\",\"deviceClassId\":\"felfktg\",\"manufacturer\":\"lcrpw\",\"model\":\"xeznoi\",\"groupId\":\"rnjwmw\",\"lastAttemptedUpdateId\":{\"provider\":\"nbsazejjoqkag\",\"name\":\"hsxttaugzxnf\",\"version\":\"azpxdtnkdmkqjjl\"},\"deploymentStatus\":\"Succeeded\",\"installedUpdateId\":{\"provider\":\"vrkpyouaibreb\",\"name\":\"aays\",\"version\":\"kixqtnqtt\"},\"onLatestUpdate\":true,\"lastDeploymentId\":\"wfff\",\"lastInstallResult\":{\"resultCode\":718732665,\"extendedResultCode\":1807860648,\"resultDetails\":\"pqqmted\",\"stepResults\":[{\"updateId\":{\"provider\":\"jihy\",\"name\":\"ozphvwauyqncygu\",\"version\":\"kvi\"},\"description\":\"dscwxqupevzhf\",\"resultCode\":434974760,\"extendedResultCode\":292167631,\"resultDetails\":\"xhojuj\"}]}}")
                        .toObject(Device.class);
        Assertions.assertEquals("olbq", model.getDeviceId());
        Assertions.assertEquals("uzlm", model.getModuleId());
        Assertions.assertEquals("felfktg", model.getDeviceClassId());
        Assertions.assertEquals("lcrpw", model.getManufacturer());
        Assertions.assertEquals("xeznoi", model.getModel());
        Assertions.assertEquals("rnjwmw", model.getGroupId());
        Assertions.assertEquals("nbsazejjoqkag", model.getLastAttemptedUpdateId().getProvider());
        Assertions.assertEquals("hsxttaugzxnf", model.getLastAttemptedUpdateId().getName());
        Assertions.assertEquals("azpxdtnkdmkqjjl", model.getLastAttemptedUpdateId().getVersion());
        Assertions.assertEquals(DeviceDeploymentState.SUCCEEDED, model.getDeploymentStatus());
        Assertions.assertEquals("vrkpyouaibreb", model.getInstalledUpdateId().getProvider());
        Assertions.assertEquals("aays", model.getInstalledUpdateId().getName());
        Assertions.assertEquals("kixqtnqtt", model.getInstalledUpdateId().getVersion());
        Assertions.assertEquals(true, model.isOnLatestUpdate());
        Assertions.assertEquals("wfff", model.getLastDeploymentId());
        Assertions.assertEquals(718732665, model.getLastInstallResult().getResultCode());
        Assertions.assertEquals(1807860648, model.getLastInstallResult().getExtendedResultCode());
        Assertions.assertEquals("pqqmted", model.getLastInstallResult().getResultDetails());
        Assertions.assertEquals(
                "jihy", model.getLastInstallResult().getStepResults().get(0).getUpdateId().getProvider());
        Assertions.assertEquals(
                "ozphvwauyqncygu", model.getLastInstallResult().getStepResults().get(0).getUpdateId().getName());
        Assertions.assertEquals("kvi", model.getLastInstallResult().getStepResults().get(0).getUpdateId().getVersion());
        Assertions.assertEquals("dscwxqupevzhf", model.getLastInstallResult().getStepResults().get(0).getDescription());
        Assertions.assertEquals(434974760, model.getLastInstallResult().getStepResults().get(0).getResultCode());
        Assertions.assertEquals(
                292167631, model.getLastInstallResult().getStepResults().get(0).getExtendedResultCode());
        Assertions.assertEquals("xhojuj", model.getLastInstallResult().getStepResults().get(0).getResultDetails());
    }
}
