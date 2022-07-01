package vkapiutils.pogo.photo;

import com.google.gson.annotations.SerializedName;

public class SaveWallPhoto {
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("user_id")
    private int userId;
    @SerializedName("group_id")
    private int groupId;
    @SerializedName("photo")
    private String photo;
    private int server;
    private String hash;
    private String latitude;
    private String longitude;
    private String caption;
    private String v;

    public String generateUrl() {
        return String.format("user_id=%d&group_id=%d&photo=%s&server=%d&hash=%s&latitude=%s&longitude=%s&caption=%s&access_token=%s&v=%s",
                userId, groupId, photo, server, hash, latitude, longitude, caption, accessToken, v);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getServer() {
        return server;
    }

    public void setServer(int server) {
        this.server = server;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
