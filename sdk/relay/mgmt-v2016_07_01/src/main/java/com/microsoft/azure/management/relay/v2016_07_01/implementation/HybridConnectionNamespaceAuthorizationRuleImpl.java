/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01.implementation;

import com.microsoft.azure.management.relay.v2016_07_01.HybridConnectionNamespaceAuthorizationRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.relay.v2016_07_01.AccessRights;

class HybridConnectionNamespaceAuthorizationRuleImpl extends CreatableUpdatableImpl<HybridConnectionNamespaceAuthorizationRule, AuthorizationRuleInner, HybridConnectionNamespaceAuthorizationRuleImpl> implements HybridConnectionNamespaceAuthorizationRule, HybridConnectionNamespaceAuthorizationRule.Definition, HybridConnectionNamespaceAuthorizationRule.Update {
    private final RelayManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String hybridConnectionName;
    private String authorizationRuleName;
    private List<AccessRights> crights;
    private List<AccessRights> urights;

    HybridConnectionNamespaceAuthorizationRuleImpl(String name, RelayManager manager) {
        super(name, new AuthorizationRuleInner());
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = name;
        //
    }

    HybridConnectionNamespaceAuthorizationRuleImpl(AuthorizationRuleInner inner, RelayManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.hybridConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "HybridConnections");
        this.authorizationRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "authorizationRules");
        //
    }

    @Override
    public RelayManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HybridConnectionNamespaceAuthorizationRule> createResourceAsync() {
        HybridConnectionsInner client = this.manager().inner().hybridConnections();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.hybridConnectionName, this.authorizationRuleName, this.crights)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HybridConnectionNamespaceAuthorizationRule> updateResourceAsync() {
        HybridConnectionsInner client = this.manager().inner().hybridConnections();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.hybridConnectionName, this.authorizationRuleName, this.urights)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AuthorizationRuleInner> getInnerAsync() {
        HybridConnectionsInner client = this.manager().inner().hybridConnections();
        return client.getAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.hybridConnectionName, this.authorizationRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<AccessRights> rights() {
        return this.inner().rights();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public HybridConnectionNamespaceAuthorizationRuleImpl withExistingHybridConnection(String resourceGroupName, String namespaceName, String hybridConnectionName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.hybridConnectionName = hybridConnectionName;
        return this;
    }

    @Override
    public HybridConnectionNamespaceAuthorizationRuleImpl withRights(List<AccessRights> rights) {
        if (isInCreateMode()) {
            this.crights = rights;
        } else {
            this.urights = rights;
        }
        return this;
    }

}
