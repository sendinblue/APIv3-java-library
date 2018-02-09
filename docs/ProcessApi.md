# ProcessApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcess**](ProcessApi.md#getProcess) | **GET** /processes/{processId} | Return the informations for a process
[**getProcesses**](ProcessApi.md#getProcesses) | **GET** /processes | Return all the processes for your account


<a name="getProcess"></a>
# **getProcess**
> GetProcess getProcess(processId)

Return the informations for a process

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
Long processId = 789L; // Long | Id of the process
try {
    GetProcess result = apiInstance.getProcess(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#getProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **Long**| Id of the process |

### Return type

[**GetProcess**](GetProcess.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcesses"></a>
# **getProcesses**
> GetProcesses getProcesses(limit, offset)

Return all the processes for your account

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
Long limit = 10L; // Long | Number limitation for the result returned
Long offset = 0L; // Long | Beginning point in the list to retrieve from.
try {
    GetProcesses result = apiInstance.getProcesses(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#getProcesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number limitation for the result returned | [optional] [default to 10]
 **offset** | **Long**| Beginning point in the list to retrieve from. | [optional] [default to 0]

### Return type

[**GetProcesses**](GetProcesses.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

