
# Body7

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of task |  [optional]
**duration** | **Integer** | Duration of task in milliseconds [1 minute &#x3D; 60000 ms] |  [optional]
**taskTypeId** | **String** | Id for type of task e.g Call / Email / Meeting etc. |  [optional]
**date** | [**OffsetDateTime**] | Task date/time |  [optional]
**notes** | **String** | Notes added to a task |  [optional]
**done** | **Boolean** | Task marked as done |  [optional]
**assignToId** | **String** | User id to whom task is assigned |  [optional]
**contactsIds** | **List&lt;Integer&gt;** | Contact ids for contacts linked to this task |  [optional]
**dealsIds** | **List&lt;String&gt;** | Deal ids for deals a task is linked to |  [optional]
**companiesIds** | **List&lt;String&gt;** | Companies ids for companies a task is linked to |  [optional]



