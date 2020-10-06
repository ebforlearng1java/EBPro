package co.jp.chapter11;

import java.util.List;

public class Line {
	private String lineName;
	private List<Station> stationList;

	//コンストラクタ
	public Line(String lineName) {
		this.lineName=lineName;
	}

	public String getLineName() {
		return lineName;
	}

	public List<Station> getStationList() {
		return stationList;
	}
	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}


}