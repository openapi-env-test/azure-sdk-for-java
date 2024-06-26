// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.CopyOption;

public final class CopyOptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyOption model = BinaryData.fromString("{\"objectType\":\"CopyOption\"}").toObject(CopyOption.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyOption model = new CopyOption();
        model = BinaryData.fromObject(model).toObject(CopyOption.class);
    }
}
