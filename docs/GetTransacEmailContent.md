
# GetTransacEmailContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email address to which transactional email has been sent | 
**subject** | **String** | Subject of the sent email | 
**templateId** | **Long** | Id of the template |  [optional]
**date** | [**OffsetDateTime**] | Date on which transactional email was sent | 
**events** | [**List&lt;GetTransacEmailContentEvents&gt;**](GetTransacEmailContentEvents.md) | Series of events which occurred on the transactional email | 
**body** | **String** | Actual content of the transactional email that has been sent | 
**attachmentCount** | **Long** | Count of the attachments that were sent in the email | 



