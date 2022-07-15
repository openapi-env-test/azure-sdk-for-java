// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.newservice.demo.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementListGroupsTests extends DemoNewServiceClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementListGroupsTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceManagementClient.listGroups(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"createdDateTime\":\"2020-07-01T12:13:14.0000000Z\",\"deployments\":[\"deployment1\",\"deployment2\"],\"deviceCount\":100,\"groupId\":\"MyGroup1\",\"groupType\":\"IoTHubTag\",\"subgroupsWithNewUpdatesAvailableCount\":2,\"subgroupsWithOnLatestUpdateCount\":1,\"subgroupsWithUpdatesInProgressCount\":0}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
