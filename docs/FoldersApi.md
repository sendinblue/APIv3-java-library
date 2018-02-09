# FoldersApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFolder**](FoldersApi.md#createFolder) | **POST** /contacts/folders | Create a folder
[**deleteFolder**](FoldersApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
[**getFolder**](FoldersApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns folder details
[**getFolderLists**](FoldersApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
[**getFolders**](FoldersApi.md#getFolders) | **GET** /contacts/folders | Get all the folders
[**updateFolder**](FoldersApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a contact folder


<a name="createFolder"></a>
# **createFolder**
> CreateModel createFolder(createFolder)

Create a folder

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
CreateUpdateFolder createFolder = new CreateUpdateFolder(); // CreateUpdateFolder | Name of the folder
try {
    CreateModel result = apiInstance.createFolder(createFolder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#createFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFolder** | [**CreateUpdateFolder**](CreateUpdateFolder.md)| Name of the folder |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(folderId)

Delete a folder (and all its lists)

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
Long folderId = 789L; // Long | Id of the folder
try {
    apiInstance.deleteFolder(folderId);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#deleteFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | **Long**| Id of the folder |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFolder"></a>
# **getFolder**
> GetFolder getFolder(folderId)

Returns folder details

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
Long folderId = 789L; // Long | id of the folder
try {
    GetFolder result = apiInstance.getFolder(folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#getFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | **Long**| id of the folder |

### Return type

[**GetFolder**](GetFolder.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFolderLists"></a>
# **getFolderLists**
> GetFolderLists getFolderLists(folderId, limit, offset)

Get the lists in a folder

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
Long folderId = 789L; // Long | Id of the folder
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetFolderLists result = apiInstance.getFolderLists(folderId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#getFolderLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | **Long**| Id of the folder |
 **limit** | **Long**| Number of documents per page | [optional] [default to 10]
 **offset** | **Long**| Index of the first document of the page | [optional] [default to 0]

### Return type

[**GetFolderLists**](GetFolderLists.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFolders"></a>
# **getFolders**
> GetFolders getFolders(limit, offset)

Get all the folders

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetFolders result = apiInstance.getFolders(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#getFolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents per page | [default to 10]
 **offset** | **Long**| Index of the first document of the page | [default to 0]

### Return type

[**GetFolders**](GetFolders.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFolder"></a>
# **updateFolder**
> updateFolder(folderId, updateFolder)

Update a contact folder

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.FoldersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

FoldersApi apiInstance = new FoldersApi();
Long folderId = 789L; // Long | Id of the folder
CreateUpdateFolder updateFolder = new CreateUpdateFolder(); // CreateUpdateFolder | Name of the folder
try {
    apiInstance.updateFolder(folderId, updateFolder);
} catch (ApiException e) {
    System.err.println("Exception when calling FoldersApi#updateFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | **Long**| Id of the folder |
 **updateFolder** | [**CreateUpdateFolder**](CreateUpdateFolder.md)| Name of the folder |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

