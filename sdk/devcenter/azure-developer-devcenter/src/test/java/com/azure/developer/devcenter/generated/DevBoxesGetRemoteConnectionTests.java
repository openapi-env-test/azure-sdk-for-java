// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.TypeReference;
import com.azure.developer.devcenter.DevCenterClientTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public final class DevBoxesGetRemoteConnectionTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesGetRemoteConnectionTests() {
        createDevBox();

        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                devBoxesClient.getRemoteConnectionWithResponse(projectName, "me", devBoxName, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());

        Map<String, Object> connectionStringData = response.getValue().toObject(new TypeReference<Map<String, Object>>() {});
        Assertions.assertNotNull(connectionStringData.get("webUrl"));
        deleteDevBox();
    }
}
