// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingRoleDefinitionListResult;

public final class BillingRoleDefinitionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingRoleDefinitionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"phvwauyqncygu\",\"permissions\":[],\"roleName\":\"ipmdscwx\"},\"id\":\"upev\",\"name\":\"hfstotxhojujbyp\",\"type\":\"lmcuvhixb\"},{\"properties\":{\"description\":\"fw\",\"permissions\":[],\"roleName\":\"r\"},\"id\":\"ool\",\"name\":\"ttpkiwkkbnujrywv\",\"type\":\"y\"}],\"nextLink\":\"fpncurdo\"}")
                .toObject(BillingRoleDefinitionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingRoleDefinitionListResult model = new BillingRoleDefinitionListResult();
        model = BinaryData.fromObject(model).toObject(BillingRoleDefinitionListResult.class);
    }
}
