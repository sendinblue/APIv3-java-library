# FilesApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crmFilesGet**](FilesApi.md#crmFilesGet) | **GET** /crm/files | Get all files
[**crmFilesIdDataGet**](FilesApi.md#crmFilesIdDataGet) | **GET** /crm/files/{id}/data | Get file details
[**crmFilesIdDelete**](FilesApi.md#crmFilesIdDelete) | **DELETE** /crm/files/{id} | Delete a file
[**crmFilesIdGet**](FilesApi.md#crmFilesIdGet) | **GET** /crm/files/{id} | Download a file
[**crmFilesPost**](FilesApi.md#crmFilesPost) | **POST** /crm/files | Upload a file


<a name="crmFilesGet"></a>
# **crmFilesGet**
> FileList crmFilesGet(entity, entityIds, dateFrom, dateTo, offset, limit, sort)

Get all files

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String entity = "entity_example"; // String | Filter by file entity type
String entityIds = "entityIds_example"; // String | Filter by file entity IDs
Integer dateFrom = 56; // Integer | dateFrom to date range filter type (timestamp in milliseconds)
Integer dateTo = 56; // Integer | dateTo to date range filter type (timestamp in milliseconds)
Long offset = 789L; // Long | Index of the first document of the page
Long limit = 50L; // Long | Number of documents per page
String sort = "sort_example"; // String | Sort the results in the ascending/descending order. Default order is **descending** by creation if `sort` is not passed
try {
    FileList result = apiInstance.crmFilesGet(entity, entityIds, dateFrom, dateTo, offset, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#crmFilesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| Filter by file entity type | [optional] [enum: companies, deals, contacts]
 **entityIds** | **String**| Filter by file entity IDs | [optional]
 **dateFrom** | **Integer**| dateFrom to date range filter type (timestamp in milliseconds) | [optional]
 **dateTo** | **Integer**| dateTo to date range filter type (timestamp in milliseconds) | [optional]
 **offset** | **Long**| Index of the first document of the page | [optional]
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **sort** | **String**| Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed | [optional] [enum: asc, desc]

### Return type

[**FileList**](FileList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import sibApi.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String id = "id_example"; // String | File id to get file data.
try {
    FileData result = apiInstance.crmFilesIdDataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#crmFilesIdDataGet");
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
//import sibApi.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String id = "id_example"; // String | File id to delete.
try {
    apiInstance.crmFilesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#crmFilesIdDelete");
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
> FileDownloadableLink crmFilesIdGet(id)

Download a file

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String id = "id_example"; // String | File id to download.
try {
    FileDownloadableLink result = apiInstance.crmFilesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#crmFilesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| File id to download. |

### Return type

[**FileDownloadableLink**](FileDownloadableLink.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmFilesPost"></a>
# **crmFilesPost**
> FileData crmFilesPost(file, dealId, contactId, companyId)

Upload a file

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FilesApi;

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

FilesApi apiInstance = new FilesApi();
File file = new File("/path/to/file.txt"); // File | File data to create a file.
String dealId = "dealId_example"; // String | Deal id linked to a file
Long contactId = 789L; // Long | Contact id linked to a file
String companyId = "companyId_example"; // String | Company id linked to a file
try {
    FileData result = apiInstance.crmFilesPost(file, dealId, contactId, companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#crmFilesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File data to create a file. |
 **dealId** | **String**| Deal id linked to a file | [optional]
 **contactId** | **Long**| Contact id linked to a file | [optional]
 **companyId** | **String**| Company id linked to a file | [optional]

### Return type

[**FileData**](FileData.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

