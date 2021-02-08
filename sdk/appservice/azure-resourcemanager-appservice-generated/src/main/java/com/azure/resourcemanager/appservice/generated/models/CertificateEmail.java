// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of CertificateEmail. */
public interface CertificateEmail {
    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the emailId property: Email id.
     *
     * @return the emailId value.
     */
    String emailId();

    /**
     * Gets the timestamp property: Time stamp.
     *
     * @return the timestamp value.
     */
    OffsetDateTime timestamp();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource Name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner object.
     *
     * @return the inner object.
     */
    CertificateEmailInner innerModel();
}
