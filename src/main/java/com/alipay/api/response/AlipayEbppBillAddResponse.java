package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.add response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-22 21:21:47
 */
public class AlipayEbppBillAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722514743367517474L;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 外部订单号，由于对账时回传给外部商户
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/** 
	 * 账单的账期，例如201203表示2012年3月的账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 出账机构中文名称。
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/** 
	 * 扩展属性，该属性值现在用于确保只有一个人可以支付成功
用法：多个人对同一笔外部欠费单创建多个账单时，确保该值不变
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 输出机构的业务流水号，需要保证唯一性。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 拥有该账单的用户姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 账单的服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	public String getBankBillNo( ) {
		return this.bankBillNo;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}
	public String getChargeInstName( ) {
		return this.chargeInstName;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount( ) {
		return this.serviceAmount;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	public String getSubOrderType( ) {
		return this.subOrderType;
	}

}