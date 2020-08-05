// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The CreateQueueBodyContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateQueueBodyContent {
    /*
     * MIME type of content.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Properties of the new queue.
     */
    @JacksonXmlProperty(
            localName = "QueueDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private QueueDescription queueDescription;

    /**
     * Get the type property: MIME type of content.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: MIME type of content.
     *
     * @param type the type value to set.
     * @return the CreateQueueBodyContent object itself.
     */
    public CreateQueueBodyContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the queueDescription property: Properties of the new queue.
     *
     * @return the queueDescription value.
     */
    public QueueDescription getQueueDescription() {
        return this.queueDescription;
    }

    /**
     * Set the queueDescription property: Properties of the new queue.
     *
     * @param queueDescription the queueDescription value to set.
     * @return the CreateQueueBodyContent object itself.
     */
    public CreateQueueBodyContent setQueueDescription(QueueDescription queueDescription) {
        this.queueDescription = queueDescription;
        return this;
    }
}
