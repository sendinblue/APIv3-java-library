
# Task

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstContact** | [**Contact**](Contact.md) |  |  [optional]
**id** | **String** | Unique task id |  [optional]
**taskTypeId** | **String** | Id for type of task e.g Call / Email / Meeting etc. | 
**name** | **String** | Name of task | 
**contactsIds** | **List&lt;Integer&gt;** | Contact ids for contacts linked to this task |  [optional]
**contacts** | [**List&lt;Contact&gt;**](Contact.md) | Contact details for contacts linked to this task |  [optional]
**dealsIds** | **List&lt;String&gt;** | Deal ids for deals a task is linked to |  [optional]
**companiesIds** | **List&lt;String&gt;** | Companies ids for companies a task is linked to |  [optional]
**assignToId** | **String** | User id to whom task is assigned |  [optional]
**date** | [**OffsetDateTime**] | Task date/time | 
**duration** | **Integer** | Duration of task |  [optional]
**notes** | **String** | Notes added to a task |  [optional]
**done** | **Boolean** | Task marked as done |  [optional]
**reminder** | [**TaskReminder**](TaskReminder.md) | Task reminder date/time for a task |  [optional]
**createdAt** | [**OffsetDateTime**] | Task created date/time |  [optional]
**updatedAt** | [**OffsetDateTime**] | Task update date/time |  [optional]
**refs** | **Object** |  |  [optional]



