// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupResourceInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.TestNotificationDetailsResponseInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.TestNotificationResponseInner;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupPatchBody;
import com.azure.resourcemanager.monitor.generated.models.EnableRequest;
import com.azure.resourcemanager.monitor.generated.models.NotificationRequestBody;

/** An instance of this class provides access to all the operations defined in ActionGroupsClient. */
public interface ActionGroupsClient {
    /**
     * Create a new action group or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param actionGroup The action group to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActionGroupResourceInner createOrUpdate(
        String resourceGroupName, String actionGroupName, ActionGroupResourceInner actionGroup);

    /**
     * Create a new action group or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param actionGroup The action group to create or use for the update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActionGroupResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String actionGroupName, ActionGroupResourceInner actionGroup, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActionGroupResourceInner getByResourceGroup(String resourceGroupName, String actionGroupName);

    /**
     * Get an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActionGroupResourceInner> getByResourceGroupWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String actionGroupName);

    /**
     * Delete an action group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String actionGroupName, Context context);

    /**
     * Updates an existing action group's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param actionGroupPatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActionGroupResourceInner update(
        String resourceGroupName, String actionGroupName, ActionGroupPatchBody actionGroupPatch);

    /**
     * Updates an existing action group's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param actionGroupName The name of the action group.
     * @param actionGroupPatch Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActionGroupResourceInner> updateWithResponse(
        String resourceGroupName, String actionGroupName, ActionGroupPatchBody actionGroupPatch, Context context);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response when test notification succeeded.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TestNotificationResponseInner>, TestNotificationResponseInner> beginPostTestNotifications(
        NotificationRequestBody notificationRequest);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response when test notification succeeded.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TestNotificationResponseInner>, TestNotificationResponseInner> beginPostTestNotifications(
        NotificationRequestBody notificationRequest, Context context);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response when test notification succeeded.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestNotificationResponseInner postTestNotifications(NotificationRequestBody notificationRequest);

    /**
     * Send test notifications to a set of provided receivers.
     *
     * @param notificationRequest The notification request body which includes the contact details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response when test notification succeeded.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestNotificationResponseInner postTestNotifications(NotificationRequestBody notificationRequest, Context context);

    /**
     * Get the test notifications by the notification id.
     *
     * @param notificationId The notification id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestNotificationDetailsResponseInner getTestNotifications(String notificationId);

    /**
     * Get the test notifications by the notification id.
     *
     * @param notificationId The notification id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the test notifications by the notification id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TestNotificationDetailsResponseInner> getTestNotificationsWithResponse(
        String notificationId, Context context);

    /**
     * Get a list of all action groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionGroupResourceInner> list();

    /**
     * Get a list of all action groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionGroupResourceInner> list(Context context);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionGroupResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionGroupResourceInner> listByResourceGroup(String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> enableReceiverWithResponse(
        String resourceGroupName, String actionGroupName, EnableRequest enableRequest, Context context);
}
