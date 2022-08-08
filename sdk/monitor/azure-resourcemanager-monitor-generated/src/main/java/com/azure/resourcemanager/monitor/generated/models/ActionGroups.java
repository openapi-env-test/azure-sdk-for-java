// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ActionGroups. */
public interface ActionGroups {
    /**
     * Get an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group.
     */
    ActionGroupResource getByResourceGroup(String resourceGroupName, String actionGroupName);

    /**
     * Get an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    Response<ActionGroupResource> getByResourceGroupWithResponse(
        String resourceGroupName, String actionGroupName, Context context);

    /**
     * Delete an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String actionGroupName);

    /**
     * Delete an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String actionGroupName, Context context);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse postTestNotifications(NotificationRequestBody notificationRequest);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse postTestNotifications(NotificationRequestBody notificationRequest, Context context);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param notificationRequest The notification request body which includes the contact details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse createNotificationsAtResourceGroupLevel(
        String resourceGroupName, NotificationRequestBody notificationRequest);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param notificationRequest The notification request body which includes the contact details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse createNotificationsAtResourceGroupLevel(
        String resourceGroupName, NotificationRequestBody notificationRequest, Context context);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param notificationRequest The notification request body which includes the contact details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse createNotificationsAtActionGroupResourceLevel(
        String resourceGroupName, String actionGroupName, NotificationRequestBody notificationRequest);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param notificationRequest The notification request body which includes the contact details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the test notification results.
     */
    TestNotificationDetailsResponse createNotificationsAtActionGroupResourceLevel(
        String resourceGroupName, String actionGroupName, NotificationRequestBody notificationRequest, Context context);

    /**
     * Get the test notifications by the notification id.
     *
     * @param notificationId The notification id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id.
     */
    TestNotificationDetailsResponse getTestNotifications(String notificationId);

    /**
     * Get the test notifications by the notification id.
     *
     * @param notificationId The notification id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id along with {@link Response}.
     */
    Response<TestNotificationDetailsResponse> getTestNotificationsWithResponse(String notificationId, Context context);

    /**
     * Get the test notifications by the notification id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param notificationId The notification id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id.
     */
    TestNotificationDetailsResponse getTestNotificationsAtResourceGroupLevel(
        String resourceGroupName, String notificationId);

    /**
     * Get the test notifications by the notification id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param notificationId The notification id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id along with {@link Response}.
     */
    Response<TestNotificationDetailsResponse> getTestNotificationsAtResourceGroupLevelWithResponse(
        String resourceGroupName, String notificationId, Context context);

    /**
     * Get the test notifications by the notification id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param notificationId The notification id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id.
     */
    TestNotificationDetailsResponse getTestNotificationsAtActionGroupResourceLevel(
        String resourceGroupName, String actionGroupName, String notificationId);

    /**
     * Get the test notifications by the notification id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param notificationId The notification id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id along with {@link Response}.
     */
    Response<TestNotificationDetailsResponse> getTestNotificationsAtActionGroupResourceLevelWithResponse(
        String resourceGroupName, String actionGroupName, String notificationId, Context context);

    /**
     * Get a list of all action groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> list();

    /**
     * Get a list of all action groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> list(Context context);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Enable a receiver in an action group. This changes the receiver's status from Disabled to Enabled. This operation
     * is only supported for Email or SMS receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param enableRequest The receiver to re-enable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableReceiver(String resourceGroupName, String actionGroupName, EnableRequest enableRequest);

    /**
     * Enable a receiver in an action group. This changes the receiver's status from Disabled to Enabled. This operation
     * is only supported for Email or SMS receivers.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param enableRequest The receiver to re-enable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableReceiverWithResponse(
        String resourceGroupName, String actionGroupName, EnableRequest enableRequest, Context context);

    /**
     * Get an action group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    ActionGroupResource getById(String id);

    /**
     * Get an action group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    Response<ActionGroupResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete an action group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an action group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ActionGroupResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ActionGroupResource definition.
     */
    ActionGroupResource.DefinitionStages.Blank define(String name);
}
