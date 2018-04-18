
package com.janani.mapmarker.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Feed {

    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("entry_id")
    private Long mEntryId;
    @SerializedName("field1")
    private String mField1;
    @SerializedName("field2")
    private String mField2;

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public Long getEntryId() {
        return mEntryId;
    }

    public String getField1() {
        return mField1;
    }

    public String getField2() {
        return mField2;
    }

    public static class Builder {

        private String mCreatedAt;
        private Long mEntryId;
        private String mField1;
        private String mField2;

        public Feed.Builder withCreatedAt(String createdAt) {
            mCreatedAt = createdAt;
            return this;
        }

        public Feed.Builder withEntryId(Long entryId) {
            mEntryId = entryId;
            return this;
        }

        public Feed.Builder withField1(String field1) {
            mField1 = field1;
            return this;
        }

        public Feed.Builder withField2(String field2) {
            mField2 = field2;
            return this;
        }

        public Feed build() {
            Feed Feed = new Feed();
            Feed.mCreatedAt = mCreatedAt;
            Feed.mEntryId = mEntryId;
            Feed.mField1 = mField1;
            Feed.mField2 = mField2;
            return Feed;
        }

    }

}
