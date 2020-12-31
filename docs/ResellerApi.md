# ResellerApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCredits**](ResellerApi.md#addCredits) | **POST** /reseller/children/{childIdentifier}/credits/add | Add Email and/or SMS credits to a specific child account
[**associateIpToChild**](ResellerApi.md#associateIpToChild) | **POST** /reseller/children/{childIdentifier}/ips/associate | Associate a dedicated IP to the child
[**createChildDomain**](ResellerApi.md#createChildDomain) | **POST** /reseller/children/{childIdentifier}/domains | Create a domain for a child account
[**createResellerChild**](ResellerApi.md#createResellerChild) | **POST** /reseller/children | Creates a reseller child
[**deleteChildDomain**](ResellerApi.md#deleteChildDomain) | **DELETE** /reseller/children/{childIdentifier}/domains/{domainName} | Delete the sender domain of the reseller child based on the childIdentifier and domainName passed
[**deleteResellerChild**](ResellerApi.md#deleteResellerChild) | **DELETE** /reseller/children/{childIdentifier} | Delete a single reseller child based on the child identifier supplied
[**dissociateIpFromChild**](ResellerApi.md#dissociateIpFromChild) | **POST** /reseller/children/{childIdentifier}/ips/dissociate | Dissociate a dedicated IP to the child
[**getChildAccountCreationStatus**](ResellerApi.md#getChildAccountCreationStatus) | **GET** /reseller/children/{childIdentifier}/accountCreationStatus | Get the status of a reseller&#39;s child account creation, whether it is successfully created (exists) or not based on the identifier supplied
[**getChildDomains**](ResellerApi.md#getChildDomains) | **GET** /reseller/children/{childIdentifier}/domains | Get all sender domains for a specific child account
[**getChildInfo**](ResellerApi.md#getChildInfo) | **GET** /reseller/children/{childIdentifier} | Get a child account&#39;s details
[**getResellerChilds**](ResellerApi.md#getResellerChilds) | **GET** /reseller/children | Get the list of all children accounts
[**getSsoToken**](ResellerApi.md#getSsoToken) | **GET** /reseller/children/{childIdentifier}/auth | Get session token to access Sendinblue (SSO)
[**removeCredits**](ResellerApi.md#removeCredits) | **POST** /reseller/children/{childIdentifier}/credits/remove | Remove Email and/or SMS credits from a specific child account
[**updateChildAccountStatus**](ResellerApi.md#updateChildAccountStatus) | **PUT** /reseller/children/{childIdentifier}/accountStatus | Update info of reseller&#39;s child account status based on the childIdentifier supplied
[**updateChildDomain**](ResellerApi.md#updateChildDomain) | **PUT** /reseller/children/{childIdentifier}/domains/{domainName} | Update the sender domain of reseller&#39;s child based on the childIdentifier and domainName passed
[**updateResellerChild**](ResellerApi.md#updateResellerChild) | **PUT** /reseller/children/{childIdentifier} | Update info of reseller&#39;s child based on the child identifier supplied


<a name="addCredits"></a>
# **addCredits**
> RemainingCreditModel addCredits(childIdentifier, addCredits)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
AddCredits addCredits = new AddCredits(); // AddCredits | Values to post to add credit to a specific child account
try {
    RemainingCreditModel result = apiInstance.addCredits(childIdentifier, addCredits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#addCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **addCredits** | [**AddCredits**](AddCredits.md)| Values to post to add credit to a specific child account |

### Return type

[**RemainingCreditModel**](RemainingCreditModel.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="associateIpToChild"></a>
# **associateIpToChild**
> associateIpToChild(childIdentifier, ip)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
ManageIp ip = new ManageIp(); // ManageIp | IP to associate
try {
    apiInstance.associateIpToChild(childIdentifier, ip);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#associateIpToChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **ip** | [**ManageIp**](ManageIp.md)| IP to associate |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChildDomain"></a>
# **createChildDomain**
> createChildDomain(childIdentifier, addChildDomain)

Create a domain for a child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
AddChildDomain addChildDomain = new AddChildDomain(); // AddChildDomain | Sender domain to add for a specific child account. This will not be displayed to the parent account.
try {
    apiInstance.createChildDomain(childIdentifier, addChildDomain);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#createChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **addChildDomain** | [**AddChildDomain**](AddChildDomain.md)| Sender domain to add for a specific child account. This will not be displayed to the parent account. |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChildDomain"></a>
# **deleteChildDomain**
> deleteChildDomain(childIdentifier, domainName)

Delete the sender domain of the reseller child based on the childIdentifier and domainName passed

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
String domainName = "domainName_example"; // String | Pass the existing domain that needs to be deleted
try {
    apiInstance.deleteChildDomain(childIdentifier, domainName);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#deleteChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **domainName** | **String**| Pass the existing domain that needs to be deleted |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResellerChild"></a>
# **deleteResellerChild**
> deleteResellerChild(childIdentifier)

Delete a single reseller child based on the child identifier supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or child id of reseller's child
try {
    apiInstance.deleteResellerChild(childIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#deleteResellerChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or child id of reseller&#39;s child |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dissociateIpFromChild"></a>
# **dissociateIpFromChild**
> dissociateIpFromChild(childIdentifier, ip)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
ManageIp ip = new ManageIp(); // ManageIp | IP to dissociate
try {
    apiInstance.dissociateIpFromChild(childIdentifier, ip);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#dissociateIpFromChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **ip** | [**ManageIp**](ManageIp.md)| IP to dissociate |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildAccountCreationStatus"></a>
# **getChildAccountCreationStatus**
> GetChildAccountCreationStatus getChildAccountCreationStatus(childIdentifier)

Get the status of a reseller&#39;s child account creation, whether it is successfully created (exists) or not based on the identifier supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
try {
    GetChildAccountCreationStatus result = apiInstance.getChildAccountCreationStatus(childIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildAccountCreationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |

### Return type

[**GetChildAccountCreationStatus**](GetChildAccountCreationStatus.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildDomains"></a>
# **getChildDomains**
> GetChildDomains getChildDomains(childIdentifier)

Get all sender domains for a specific child account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
try {
    GetChildDomains result = apiInstance.getChildDomains(childIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |

### Return type

[**GetChildDomains**](GetChildDomains.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildInfo"></a>
# **getChildInfo**
> GetChildInfo getChildInfo(childIdentifier)

Get a child account&#39;s details

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
try {
    GetChildInfo result = apiInstance.getChildInfo(childIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getChildInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |

### Return type

[**GetChildInfo**](GetChildInfo.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResellerChilds"></a>
# **getResellerChilds**
> GetChildrenList getResellerChilds(limit, offset)

Get the list of all children accounts

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSsoToken"></a>
# **getSsoToken**
> GetSsoToken getSsoToken(childIdentifier)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
try {
    GetSsoToken result = apiInstance.getSsoToken(childIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getSsoToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |

### Return type

[**GetSsoToken**](GetSsoToken.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeCredits"></a>
# **removeCredits**
> RemainingCreditModel removeCredits(childIdentifier, removeCredits)

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

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
RemoveCredits removeCredits = new RemoveCredits(); // RemoveCredits | Values to post to remove email or SMS credits from a specific child account
try {
    RemainingCreditModel result = apiInstance.removeCredits(childIdentifier, removeCredits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#removeCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **removeCredits** | [**RemoveCredits**](RemoveCredits.md)| Values to post to remove email or SMS credits from a specific child account |

### Return type

[**RemainingCreditModel**](RemainingCreditModel.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChildAccountStatus"></a>
# **updateChildAccountStatus**
> updateChildAccountStatus(childIdentifier, updateChildAccountStatus)

Update info of reseller&#39;s child account status based on the childIdentifier supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
UpdateChildAccountStatus updateChildAccountStatus = new UpdateChildAccountStatus(); // UpdateChildAccountStatus | values to update in child account status
try {
    apiInstance.updateChildAccountStatus(childIdentifier, updateChildAccountStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateChildAccountStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **updateChildAccountStatus** | [**UpdateChildAccountStatus**](UpdateChildAccountStatus.md)| values to update in child account status |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChildDomain"></a>
# **updateChildDomain**
> updateChildDomain(childIdentifier, domainName, updateChildDomain)

Update the sender domain of reseller&#39;s child based on the childIdentifier and domainName passed

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
String domainName = "domainName_example"; // String | Pass the existing domain that needs to be updated
UpdateChildDomain updateChildDomain = new UpdateChildDomain(); // UpdateChildDomain | value to update for sender domain
try {
    apiInstance.updateChildDomain(childIdentifier, domainName, updateChildDomain);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateChildDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **domainName** | **String**| Pass the existing domain that needs to be updated |
 **updateChildDomain** | [**UpdateChildDomain**](UpdateChildDomain.md)| value to update for sender domain |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResellerChild"></a>
# **updateResellerChild**
> updateResellerChild(childIdentifier, resellerChild)

Update info of reseller&#39;s child based on the child identifier supplied

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ResellerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partnerKey
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partnerKey");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ResellerApi apiInstance = new ResellerApi();
String childIdentifier = "childIdentifier_example"; // String | Either auth key or id of reseller's child
UpdateChild resellerChild = new UpdateChild(); // UpdateChild | values to update in child profile
try {
    apiInstance.updateResellerChild(childIdentifier, resellerChild);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#updateResellerChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childIdentifier** | **String**| Either auth key or id of reseller&#39;s child |
 **resellerChild** | [**UpdateChild**](UpdateChild.md)| values to update in child profile |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

