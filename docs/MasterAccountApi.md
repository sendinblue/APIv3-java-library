# MasterAccountApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corporateMasterAccountGet**](MasterAccountApi.md#corporateMasterAccountGet) | **GET** /corporate/masterAccount | Get the details of requested master account
[**corporateSubAccountGet**](MasterAccountApi.md#corporateSubAccountGet) | **GET** /corporate/subAccount | Get the list of all the sub-accounts of the master account.
[**corporateSubAccountIdDelete**](MasterAccountApi.md#corporateSubAccountIdDelete) | **DELETE** /corporate/subAccount/{id} | Delete a sub-account
[**corporateSubAccountIdGet**](MasterAccountApi.md#corporateSubAccountIdGet) | **GET** /corporate/subAccount/{id} | Get sub-account details
[**corporateSubAccountIdPlanPut**](MasterAccountApi.md#corporateSubAccountIdPlanPut) | **PUT** /corporate/subAccount/{id}/plan | Update sub-account plan
[**corporateSubAccountPost**](MasterAccountApi.md#corporateSubAccountPost) | **POST** /corporate/subAccount | Create a new sub-account under a master account.
[**corporateSubAccountSsoTokenPost**](MasterAccountApi.md#corporateSubAccountSsoTokenPost) | **POST** /corporate/subAccount/ssoToken | Generate SSO token to access Sendinblue


<a name="corporateMasterAccountGet"></a>
# **corporateMasterAccountGet**
> MasterDetailsResponse corporateMasterAccountGet()

Get the details of requested master account

This endpoint will provide the details of the master account.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
try {
    MasterDetailsResponse result = apiInstance.corporateMasterAccountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateMasterAccountGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MasterDetailsResponse**](MasterDetailsResponse.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountGet"></a>
# **corporateSubAccountGet**
> SubAccountsResponse corporateSubAccountGet(offset, limit)

Get the list of all the sub-accounts of the master account.

This endpoint will provide the list all the sub-accounts of the master account.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
Integer offset = 56; // Integer | Page number of sub-accounts listing
Integer limit = 56; // Integer | Number of sub-accounts to be displayed on each page
try {
    SubAccountsResponse result = apiInstance.corporateSubAccountGet(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Page number of sub-accounts listing |
 **limit** | **Integer**| Number of sub-accounts to be displayed on each page |

### Return type

[**SubAccountsResponse**](SubAccountsResponse.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountIdDelete"></a>
# **corporateSubAccountIdDelete**
> corporateSubAccountIdDelete(id)

Delete a sub-account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
Long id = 789L; // Long | Id of the sub-account organization to be deleted
try {
    apiInstance.corporateSubAccountIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id of the sub-account organization to be deleted |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountIdGet"></a>
# **corporateSubAccountIdGet**
> SubAccountDetailsResponse corporateSubAccountIdGet(id)

Get sub-account details

This endpoint will provide the details of specified sub-account organization

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
Long id = 789L; // Long | Id of the sub-account organization
try {
    SubAccountDetailsResponse result = apiInstance.corporateSubAccountIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id of the sub-account organization |

### Return type

[**SubAccountDetailsResponse**](SubAccountDetailsResponse.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountIdPlanPut"></a>
# **corporateSubAccountIdPlanPut**
> corporateSubAccountIdPlanPut(id, updatePlanDetails)

Update sub-account plan

This endpoint will update the sub-account plan

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
Long id = 789L; // Long | Id of the sub-account organization
SubAccountUpdatePlanRequest updatePlanDetails = new SubAccountUpdatePlanRequest(); // SubAccountUpdatePlanRequest | Values to update a sub-account plan
try {
    apiInstance.corporateSubAccountIdPlanPut(id, updatePlanDetails);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountIdPlanPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Id of the sub-account organization |
 **updatePlanDetails** | [**SubAccountUpdatePlanRequest**](SubAccountUpdatePlanRequest.md)| Values to update a sub-account plan |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountPost"></a>
# **corporateSubAccountPost**
> CreateModel corporateSubAccountPost(subAccountCreate)

Create a new sub-account under a master account.

This endpoint will create a new sub-account under a master account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
CreateSubAccount subAccountCreate = new CreateSubAccount(); // CreateSubAccount | values to create new sub-account
try {
    CreateModel result = apiInstance.corporateSubAccountPost(subAccountCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountCreate** | [**CreateSubAccount**](CreateSubAccount.md)| values to create new sub-account |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="corporateSubAccountSsoTokenPost"></a>
# **corporateSubAccountSsoTokenPost**
> GetSsoToken corporateSubAccountSsoTokenPost(ssoTokenRequest)

Generate SSO token to access Sendinblue

This endpoint generates an sso token to authenticate and access a sub-account of the master using the account endpoint https://app.sendinblue.com/account/login/sub-account/sso/[token], where [token] will be replaced with actual token.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.MasterAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

MasterAccountApi apiInstance = new MasterAccountApi();
SsoTokenRequest ssoTokenRequest = new SsoTokenRequest(); // SsoTokenRequest | Values to generate SSO token for sub-account
try {
    GetSsoToken result = apiInstance.corporateSubAccountSsoTokenPost(ssoTokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterAccountApi#corporateSubAccountSsoTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssoTokenRequest** | [**SsoTokenRequest**](SsoTokenRequest.md)| Values to generate SSO token for sub-account |

### Return type

[**GetSsoToken**](GetSsoToken.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

