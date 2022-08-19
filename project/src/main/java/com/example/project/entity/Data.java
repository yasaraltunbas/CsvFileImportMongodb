package com.example.project.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document

public class Data {

	@Id
	private int mainLevel_id;
	private int XRmean;
	private int XRmin;
	private int XRmax;
	private Double SDNN;
	private Double Rmssd;
	private Double NN50;
	private Double pNN50;
	private Double ValueIndex;
	private long created_at;
	public int getMainLevel_id() {
		return mainLevel_id;
	}
	public void setMainLevel_id(int mainLevel_id) {
		this.mainLevel_id = mainLevel_id;
	}
	public int getXRmean() {
		return XRmean;
	}
	public void setXRmean(int xRmean) {
		XRmean = xRmean;
	}
	public int getXRmin() {
		return XRmin;
	}
	public void setXRmin(int xRmin) {
		XRmin = xRmin;
	}
	public int getXRmax() {
		return XRmax;
	}
	public void setXRmax(int xRmax) {
		XRmax = xRmax;
	}
	public Double getSDNN() {
		return SDNN;
	}
	public void setSDNN(Double sDNN) {
		SDNN = sDNN;
	}
	public Double getRmssd() {
		return Rmssd;
	}
	public void setRmssd(Double rmssd) {
		Rmssd = rmssd;
	}
	public Double getNN50() {
		return NN50;
	}
	public void setNN50(Double nN50) {
		NN50 = nN50;
	}
	public Double getpNN50() {
		return pNN50;
	}
	public void setpNN50(Double pNN50) {
		this.pNN50 = pNN50;
	}
	public Double getValueIndex() {
		return ValueIndex;
	}
	public void setValueIndex(Double valueIndex) {
		ValueIndex = valueIndex;
	}
	public long getCreated_at() {
		return created_at;
	}
	public void setCreated_at(long created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Data [mainLevel_id=" + mainLevel_id + ", XRmean=" + XRmean + ", XRmin=" + XRmin + ", XRmax=" + XRmax
				+ ", SDNN=" + SDNN + ", Rmssd=" + Rmssd + ", NN50=" + NN50 + ", pNN50=" + pNN50 + ", ValueIndex="
				+ ValueIndex + ", created_at=" + created_at + "]";
	}
	public Data(int mainLevel_id, int xRmean, int xRmin, int xRmax, Double sDNN, Double rmssd, Double nN50,
			Double pNN50, Double valueIndex, long created_at) {
		super();
		this.mainLevel_id = mainLevel_id;
		XRmean = xRmean;
		XRmin = xRmin;
		XRmax = xRmax;
		SDNN = sDNN;
		Rmssd = rmssd;
		NN50 = nN50;
		this.pNN50 = pNN50;
		ValueIndex = valueIndex;
		this.created_at = created_at;
	}
	public Data() {
		super();
	}
	
	

}
