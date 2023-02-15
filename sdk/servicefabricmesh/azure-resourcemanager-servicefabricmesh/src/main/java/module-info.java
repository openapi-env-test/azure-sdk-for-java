// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.servicefabricmesh {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.servicefabricmesh;
    exports com.azure.resourcemanager.servicefabricmesh.fluent;
    exports com.azure.resourcemanager.servicefabricmesh.fluent.models;
    exports com.azure.resourcemanager.servicefabricmesh.models;

    opens com.azure.resourcemanager.servicefabricmesh.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.servicefabricmesh.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
