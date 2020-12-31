# ListsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToList**](ListsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
[**createList**](ListsApi.md#createList) | **POST** /contacts/lists | Create a list
[**deleteList**](ListsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
[**getContactsFromList**](ListsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get contacts in a list
[**getFolderLists**](ListsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get lists in a folder
[**getList**](ListsApi.md#getList) | **GET** /contacts/lists/{listId} | Get a list&#39;s details
[**getLists**](ListsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
[**removeContactFromList**](ListsApi.md#removeContactFromList) | **POST** /contacts/lists/{listId}/contacts/remove | Delete a contact from a list
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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
AddContactToList contactEmails = new AddContactToList(); // AddContactToList | Emails addresses OR IDs of the contacts
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
 **contactEmails** | [**AddContactToList**](AddContactToList.md)| Emails addresses OR IDs of the contacts |

### Return type

[**PostContactInfo**](PostContactInfo.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactsFromList"></a>
# **getContactsFromList**
> GetContacts getContactsFromList(listId, modifiedSince, limit, offset, sort)

Get contacts in a list

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
OffsetDateTime modifiedSince = OffsetDateTime.now(); // OffsetDateTime | Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.
Long limit = 50L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetContacts result = apiInstance.getContactsFromList(listId, modifiedSince, limit, offset, sort);
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
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetContacts**](GetContacts.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFolderLists"></a>
# **getFolderLists**
> GetFolderLists getFolderLists(folderId, limit, offset, sort)

Get lists in a folder

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long folderId = 789L; // Long | Id of the folder
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetFolderLists result = apiInstance.getFolderLists(folderId, limit, offset, sort);
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
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetFolderLists**](GetFolderLists.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getList"></a>
# **getList**
> GetExtendedList getList(listId)

Get a list&#39;s details

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLists"></a>
# **getLists**
> GetLists getLists(limit, offset, sort)

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetLists result = apiInstance.getLists(limit, offset, sort);
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
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetLists**](GetLists.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeContactFromList"></a>
# **removeContactFromList**
> PostContactInfo removeContactFromList(listId, contactEmails)

Delete a contact from a list

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
Long listId = 789L; // Long | Id of the list
RemoveContactFromList contactEmails = new RemoveContactFromList(); // RemoveContactFromList | Emails addresses OR IDs of the contacts
try {
    PostContactInfo result = apiInstance.removeContactFromList(listId, contactEmails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#removeContactFromList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Long**| Id of the list |
 **contactEmails** | [**RemoveContactFromList**](RemoveContactFromList.md)| Emails addresses OR IDs of the contacts |

### Return type

[**PostContactInfo**](PostContactInfo.md)

### Authorization

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

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

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

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

[apiKey](../README.md#apiKey), [partnerKey](../README.md#partnerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

