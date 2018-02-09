# ListsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToList**](ListsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
[**createList**](ListsApi.md#createList) | **POST** /contacts/lists | Create a list
[**deleteList**](ListsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
[**getContactsFromList**](ListsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get the contacts in a list
[**getFolderLists**](ListsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
[**getList**](ListsApi.md#getList) | **GET** /contacts/lists/{listId} | Get the details of a list
[**getLists**](ListsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
[**removeContactToList**](ListsApi.md#removeContactToList) | **POST** /contacts/lists/{listId}/contacts/remove | Remove existing contacts from a list
[**updateList**](ListsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list


<a name="addContactToList"></a>
# **addContactToList**
> PostContactInfo addContactToList(listId, contactEmails)

Add existing contacts to a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
AddRemoveContactToList contactEmails = new AddRemoveContactToList(); // AddRemoveContactToList | Emails addresses of the contacts
try {
    PostContactInfo result = apiInstance.addContactToList(listId, contactEmails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#addContactToList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |
 **contactEmails** | [**AddRemoveContactToList**](AddRemoveContactToList.md)| Emails addresses of the contacts |

### Return type

[**PostContactInfo**](PostContactInfo.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createList"></a>
# **createList**
> CreateModel createList(createList)

Create a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
CreateList createList = new CreateList(); // CreateList | Values to create a list
try {
    CreateModel result = apiInstance.createList(createList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#createList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createList** | [**CreateList**](CreateList.md)| Values to create a list |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteList"></a>
# **deleteList**
> deleteList(listId)

Delete a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
try {
    apiInstance.deleteList(listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#deleteList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactsFromList"></a>
# **getContactsFromList**
> GetContacts getContactsFromList(listId, modifiedSince, limit, offset)

Get the contacts in a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
OffsetDateTime modifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.
Long limit = 50L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetContacts result = apiInstance.getContactsFromList(listId, modifiedSince, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getContactsFromList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |
 **modifiedSince** | **OffsetDateTime**| Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result. | [optional]
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document of the page | [optional] [default to 0]

### Return type

[**GetContacts**](GetContacts.md)

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
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long folderId = 789L; // Long | Id of the folder
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetFolderLists result = apiInstance.getFolderLists(folderId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getFolderLists");
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

<a name="getList"></a>
# **getList**
> GetExtendedList getList(listId)

Get the details of a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
try {
    GetExtendedList result = apiInstance.getList(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |

### Return type

[**GetExtendedList**](GetExtendedList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLists"></a>
# **getLists**
> GetLists getLists(limit, offset)

Get all the lists

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetLists result = apiInstance.getLists(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents per page | [optional] [default to 10]
 **offset** | **Long**| Index of the first document of the page | [optional] [default to 0]

### Return type

[**GetLists**](GetLists.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeContactToList"></a>
# **removeContactToList**
> PostContactInfo removeContactToList(listId, contactEmails)

Remove existing contacts from a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
AddRemoveContactToList contactEmails = new AddRemoveContactToList(); // AddRemoveContactToList | Emails adresses of the contact
try {
    PostContactInfo result = apiInstance.removeContactToList(listId, contactEmails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#removeContactToList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |
 **contactEmails** | [**AddRemoveContactToList**](AddRemoveContactToList.md)| Emails adresses of the contact |

### Return type

[**PostContactInfo**](PostContactInfo.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateList"></a>
# **updateList**
> updateList(listId, updateList)

Update a list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
UpdateList updateList = new UpdateList(); // UpdateList | Values to update a list
try {
    apiInstance.updateList(listId, updateList);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#updateList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |
 **updateList** | [**UpdateList**](UpdateList.md)| Values to update a list |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

