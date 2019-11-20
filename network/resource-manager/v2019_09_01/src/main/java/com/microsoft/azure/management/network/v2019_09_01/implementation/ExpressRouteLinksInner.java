/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteLinks.
 */
public class ExpressRouteLinksInner {
    /** The Retrofit service to perform REST calls. */
    private ExpressRouteLinksService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteLinksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteLinksInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ExpressRouteLinksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExpressRouteLinks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteLinksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_09_01.ExpressRouteLinks get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}/links/{linkName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("expressRoutePortName") String expressRoutePortName, @Path("linkName") String linkName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_09_01.ExpressRouteLinks list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ExpressRoutePorts/{expressRoutePortName}/links")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("expressRoutePortName") String expressRoutePortName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_09_01.ExpressRouteLinks listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteLinkInner object if successful.
     */
    public ExpressRouteLinkInner get(String resourceGroupName, String expressRoutePortName, String linkName) {
        return getWithServiceResponseAsync(resourceGroupName, expressRoutePortName, linkName).toBlocking().single().body();
    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRouteLinkInner> getAsync(String resourceGroupName, String expressRoutePortName, String linkName, final ServiceCallback<ExpressRouteLinkInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, expressRoutePortName, linkName), serviceCallback);
    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteLinkInner object
     */
    public Observable<ExpressRouteLinkInner> getAsync(String resourceGroupName, String expressRoutePortName, String linkName) {
        return getWithServiceResponseAsync(resourceGroupName, expressRoutePortName, linkName).map(new Func1<ServiceResponse<ExpressRouteLinkInner>, ExpressRouteLinkInner>() {
            @Override
            public ExpressRouteLinkInner call(ServiceResponse<ExpressRouteLinkInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteLinkInner object
     */
    public Observable<ServiceResponse<ExpressRouteLinkInner>> getWithServiceResponseAsync(String resourceGroupName, String expressRoutePortName, String linkName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRoutePortName == null) {
            throw new IllegalArgumentException("Parameter expressRoutePortName is required and cannot be null.");
        }
        if (linkName == null) {
            throw new IllegalArgumentException("Parameter linkName is required and cannot be null.");
        }
        final String apiVersion = "2019-09-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, expressRoutePortName, linkName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteLinkInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteLinkInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteLinkInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteLinkInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExpressRouteLinkInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExpressRouteLinkInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRouteLinkInner&gt; object if successful.
     */
    public PagedList<ExpressRouteLinkInner> list(final String resourceGroupName, final String expressRoutePortName) {
        ServiceResponse<Page<ExpressRouteLinkInner>> response = listSinglePageAsync(resourceGroupName, expressRoutePortName).toBlocking().single();
        return new PagedList<ExpressRouteLinkInner>(response.body()) {
            @Override
            public Page<ExpressRouteLinkInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpressRouteLinkInner>> listAsync(final String resourceGroupName, final String expressRoutePortName, final ListOperationCallback<ExpressRouteLinkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, expressRoutePortName),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteLinkInner&gt; object
     */
    public Observable<Page<ExpressRouteLinkInner>> listAsync(final String resourceGroupName, final String expressRoutePortName) {
        return listWithServiceResponseAsync(resourceGroupName, expressRoutePortName)
            .map(new Func1<ServiceResponse<Page<ExpressRouteLinkInner>>, Page<ExpressRouteLinkInner>>() {
                @Override
                public Page<ExpressRouteLinkInner> call(ServiceResponse<Page<ExpressRouteLinkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteLinkInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String expressRoutePortName) {
        return listSinglePageAsync(resourceGroupName, expressRoutePortName)
            .concatMap(new Func1<ServiceResponse<Page<ExpressRouteLinkInner>>, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(ServiceResponse<Page<ExpressRouteLinkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
    ServiceResponse<PageImpl<ExpressRouteLinkInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<ExpressRouteLinkInner>> * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpressRouteLinkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> listSinglePageAsync(final String resourceGroupName, final String expressRoutePortName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRoutePortName == null) {
            throw new IllegalArgumentException("Parameter expressRoutePortName is required and cannot be null.");
        }
        final String apiVersion = "2019-09-01";
        return service.list(this.client.subscriptionId(), resourceGroupName, expressRoutePortName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRouteLinkInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRouteLinkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRouteLinkInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpressRouteLinkInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRouteLinkInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRouteLinkInner&gt; object if successful.
     */
    public PagedList<ExpressRouteLinkInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ExpressRouteLinkInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ExpressRouteLinkInner>(response.body()) {
            @Override
            public Page<ExpressRouteLinkInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpressRouteLinkInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ExpressRouteLinkInner>> serviceFuture, final ListOperationCallback<ExpressRouteLinkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteLinkInner&gt; object
     */
    public Observable<Page<ExpressRouteLinkInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ExpressRouteLinkInner>>, Page<ExpressRouteLinkInner>>() {
                @Override
                public Page<ExpressRouteLinkInner> call(ServiceResponse<Page<ExpressRouteLinkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteLinkInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExpressRouteLinkInner>>, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(ServiceResponse<Page<ExpressRouteLinkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
    ServiceResponse<PageImpl<ExpressRouteLinkInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpressRouteLinkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRouteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteLinkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRouteLinkInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRouteLinkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRouteLinkInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpressRouteLinkInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRouteLinkInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
