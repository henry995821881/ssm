package com.henry1.bean.tm;

import java.io.Serializable;

public class SidoukikanData implements Serializable {

	/**
	 * デフォルト永続化ID。
	 */
	private static final long serialVersionUID = 1L;

	private String skCd;
	private String skNm;
	private String area;
	private Long maxNinzu;
	private String yubinNo;
	private String address;
	private String address2;
	private String telNo;
	private Boolean gaibuFlg;
	private String comSkCd;
	private Boolean daikouKikanFlg;
	public String getSkCd() {
		return skCd;
	}

	public void setSkCd(String skCd) {
		this.skCd = skCd;
	}

	public String getSkNm() {
		return skNm;
	}

	public void setSkNm(String skNm) {
		this.skNm = skNm;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getMaxNinzu() {
		return maxNinzu;
	}

	public void setMaxNinzu(Long maxNinzu) {
		this.maxNinzu = maxNinzu;
	}

	public String getYubinNo() {
		return yubinNo;
	}

	public void setYubinNo(String yubinNo) {
		this.yubinNo = yubinNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Boolean getGaibuFlg() {
		return gaibuFlg;
	}

	public void setGaibuFlg(Boolean gaibuFlg) {
		this.gaibuFlg = gaibuFlg;
	}

	public String getComSkCd() {
		return comSkCd;
	}

	public void setComSkCd(String comSkCd) {
		this.comSkCd = comSkCd;
	}

	public Boolean getDaikouKikanFlg() {
		return daikouKikanFlg;
	}

	public void setDaikouKikanFlg(Boolean daikouKikanFlg) {
		this.daikouKikanFlg = daikouKikanFlg;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		sb.append("/skCd=").append(skCd);
		sb.append("/skNm=").append(skNm);
		sb.append("/area=").append(area);
		sb.append("/maxNinzu=").append(maxNinzu);
		sb.append("/yubinNo=").append(yubinNo);
		sb.append("/address=").append(address);
		sb.append("/address2=").append(address2);
		sb.append("/telNo=").append(telNo);
		sb.append("/gaibuFlg=").append(gaibuFlg);
		sb.append("/comSkCd=").append(comSkCd);
		sb.append("/daikouKikanFlg=").append(daikouKikanFlg);
		sb.append("]");
		return sb.toString();
	}

}
