
# SendEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailTo** | **List&lt;String&gt;** | Email addresses of the recipients | 
**emailBcc** | **List&lt;String&gt;** | Email addresses of the recipients in bcc |  [optional]
**emailCc** | **List&lt;String&gt;** | Email addresses of the recipients in cc |  [optional]
**replyTo** | **String** | Email on which campaign recipients will be able to reply to |  [optional]
**attachmentUrl** | **String** | Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps |  [optional]
**attachment** | [**List&lt;SendEmailAttachment&gt;**](SendEmailAttachment.md) | Pass the base64 content of the attachment. Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]



