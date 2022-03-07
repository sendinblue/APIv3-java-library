# CrmApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crmFilesIdDataGet**](CrmApi.md#crmFilesIdDataGet) | **GET** /crm/files/{id}/data | Get file details
[**crmFilesIdDelete**](CrmApi.md#crmFilesIdDelete) | **DELETE** /crm/files/{id} | Delete a file
[**crmFilesIdGet**](CrmApi.md#crmFilesIdGet) | **GET** /crm/files/{id} | Download a file
[**crmFilesPost**](CrmApi.md#crmFilesPost) | **POST** /crm/files | Upload a file
[**crmNotesIdDelete**](CrmApi.md#crmNotesIdDelete) | **DELETE** /crm/notes/{id} | Delete a note
[**crmNotesIdGet**](CrmApi.md#crmNotesIdGet) | **GET** /crm/notes/{id} | Get a note
[**crmNotesIdPatch**](CrmApi.md#crmNotesIdPatch) | **PATCH** /crm/notes/{id} | Update a note
[**crmNotesPost**](CrmApi.md#crmNotesPost) | **POST** /crm/notes | Create a note
[**crmTasksIdDelete**](CrmApi.md#crmTasksIdDelete) | **DELETE** /crm/tasks/{id} | Delete a task
[**crmTasksIdGet**](CrmApi.md#crmTasksIdGet) | **GET** /crm/tasks/{id} | Get a task
[**crmTasksIdPatch**](CrmApi.md#crmTasksIdPatch) | **PATCH** /crm/tasks/{id} | Update a task
[**crmTasksPost**](CrmApi.md#crmTasksPost) | **POST** /crm/tasks | Create a task
[**crmTasktypesGet**](CrmApi.md#crmTasktypesGet) | **GET** /crm/tasktypes | Get all task types


<a name="crmFilesIdDataGet"></a>
# **crmFilesIdDataGet**
> FileData crmFilesIdDataGet(id)

Get file details

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | File id to get file data.
try {
    FileData result = apiInstance.crmFilesIdDataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmFilesIdDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| File id to get file data. |

### Return type

[**FileData**](FileData.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmFilesIdDelete"></a>
# **crmFilesIdDelete**
> crmFilesIdDelete(id)

Delete a file

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | File id to delete.
try {
    apiInstance.crmFilesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmFilesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| File id to delete. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmFilesIdGet"></a>
# **crmFilesIdGet**
> crmFilesIdGet(id)

Download a file

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | File id to download.
try {
    apiInstance.crmFilesIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmFilesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| File id to download. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmFilesPost"></a>
# **crmFilesPost**
> FileData crmFilesPost(file, dealsIds)

Upload a file

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
File file = new File("/path/to/file.txt"); // File | File data to create a file.
List<String> dealsIds = Arrays.asList("dealsIds_example"); // List<String> | Deal ids linked to a file
try {
    FileData result = apiInstance.crmFilesPost(file, dealsIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmFilesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File data to create a file. |
 **dealsIds** | [**List&lt;String&gt;**](String.md)| Deal ids linked to a file | [optional]

### Return type

[**FileData**](FileData.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="crmNotesIdDelete"></a>
# **crmNotesIdDelete**
> crmNotesIdDelete(id)

Delete a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | Note ID to delete
try {
    apiInstance.crmNotesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmNotesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to delete |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesIdGet"></a>
# **crmNotesIdGet**
> Note crmNotesIdGet(id)

Get a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | Note ID to get
try {
    Note result = apiInstance.crmNotesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmNotesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to get |

### Return type

[**Note**](Note.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesIdPatch"></a>
# **crmNotesIdPatch**
> Note crmNotesIdPatch(id, body)

Update a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | Note ID to update
NoteData body = new NoteData(); // NoteData | Note data to update a note
try {
    Note result = apiInstance.crmNotesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmNotesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to update |
 **body** | [**NoteData**](NoteData.md)| Note data to update a note |

### Return type

[**Note**](Note.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesPost"></a>
# **crmNotesPost**
> Note crmNotesPost(body)

Create a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
NoteData body = new NoteData(); // NoteData | Note data to create a note.
try {
    Note result = apiInstance.crmNotesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmNotesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NoteData**](NoteData.md)| Note data to create a note. |

### Return type

[**Note**](Note.md)

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
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | 
try {
    apiInstance.crmTasksIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmTasksIdDelete");
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
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | 
try {
    Task result = apiInstance.crmTasksIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmTasksIdGet");
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
> Task crmTasksIdPatch(id, body)

Update a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
String id = "id_example"; // String | 
Body1 body = new Body1(); // Body1 | Updated task details.
try {
    Task result = apiInstance.crmTasksIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmTasksIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Body1**](Body1.md)| Updated task details. |

### Return type

[**Task**](Task.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmTasksPost"></a>
# **crmTasksPost**
> Task crmTasksPost(body)

Create a task

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
Body body = new Body(); // Body | Task name.
try {
    Task result = apiInstance.crmTasksPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmTasksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| Task name. |

### Return type

[**Task**](Task.md)

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
//import sibApi.CrmApi;

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

CrmApi apiInstance = new CrmApi();
try {
    TaskTypes result = apiInstance.crmTasktypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmTasktypesGet");
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

