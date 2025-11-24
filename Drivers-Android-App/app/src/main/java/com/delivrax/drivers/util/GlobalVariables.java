package com.delivrax.drivers.util;

import android.app.Application;

public class GlobalVariables extends Application {

    // API Configuration - Update this URL to your backend server
    // For emulator: use 10.0.2.2 instead of localhost
    // For physical device: use your computer's IP address
    public static final String API_BASE_URL = "http://10.0.2.2:5000/api/";
    public static final String ADMIN_BASE_URL = "http://10.0.2.2:5000/admin/";
    
    // Weather API (OpenWeatherMap)
    public static final String WEATHER_API_KEY = "f4f64f21d23ce5ca16621e7e6cbc4f58";
    public static final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather";

    private String driverID;
    private String driverFirstname;
    private String driverLastConnection;
    private String vehicleID;
    private String weather;
    private int numberOfReceipts;
    private double Latitude;
    private double Longitude;

    public double getLatitude() { return Latitude; }

    public void setLatitude(double latitude) { Latitude = latitude; }

    public double getLongitude() { return Longitude; }

    public void setLongitude(double longitude) { Longitude = longitude; }

    public int getNumberOfReceipts() { return numberOfReceipts; }

    public void setNumberOfReceipts(int numberOfReceipts) { this.numberOfReceipts = numberOfReceipts; }

    public String getWeather() { return weather; }

    public void setWeather(String weather) { this.weather = weather; }

    public String getVehicleID() { return vehicleID; }

    public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getDriverFirstname() {
        return driverFirstname;
    }

    public void setDriverFirstname(String driverFirstname) { this.driverFirstname = driverFirstname; }

    public String getDriverLastConnection() { return driverLastConnection; }

    public void setDriverLastConnection(String driverLastConnection) { this.driverLastConnection = driverLastConnection; }
}
