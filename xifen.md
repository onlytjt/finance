### 前端接口系分

- 新建凭证提交接口。finance/voucher/create
- 入参：

```json
{
  "formData": {
    "voucherSerial": "凭证序号",
    "company": "公司名称(必填)",
    "creatorName": "制单人(必填)",
    "checkerName": "审核人(必填)",
    "accountorName": "记账人(必填)",
    "attachNum": "附件张数",
    "voucherClauseModelList": [
      {
        "summary": "摘要(必填)",
        "captionId": "科目id(必填)",
        "currency": "货币种类",
        "rate": "汇率",
        "amount": "原币数量",
        "accountDirection": "记账方向",
        "debitAmount": 100,
        "creditAmount": 100
      }
    ]
  }
}
```

- 出参：

```json
{
  "success": "请求结果",
  "voucherId": "凭证id"
}
```

