# TasksApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crmTasksGet**](TasksApi.md#crmTasksGet) | **GET** /crm/tasks | Get all tasks
[**crmTasksIdDelete**](TasksApi.md#crmTasksIdDelete) | **DELETE** /crm/tasks/{id} | Delete a task
[**crmTasksIdGet**](TasksApi.md#crmTasksIdGet) | **GET** /crm/tasks/{id} | Get a task
[**crmTasksIdPatch**](TasksApi.md#crmTasksIdPatch) | **PATCH** /crm/tasks/{id} | Update a task
[**crmTasksPost**](TasksApi.md#crmTasksPost) | **POST** /crm/tasks | Create a task
[**crmTasktypesGet**](TasksApi.md#crmTasktypesGet) | **GET** /crm/tasktypes | Get all task types


<a name="crmTasksGet"></a>
# **crmTasksGet**
> TaskList crmTasksGet(filterType, filterStatus, filterDate, filterAssignTo, filterContacts, filterDeals, filterCompanies, dateFrom, dateTo, offset, limit, sort, sortBy)

Get all tasks

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String filterType = "filterType_example"; // String | Filter by task type (ID)
String filterStatus = "filterStatus_example"; // String | Filter by task status
String filterDate = "filterDate_example"; // String | Filter by date
String filterAssignTo = "filterAssignTo_example"; // String | Filter by assignTo id
String filterContacts = "filterContacts_example"; // String | Filter by contact ids
String filterDeals = "filterDeals_example"; // String | Filter by deals ids
String filterCompanies = "filterCompanies_example"; // String | Filter by companies ids
Integer dateFrom = 56; // Integer | dateFrom to date range filter type (timestamp in milliseconds)
Integer dateTo = 56; // Integer | dateTo to date range filter type (timestamp in milliseconds)
Long offset = 789L; // Long | Index of the first document of the page
Long limit = 50L; // Long | Number of documents per page
String sort = "sort_example"; // String | Sort the results in the ascending/descending order. Default order is **descending** by creation if `sort` is not passed
String sortBy = "sortBy_example"; // String | The field used to sort field names.
try {
    TaskList result = apiInstance.crmTasksGet(filterType, filterStatus, filterDate, filterAssignTo, filterContacts, filterDeals, filterCompanies, dateFrom, dateTo, offset, limit, sort, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterType** | **String**| Filter by task type (ID) | [optional]
 **filterStatus** | **String**| Filter by task status | [optional] [enum: done, undone]
 **filterDate** | **String**| Filter by date | [optional] [enum: overdue, today, tomorrow, week, range]
 **filterAssignTo** | **String**| Filter by assignTo id | [optional]
 **filterContacts** | **String**| Filter by contact ids | [optional]
 **filterDeals** | **String**| Filter by deals ids | [optional]
 **filterCompanies** | **String**| Filter by companies ids | [optional]
 **dateFrom** | **Integer**| dateFrom to date range filter type (timestamp in milliseconds) | [optional]
 **dateTo** | **Integer**| dateTo to date range filter type (timestamp in milliseconds) | [optional]
 **offset** | **Long**| Index of the first document of the page | [optional]
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **sort** | **String**| Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed | [optional] [enum: asc, desc]
 **sortBy** | **String**| The field used to sort field names. | [optional]

### Return type

[**TaskList**](TaskList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasksIdDelete"></a>
# **crmTasksIdDelete**
> crmTasksIdDelete(id)

Delete a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
try {
    apiInstance.crmTasksIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasksIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasksIdGet"></a>
# **crmTasksIdGet**
> Task crmTasksIdGet(id)

Get a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
try {
    Task result = apiInstance.crmTasksIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasksIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Task**](Task.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasksIdPatch"></a>
# **crmTasksIdPatch**
> crmTasksIdPatch(id, body)

Update a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
Body7 body = new Body7(); // Body7 | Updated task details.
try {
    apiInstance.crmTasksIdPatch(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasksIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Body7**](Body7.md)| Updated task details. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasksPost"></a>
# **crmTasksPost**
> InlineResponse2011 crmTasksPost(body)

Create a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
Body6 body = new Body6(); // Body6 | Task name.
try {
    InlineResponse2011 result = apiInstance.crmTasksPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body6**](Body6.md)| Task name. |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasktypesGet"></a>
# **crmTasktypesGet**
> TaskTypes crmTasktypesGet()

Get all task types

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TasksApi;

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

TasksApi apiInstance = new TasksApi();
try {
    TaskTypes result = apiInstance.crmTasktypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#crmTasktypesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TaskTypes**](TaskTypes.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

