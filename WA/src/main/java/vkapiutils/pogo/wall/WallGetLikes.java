package vkapiutils.pogo.wall;

import com.google.gson.annotations.SerializedName;

public class WallGetLikes {
	@SerializedName("access_token")
	private String accessToken;
	@SerializedName("owner_id")
	private int ownerId;
	@SerializedName("post_id")
	private int postId;
	@SerializedName("published_only")
	private boolean publishedOnly;
	@SerializedName("friends_only")
	private boolean friendsOnly;
	private int offset;
	private int count;
	private String v;

	public String generateUrl() {
		return "owner_id=" + ownerId
		 + "&post_id=" + postId
		 + "&published_only=" + (publishedOnly ? 1 : 0)
		 + "&friends_only=" + (friendsOnly ? 1 : 0)
		 + "&offset=" + offset
		 + "&count=" + count
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

	public boolean isPublishedOnly() {
		return publishedOnly;
	}

	public void setPublishedOnly(boolean publishedOnly) {
		this.publishedOnly = publishedOnly;
	}

	public boolean isFriendsOnly() {
		return friendsOnly;
	}

	public void setFriendsOnly(boolean friendsOnly) {
		this.friendsOnly = friendsOnly;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
