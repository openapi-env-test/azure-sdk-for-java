// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.generated;

import com.azure.resourcemanager.servicefabricmesh.models.GatewayDestination;
import com.azure.resourcemanager.servicefabricmesh.models.HeaderMatchType;
import com.azure.resourcemanager.servicefabricmesh.models.HttpConfig;
import com.azure.resourcemanager.servicefabricmesh.models.HttpHostConfig;
import com.azure.resourcemanager.servicefabricmesh.models.HttpRouteConfig;
import com.azure.resourcemanager.servicefabricmesh.models.HttpRouteMatchHeader;
import com.azure.resourcemanager.servicefabricmesh.models.HttpRouteMatchPath;
import com.azure.resourcemanager.servicefabricmesh.models.HttpRouteMatchRule;
import com.azure.resourcemanager.servicefabricmesh.models.NetworkRef;
import com.azure.resourcemanager.servicefabricmesh.models.PathMatchType;
import com.azure.resourcemanager.servicefabricmesh.models.TcpConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Gateway Create. */
public final class GatewayCreateSamples {
    /*
     * x-ms-original-file: specification/servicefabricmesh/resource-manager/Microsoft.ServiceFabricMesh/preview/2018-09-01-preview/examples/gateways/create_update.json
     */
    /**
     * Sample code: CreateOrUpdateGateway.
     *
     * @param manager Entry point to ServiceFabricMeshManager.
     */
    public static void createOrUpdateGateway(
        com.azure.resourcemanager.servicefabricmesh.ServiceFabricMeshManager manager) {
        manager
            .gateways()
            .define("sampleGateway")
            .withRegion("EastUS")
            .withExistingResourceGroup("sbz_demo")
            .withSourceNetwork(new NetworkRef().withName("Open"))
            .withDestinationNetwork(new NetworkRef().withName("helloWorldNetwork"))
            .withTags(mapOf())
            .withDescription("Service Fabric Mesh sample gateway.")
            .withTcp(
                Arrays
                    .asList(
                        new TcpConfig()
                            .withName("web")
                            .withPort(80)
                            .withDestination(
                                new GatewayDestination()
                                    .withApplicationName("helloWorldApp")
                                    .withServiceName("helloWorldService")
                                    .withEndpointName("helloWorldListener"))))
            .withHttp(
                Arrays
                    .asList(
                        new HttpConfig()
                            .withName("contosoWebsite")
                            .withPort(8081)
                            .withHosts(
                                Arrays
                                    .asList(
                                        new HttpHostConfig()
                                            .withName("contoso.com")
                                            .withRoutes(
                                                Arrays
                                                    .asList(
                                                        new HttpRouteConfig()
                                                            .withName("index")
                                                            .withMatch(
                                                                new HttpRouteMatchRule()
                                                                    .withPath(
                                                                        new HttpRouteMatchPath()
                                                                            .withValue("/index")
                                                                            .withRewrite("/")
                                                                            .withType(PathMatchType.PREFIX))
                                                                    .withHeaders(
                                                                        Arrays
                                                                            .asList(
                                                                                new HttpRouteMatchHeader()
                                                                                    .withName("accept")
                                                                                    .withValue("application/json")
                                                                                    .withType(HeaderMatchType.EXACT))))
                                                            .withDestination(
                                                                new GatewayDestination()
                                                                    .withApplicationName("httpHelloWorldApp")
                                                                    .withServiceName("indexService")
                                                                    .withEndpointName("indexHttpEndpoint"))))))))
            .create();
    }

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
