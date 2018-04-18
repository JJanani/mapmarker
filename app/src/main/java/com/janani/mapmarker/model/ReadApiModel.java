
package com.janani.mapmarker.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ReadApiModel {


    @SerializedName("channel")
    private Channel mChannel;
    @SerializedName("feeds")
    private List<Feed> mFeeds;

    public Channel getChannel() {
        return mChannel;
    }

    public List<Feed> getFeeds() {
        return mFeeds;
    }

    public static class Builder {

        private Channel mChannel;
        private List<Feed> mFeeds;

        public ReadApiModel.Builder withChannel(Channel channel) {
            mChannel = channel;
            return this;
        }

        public ReadApiModel.Builder withFeeds(List<Feed> feeds) {
            mFeeds = feeds;
            return this;
        }

        public ReadApiModel build() {
            ReadApiModel ReadApiModel = new ReadApiModel();
            ReadApiModel.mChannel = mChannel;
            ReadApiModel.mFeeds = mFeeds;
            return ReadApiModel;
        }

    }

}
