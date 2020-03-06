/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_02_01;

import rx.Completable;

/**
 * Type representing ManagementGroupSubscriptions.
 */
public interface ManagementGroupSubscriptions {
    /**
     * Associates existing subscription with the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable createAsync(String groupId, String subscriptionId);

    /**
     * De-associates subscription from the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String groupId, String subscriptionId);

}
