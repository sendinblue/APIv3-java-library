
# GetInboundEmailEventsByUuid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receivedAt** | [**OffsetDateTime**] | Date when email was received on SMTP relay |  [optional]
**deliveredAt** | [**OffsetDateTime**] | Date when email was delivered successfully to client’s webhook |  [optional]
**recipient** | **String** | Recipient’s email address |  [optional]
**sender** | **String** | Sender’s email address |  [optional]
**messageId** | **String** | Value of the Message-ID header. This will be present only after the processing is done. |  [optional]
**subject** | **String** | Value of the Subject header. This will be present only after the processing is done.  |  [optional]
**attachments** | [**List&lt;GetInboundEmailEventsByUuidAttachments&gt;**](GetInboundEmailEventsByUuidAttachments.md) | List of attachments of the email. This will be present only after the processing is done. |  [optional]
**logs** | [**List&lt;GetInboundEmailEventsByUuidLogs&gt;**](GetInboundEmailEventsByUuidLogs.md) | List of events/logs that describe the lifecycle of the email on SIB platform |  [optional]



