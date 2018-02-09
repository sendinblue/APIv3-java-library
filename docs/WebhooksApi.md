# WebhooksApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Create a webhook
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a webhook
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook details
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get all webhooks
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Update a webhook


<a name="createWebhook"></a>
# **createWebhook**
> CreateModel createWebhook(createWebhook)

Create a webhook

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
CreateWebhook createWebhook = new CreateWebhook(); // CreateWebhook | Values to create a webhook
try {
    CreateModel result = apiInstance.createWebhook(createWebhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebhook** | [**CreateWebhook**](CreateWebhook.md)| Values to create a webhook |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId)

Delete a webhook

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Id of the webhook
try {
    apiInstance.deleteWebhook(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Id of the webhook |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> GetWebhook getWebhook(webhookId)

Get a webhook details

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Id of the webhook
try {
    GetWebhook result = apiInstance.getWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Id of the webhook |

### Return type

[**GetWebhook**](GetWebhook.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> GetWebhooks getWebhooks(type)

Get all webhooks

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String type = "transactional"; // String | Filter on webhook type
try {
    GetWebhooks result = apiInstance.getWebhooks(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Filter on webhook type | [optional] [default to transactional] [enum: marketing, transactional]

### Return type

[**GetWebhooks**](GetWebhooks.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> updateWebhook(webhookId, updateWebhook)

Update a webhook

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Id of the webhook
UpdateWebhook updateWebhook = new UpdateWebhook(); // UpdateWebhook | Values to update a webhook
try {
    apiInstance.updateWebhook(webhookId, updateWebhook);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Id of the webhook |
 **updateWebhook** | [**UpdateWebhook**](UpdateWebhook.md)| Values to update a webhook |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

