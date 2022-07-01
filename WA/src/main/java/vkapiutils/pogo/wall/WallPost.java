package vkapiutils.pogo.wall;

import com.google.gson.annotations.SerializedName;

public class WallPost {
	@SerializedName("access_token")
	private String accessToken;
	@SerializedName("owner_id")
	private int ownerId;
	@SerializedName("friends_only")
	private boolean friendsOnly;
	@SerializedName("from_group")
	private boolean fromGroup;
	private String message;
	private String attachments;
	private String services;
	private boolean signed;
	@SerializedName("publish_date")
	private String publishDate;
	private String lat;
	private String lng;
	@SerializedName("place_id")
	private String placeId;
	@SerializedName("post_id")
	private String postId;
	private String guid;
	@SerializedName("mark_as_ads")
	private boolean markAsAds;
	@SerializedName("close_comments")
	private boolean closeComments;
	@SerializedName("donut_paid_duration")
	private int donutPaidDuration;
	@SerializedName("mute_notifications")
	private boolean muteNotifications;
	private String copyright;
	@SerializedName("topic_id")
	private String topicId;
	private String v;

	public String generateUrl() {
		return "owner_id=" + ownerId
		 + "&friends_only=" + (friendsOnly ? "1": "0")
		 + "&from_group=" + (fromGroup ? "1": "0")
		 + "&message=" + message
		 + "&attachments=" + attachments
		 + "&services=" + services
		 + "&signed=" + (signed? "1": "0")
		 + "&publish_date=" + publishDate
		 + "&lat=" + lat
		 + "&lng=" + lng
		 + "&place_id=" + placeId
		 + "&post_id=" + postId
		 + "&guid=" + guid
		 + "&mark_as_ads=" + (markAsAds ? "1": "0")
		 + "&close_comments=" + (closeComments ? "1": "0")
		 + "&donut_paid_duration=" + donutPaidDuration
		 + "&copyright=" + copyright
		 + "&topic_id=" + topicId
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

	public boolean isFriendsOnly() {
		return friendsOnly;
	}

	public void setFriendsOnly(boolean friendsOnly) {
		this.friendsOnly = friendsOnly;
	}

	public boolean isFromGroup() {
		return fromGroup;
	}

	public void setFromGroup(boolean fromGroup) {
		this.fromGroup = fromGroup;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public boolean isSigned() {
		return signed;
	}

	public void setSigned(boolean signed) {
		this.signed = signed;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public boolean isMarkAsAds() {
		return markAsAds;
	}

	public void setMarkAsAds(boolean markAsAds) {
		this.markAsAds = markAsAds;
	}

	public boolean isCloseComments() {
		return closeComments;
	}

	public void setCloseComments(boolean closeComments) {
		this.closeComments = closeComments;
	}

	public int getDonutPaidDuration() {
		return donutPaidDuration;
	}

	public void setDonutPaidDuration(int donutPaidDuration) {
		this.donutPaidDuration = donutPaidDuration;
	}

	public boolean isMuteNotifications() {
		return muteNotifications;
	}

	public void setMuteNotifications(boolean muteNotifications) {
		this.muteNotifications = muteNotifications;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
