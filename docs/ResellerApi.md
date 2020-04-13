# ResellerApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCredits**](ResellerApi.md#addCredits) | **POST** /reseller/children/{childAuthKey}/credits/add | Add Email and/or SMS credits to a specific child account
[**associateIpToChild**](ResellerApi.md#associateIpToChild) | **POST** /reseller/children/{childAuthKey}/ips/associate | Associate a dedicated IP to the child
[**createChildDomain**](ResellerApi.md#createChildDomain) | **POST** /reseller/children/{childAuthKey}/domains | Creates a domain for a child account
[**createResellerChild**](ResellerApi.md#createResellerChild) | **POST** /reseller/children | Creates a reseller child
[**deleteChildDomain**](ResellerApi.md#deleteChildDomain) | **DELETE** /reseller/children/{childAuthKey}/domains/{domainName} | Deletes the sender domain of the reseller child based on the childAuthKey and domainName passed
[**deleteResellerChild**](ResellerApi.md#deleteResellerChild) | **DELETE** /reseller/children/{childAuthKey} | Deletes a single reseller child based on the childAuthKey supplied
[**dissociateIpFromChild**](ResellerApi.md#dissociateIpFromChild) | **POST** /reseller/children/{childAuthKey}/ips/dissociate | Dissociate a dedicated IP to the child
[**getChildAccountCreationStatus**](ResellerApi.md#getChildAccountCreationStatus) | **GET** /reseller/children/{childAuthKey}/accountCreationStatus | Returns the status of reseller&#39;s child account creation, whether it is successfully created (exists) or not based on the childAuthKey supplied
[**getChildDomains**](ResellerApi.md#getChildDomains) | **GET** /reseller/children/{childAuthKey}/domains | Gets all the sender domains of a specific child account
[**getChildInfo**](ResellerApi.md#getChildInfo) | **GET** /reseller/children/{childAuthKey} | Gets the info about a specific child account
[**getResellerChilds**](ResellerApi.md#getResellerChilds) | **GET** /reseller/children | Gets the list of all reseller&#39;s children accounts
[**getSsoToken**](ResellerApi.md#getSsoToken) | **GET** /reseller/children/{childAuthKey}/auth | Get session token to access Sendinblue (SSO)
[**removeCredits**](ResellerApi.md#removeCredits) | **POST** /reseller/children/{childAuthKey}/credits/remove | Remove Email and/or SMS credits from a specific child account
[**updateChildAccountStatus**](ResellerApi.md#updateChildAccountStatus) | **PUT** /reseller/children/{childAuthKey}/accountStatus | Updates infos of reseller&#39;s child account status based on the childAuthKey supplied
[**updateChildDomain**](ResellerApi.md#updateChildDomain) | **PUT** /reseller/children/{childAuthKey}/domains/{domainName} | Updates the sender domain of reseller&#39;s child based on the childAuthKey and domainName passed
[**updateResellerChild**](ResellerApi.md#updateResellerChild) | **PUT** /reseller/children/{childAuthKey} | Updates infos of reseller&#39;s child based on the childAuthKey supplied


<a name="addCredits"></a>
# **addCredits**
> RemainingCreditModel addCredits(childAuthKey, addCredits)

Add Email and/or SMS credits to a specific child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
AddCredits addCredits = new AddCredits(); // AddCredits | Values to post to add credit to a specific child account
try {
    RemainingCreditModel result = apiInstance.addCredits(childAuthKey, addCredits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#addCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **addCredits** | [**AddCredits**](AddCredits.md)| Values to post to add credit to a specific child account |

### Return type

[**RemainingCreditModel**](RemainingCreditModel.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="associateIpToChild"></a>
# **associateIpToChild**
> associateIpToChild(childAuthKey, ip)

Associate a dedicated IP to the child

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
ManageIp ip = new ManageIp(); // ManageIp | IP to associate
try {
    apiInstance.associateIpToChild(childAuthKey, ip);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#associateIpToChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **ip** | [**ManageIp**](ManageIp.md)| IP to associate |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChildDomain"></a>
# **createChildDomain**
> createChildDomain(childAuthKey, addChildDomain)

Creates a domain for a child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
AddChildDomain addChildDomain = new AddChildDomain(); // AddChildDomain | Sender domain to add for a specific child account. This will not be displayed to the parent account.
try {
    apiInstance.createChildDomain(childAuthKey, addChildDomain);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#createChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **addChildDomain** | [**AddChildDomain**](AddChildDomain.md)| Sender domain to add for a specific child account. This will not be displayed to the parent account. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createResellerChild"></a>
# **createResellerChild**
> CreateReseller createResellerChild(resellerChild)

Creates a reseller child

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
CreateChild resellerChild = new CreateChild(); // CreateChild | reseller child to add
try {
    CreateReseller result = apiInstance.createResellerChild(resellerChild);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#createResellerChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resellerChild** | [**CreateChild**](CreateChild.md)| reseller child to add | [optional]

### Return type

[**CreateReseller**](CreateReseller.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChildDomain"></a>
# **deleteChildDomain**
> deleteChildDomain(childAuthKey, domainName)

Deletes the sender domain of the reseller child based on the childAuthKey and domainName passed

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
String domainName = "domainName_example"; // String | Pass the existing domain that needs to be deleted
try {
    apiInstance.deleteChildDomain(childAuthKey, domainName);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#deleteChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **domainName** | **String**| Pass the existing domain that needs to be deleted |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResellerChild"></a>
# **deleteResellerChild**
> deleteResellerChild(childAuthKey)

Deletes a single reseller child based on the childAuthKey supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
try {
    apiInstance.deleteResellerChild(childAuthKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#deleteResellerChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dissociateIpFromChild"></a>
# **dissociateIpFromChild**
> dissociateIpFromChild(childAuthKey, ip)

Dissociate a dedicated IP to the child

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
ManageIp ip = new ManageIp(); // ManageIp | IP to dissociate
try {
    apiInstance.dissociateIpFromChild(childAuthKey, ip);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#dissociateIpFromChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **ip** | [**ManageIp**](ManageIp.md)| IP to dissociate |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildAccountCreationStatus"></a>
# **getChildAccountCreationStatus**
> GetChildAccountCreationStatus getChildAccountCreationStatus(childAuthKey)

Returns the status of reseller&#39;s child account creation, whether it is successfully created (exists) or not based on the childAuthKey supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
try {
    GetChildAccountCreationStatus result = apiInstance.getChildAccountCreationStatus(childAuthKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildAccountCreationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |

### Return type

[**GetChildAccountCreationStatus**](GetChildAccountCreationStatus.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildDomains"></a>
# **getChildDomains**
> GetChildDomains getChildDomains(childAuthKey)

Gets all the sender domains of a specific child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
api-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partner-key = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partner-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partner-key.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
try {
    GetChildDomains result = apiInstance.getChildDomains(childAuthKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |

### Return type

[**GetChildDomains**](GetChildDomains.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildInfo"></a>
# **getChildInfo**
> GetChildInfo getChildInfo(childAuthKey)

Gets the info about a specific child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
try {
    GetChildInfo result = apiInstance.getChildInfo(childAuthKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |

### Return type

[**GetChildInfo**](GetChildInfo.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResellerChilds"></a>
# **getResellerChilds**
> GetChildrenList getResellerChilds(limit, offset)

Gets the list of all reseller&#39;s children accounts

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
Long limit = 10L; // Long | Number of documents for child accounts information per page
Long offset = 0L; // Long | Index of the first document in the page
try {
    GetChildrenList result = apiInstance.getResellerChilds(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getResellerChilds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents for child accounts information per page | [optional] [default to 10]
 **offset** | **Long**| Index of the first document in the page | [optional] [default to 0]

### Return type

[**GetChildrenList**](GetChildrenList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSsoToken"></a>
# **getSsoToken**
> GetSsoToken getSsoToken(childAuthKey)

Get session token to access Sendinblue (SSO)

It returns a session [token] which will remain valid for a short period of time. A child account will be able to access a white-labeled section by using the following url pattern &#x3D;&gt; https:/email.mydomain.com/login/sso?token&#x3D;[token]

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
try {
    GetSsoToken result = apiInstance.getSsoToken(childAuthKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getSsoToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |

### Return type

[**GetSsoToken**](GetSsoToken.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeCredits"></a>
# **removeCredits**
> RemainingCreditModel removeCredits(childAuthKey, removeCredits)

Remove Email and/or SMS credits from a specific child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
RemoveCredits removeCredits = new RemoveCredits(); // RemoveCredits | Values to post to remove email or SMS credits from a specific child account
try {
    RemainingCreditModel result = apiInstance.removeCredits(childAuthKey, removeCredits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#removeCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **removeCredits** | [**RemoveCredits**](RemoveCredits.md)| Values to post to remove email or SMS credits from a specific child account |

### Return type

[**RemainingCreditModel**](RemainingCreditModel.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChildAccountStatus"></a>
# **updateChildAccountStatus**
> updateChildAccountStatus(childAuthKey, updateChildAccountStatus)

Updates infos of reseller&#39;s child account status based on the childAuthKey supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
UpdateChildAccountStatus updateChildAccountStatus = new UpdateChildAccountStatus(); // UpdateChildAccountStatus | values to update in child account status
try {
    apiInstance.updateChildAccountStatus(childAuthKey, updateChildAccountStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateChildAccountStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **updateChildAccountStatus** | [**UpdateChildAccountStatus**](UpdateChildAccountStatus.md)| values to update in child account status |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChildDomain"></a>
# **updateChildDomain**
> updateChildDomain(childAuthKey, domainName, updateChildDomain)

Updates the sender domain of reseller&#39;s child based on the childAuthKey and domainName passed

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
api-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partner-key = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partner-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partner-key.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
String domainName = "domainName_example"; // String | Pass the existing domain that needs to be updated
UpdateChildDomain updateChildDomain = new UpdateChildDomain(); // UpdateChildDomain | value to update for sender domain
try {
    apiInstance.updateChildDomain(childAuthKey, domainName, updateChildDomain);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **domainName** | **String**| Pass the existing domain that needs to be updated |
 **updateChildDomain** | [**UpdateChildDomain**](UpdateChildDomain.md)| value to update for sender domain |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResellerChild"></a>
# **updateResellerChild**
> updateResellerChild(childAuthKey, resellerChild)

Updates infos of reseller&#39;s child based on the childAuthKey supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childAuthKey = "childAuthKey_example"; // String | auth key of reseller's child
UpdateChild resellerChild = new UpdateChild(); // UpdateChild | values to update in child profile
try {
    apiInstance.updateResellerChild(childAuthKey, resellerChild);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateResellerChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAuthKey** | **String**| auth key of reseller&#39;s child |
 **resellerChild** | [**UpdateChild**](UpdateChild.md)| values to update in child profile |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

