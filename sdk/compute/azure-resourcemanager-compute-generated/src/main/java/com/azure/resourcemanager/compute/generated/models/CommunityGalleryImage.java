// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of CommunityGalleryImage. */
public interface CommunityGalleryImage {
    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the uniqueId property: The unique id of this community gallery.
     *
     * @return the uniqueId value.
     */
    String uniqueId();

    /**
     * Gets the osType property: This property allows you to specify the type of the OS that is included in the disk
     * when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @return the osState value.
     */
    OperatingSystemStateTypes osState();

    /**
     * Gets the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    OffsetDateTime endOfLifeDate();

    /**
     * Gets the identifier property: This is the gallery image definition identifier.
     *
     * @return the identifier value.
     */
    GalleryImageIdentifier identifier();

    /**
     * Gets the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @return the recommended value.
     */
    RecommendedMachineConfiguration recommended();

    /**
     * Gets the disallowed property: Describes the disallowed disk types.
     *
     * @return the disallowed value.
     */
    Disallowed disallowed();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the features property: A list of gallery image features.
     *
     * @return the features value.
     */
    List<GalleryImageFeature> features();

    /**
     * Gets the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @return the purchasePlan value.
     */
    ImagePurchasePlan purchasePlan();

    /**
     * Gets the architecture property: The architecture of the image. Applicable to OS disks only.
     *
     * @return the architecture value.
     */
    Architecture architecture();

    /**
     * Gets the privacyStatementUri property: Privacy statement uri for the current community gallery image.
     *
     * @return the privacyStatementUri value.
     */
    String privacyStatementUri();

    /**
     * Gets the eula property: End-user license agreement for the current community gallery image.
     *
     * @return the eula value.
     */
    String eula();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner object.
     *
     * @return the inner object.
     */
    CommunityGalleryImageInner innerModel();
}
