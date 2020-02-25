/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The service resource properties for patch operations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceKind", defaultImpl = ServiceUpdateProperties.class)
@JsonTypeName("ServiceUpdateProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceUpdateProperties.class),
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceUpdateProperties.class)
})
public class ServiceUpdateProperties extends ServicePropertiesBase {
}
