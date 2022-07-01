package vkapiutils.pogo.wall;

import com.google.gson.annotations.SerializedName;

public class WallDelete {
	@SerializedName("access_token")
	private String accessToken;
	@SerializedName("owner_id")
	private int ownerId;
	@SerializedName("post_id")
	private int postId;
	private String v;

	public String generateUrl() {
		return "owner_id=" + ownerId
		 + "&post_id=" + postId
		 + "&access_token=" + accessToken
		 + "&v=" + v;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
