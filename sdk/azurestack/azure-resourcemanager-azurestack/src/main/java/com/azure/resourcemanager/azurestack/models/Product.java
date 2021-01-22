// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.resourcemanager.azurestack.fluent.models.ProductInner;
import java.util.List;

/** An immutable client-side representation of Product. */
public interface Product {
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
     * Gets the displayName property: The display name of the product.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: The description of the product.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the publisherDisplayName property: The user-friendly name of the product publisher.
     *
     * @return the publisherDisplayName value.
     */
    String publisherDisplayName();

    /**
     * Gets the publisherIdentifier property: Publisher identifier.
     *
     * @return the publisherIdentifier value.
     */
    String publisherIdentifier();

    /**
     * Gets the offer property: The offer representing the product.
     *
     * @return the offer value.
     */
    String offer();

    /**
     * Gets the offerVersion property: The version of the product offer.
     *
     * @return the offerVersion value.
     */
    String offerVersion();

    /**
     * Gets the sku property: The product SKU.
     *
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the billingPartNumber property: The part number used for billing purposes.
     *
     * @return the billingPartNumber value.
     */
    String billingPartNumber();

    /**
     * Gets the vmExtensionType property: The type of the Virtual Machine Extension.
     *
     * @return the vmExtensionType value.
     */
    String vmExtensionType();

    /**
     * Gets the galleryItemIdentity property: The identifier of the gallery item corresponding to the product.
     *
     * @return the galleryItemIdentity value.
     */
    String galleryItemIdentity();

    /**
     * Gets the iconUris property: Additional links available for this product.
     *
     * @return the iconUris value.
     */
    IconUris iconUris();

    /**
     * Gets the links property: Additional links available for this product.
     *
     * @return the links value.
     */
    List<ProductLink> links();

    /**
     * Gets the legalTerms property: The legal terms.
     *
     * @return the legalTerms value.
     */
    String legalTerms();

    /**
     * Gets the privacyPolicy property: The privacy policy.
     *
     * @return the privacyPolicy value.
     */
    String privacyPolicy();

    /**
     * Gets the payloadLength property: The length of product content.
     *
     * @return the payloadLength value.
     */
    Long payloadLength();

    /**
     * Gets the productKind property: The kind of the product (virtualMachine or virtualMachineExtension).
     *
     * @return the productKind value.
     */
    String productKind();

    /**
     * Gets the productProperties property: Additional properties for the product.
     *
     * @return the productProperties value.
     */
    ProductProperties productProperties();

    /**
     * Gets the compatibility property: Product compatibility with current device.
     *
     * @return the compatibility value.
     */
    Compatibility compatibility();

    /**
     * Gets the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.fluent.models.ProductInner object.
     *
     * @return the inner object.
     */
    ProductInner innerModel();
}
