package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子身份证查询用户身份信息
 *
 * @author auto create
 * @since 1.0, 2018-04-12 14:03:49
 */
public class AlipayUserElectronicidUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7265912831631678725L;

	/**
	 * 用户码码串
	 */
	@ApiField("barcode")
	private String barcode;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}