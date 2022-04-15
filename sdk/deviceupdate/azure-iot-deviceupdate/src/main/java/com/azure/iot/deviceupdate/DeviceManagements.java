package com.azure.iot.deviceupdate;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.iot.deviceupdate.models.AccessCondition;
import com.azure.iot.deviceupdate.models.Deployment;
import com.azure.iot.deviceupdate.models.DeploymentCancelAction;
import com.azure.iot.deviceupdate.models.DeploymentDeviceState;
import com.azure.iot.deviceupdate.models.DeploymentDeviceStatesList;
import com.azure.iot.deviceupdate.models.DeploymentRetryAction;
import com.azure.iot.deviceupdate.models.DeploymentStatus;
import com.azure.iot.deviceupdate.models.DeploymentsList;
import com.azure.iot.deviceupdate.models.Device;
import com.azure.iot.deviceupdate.models.DeviceClass;
import com.azure.iot.deviceupdate.models.DeviceClassesList;
import com.azure.iot.deviceupdate.models.DeviceManagementsGetOperationResponse;
import com.azure.iot.deviceupdate.models.DeviceManagementsImportDevicesResponse;
import com.azure.iot.deviceupdate.models.DeviceOperation;
import com.azure.iot.deviceupdate.models.DeviceOperationsList;
import com.azure.iot.deviceupdate.models.DeviceTag;
import com.azure.iot.deviceupdate.models.DeviceTagsList;
import com.azure.iot.deviceupdate.models.DevicesList;
import com.azure.iot.deviceupdate.models.ErrorResponseException;
import com.azure.iot.deviceupdate.models.Group;
import com.azure.iot.deviceupdate.models.GroupsList;
import com.azure.iot.deviceupdate.models.ImportAction;
import com.azure.iot.deviceupdate.models.ImportType;
import com.azure.iot.deviceupdate.models.LogCollectionOperation;
import com.azure.iot.deviceupdate.models.LogCollectionOperationDetailedStatus;
import com.azure.iot.deviceupdate.models.LogCollectionOperationList;
import com.azure.iot.deviceupdate.models.UpdatableDevices;
import com.azure.iot.deviceupdate.models.UpdatableDevicesList;
import com.azure.iot.deviceupdate.models.UpdateCompliance;
import com.azure.iot.deviceupdate.models.UpdateId;
import com.azure.iot.deviceupdate.models.UpdateIdsList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeviceManagements. */
public final class DeviceManagements {
    /** The proxy service used to perform REST calls. */
    private final DeviceManagementsService service;

    /** The service client containing this operation class. */
    private final DeviceUpdateClient client;

    /**
     * Initializes an instance of DeviceManagements.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeviceManagements(DeviceUpdateClient client) {
        this.service =
                RestProxy.create(
                        DeviceManagementsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DeviceUpdateClientDeviceManagements to be used by the proxy service
     * to perform REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "DeviceUpdateClientDe")
    private interface DeviceManagementsService {
        @Get("/deviceupdate/{instanceId}/management/deviceclasses")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceClassesList>> listDeviceClasses(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/deviceclasses/{deviceClassId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceClass>> getDeviceClass(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("deviceClassId") String deviceClassId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/deviceclasses/{deviceClassId}/installableupdates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateIdsList>> listInstallableUpdatesForDeviceClass(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("deviceClassId") String deviceClassId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/devices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DevicesList>> listDevices(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Post("/deviceupdate/{instanceId}/management/devices")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DeviceManagementsImportDevicesResponse> importDevices(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("action") ImportAction action,
                @BodyParam("application/json") ImportType importType,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/devices/{deviceId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Device>> getDevice(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("deviceId") String deviceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/devices/{deviceId}/modules/{moduleId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Device>> getDeviceModule(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("deviceId") String deviceId,
                @PathParam("moduleId") String moduleId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/updatecompliance")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateCompliance>> getUpdateCompliance(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/devicetags")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceTagsList>> listDeviceTags(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/devicetags/{tagName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceTag>> getDeviceTag(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("tagName") String tagName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<GroupsList>> listGroups(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Group>> getGroup(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Put("/deviceupdate/{instanceId}/management/groups/{groupId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Group>> createOrUpdateGroup(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Group group,
                @HeaderParam("Accept") String accept);

        @Delete("/deviceupdate/{instanceId}/management/groups/{groupId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> deleteGroup(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/updateCompliance")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateCompliance>> getGroupUpdateCompliance(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/bestUpdates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdatableDevicesList>> listBestUpdatesForGroup(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeploymentsList>> listDeploymentsForGroup(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Deployment>> getDeployment(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Put("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Deployment>> createOrUpdateDeployment(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("deploymentId") String deploymentId,
                @PathParam("groupId") String groupId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Deployment deployment,
                @HeaderParam("Accept") String accept);

        @Delete("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> deleteDeployment(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}/status")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeploymentStatus>> getDeploymentStatus(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}/devicestates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeploymentDeviceStatesList>> listDeploymentDevices(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/operations/{operationId}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DeviceManagementsGetOperationResponse> getOperation(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("operationId") String operationId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceOperationsList>> listOperations(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("$filter") String filter,
                @QueryParam("$top") Integer top,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Put("/deviceupdate/{instanceId}/management/deviceDiagnostics/logCollections/{operationId}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogCollectionOperation>> collectLogs(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("operationId") String operationId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") LogCollectionOperation logCollectionRequest,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/deviceDiagnostics/logCollections/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogCollectionOperation>> getLogCollectionOperation(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("operationId") String operationId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/deviceDiagnostics/logCollections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogCollectionOperationList>> listLogCollectionOperations(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/management/deviceDiagnostics/logCollections/{operationId}/detailedStatus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogCollectionOperationDetailedStatus>> getLogCollectionOperationDetailedStatus(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("operationId") String operationId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Post("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Deployment>> stopDeployment(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("action") DeploymentCancelAction action,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Post("/deviceupdate/{instanceId}/management/groups/{groupId}/deployments/{deploymentId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Deployment>> retryDeployment(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("groupId") String groupId,
                @PathParam("deploymentId") String deploymentId,
                @QueryParam("action") DeploymentRetryAction action,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceClassesList>> listDeviceClassesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateIdsList>> listInstallableUpdatesForDeviceClassNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DevicesList>> listDevicesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceTagsList>> listDeviceTagsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<GroupsList>> listGroupsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdatableDevicesList>> listBestUpdatesForGroupNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeploymentsList>> listDeploymentsForGroupNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeploymentDeviceStatesList>> listDeploymentDevicesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<DeviceOperationsList>> listOperationsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogCollectionOperationList>> listLogCollectionOperationsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Gets a list of all device classes (unique combinations of device manufacturer and model) for all devices
     * connected to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device classes (unique combinations of device manufacturer and model) for all devices
     *     connected to Device Update for IoT Hub along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceClass>> listDeviceClassesSinglePageAsync() {
        final String accept = "application/json";
        return service.listDeviceClasses(
                        this.client.getEndpoint(), this.client.getInstanceId(), this.client.getApiVersion(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of all device classes (unique combinations of device manufacturer and model) for all devices
     * connected to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device classes (unique combinations of device manufacturer and model) for all devices
     *     connected to Device Update for IoT Hub as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeviceClass> listDeviceClassesAsync() {
        return new PagedFlux<>(
                () -> listDeviceClassesSinglePageAsync(), nextLink -> listDeviceClassesNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the properties of a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a device class along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeviceClass>> getDeviceClassWithResponseAsync(String deviceClassId) {
        final String accept = "application/json";
        return service.getDeviceClass(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                deviceClassId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Gets the properties of a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a device class on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceClass> getDeviceClassAsync(String deviceClassId) {
        return getDeviceClassWithResponseAsync(deviceClassId)
                .flatMap(
                        (Response<DeviceClass> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets a list of installable updates for a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of installable updates for a device class along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdateId>> listInstallableUpdatesForDeviceClassSinglePageAsync(String deviceClassId) {
        final String accept = "application/json";
        return service.listInstallableUpdatesForDeviceClass(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        deviceClassId,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of installable updates for a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of installable updates for a device class as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UpdateId> listInstallableUpdatesForDeviceClassAsync(String deviceClassId) {
        return new PagedFlux<>(
                () -> listInstallableUpdatesForDeviceClassSinglePageAsync(deviceClassId),
                nextLink -> listInstallableUpdatesForDeviceClassNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of devices connected to Device Update for IoT Hub.
     *
     * @param filter Restricts the set of devices returned. You can filter on device GroupId or DeviceClassId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices connected to Device Update for IoT Hub along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Device>> listDevicesSinglePageAsync(String filter) {
        final String accept = "application/json";
        return service.listDevices(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        filter,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of devices connected to Device Update for IoT Hub.
     *
     * @param filter Restricts the set of devices returned. You can filter on device GroupId or DeviceClassId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices connected to Device Update for IoT Hub as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Device> listDevicesAsync(String filter) {
        return new PagedFlux<>(
                () -> listDevicesSinglePageAsync(filter), nextLink -> listDevicesNextSinglePageAsync(nextLink));
    }

    /**
     * Import existing devices from IoT Hub.
     *
     * @param action Devices action.
     * @param importType The types of devices to import.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceManagementsImportDevicesResponse> importDevicesWithResponseAsync(
            ImportAction action, ImportType importType) {
        final String accept = "application/json";
        return service.importDevices(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                this.client.getApiVersion(),
                action,
                importType,
                accept);
    }

    /**
     * Import existing devices from IoT Hub.
     *
     * @param action Devices action.
     * @param importType The types of devices to import.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> importDevicesAsync(ImportAction action, ImportType importType) {
        return importDevicesWithResponseAsync(action, importType)
                .flatMap((DeviceManagementsImportDevicesResponse res) -> Mono.empty());
    }

    /**
     * Gets the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     *
     * @param deviceId Device identifier in Azure IoT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device properties and latest deployment status for a device connected to Device Update for IoT Hub
     *     along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Device>> getDeviceWithResponseAsync(String deviceId) {
        final String accept = "application/json";
        return service.getDevice(
                this.client.getEndpoint(), this.client.getInstanceId(), deviceId, this.client.getApiVersion(), accept);
    }

    /**
     * Gets the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     *
     * @param deviceId Device identifier in Azure IoT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device properties and latest deployment status for a device connected to Device Update for IoT Hub on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Device> getDeviceAsync(String deviceId) {
        return getDeviceWithResponseAsync(deviceId)
                .flatMap(
                        (Response<Device> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets the device module properties and latest deployment status for a device module connected to Device Update for
     * IoT Hub.
     *
     * @param deviceId Device identifier in Azure IoT Hub.
     * @param moduleId Device module identifier in Azure IoT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device module properties and latest deployment status for a device module connected to Device Update
     *     for IoT Hub along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Device>> getDeviceModuleWithResponseAsync(String deviceId, String moduleId) {
        final String accept = "application/json";
        return service.getDeviceModule(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                deviceId,
                moduleId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Gets the device module properties and latest deployment status for a device module connected to Device Update for
     * IoT Hub.
     *
     * @param deviceId Device identifier in Azure IoT Hub.
     * @param moduleId Device module identifier in Azure IoT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device module properties and latest deployment status for a device module connected to Device Update
     *     for IoT Hub on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Device> getDeviceModuleAsync(String deviceId, String moduleId) {
        return getDeviceModuleWithResponseAsync(deviceId, moduleId)
                .flatMap(
                        (Response<Device> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets the breakdown of how many devices are on their latest update, have new updates available, or are in progress
     * receiving new updates.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the breakdown of how many devices are on their latest update, have new updates available, or are in
     *     progress receiving new updates along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UpdateCompliance>> getUpdateComplianceWithResponseAsync() {
        final String accept = "application/json";
        return service.getUpdateCompliance(
                this.client.getEndpoint(), this.client.getInstanceId(), this.client.getApiVersion(), accept);
    }

    /**
     * Gets the breakdown of how many devices are on their latest update, have new updates available, or are in progress
     * receiving new updates.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the breakdown of how many devices are on their latest update, have new updates available, or are in
     *     progress receiving new updates on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UpdateCompliance> getUpdateComplianceAsync() {
        return getUpdateComplianceWithResponseAsync()
                .flatMap(
                        (Response<UpdateCompliance> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets a list of available group device tags for all devices connected to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available group device tags for all devices connected to Device Update for IoT Hub along with
     *     {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceTag>> listDeviceTagsSinglePageAsync() {
        final String accept = "application/json";
        return service.listDeviceTags(
                        this.client.getEndpoint(), this.client.getInstanceId(), this.client.getApiVersion(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of available group device tags for all devices connected to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available group device tags for all devices connected to Device Update for IoT Hub as paginated
     *     response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeviceTag> listDeviceTagsAsync() {
        return new PagedFlux<>(
                () -> listDeviceTagsSinglePageAsync(), nextLink -> listDeviceTagsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a count of how many devices have a device tag.
     *
     * @param tagName Tag name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a count of how many devices have a device tag along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeviceTag>> getDeviceTagWithResponseAsync(String tagName) {
        final String accept = "application/json";
        return service.getDeviceTag(
                this.client.getEndpoint(), this.client.getInstanceId(), tagName, this.client.getApiVersion(), accept);
    }

    /**
     * Gets a count of how many devices have a device tag.
     *
     * @param tagName Tag name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a count of how many devices have a device tag on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceTag> getDeviceTagAsync(String tagName) {
        return getDeviceTagWithResponseAsync(tagName)
                .flatMap(
                        (Response<DeviceTag> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets a list of all device groups.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device groups along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Group>> listGroupsSinglePageAsync() {
        final String accept = "application/json";
        return service.listGroups(
                        this.client.getEndpoint(), this.client.getInstanceId(), this.client.getApiVersion(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of all device groups.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Group> listGroupsAsync() {
        return new PagedFlux<>(() -> listGroupsSinglePageAsync(), nextLink -> listGroupsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the properties of a group.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a group along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Group>> getGroupWithResponseAsync(String groupId) {
        final String accept = "application/json";
        return service.getGroup(
                this.client.getEndpoint(), this.client.getInstanceId(), groupId, this.client.getApiVersion(), accept);
    }

    /**
     * Gets the properties of a group.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a group on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Group> getGroupAsync(String groupId) {
        return getGroupWithResponseAsync(groupId)
                .flatMap(
                        (Response<Group> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create or update a device group.
     *
     * @param groupId Group identity.
     * @param group The group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Group>> createOrUpdateGroupWithResponseAsync(String groupId, Group group) {
        final String accept = "application/json";
        return service.createOrUpdateGroup(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                this.client.getApiVersion(),
                group,
                accept);
    }

    /**
     * Create or update a device group.
     *
     * @param groupId Group identity.
     * @param group The group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Group> createOrUpdateGroupAsync(String groupId, Group group) {
        return createOrUpdateGroupWithResponseAsync(groupId, group)
                .flatMap(
                        (Response<Group> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes a device group.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteGroupWithResponseAsync(String groupId) {
        final String accept = "application/json";
        return service.deleteGroup(
                this.client.getEndpoint(), this.client.getInstanceId(), groupId, this.client.getApiVersion(), accept);
    }

    /**
     * Deletes a device group.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteGroupAsync(String groupId) {
        return deleteGroupWithResponseAsync(groupId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Get group update compliance information such as how many devices are on their latest update, how many need new
     * updates, and how many are in progress on receiving a new update.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group update compliance information such as how many devices are on their latest update, how many need
     *     new updates, and how many are in progress on receiving a new update along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UpdateCompliance>> getGroupUpdateComplianceWithResponseAsync(String groupId) {
        final String accept = "application/json";
        return service.getGroupUpdateCompliance(
                this.client.getEndpoint(), this.client.getInstanceId(), groupId, this.client.getApiVersion(), accept);
    }

    /**
     * Get group update compliance information such as how many devices are on their latest update, how many need new
     * updates, and how many are in progress on receiving a new update.
     *
     * @param groupId Group identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group update compliance information such as how many devices are on their latest update, how many need
     *     new updates, and how many are in progress on receiving a new update on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UpdateCompliance> getGroupUpdateComplianceAsync(String groupId) {
        return getGroupUpdateComplianceWithResponseAsync(groupId)
                .flatMap(
                        (Response<UpdateCompliance> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get the best available updates for a group and a count of how many devices need each update.
     *
     * @param groupId Group identity.
     * @param filter Restricts the set of bestUpdates returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the best available updates for a group and a count of how many devices need each update along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdatableDevices>> listBestUpdatesForGroupSinglePageAsync(String groupId, String filter) {
        final String accept = "application/json";
        return service.listBestUpdatesForGroup(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        groupId,
                        filter,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the best available updates for a group and a count of how many devices need each update.
     *
     * @param groupId Group identity.
     * @param filter Restricts the set of bestUpdates returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the best available updates for a group and a count of how many devices need each update as paginated
     *     response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UpdatableDevices> listBestUpdatesForGroupAsync(String groupId, String filter) {
        return new PagedFlux<>(
                () -> listBestUpdatesForGroupSinglePageAsync(groupId, filter),
                nextLink -> listBestUpdatesForGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of deployments for a group.
     *
     * @param groupId Group identity.
     * @param filter Restricts the set of deployments returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deployments for a group along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Deployment>> listDeploymentsForGroupSinglePageAsync(String groupId, String filter) {
        final String accept = "application/json";
        return service.listDeploymentsForGroup(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        groupId,
                        filter,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of deployments for a group.
     *
     * @param groupId Group identity.
     * @param filter Restricts the set of deployments returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deployments for a group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Deployment> listDeploymentsForGroupAsync(String groupId, String filter) {
        return new PagedFlux<>(
                () -> listDeploymentsForGroupSinglePageAsync(groupId, filter),
                nextLink -> listDeploymentsForGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the properties of a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a deployment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Deployment>> getDeploymentWithResponseAsync(String groupId, String deploymentId) {
        final String accept = "application/json";
        return service.getDeployment(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                deploymentId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Gets the properties of a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a deployment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Deployment> getDeploymentAsync(String groupId, String deploymentId) {
        return getDeploymentWithResponseAsync(groupId, deploymentId)
                .flatMap(
                        (Response<Deployment> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Creates or updates a deployment.
     *
     * @param deploymentId Deployment identifier.
     * @param groupId Group identity.
     * @param deployment The deployment properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Deployment>> createOrUpdateDeploymentWithResponseAsync(
            String deploymentId, String groupId, Deployment deployment) {
        final String accept = "application/json";
        return service.createOrUpdateDeployment(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                deploymentId,
                groupId,
                this.client.getApiVersion(),
                deployment,
                accept);
    }

    /**
     * Creates or updates a deployment.
     *
     * @param deploymentId Deployment identifier.
     * @param groupId Group identity.
     * @param deployment The deployment properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Deployment> createOrUpdateDeploymentAsync(String deploymentId, String groupId, Deployment deployment) {
        return createOrUpdateDeploymentWithResponseAsync(deploymentId, groupId, deployment)
                .flatMap(
                        (Response<Deployment> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDeploymentWithResponseAsync(String groupId, String deploymentId) {
        final String accept = "application/json";
        return service.deleteDeployment(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                deploymentId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Deletes a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDeploymentAsync(String groupId, String deploymentId) {
        return deleteDeploymentWithResponseAsync(groupId, deploymentId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Gets the status of a deployment including a breakdown of how many devices in the deployment are in progress,
     * completed, or failed.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a deployment including a breakdown of how many devices in the deployment are in progress,
     *     completed, or failed along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeploymentStatus>> getDeploymentStatusWithResponseAsync(String groupId, String deploymentId) {
        final String accept = "application/json";
        return service.getDeploymentStatus(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                deploymentId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Gets the status of a deployment including a breakdown of how many devices in the deployment are in progress,
     * completed, or failed.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a deployment including a breakdown of how many devices in the deployment are in progress,
     *     completed, or failed on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentStatus> getDeploymentStatusAsync(String groupId, String deploymentId) {
        return getDeploymentStatusWithResponseAsync(groupId, deploymentId)
                .flatMap(
                        (Response<DeploymentStatus> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets a list of devices in a deployment along with their state. Useful for getting a list of failed devices.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param filter Restricts the set of deployment device states returned. You can filter on deviceId and moduleId
     *     and/or deviceState.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices in a deployment along with their state along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentDeviceState>> listDeploymentDevicesSinglePageAsync(
            String groupId, String deploymentId, String filter) {
        final String accept = "application/json";
        return service.listDeploymentDevices(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        groupId,
                        deploymentId,
                        filter,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Gets a list of devices in a deployment along with their state. Useful for getting a list of failed devices.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param filter Restricts the set of deployment device states returned. You can filter on deviceId and moduleId
     *     and/or deviceState.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices in a deployment along with their state as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentDeviceState> listDeploymentDevicesAsync(
            String groupId, String deploymentId, String filter) {
        return new PagedFlux<>(
                () -> listDeploymentDevicesSinglePageAsync(groupId, deploymentId, filter),
                nextLink -> listDeploymentDevicesNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieve operation status.
     *
     * @param operationId Operation identifier.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceManagementsGetOperationResponse> getOperationWithResponseAsync(
            String operationId, AccessCondition accessCondition) {
        final String accept = "application/json";
        String ifNoneMatchInternal = null;
        if (accessCondition != null) {
            ifNoneMatchInternal = accessCondition.getIfNoneMatch();
        }
        String ifNoneMatch = ifNoneMatchInternal;
        return service.getOperation(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                operationId,
                this.client.getApiVersion(),
                ifNoneMatch,
                accept);
    }

    /**
     * Retrieve operation status.
     *
     * @param operationId Operation identifier.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceOperation> getOperationAsync(String operationId, AccessCondition accessCondition) {
        return getOperationWithResponseAsync(operationId, accessCondition)
                .flatMap(
                        (DeviceManagementsGetOperationResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a list of all device import operations. Completed operations are kept for 7 days before auto-deleted.
     *
     * @param filter Restricts the set of operations returned. Only one specific filter is supported: "status eq
     *     'NotStarted' or status eq 'Running'".
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device import operations along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceOperation>> listOperationsSinglePageAsync(String filter, Integer top) {
        final String accept = "application/json";
        return service.listOperations(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        filter,
                        top,
                        this.client.getApiVersion(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get a list of all device import operations. Completed operations are kept for 7 days before auto-deleted.
     *
     * @param filter Restricts the set of operations returned. Only one specific filter is supported: "status eq
     *     'NotStarted' or status eq 'Running'".
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device import operations as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeviceOperation> listOperationsAsync(String filter, Integer top) {
        return new PagedFlux<>(
                () -> listOperationsSinglePageAsync(filter, top),
                nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Start the device diagnostics log collection operation on specified devices.
     *
     * @param operationId Operation identifier.
     * @param logCollectionRequest The deployment properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostics request body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogCollectionOperation>> collectLogsWithResponseAsync(
            String operationId, LogCollectionOperation logCollectionRequest) {
        final String accept = "application/json";
        return service.collectLogs(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                operationId,
                this.client.getApiVersion(),
                logCollectionRequest,
                accept);
    }

    /**
     * Start the device diagnostics log collection operation on specified devices.
     *
     * @param operationId Operation identifier.
     * @param logCollectionRequest The deployment properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostics request body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogCollectionOperation> collectLogsAsync(
            String operationId, LogCollectionOperation logCollectionRequest) {
        return collectLogsWithResponseAsync(operationId, logCollectionRequest)
                .flatMap(
                        (Response<LogCollectionOperation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get the device diagnostics log collection operation.
     *
     * @param operationId Operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device diagnostics log collection operation along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogCollectionOperation>> getLogCollectionOperationWithResponseAsync(String operationId) {
        final String accept = "application/json";
        return service.getLogCollectionOperation(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                operationId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Get the device diagnostics log collection operation.
     *
     * @param operationId Operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device diagnostics log collection operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogCollectionOperation> getLogCollectionOperationAsync(String operationId) {
        return getLogCollectionOperationWithResponseAsync(operationId)
                .flatMap(
                        (Response<LogCollectionOperation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get all device diagnostics log collection operations.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all device diagnostics log collection operations along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LogCollectionOperation>> listLogCollectionOperationsSinglePageAsync() {
        final String accept = "application/json";
        return service.listLogCollectionOperations(
                        this.client.getEndpoint(), this.client.getInstanceId(), this.client.getApiVersion(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get all device diagnostics log collection operations.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all device diagnostics log collection operations as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogCollectionOperation> listLogCollectionOperationsAsync() {
        return new PagedFlux<>(
                () -> listLogCollectionOperationsSinglePageAsync(),
                nextLink -> listLogCollectionOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Get device diagnostics log collection operation with detailed status.
     *
     * @param operationId Operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device diagnostics log collection operation with detailed status along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogCollectionOperationDetailedStatus>>
            getLogCollectionOperationDetailedStatusWithResponseAsync(String operationId) {
        final String accept = "application/json";
        return service.getLogCollectionOperationDetailedStatus(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                operationId,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Get device diagnostics log collection operation with detailed status.
     *
     * @param operationId Operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device diagnostics log collection operation with detailed status on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogCollectionOperationDetailedStatus> getLogCollectionOperationDetailedStatusAsync(String operationId) {
        return getLogCollectionOperationDetailedStatusWithResponseAsync(operationId)
                .flatMap(
                        (Response<LogCollectionOperationDetailedStatus> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Stops a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param action Cancel deployment action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Deployment>> stopDeploymentWithResponseAsync(
            String groupId, String deploymentId, DeploymentCancelAction action) {
        final String accept = "application/json";
        return service.stopDeployment(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                deploymentId,
                action,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Stops a deployment.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param action Cancel deployment action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Deployment> stopDeploymentAsync(String groupId, String deploymentId, DeploymentCancelAction action) {
        return stopDeploymentWithResponseAsync(groupId, deploymentId, action)
                .flatMap(
                        (Response<Deployment> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retries a deployment with failed devices.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param action Retry deployment action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Deployment>> retryDeploymentWithResponseAsync(
            String groupId, String deploymentId, DeploymentRetryAction action) {
        final String accept = "application/json";
        return service.retryDeployment(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                groupId,
                deploymentId,
                action,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Retries a deployment with failed devices.
     *
     * @param groupId Group identity.
     * @param deploymentId Deployment identifier.
     * @param action Retry deployment action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Deployment> retryDeploymentAsync(String groupId, String deploymentId, DeploymentRetryAction action) {
        return retryDeploymentWithResponseAsync(groupId, deploymentId, action)
                .flatMap(
                        (Response<Deployment> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of device classes along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceClass>> listDeviceClassesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listDeviceClassesNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of update identities along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdateId>> listInstallableUpdatesForDeviceClassNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listInstallableUpdatesForDeviceClassNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of devices along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Device>> listDevicesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listDevicesNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of device tags along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceTag>> listDeviceTagsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listDeviceTagsNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of groups along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Group>> listGroupsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listGroupsNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of updatable devices along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdatableDevices>> listBestUpdatesForGroupNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listBestUpdatesForGroupNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of deployments along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Deployment>> listDeploymentsForGroupNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listDeploymentsForGroupNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of deployment device states along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentDeviceState>> listDeploymentDevicesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listDeploymentDevicesNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of device operations with server paging support along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeviceOperation>> listOperationsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listOperationsNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of diagnostics operations with server paging support along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LogCollectionOperation>> listLogCollectionOperationsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listLogCollectionOperationsNext(nextLink, this.client.getEndpoint(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
