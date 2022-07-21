// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.appservice.generated.models.Kind;
import com.azure.resourcemanager.appservice.generated.models.Workflow;
import java.io.IOException;

/** Samples for Workflows Validate. */
public final class WorkflowsValidateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Workflows_Validate.json
     */
    /**
     * Sample code: Validate a workflow.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void validateAWorkflow(com.azure.resourcemanager.appservice.generated.AppServiceManager manager)
        throws IOException {
        manager
            .workflows()
            .validateWithResponse(
                "test-resource-group",
                "test-name",
                "test-workflow",
                new Workflow()
                    .withDefinition(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"$schema\":\"https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#\",\"actions\":{},\"contentVersion\":\"1.0.0.0\",\"outputs\":{},\"parameters\":{},\"triggers\":{}}",
                                Object.class,
                                SerializerEncoding.JSON))
                    .withKind(Kind.STATEFUL),
                Context.NONE);
    }
}
