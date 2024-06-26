// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FabricSpecificCreationInput;

public final class FabricSpecificCreationInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FabricSpecificCreationInput model =
            BinaryData
                .fromString("{\"instanceType\":\"FabricSpecificCreationInput\"}")
                .toObject(FabricSpecificCreationInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FabricSpecificCreationInput model = new FabricSpecificCreationInput();
        model = BinaryData.fromObject(model).toObject(FabricSpecificCreationInput.class);
    }
}
