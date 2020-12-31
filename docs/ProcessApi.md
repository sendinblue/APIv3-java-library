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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcesses"></a>
# **getProcesses**
> GetProcesses getProcesses(limit, offset, sort)

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

ProcessApi apiInstance = new ProcessApi();
Long limit = 10L; // Long | Number limitation for the result returned
Long offset = 0L; // Long | Beginning point in the list to retrieve from.
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetProcesses result = apiInstance.getProcesses(limit, offset, sort);
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
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetProcesses**](GetProcesses.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

