// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.fluent.RulesClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.RuleInner;
import com.azure.resourcemanager.servicebus.generated.models.Rule;
import com.azure.resourcemanager.servicebus.generated.models.Rules;

public final class RulesImpl implements Rules {
    private static final ClientLogger LOGGER = new ClientLogger(RulesImpl.class);

    private final RulesClient innerClient;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    public RulesImpl(
        RulesClient innerClient, com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Rule> listBySubscriptions(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        PagedIterable<RuleInner> inner =
            this.serviceClient().listBySubscriptions(resourceGroupName, namespaceName, topicName, subscriptionName);
        return Utils.mapPage(inner, inner1 -> new RuleImpl(inner1, this.manager()));
    }

    public PagedIterable<Rule> listBySubscriptions(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        Integer skip,
        Integer top,
        Context context) {
        PagedIterable<RuleInner> inner =
            this
                .serviceClient()
                .listBySubscriptions(resourceGroupName, namespaceName, topicName, subscriptionName, skip, top, context);
        return Utils.mapPage(inner, inner1 -> new RuleImpl(inner1, this.manager()));
    }

    public void delete(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        String ruleName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, context);
    }

    public Rule get(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName) {
        RuleInner inner =
            this.serviceClient().get(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName);
        if (inner != null) {
            return new RuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Rule> getWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        String ruleName,
        Context context) {
        Response<RuleInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Rule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String subscriptionName = Utils.getValueFromIdByName(id, "subscriptions");
        if (subscriptionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subscriptions'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, Context.NONE)
            .getValue();
    }

    public Response<Rule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String subscriptionName = Utils.getValueFromIdByName(id, "subscriptions");
        if (subscriptionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subscriptions'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String subscriptionName = Utils.getValueFromIdByName(id, "subscriptions");
        if (subscriptionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subscriptions'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        String subscriptionName = Utils.getValueFromIdByName(id, "subscriptions");
        if (subscriptionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subscriptions'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this
            .deleteWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, context);
    }

    private RulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }

    public RuleImpl define(String name) {
        return new RuleImpl(name, this.manager());
    }
}
