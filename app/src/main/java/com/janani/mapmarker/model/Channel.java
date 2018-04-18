
package com.janani.mapmarker.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Channel {

    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("field1")
    private String mField1;
    @SerializedName("field2")
    private String mField2;
    @SerializedName("id")
    private Long mId;
    @SerializedName("last_entry_id")
    private Long mLastEntryId;
    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("longitude")
    private String mLongitude;
    @SerializedName("name")
    private String mName;
    @SerializedName("updated_at")
    private String mUpdatedAt;

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getField1() {
        return mField1;
    }

    public String getField2() {
        return mField2;
    }

    public Long getId() {
        return mId;
    }

    public Long getLastEntryId() {
        return mLastEntryId;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public String getName() {
        return mName;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public static class Builder {

        private String mCreatedAt;
        private String mDescription;
        private String mField1;
        private String mField2;
        private Long mId;
        private Long mLastEntryId;
        private String mLatitude;
        private String mLongitude;
        private String mName;
        private String mUpdatedAt;

        public Channel.Builder withCreatedAt(String createdAt) {
            mCreatedAt = createdAt;
            return this;
        }

        public Channel.Builder withDescription(String description) {
            mDescription = description;
            return this;
        }

        public Channel.Builder withField1(String field1) {
            mField1 = field1;
            return this;
        }

        public Channel.Builder withField2(String field2) {
            mField2 = field2;
            return this;
        }

        public Channel.Builder withId(Long id) {
            mId = id;
            return this;
        }

        public Channel.Builder withLastEntryId(Long lastEntryId) {
            mLastEntryId = lastEntryId;
            return this;
        }

        public Channel.Builder withLatitude(String latitude) {
            mLatitude = latitude;
            return this;
        }

        public Channel.Builder withLongitude(String longitude) {
            mLongitude = longitude;
            return this;
        }

        public Channel.Builder withName(String name) {
            mName = name;
            return this;
        }

        public Channel.Builder withUpdatedAt(String updatedAt) {
            mUpdatedAt = updatedAt;
            return this;
        }

        public Channel build() {
            Channel Channel = new Channel();
            Channel.mCreatedAt = mCreatedAt;
            Channel.mDescription = mDescription;
            Channel.mField1 = mField1;
            Channel.mField2 = mField2;
            Channel.mId = mId;
            Channel.mLastEntryId = mLastEntryId;
            Channel.mLatitude = mLatitude;
            Channel.mLongitude = mLongitude;
            Channel.mName = mName;
            Channel.mUpdatedAt = mUpdatedAt;
            return Channel;
        }

    }

}
