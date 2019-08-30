package com.howtodoinjava.demo.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CurrentWeather {
	  @SerializedName("coord")
	    private Coord mCoord;

	    @SerializedName("weather")
	    private List<Weather> mWeather;

	    @SerializedName("base")
	    private String base;

	    @SerializedName("main")
	    private Main mMain;

	    @SerializedName("wind")
	    private Wind mWind;

	    @SerializedName("clouds")
	    private Clouds mClouds;

	    @SerializedName("dt")
	    private Long dt;

	    @SerializedName("sys")
	    private Sys mSys;

	    @SerializedName("id")
	    private Long id;

	    @SerializedName("name")
	    private String name;

	    public Coord getCoord() {
	        return mCoord;
	    }

	    public void setCoord(Coord coord) {
	        mCoord = coord;
	    }

	    public List<Weather> getWeather() {
	        return mWeather;
	    }

	    public void setWeather(List<Weather> weather) {
	        mWeather = weather;
	    }

	    public String getBase() {
	        return base;
	    }

	    public void setBase(String base) {
	        this.base = base;
	    }

	    public Main getMain() {
	        return mMain;
	    }

	    public void setMain(Main main) {
	        mMain = main;
	    }

	    public Wind getWind() {
	        return mWind;
	    }

	    public void setWind(Wind wind) {
	        mWind = wind;
	    }

	    public Clouds getClouds() {
	        return mClouds;
	    }

	    public void setClouds(Clouds clouds) {
	        mClouds = clouds;
	    }

	    public Long getDt() {
	        return dt;
	    }

	    public void setDt(Long dt) {
	        this.dt = dt;
	    }

	    public Sys getSys() {
	        return mSys;
	    }

	    public void setSys(Sys sys) {
	        mSys = sys;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
}
