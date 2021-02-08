// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteAuthSettingsInner;
import java.util.List;

/** An immutable client-side representation of SiteAuthSettings. */
public interface SiteAuthSettings {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the enabled property: &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled
     * for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the runtimeVersion property: The RuntimeVersion of the Authentication / Authorization feature in use for the
     * current app. The setting in this value can control the behavior of certain features in the Authentication /
     * Authorization module.
     *
     * @return the runtimeVersion value.
     */
    String runtimeVersion();

    /**
     * Gets the unauthenticatedClientAction property: The action to take when an unauthenticated client attempts to
     * access the app.
     *
     * @return the unauthenticatedClientAction value.
     */
    UnauthenticatedClientAction unauthenticatedClientAction();

    /**
     * Gets the tokenStoreEnabled property: &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security
     * tokens that are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the tokenStoreEnabled value.
     */
    Boolean tokenStoreEnabled();

    /**
     * Gets the allowedExternalRedirectUrls property: External URLs that can be redirected to as part of logging in or
     * logging out of the app. Note that the query string part of the URL is ignored. This is an advanced setting
     * typically only needed by Windows Store application backends. Note that URLs within the current domain are always
     * implicitly allowed.
     *
     * @return the allowedExternalRedirectUrls value.
     */
    List<String> allowedExternalRedirectUrls();

    /**
     * Gets the defaultProvider property: The default authentication provider to use when multiple providers are
     * configured. This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to "RedirectToLoginPage".
     *
     * @return the defaultProvider value.
     */
    BuiltInAuthenticationProvider defaultProvider();

    /**
     * Gets the tokenRefreshExtensionHours property: The number of hours after session token expiration that a session
     * token can be used to call the token refresh API. The default is 72 hours.
     *
     * @return the tokenRefreshExtensionHours value.
     */
    Double tokenRefreshExtensionHours();

    /**
     * Gets the clientId property: The Client ID of this relying party application, known as the client_id. This setting
     * is required for enabling OpenID Connection authentication with Azure Active Directory or other 3rd party OpenID
     * Connect providers. More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @return the clientId value.
     */
    String clientId();

    /**
     * Gets the clientSecret property: The Client Secret of this relying party application (in Azure Active Directory,
     * this is also referred to as the Key). This setting is optional. If no client secret is configured, the OpenID
     * Connect implicit auth flow is used to authenticate end users. Otherwise, the OpenID Connect Authorization Code
     * Flow is used to authenticate end users. More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * Gets the issuer property: The OpenID Connect Issuer URI that represents the entity which issues access tokens for
     * this application. When using Azure Active Directory, this value is the URI of the directory tenant, e.g.
     * https://sts.windows.net/{tenant-guid}/. This URI is a case-sensitive identifier for the token issuer. More
     * information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html.
     *
     * @return the issuer value.
     */
    String issuer();

    /**
     * Gets the allowedAudiences property: Allowed audience values to consider when validating JWTs issued by Azure
     * Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt; value is always considered an allowed audience,
     * regardless of this setting.
     *
     * @return the allowedAudiences value.
     */
    List<String> allowedAudiences();

    /**
     * Gets the additionalLoginParams property: Login parameters to send to the OpenID Connect authorization endpoint
     * when a user logs in. Each parameter must be in the form "key=value".
     *
     * @return the additionalLoginParams value.
     */
    List<String> additionalLoginParams();

    /**
     * Gets the googleClientId property: The OpenID Connect Client ID for the Google web application. This setting is
     * required for enabling Google Sign-In. Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleClientId value.
     */
    String googleClientId();

    /**
     * Gets the googleClientSecret property: The client secret associated with the Google web application. This setting
     * is required for enabling Google Sign-In. Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleClientSecret value.
     */
    String googleClientSecret();

    /**
     * Gets the googleOAuthScopes property: The OAuth 2.0 scopes that will be requested as part of Google Sign-In
     * authentication. This setting is optional. If not specified, "openid", "profile", and "email" are used as default
     * scopes. Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleOAuthScopes value.
     */
    List<String> googleOAuthScopes();

    /**
     * Gets the facebookAppId property: The App ID of the Facebook app used for login. This setting is required for
     * enabling Facebook Login. Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookAppId value.
     */
    String facebookAppId();

    /**
     * Gets the facebookAppSecret property: The App Secret of the Facebook app used for Facebook Login. This setting is
     * required for enabling Facebook Login. Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookAppSecret value.
     */
    String facebookAppSecret();

    /**
     * Gets the facebookOAuthScopes property: The OAuth 2.0 scopes that will be requested as part of Facebook Login
     * authentication. This setting is optional. Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookOAuthScopes value.
     */
    List<String> facebookOAuthScopes();

    /**
     * Gets the twitterConsumerKey property: The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In. Twitter Sign-In documentation:
     * https://dev.twitter.com/web/sign-in.
     *
     * @return the twitterConsumerKey value.
     */
    String twitterConsumerKey();

    /**
     * Gets the twitterConsumerSecret property: The OAuth 1.0a consumer secret of the Twitter application used for
     * sign-in. This setting is required for enabling Twitter Sign-In. Twitter Sign-In documentation:
     * https://dev.twitter.com/web/sign-in.
     *
     * @return the twitterConsumerSecret value.
     */
    String twitterConsumerSecret();

    /**
     * Gets the microsoftAccountClientId property: The OAuth 2.0 client ID that was created for the app used for
     * authentication. This setting is required for enabling Microsoft Account authentication. Microsoft Account OAuth
     * documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @return the microsoftAccountClientId value.
     */
    String microsoftAccountClientId();

    /**
     * Gets the microsoftAccountClientSecret property: The OAuth 2.0 client secret that was created for the app used for
     * authentication. This setting is required for enabling Microsoft Account authentication. Microsoft Account OAuth
     * documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @return the microsoftAccountClientSecret value.
     */
    String microsoftAccountClientSecret();

    /**
     * Gets the microsoftAccountOAuthScopes property: The OAuth 2.0 scopes that will be requested as part of Microsoft
     * Account authentication. This setting is optional. If not specified, "wl.basic" is used as the default scope.
     * Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx.
     *
     * @return the microsoftAccountOAuthScopes value.
     */
    List<String> microsoftAccountOAuthScopes();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteAuthSettingsInner object.
     *
     * @return the inner object.
     */
    SiteAuthSettingsInner innerModel();
}
