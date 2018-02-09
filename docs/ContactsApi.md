# ContactsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToList**](ContactsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
[**createAttribute**](ContactsApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Creates contact attribute
[**createContact**](ContactsApi.md#createContact) | **POST** /contacts | Create a contact
[**createFolder**](ContactsApi.md#createFolder) | **POST** /contacts/folders | Create a folder
[**createList**](ContactsApi.md#createList) | **POST** /contacts/lists | Create a list
[**deleteAttribute**](ContactsApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Deletes an attribute
[**deleteFolder**](ContactsApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
[**deleteList**](ContactsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
[**getAttributes**](ContactsApi.md#getAttributes) | **GET** /contacts/attributes | Lists all attributes
[**getContactInfo**](ContactsApi.md#getContactInfo) | **GET** /contacts/{email} | Retrieves contact informations
[**getContactStats**](ContactsApi.md#getContactStats) | **GET** /contacts/{email}/campaignStats | Get the campaigns statistics for a contact
[**getContacts**](ContactsApi.md#getContacts) | **GET** /contacts | Get all the contacts
[**getContactsFromList**](ContactsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get the contacts in a list
[**getFolder**](ContactsApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns folder details
[**getFolderLists**](ContactsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
[**getFolders**](ContactsApi.md#getFolders) | **GET** /contacts/folders | Get all the folders
[**getList**](ContactsApi.md#getList) | **GET** /contacts/lists/{listId} | Get the details of a list
[**getLists**](ContactsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
[**importContacts**](ContactsApi.md#importContacts) | **POST** /contacts/import | Import contacts
[**removeContactToList**](ContactsApi.md#removeContactToList) | **POST** /contacts/lists/{listId}/contacts/remove | Remove existing contacts from a list
[**requestContactExport**](ContactsApi.md#requestContactExport) | **POST** /contacts/export | Export contacts
[**updateAttribute**](ContactsApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Updates contact attribute
[**updateContact**](ContactsApi.md#updateContact) | **PUT** /contacts/{email} | Updates a contact
[**updateFolder**](ContactsApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a contact folder
[**updateList**](ContactsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list


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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
AddRemoveContactToList contactEmails = new AddRemoveContactToList(); // AddRemoveContactToList | Emails addresses of the contacts
try {
    PostContactInfo result = apiInstance.addContactToList(listId, contactEmails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addContactToList");
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

<a name="createAttribute"></a>
# **createAttribute**
> createAttribute(attributeCategory, attributeName, createAttribute)

Creates contact attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the attribute
CreateAttribute createAttribute = new CreateAttribute(); // CreateAttribute | Values to create an attribute
try {
    apiInstance.createAttribute(attributeCategory, attributeName, createAttribute);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: normal, transactional, category, calculated, global]
 **attributeName** | **String**| Name of the attribute |
 **createAttribute** | [**CreateAttribute**](CreateAttribute.md)| Values to create an attribute |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContact"></a>
# **createContact**
> CreateModel createContact(createContact)

Create a contact

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
CreateContact createContact = new CreateContact(); // CreateContact | Values to create a contact
try {
    CreateModel result = apiInstance.createContact(createContact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContact** | [**CreateContact**](CreateContact.md)| Values to create a contact |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
CreateUpdateFolder createFolder = new CreateUpdateFolder(); // CreateUpdateFolder | Name of the folder
try {
    CreateModel result = apiInstance.createFolder(createFolder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createFolder");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
CreateList createList = new CreateList(); // CreateList | Values to create a list
try {
    CreateModel result = apiInstance.createList(createList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createList");
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

<a name="deleteAttribute"></a>
# **deleteAttribute**
> deleteAttribute(attributeCategory, attributeName)

Deletes an attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the existing attribute
try {
    apiInstance.deleteAttribute(attributeCategory, attributeName);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: normal, transactional, category, calculated, global]
 **attributeName** | **String**| Name of the existing attribute |

### Return type

null (empty response body)

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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long folderId = 789L; // Long | Id of the folder
try {
    apiInstance.deleteFolder(folderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteFolder");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
try {
    apiInstance.deleteList(listId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteList");
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

<a name="getAttributes"></a>
# **getAttributes**
> GetAttributes getAttributes()

Lists all attributes

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
try {
    GetAttributes result = apiInstance.getAttributes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getAttributes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAttributes**](GetAttributes.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactInfo"></a>
# **getContactInfo**
> GetExtendedContactDetails getContactInfo(email)

Retrieves contact informations

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String email = "email_example"; // String | Email (urlencoded) of the contact
try {
    GetExtendedContactDetails result = apiInstance.getContactInfo(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email (urlencoded) of the contact |

### Return type

[**GetExtendedContactDetails**](GetExtendedContactDetails.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactStats"></a>
# **getContactStats**
> GetContactCampaignStats getContactStats(email)

Get the campaigns statistics for a contact

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String email = "email_example"; // String | Email address (urlencoded) of the contact
try {
    GetContactCampaignStats result = apiInstance.getContactStats(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email address (urlencoded) of the contact |

### Return type

[**GetContactCampaignStats**](GetContactCampaignStats.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContacts"></a>
# **getContacts**
> GetContacts getContacts(limit, offset, modifiedSince)

Get all the contacts

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long limit = 50L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
OffsetDateTime modifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.
try {
    GetContacts result = apiInstance.getContacts(limit, offset, modifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document of the page | [optional] [default to 0]
 **modifiedSince** | **OffsetDateTime**| Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result. | [optional]

### Return type

[**GetContacts**](GetContacts.md)

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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
OffsetDateTime modifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter (urlencoded) the contacts modified after a given UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.
Long limit = 50L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetContacts result = apiInstance.getContactsFromList(listId, modifiedSince, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactsFromList");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long folderId = 789L; // Long | id of the folder
try {
    GetFolder result = apiInstance.getFolder(folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getFolder");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long folderId = 789L; // Long | Id of the folder
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetFolderLists result = apiInstance.getFolderLists(folderId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getFolderLists");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetFolders result = apiInstance.getFolders(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getFolders");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
try {
    GetExtendedList result = apiInstance.getList(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getList");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long limit = 10L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document of the page
try {
    GetLists result = apiInstance.getLists(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getLists");
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

<a name="importContacts"></a>
# **importContacts**
> CreatedProcessId importContacts(requestContactImport)

Import contacts

It returns the background process ID which on completion calls the notify URL that you have set in the input.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
RequestContactImport requestContactImport = new RequestContactImport(); // RequestContactImport | Values to import contacts in Sendinblue. To know more about the expected format, please have a look at ``https://help.sendinblue.com/hc/en-us/articles/209499265-Build-contacts-lists-for-your-email-marketing-campaigns``
try {
    CreatedProcessId result = apiInstance.importContacts(requestContactImport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#importContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestContactImport** | [**RequestContactImport**](RequestContactImport.md)| Values to import contacts in Sendinblue. To know more about the expected format, please have a look at &#x60;&#x60;https://help.sendinblue.com/hc/en-us/articles/209499265-Build-contacts-lists-for-your-email-marketing-campaigns&#x60;&#x60; |

### Return type

[**CreatedProcessId**](CreatedProcessId.md)

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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
AddRemoveContactToList contactEmails = new AddRemoveContactToList(); // AddRemoveContactToList | Emails adresses of the contact
try {
    PostContactInfo result = apiInstance.removeContactToList(listId, contactEmails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#removeContactToList");
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

<a name="requestContactExport"></a>
# **requestContactExport**
> CreatedProcessId requestContactExport(requestContactExport)

Export contacts

It returns the background process ID which on completion calls the notify URL that you have set in the input. File will be available in csv.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
RequestContactExport requestContactExport = new RequestContactExport(); // RequestContactExport | Values to request a contact export
try {
    CreatedProcessId result = apiInstance.requestContactExport(requestContactExport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#requestContactExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestContactExport** | [**RequestContactExport**](RequestContactExport.md)| Values to request a contact export |

### Return type

[**CreatedProcessId**](CreatedProcessId.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAttribute"></a>
# **updateAttribute**
> updateAttribute(attributeCategory, attributeName, updateAttribute)

Updates contact attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the existing attribute
UpdateAttribute updateAttribute = new UpdateAttribute(); // UpdateAttribute | Values to update an attribute
try {
    apiInstance.updateAttribute(attributeCategory, attributeName, updateAttribute);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: category, calculated, global]
 **attributeName** | **String**| Name of the existing attribute |
 **updateAttribute** | [**UpdateAttribute**](UpdateAttribute.md)| Values to update an attribute |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContact"></a>
# **updateContact**
> updateContact(email, updateContact)

Updates a contact

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String email = "email_example"; // String | Email (urlencoded) of the contact
UpdateContact updateContact = new UpdateContact(); // UpdateContact | Values to update a contact
try {
    apiInstance.updateContact(email, updateContact);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email (urlencoded) of the contact |
 **updateContact** | [**UpdateContact**](UpdateContact.md)| Values to update a contact |

### Return type

null (empty response body)

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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long folderId = 789L; // Long | Id of the folder
CreateUpdateFolder updateFolder = new CreateUpdateFolder(); // CreateUpdateFolder | Name of the folder
try {
    apiInstance.updateFolder(folderId, updateFolder);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateFolder");
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
//import sibApi.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
Long listId = 789L; // Long | Id of the list
UpdateList updateList = new UpdateList(); // UpdateList | Values to update a list
try {
    apiInstance.updateList(listId, updateList);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateList");
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

