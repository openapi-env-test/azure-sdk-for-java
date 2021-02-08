// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.UserInner;

/** An immutable client-side representation of User. */
public interface User {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the username property: Username.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the publishingUsername property: Username used for publishing.
     *
     * @return the publishingUsername value.
     */
    String publishingUsername();

    /**
     * Gets the publishingPassword property: Password used for publishing.
     *
     * @return the publishingPassword value.
     */
    String publishingPassword();

    /**
     * Gets the publishingPasswordHash property: Password hash used for publishing.
     *
     * @return the publishingPasswordHash value.
     */
    String publishingPasswordHash();

    /**
     * Gets the publishingPasswordHashSalt property: Password hash salt used for publishing.
     *
     * @return the publishingPasswordHashSalt value.
     */
    String publishingPasswordHashSalt();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.UserInner object.
     *
     * @return the inner object.
     */
    UserInner innerModel();
}
