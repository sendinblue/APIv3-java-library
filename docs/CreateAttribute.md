
# CreateAttribute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Value of the attribute. Use only if the attribute&#39;s category is &#39;calculated&#39; or &#39;global&#39; |  [optional]
**enumeration** | [**List&lt;CreateAttributeEnumeration&gt;**](CreateAttributeEnumeration.md) | List of values and labels that the attribute can take. Use only if the attribute&#39;s category is \&quot;category\&quot;. For example, [{&#39;value&#39;:1, &#39;label&#39;:&#39;male&#39;}, {&#39;value&#39;:2, &#39;label&#39;:&#39;female&#39;}] |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the attribute. Use only if the attribute&#39;s category is &#39;normal&#39;, &#39;category&#39; or &#39;transactional&#39; ( type &#39;id&#39; is only available if the category is &#39;transactional&#39; attribute &amp; type &#39;category&#39; is only available if the category is &#39;category&#39; attribute ) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
DATE | &quot;date&quot;
FLOAT | &quot;float&quot;
ID | &quot;id&quot;
CATEGORY | &quot;category&quot;



