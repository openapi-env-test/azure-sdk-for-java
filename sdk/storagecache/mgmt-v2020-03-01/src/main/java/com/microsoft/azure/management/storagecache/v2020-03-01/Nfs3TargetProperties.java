/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020-03-01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An NFSv3 mount point for use as a Storage Target.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "targetBaseType", defaultImpl = Nfs3TargetProperties.class)
@JsonTypeName("nfs3")
public class Nfs3TargetProperties extends StorageTargetProperties {
}
