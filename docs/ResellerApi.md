# ResellerApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCredits**](ResellerApi.md#addCredits) | **POST** /reseller/children/{childAuthKey}/credits/add | Add Email and/or SMS credits to a specific child account
[**associateIpToChild**](ResellerApi.md#associateIpToChild) | **POST** /reseller/children/{childAuthKey}/ips/associate | Associate a dedicated IP to the child
[**createResellerChild**](ResellerApi.md#createResellerChild) | **POST** /reseller/children | Creates a reseller child
[**deleteResellerChild**](ResellerApi.md#deleteResellerChild) | **DELETE** /reseller/children/{childAuthKey} | Deletes a single reseller child based on the childAuthKey supplied
[**dissociateIpFromChild**](ResellerApi.md#dissociateIpFromChild) | **POST** /reseller/children/{childAuthKey}/ips/dissociate | Dissociate a dedicated IP to the child
[**getChildInfo**](ResellerApi.md#getChildInfo) | **GET** /reseller/children/{childAuthKey} | Gets the info about a specific child account
[**getResellerChilds**](ResellerApi.md#getResellerChilds) | **GET** /reseller/children | Gets the list of all reseller&#39;s children accounts
[**removeCredits**](ResellerApi.md#removeCredits) | **POST** /reseller/children/{childAuthKey}/credits/remove | Remove Email and/or SMS credits from a specific child account
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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResellerChilds"></a>
# **getResellerChilds**
> GetChildrenList getResellerChilds()

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

ResellerApi apiInstance = new ResellerApi();
try {
    GetChildrenList result = apiInstance.getResellerChilds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerApi#getResellerChilds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetChildrenList**](GetChildrenList.md)

### Authorization

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

