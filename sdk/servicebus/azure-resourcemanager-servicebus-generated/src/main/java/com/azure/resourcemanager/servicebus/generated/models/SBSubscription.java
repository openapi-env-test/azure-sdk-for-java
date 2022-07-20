// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner;
import java.time.Duration;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SBSubscription. */
public interface SBSubscription {
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
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the messageCount property: Number of messages.
     *
     * @return the messageCount value.
     */
    Long messageCount();

    /**
     * Gets the createdAt property: Exact time the message was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the accessedAt property: Last time there was a receive request to this subscription.
     *
     * @return the accessedAt value.
     */
    OffsetDateTime accessedAt();

    /**
     * Gets the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the countDetails property: Message count details.
     *
     * @return the countDetails value.
     */
    MessageCountDetails countDetails();

    /**
     * Gets the lockDuration property: ISO 8061 lock duration timespan for the subscription. The default value is 1
     * minute.
     *
     * @return the lockDuration value.
     */
    Duration lockDuration();

    /**
     * Gets the requiresSession property: Value indicating if a subscription supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    Boolean requiresSession();

    /**
     * Gets the defaultMessageTimeToLive property: ISO 8061 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    Duration defaultMessageTimeToLive();

    /**
     * Gets the deadLetteringOnFilterEvaluationExceptions property: Value that indicates whether a subscription has dead
     * letter support on filter evaluation exceptions.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value.
     */
    Boolean deadLetteringOnFilterEvaluationExceptions();

    /**
     * Gets the deadLetteringOnMessageExpiration property: Value that indicates whether a subscription has dead letter
     * support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    Boolean deadLetteringOnMessageExpiration();

    /**
     * Gets the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    Duration duplicateDetectionHistoryTimeWindow();

    /**
     * Gets the maxDeliveryCount property: Number of maximum deliveries.
     *
     * @return the maxDeliveryCount value.
     */
    Integer maxDeliveryCount();

    /**
     * Gets the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @return the status value.
     */
    EntityStatus status();

    /**
     * Gets the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    Boolean enableBatchedOperations();

    /**
     * Gets the autoDeleteOnIdle property: ISO 8061 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    Duration autoDeleteOnIdle();

    /**
     * Gets the forwardTo property: Queue/Topic name to forward the messages.
     *
     * @return the forwardTo value.
     */
    String forwardTo();

    /**
     * Gets the forwardDeadLetteredMessagesTo property: Queue/Topic name to forward the Dead Letter message.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    String forwardDeadLetteredMessagesTo();

    /**
     * Gets the isClientAffine property: Value that indicates whether the subscription has an affinity to the client id.
     *
     * @return the isClientAffine value.
     */
    Boolean isClientAffine();

    /**
     * Gets the clientAffineProperties property: Properties specific to client affine subscriptions.
     *
     * @return the clientAffineProperties value.
     */
    SBClientAffineProperties clientAffineProperties();

    /**
     * Gets the inner com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner object.
     *
     * @return the inner object.
     */
    SBSubscriptionInner innerModel();
}
