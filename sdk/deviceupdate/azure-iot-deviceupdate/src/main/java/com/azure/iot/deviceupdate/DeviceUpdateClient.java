package com.azure.iot.deviceupdate;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the DeviceUpdateClient type. */
public final class DeviceUpdateClient {
    /** Account endpoint. */
    private final String endpoint;

    /**
     * Gets Account endpoint.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Account instance identifier. */
    private final String instanceId;

    /**
     * Gets Account instance identifier.
     *
     * @return the instanceId value.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The DeviceUpdates object to access its operations. */
    private final DeviceUpdates deviceUpdates;

    /**
     * Gets the DeviceUpdates object to access its operations.
     *
     * @return the DeviceUpdates object.
     */
    public DeviceUpdates getDeviceUpdates() {
        return this.deviceUpdates;
    }

    /** The DeviceManagements object to access its operations. */
    private final DeviceManagements deviceManagements;

    /**
     * Gets the DeviceManagements object to access its operations.
     *
     * @return the DeviceManagements object.
     */
    public DeviceManagements getDeviceManagements() {
        return this.deviceManagements;
    }

    /**
     * Initializes an instance of DeviceUpdateClient client.
     *
     * @param endpoint Account endpoint.
     * @param instanceId Account instance identifier.
     * @param apiVersion Api Version.
     */
    DeviceUpdateClient(String endpoint, String instanceId, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                instanceId,
                apiVersion);
    }

    /**
     * Initializes an instance of DeviceUpdateClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Account endpoint.
     * @param instanceId Account instance identifier.
     * @param apiVersion Api Version.
     */
    DeviceUpdateClient(HttpPipeline httpPipeline, String endpoint, String instanceId, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, instanceId, apiVersion);
    }

    /**
     * Initializes an instance of DeviceUpdateClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Account endpoint.
     * @param instanceId Account instance identifier.
     * @param apiVersion Api Version.
     */
    DeviceUpdateClient(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            String instanceId,
            String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.instanceId = instanceId;
        this.apiVersion = apiVersion;
        this.deviceUpdates = new DeviceUpdates(this);
        this.deviceManagements = new DeviceManagements(this);
    }
}
