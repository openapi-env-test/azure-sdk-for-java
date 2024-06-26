// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceStandardProperties;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceStandardPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceStandardProperties model =
            BinaryData
                .fromString(
                    "{\"state\":\"Passed\",\"passedControls\":1289922635,\"failedControls\":2016240775,\"skippedControls\":1785480642,\"unsupportedControls\":1319362662}")
                .toObject(RegulatoryComplianceStandardProperties.class);
        Assertions.assertEquals(State.PASSED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceStandardProperties model =
            new RegulatoryComplianceStandardProperties().withState(State.PASSED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceStandardProperties.class);
        Assertions.assertEquals(State.PASSED, model.state());
    }
}
