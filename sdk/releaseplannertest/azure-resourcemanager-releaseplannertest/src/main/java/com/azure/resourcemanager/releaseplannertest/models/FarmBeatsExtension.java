// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.releaseplannertest.fluent.models.FarmBeatsExtensionInner;
import java.util.List;

/** An immutable client-side representation of FarmBeatsExtension. */
public interface FarmBeatsExtension {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the targetResourceType property: Target ResourceType of the farmBeatsExtension.
     *
     * @return the targetResourceType value.
     */
    String targetResourceType();

    /**
     * Gets the farmBeatsExtensionId property: FarmBeatsExtension ID.
     *
     * @return the farmBeatsExtensionId value.
     */
    String farmBeatsExtensionId();

    /**
     * Gets the farmBeatsExtensionName property: FarmBeatsExtension name.
     *
     * @return the farmBeatsExtensionName value.
     */
    String farmBeatsExtensionName();

    /**
     * Gets the farmBeatsExtensionVersion property: FarmBeatsExtension version.
     *
     * @return the farmBeatsExtensionVersion value.
     */
    String farmBeatsExtensionVersion();

    /**
     * Gets the publisherId property: Publisher ID.
     *
     * @return the publisherId value.
     */
    String publisherId();

    /**
     * Gets the description property: Textual description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the extensionCategory property: Category of the extension. e.g. weather/sensor/satellite.
     *
     * @return the extensionCategory value.
     */
    String extensionCategory();

    /**
     * Gets the extensionAuthLink property: FarmBeatsExtension auth link.
     *
     * @return the extensionAuthLink value.
     */
    String extensionAuthLink();

    /**
     * Gets the extensionApiDocsLink property: FarmBeatsExtension api docs link.
     *
     * @return the extensionApiDocsLink value.
     */
    String extensionApiDocsLink();

    /**
     * Gets the detailedInformation property: Detailed information which shows summary of requested data. Used in
     * descriptive get extension metadata call. Information for weather category per api included are apisSupported,
     * customParameters, PlatformParameters and Units supported.
     *
     * @return the detailedInformation value.
     */
    List<DetailedInformation> detailedInformation();

    /**
     * Gets the inner com.azure.resourcemanager.releaseplannertest.fluent.models.FarmBeatsExtensionInner object.
     *
     * @return the inner object.
     */
    FarmBeatsExtensionInner innerModel();
}
