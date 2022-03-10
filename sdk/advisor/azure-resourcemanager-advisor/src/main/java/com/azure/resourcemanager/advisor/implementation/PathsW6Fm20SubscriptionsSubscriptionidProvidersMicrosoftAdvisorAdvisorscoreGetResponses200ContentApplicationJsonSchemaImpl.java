// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.implementation;

import com.azure.resourcemanager.advisor.fluent.models.AdvisorScoreEntityInner;
import com.azure.resourcemanager.advisor.fluent.models.PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaInner;
import com.azure.resourcemanager.advisor.models.AdvisorScoreEntity;
import com.azure.resourcemanager.advisor.models.PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchema;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final
class PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaImpl
    implements PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchema {
    private
    PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaInner
        innerObject;

    private final com.azure.resourcemanager.advisor.AdvisorManager serviceManager;

    PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaImpl(
        PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaInner
            innerObject,
        com.azure.resourcemanager.advisor.AdvisorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public List<AdvisorScoreEntity> value() {
        List<AdvisorScoreEntityInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AdvisorScoreEntityImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public
    PathsW6Fm20SubscriptionsSubscriptionidProvidersMicrosoftAdvisorAdvisorscoreGetResponses200ContentApplicationJsonSchemaInner
        innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.advisor.AdvisorManager manager() {
        return this.serviceManager;
    }
}
