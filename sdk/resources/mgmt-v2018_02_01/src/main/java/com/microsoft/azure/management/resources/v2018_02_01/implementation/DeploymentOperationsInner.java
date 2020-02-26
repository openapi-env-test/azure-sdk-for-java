/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

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
 * in DeploymentOperations.
 */
public class DeploymentOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private DeploymentOperationsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of DeploymentOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DeploymentOperationsInner(Retrofit retrofit, ResourceManagementClientImpl client) {
        this.service = retrofit.create(DeploymentOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DeploymentOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeploymentOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2018_02_01.DeploymentOperations get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2018_02_01.DeploymentOperations listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("$top") Integer top, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2018_02_01.DeploymentOperations listByResourceGroupNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceGroupNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeploymentOperationInner object if successful.
     */
    public DeploymentOperationInner get(String resourceGroupName, String deploymentName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId).toBlocking().single().body();
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeploymentOperationInner> getAsync(String resourceGroupName, String deploymentName, String operationId, final ServiceCallback<DeploymentOperationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId), serviceCallback);
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeploymentOperationInner object
     */
    public Observable<DeploymentOperationInner> getAsync(String resourceGroupName, String deploymentName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId).map(new Func1<ServiceResponse<DeploymentOperationInner>, DeploymentOperationInner>() {
            @Override
            public DeploymentOperationInner call(ServiceResponse<DeploymentOperationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeploymentOperationInner object
     */
    public Observable<ServiceResponse<DeploymentOperationInner>> getWithServiceResponseAsync(String resourceGroupName, String deploymentName, String operationId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.get(resourceGroupName, deploymentName, operationId, this.client.subscriptionId(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeploymentOperationInner>>>() {
                @Override
                public Observable<ServiceResponse<DeploymentOperationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeploymentOperationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeploymentOperationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DeploymentOperationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DeploymentOperationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> listByResourceGroup(final String resourceGroupName, final String deploymentName) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName, deploymentName)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName, final String deploymentName) {
        return listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupSinglePageAsync(final String resourceGroupName, final String deploymentName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final Integer top = null;
        return service.listByResourceGroup(resourceGroupName, deploymentName, this.client.subscriptionId(), top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> listByResourceGroup(final String resourceGroupName, final String deploymentName, final Integer top) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName, top).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName, final Integer top, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName, top),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName, deploymentName, top)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        return listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName, top)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param deploymentName The name of the deployment with the operation to get.
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param top The number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupSinglePageAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.listByResourceGroup(resourceGroupName, deploymentName, this.client.subscriptionId(), top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeploymentOperationInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeploymentOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeploymentOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> listByResourceGroupNext(final String nextPageLink) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<DeploymentOperationInner>> serviceFuture, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listByResourceGroupNextAsync(final String nextPageLink) {
        return listByResourceGroupNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listByResourceGroupNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listByResourceGroupNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeploymentOperationInner>> listByResourceGroupNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeploymentOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeploymentOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
