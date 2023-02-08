package com.example.uas_mobprog_cinemacgp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Cinema implements Parcelable {
    private String name;
    private String address;
    private int image;
    private double latitude;
    private double longitude;

    protected Cinema(Parcel in) {
        name = in.readString();
        address = in.readString();
        image = in.readInt();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Cinema> CREATOR = new Creator<Cinema>() {
        @Override
        public Cinema createFromParcel(Parcel in) {
            return new Cinema(in);
        }

        @Override
        public Cinema[] newArray(int size) {
            return new Cinema[size];
        }
    };

    public Cinema(int imgcinemas, String name, double lat, double lon, String address) {
        this.image = imgcinemas;
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeInt(image);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
