/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.network.v2019_02_01.ErrorException;
import com.microsoft.azure.management.network.v2019_02_01.GetVpnSitesConfigurationRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;

/**
 * An instance of this class provides access to all the operations defined
 * in VpnSitesConfigurations.
 */
public class VpnSitesConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private VpnSitesConfigurationsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSitesConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSitesConfigurationsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VpnSitesConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnSitesConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpnSitesConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_02_01.VpnSitesConfigurations download" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnConfiguration")
        Observable<Response<ResponseBody>> download(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualWANName") String virtualWANName, @Body GetVpnSitesConfigurationRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_02_01.VpnSitesConfigurations beginDownload" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnConfiguration")
        Observable<Response<ResponseBody>> beginDownload(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualWANName") String virtualWANName, @Body GetVpnSitesConfigurationRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void download(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        downloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request).toBlocking().last().body();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> downloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(downloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request), serviceCallback);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> downloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        return downloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> downloadWithServiceResponseAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualWANName == null) {
            throw new IllegalArgumentException("Parameter virtualWANName is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        Validator.validate(request);
        final String apiVersion = "2019-02-01";
        Observable<Response<ResponseBody>> observable = service.download(this.client.subscriptionId(), resourceGroupName, virtualWANName, request, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new LongRunningOperationOptions().withFinalStateVia(LongRunningFinalState.LOCATION), new TypeToken<Void>() { }.getType());
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDownload(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        beginDownloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request).toBlocking().single().body();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDownloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDownloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request), serviceCallback);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDownloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        return beginDownloadWithServiceResponseAsync(resourceGroupName, virtualWANName, request).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDownloadWithServiceResponseAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualWANName == null) {
            throw new IllegalArgumentException("Parameter virtualWANName is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        Validator.validate(request);
        final String apiVersion = "2019-02-01";
        return service.beginDownload(this.client.subscriptionId(), resourceGroupName, virtualWANName, request, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDownloadDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDownloadDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
