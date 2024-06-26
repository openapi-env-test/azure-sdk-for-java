// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RunAsAccount;
import org.junit.jupiter.api.Assertions;

public final class RunAsAccountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunAsAccount model =
            BinaryData
                .fromString("{\"accountId\":\"iploisjkzsoxznnt\",\"accountName\":\"kvyohpsap\"}")
                .toObject(RunAsAccount.class);
        Assertions.assertEquals("iploisjkzsoxznnt", model.accountId());
        Assertions.assertEquals("kvyohpsap", model.accountName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunAsAccount model = new RunAsAccount().withAccountId("iploisjkzsoxznnt").withAccountName("kvyohpsap");
        model = BinaryData.fromObject(model).toObject(RunAsAccount.class);
        Assertions.assertEquals("iploisjkzsoxznnt", model.accountId());
        Assertions.assertEquals("kvyohpsap", model.accountName());
    }
}
