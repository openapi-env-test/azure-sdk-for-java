// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentUpdate;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentUpdate model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"veual\":{\"principalId\":\"722f6d5d-a4be-49ef-859d-8e0961238354\",\"clientId\":\"a4541266-741f-439c-981a-c1cf2b17ae98\"},\"mkh\":{\"principalId\":\"54b509c6-afca-41df-a2ea-819d552cfcf1\",\"clientId\":\"9a36844d-8db6-4d0e-b5f9-c495c195c8a6\"},\"bbcswsrtjri\":{\"principalId\":\"804d3b9b-f5ae-4616-9331-d242e48040b4\",\"clientId\":\"63b3ce36-c7db-4e64-bd93-42681aab08ca\"},\"bpbewtghfgb\":{\"principalId\":\"a21c1186-61a2-47c5-b1c6-e74d4d4d9ccf\",\"clientId\":\"19babc93-1b64-4e6c-8513-919d7f32cae6\"}},\"principalId\":\"gw\",\"tenantId\":\"vlvqhjkbegi\"}}")
                .toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentUpdate model =
            new ExperimentUpdate()
                .withIdentity(
                    new ResourceIdentity()
                        .withType(ResourceIdentityType.NONE)
                        .withUserAssignedIdentities(
                            mapOf(
                                "veual",
                                new UserAssignedIdentity(),
                                "mkh",
                                new UserAssignedIdentity(),
                                "bbcswsrtjri",
                                new UserAssignedIdentity(),
                                "bpbewtghfgb",
                                new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
