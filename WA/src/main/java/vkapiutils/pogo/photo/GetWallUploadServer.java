package vkapiutils.pogo.photo;

import com.google.gson.annotations.SerializedName;

public class GetWallUploadServer {
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("group_id")
    private int groupId;
    private String v;

    public String generateUrl() {
        return String.format("&access_token=%s&v=%s", accessToken, v);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
