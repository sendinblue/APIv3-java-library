
# ConversationsMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Message ID. It can be used for further manipulations with the message. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | &#x60;&quot;agent&quot;&#x60; for agents’ messages, &#x60;&quot;visitor&quot;&#x60; for visitors’ messages. |  [optional]
**text** | **String** | Message text or name of the attached file |  [optional]
**visitorId** | **String** | visitor’s ID |  [optional]
**agentId** | **String** | ID of the agent on whose behalf the message was sent (only in messages sent by an agent). |  [optional]
**agentName** | **String** | Agent’s name as displayed to the visitor. Only in the messages sent by an agent. |  [optional]
**createdAt** | **Long** | Timestamp in milliseconds. |  [optional]
**isPushed** | **Boolean** | &#x60;true&#x60; for pushed messages |  [optional]
**receivedFrom** | **String** | In two-way integrations, messages sent via REST API can be marked with receivedFrom property and then filtered out when received in a webhook to avoid infinite loop. |  [optional]
**file** | [**ConversationsMessageFile**](ConversationsMessageFile.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AGENT | &quot;agent&quot;
VISITOR | &quot;visitor&quot;



