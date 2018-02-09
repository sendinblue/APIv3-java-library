# SendersApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSender**](SendersApi.md#createSender) | **POST** /senders | Create a new sender
[**deleteSender**](SendersApi.md#deleteSender) | **DELETE** /senders/{senderId} | Delete a sender
[**getIps**](SendersApi.md#getIps) | **GET** /senders/ips | Return all the dedicated IPs for your account
[**getIpsFromSender**](SendersApi.md#getIpsFromSender) | **GET** /senders/{senderId}/ips | Return all the dedicated IPs for a sender
[**getSenders**](SendersApi.md#getSenders) | **GET** /senders | Get the list of all your senders
[**updateSender**](SendersApi.md#updateSender) | **PUT** /senders/{senderId} | Update a sender


<a name="createSender"></a>
# **createSender**
> CreateSenderModel createSender(sender)

Create a new sender

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
CreateSender sender = new CreateSender(); // CreateSender | sender's name
try {
    CreateSenderModel result = apiInstance.createSender(sender);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#createSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sender** | [**CreateSender**](CreateSender.md)| sender&#39;s name | [optional]

### Return type

[**CreateSenderModel**](CreateSenderModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSender"></a>
# **deleteSender**
> deleteSender(senderId)

Delete a sender

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
Long senderId = 789L; // Long | Id of the sender
try {
    apiInstance.deleteSender(senderId);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#deleteSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | **Long**| Id of the sender |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIps"></a>
# **getIps**
> GetIps getIps()

Return all the dedicated IPs for your account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
try {
    GetIps result = apiInstance.getIps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#getIps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetIps**](GetIps.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIpsFromSender"></a>
# **getIpsFromSender**
> GetIpsFromSender getIpsFromSender(senderId)

Return all the dedicated IPs for a sender

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
Long senderId = 789L; // Long | Id of the sender
try {
    GetIpsFromSender result = apiInstance.getIpsFromSender(senderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#getIpsFromSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | **Long**| Id of the sender |

### Return type

[**GetIpsFromSender**](GetIpsFromSender.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenders"></a>
# **getSenders**
> GetSendersList getSenders(ip, domain)

Get the list of all your senders

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
String ip = "ip_example"; // String | Filter your senders for a specific ip (available for dedicated IP usage only)
String domain = "domain_example"; // String | Filter your senders for a specific domain
try {
    GetSendersList result = apiInstance.getSenders(ip, domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#getSenders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| Filter your senders for a specific ip (available for dedicated IP usage only) | [optional]
 **domain** | **String**| Filter your senders for a specific domain | [optional]

### Return type

[**GetSendersList**](GetSendersList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSender"></a>
# **updateSender**
> updateSender(senderId, sender)

Update a sender

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
Long senderId = 789L; // Long | Id of the sender
UpdateSender sender = new UpdateSender(); // UpdateSender | sender's name
try {
    apiInstance.updateSender(senderId, sender);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#updateSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | **Long**| Id of the sender |
 **sender** | [**UpdateSender**](UpdateSender.md)| sender&#39;s name | [optional]

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

