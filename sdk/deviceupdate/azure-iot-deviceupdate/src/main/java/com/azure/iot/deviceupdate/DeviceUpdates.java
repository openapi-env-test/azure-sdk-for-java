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
import com.azure.iot.deviceupdate.models.DeviceUpdatesDeleteUpdateResponse;
import com.azure.iot.deviceupdate.models.DeviceUpdatesGetOperationResponse;
import com.azure.iot.deviceupdate.models.DeviceUpdatesImportUpdateResponse;
import com.azure.iot.deviceupdate.models.ErrorResponseException;
import com.azure.iot.deviceupdate.models.ImportAction;
import com.azure.iot.deviceupdate.models.ImportUpdateInputItem;
import com.azure.iot.deviceupdate.models.StringsList;
import com.azure.iot.deviceupdate.models.Update;
import com.azure.iot.deviceupdate.models.UpdateFile;
import com.azure.iot.deviceupdate.models.UpdateList;
import com.azure.iot.deviceupdate.models.UpdateOperation;
import com.azure.iot.deviceupdate.models.UpdateOperationsList;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeviceUpdates. */
public final class DeviceUpdates {
    /** The proxy service used to perform REST calls. */
    private final DeviceUpdatesService service;

    /** The service client containing this operation class. */
    private final DeviceUpdateClient client;

    /**
     * Initializes an instance of DeviceUpdates.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeviceUpdates(DeviceUpdateClient client) {
        this.service =
                RestProxy.create(DeviceUpdatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DeviceUpdateClientDeviceUpdates to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "DeviceUpdateClientDe")
    private interface DeviceUpdatesService {
        @Post("/deviceupdate/{instanceId}/updates")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DeviceUpdatesImportUpdateResponse> importUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("action") ImportAction action,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<ImportUpdateInputItem> updateToImport,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateList>> listUpdates(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("$search") String search,
                @QueryParam("$filter") String filter,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers/{provider}/names/{name}/versions/{version}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Update>> getUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @PathParam("name") String name,
                @PathParam("version") String version,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Accept") String accept);

        @Delete("/deviceupdate/{instanceId}/updates/providers/{provider}/names/{name}/versions/{version}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DeviceUpdatesDeleteUpdateResponse> deleteUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @PathParam("name") String name,
                @PathParam("version") String version,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listProviders(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers/{provider}/names")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listNames(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers/{provider}/names/{name}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listVersions(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @PathParam("name") String name,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("$filter") String filter,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers/{provider}/names/{name}/versions/{version}/files")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listFiles(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @PathParam("name") String name,
                @PathParam("version") String version,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/providers/{provider}/names/{name}/versions/{version}/files/{fileId}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateFile>> getFile(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("provider") String provider,
                @PathParam("name") String name,
                @PathParam("version") String version,
                @PathParam("fileId") String fileId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateOperationsList>> listOperations(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @QueryParam("$filter") String filter,
                @QueryParam("$top") Integer top,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/deviceupdate/{instanceId}/updates/operations/{operationId}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DeviceUpdatesGetOperationResponse> getOperation(
                @HostParam("endpoint") String endpoint,
                @PathParam(value = "instanceId", encoded = true) String instanceId,
                @PathParam("operationId") String operationId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateList>> listUpdatesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listProvidersNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listNamesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listVersionsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<StringsList>> listFilesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<UpdateOperationsList>> listOperationsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Import new update version.
     *
     * @param action Import update action.
     * @param updateToImport The update to be imported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return update metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceUpdatesImportUpdateResponse> importUpdateWithResponseAsync(
            ImportAction action, List<ImportUpdateInputItem> updateToImport) {
        final String accept = "application/json";
        return service.importUpdate(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                action,
                this.client.getApiVersion(),
                updateToImport,
                accept);
    }

    /**
     * Import new update version.
     *
     * @param action Import update action.
     * @param updateToImport The update to be imported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return update metadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Update> importUpdateAsync(ImportAction action, List<ImportUpdateInputItem> updateToImport) {
        return importUpdateWithResponseAsync(action, updateToImport)
                .flatMap(
                        (DeviceUpdatesImportUpdateResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a list of all updates that have been imported to Device Update for IoT Hub.
     *
     * @param search Request updates matching a free-text search expression.
     * @param filter Filter updates by its properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all updates that have been imported to Device Update for IoT Hub along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Update>> listUpdatesSinglePageAsync(String search, String filter) {
        final String accept = "application/json";
        return service.listUpdates(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        this.client.getApiVersion(),
                        search,
                        filter,
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
     * Get a list of all updates that have been imported to Device Update for IoT Hub.
     *
     * @param search Request updates matching a free-text search expression.
     * @param filter Filter updates by its properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all updates that have been imported to Device Update for IoT Hub as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Update> listUpdatesAsync(String search, String filter) {
        return new PagedFlux<>(
                () -> listUpdatesSinglePageAsync(search, filter), nextLink -> listUpdatesNextSinglePageAsync(nextLink));
    }

    /**
     * Get a specific update version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific update version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Update>> getUpdateWithResponseAsync(
            String provider, String name, String version, AccessCondition accessCondition) {
        final String accept = "application/json";
        String ifNoneMatchInternal = null;
        if (accessCondition != null) {
            ifNoneMatchInternal = accessCondition.getIfNoneMatch();
        }
        String ifNoneMatch = ifNoneMatchInternal;
        return service.getUpdate(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                provider,
                name,
                version,
                this.client.getApiVersion(),
                ifNoneMatch,
                accept);
    }

    /**
     * Get a specific update version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific update version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Update> getUpdateAsync(String provider, String name, String version, AccessCondition accessCondition) {
        return getUpdateWithResponseAsync(provider, name, version, accessCondition)
                .flatMap(
                        (Response<Update> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Delete a specific update version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceUpdatesDeleteUpdateResponse> deleteUpdateWithResponseAsync(
            String provider, String name, String version) {
        final String accept = "application/json";
        return service.deleteUpdate(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                provider,
                name,
                version,
                this.client.getApiVersion(),
                accept);
    }

    /**
     * Delete a specific update version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteUpdateAsync(String provider, String name, String version) {
        return deleteUpdateWithResponseAsync(provider, name, version)
                .flatMap((DeviceUpdatesDeleteUpdateResponse res) -> Mono.empty());
    }

    /**
     * Get a list of all update providers that have been imported to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update providers that have been imported to Device Update for IoT Hub along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listProvidersSinglePageAsync() {
        final String accept = "application/json";
        return service.listProviders(
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
     * Get a list of all update providers that have been imported to Device Update for IoT Hub.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update providers that have been imported to Device Update for IoT Hub as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listProvidersAsync() {
        return new PagedFlux<>(
                () -> listProvidersSinglePageAsync(), nextLink -> listProvidersNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of all update names that match the specified provider.
     *
     * @param provider Update provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update names that match the specified provider along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listNamesSinglePageAsync(String provider) {
        final String accept = "application/json";
        return service.listNames(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        provider,
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
     * Get a list of all update names that match the specified provider.
     *
     * @param provider Update provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update names that match the specified provider as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listNamesAsync(String provider) {
        return new PagedFlux<>(
                () -> listNamesSinglePageAsync(provider), nextLink -> listNamesNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of all update versions that match the specified provider and name.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param filter Filter updates by its properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update versions that match the specified provider and name along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listVersionsSinglePageAsync(String provider, String name, String filter) {
        final String accept = "application/json";
        return service.listVersions(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        provider,
                        name,
                        this.client.getApiVersion(),
                        filter,
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
     * Get a list of all update versions that match the specified provider and name.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param filter Filter updates by its properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update versions that match the specified provider and name as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listVersionsAsync(String provider, String name, String filter) {
        return new PagedFlux<>(
                () -> listVersionsSinglePageAsync(provider, name, filter),
                nextLink -> listVersionsNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of all update file identifiers for the specified version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update file identifiers for the specified version along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listFilesSinglePageAsync(String provider, String name, String version) {
        final String accept = "application/json";
        return service.listFiles(
                        this.client.getEndpoint(),
                        this.client.getInstanceId(),
                        provider,
                        name,
                        version,
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
     * Get a list of all update file identifiers for the specified version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update file identifiers for the specified version as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listFilesAsync(String provider, String name, String version) {
        return new PagedFlux<>(
                () -> listFilesSinglePageAsync(provider, name, version),
                nextLink -> listFilesNextSinglePageAsync(nextLink));
    }

    /**
     * Get a specific update file from the version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param fileId File identifier.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific update file from the version along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UpdateFile>> getFileWithResponseAsync(
            String provider, String name, String version, String fileId, AccessCondition accessCondition) {
        final String accept = "application/json";
        String ifNoneMatchInternal = null;
        if (accessCondition != null) {
            ifNoneMatchInternal = accessCondition.getIfNoneMatch();
        }
        String ifNoneMatch = ifNoneMatchInternal;
        return service.getFile(
                this.client.getEndpoint(),
                this.client.getInstanceId(),
                provider,
                name,
                version,
                fileId,
                this.client.getApiVersion(),
                ifNoneMatch,
                accept);
    }

    /**
     * Get a specific update file from the version.
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param fileId File identifier.
     * @param accessCondition Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific update file from the version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UpdateFile> getFileAsync(
            String provider, String name, String version, String fileId, AccessCondition accessCondition) {
        return getFileWithResponseAsync(provider, name, version, fileId, accessCondition)
                .flatMap(
                        (Response<UpdateFile> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a list of all import update operations. Completed operations are kept for 7 days before auto-deleted. Delete
     * operations are not returned by this API version.
     *
     * @param filter Restricts the set of operations returned. Only one specific filter is supported: "status eq
     *     'NotStarted' or status eq 'Running'".
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all import update operations along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdateOperation>> listOperationsSinglePageAsync(String filter, Integer top) {
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
     * Get a list of all import update operations. Completed operations are kept for 7 days before auto-deleted. Delete
     * operations are not returned by this API version.
     *
     * @param filter Restricts the set of operations returned. Only one specific filter is supported: "status eq
     *     'NotStarted' or status eq 'Running'".
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all import update operations as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UpdateOperation> listOperationsAsync(String filter, Integer top) {
        return new PagedFlux<>(
                () -> listOperationsSinglePageAsync(filter, top),
                nextLink -> listOperationsNextSinglePageAsync(nextLink));
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
    public Mono<DeviceUpdatesGetOperationResponse> getOperationWithResponseAsync(
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
    public Mono<UpdateOperation> getOperationAsync(String operationId, AccessCondition accessCondition) {
        return getOperationWithResponseAsync(operationId, accessCondition)
                .flatMap(
                        (DeviceUpdatesGetOperationResponse res) -> {
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
     * @return the list of updates along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Update>> listUpdatesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listUpdatesNext(nextLink, this.client.getEndpoint(), accept)
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
     * @return the list of strings with server paging support along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listProvidersNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listProvidersNext(nextLink, this.client.getEndpoint(), accept)
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
     * @return the list of strings with server paging support along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listNamesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listNamesNext(nextLink, this.client.getEndpoint(), accept)
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
     * @return the list of strings with server paging support along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listVersionsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listVersionsNext(nextLink, this.client.getEndpoint(), accept)
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
     * @return the list of strings with server paging support along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listFilesNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listFilesNext(nextLink, this.client.getEndpoint(), accept)
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
     * @return the list of operations with server paging support along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UpdateOperation>> listOperationsNextSinglePageAsync(String nextLink) {
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
}
