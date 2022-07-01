package vkapiutils.pogo.wall;

import com.google.gson.annotations.SerializedName;

public class WallEdit {
	@SerializedName("access_token")
	private String accessToken;
	@SerializedName("owner_id")
	private int ownerId;
	@SerializedName("post_id")
	private int postId;
	@SerializedName("friends_only")
	private boolean friendsOnly;
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
	@SerializedName("mark_as_ads")
	private boolean markAsAds;
	@SerializedName("close_comments")
	private boolean closeComments;
	@SerializedName("donut_paid_duration")
	private int donutPaidDuration;
	@SerializedName("poster_bkg_id")
	private int posterBkgId;
	@SerializedName("poster_bkg_owner_id")
	private int posterBkgOwnerId;
	@SerializedName("poster_bkg_access_hash")
	private String posterBkgAccessHash;
	private String copyright;
	private String v;

	public String generateUrl() {
		return "owner_id=" + ownerId
		 + "&post_id=" + postId
		 + "&friends_only=" + (friendsOnly ? "1": "0")
		 + "&message=" + message
		 + "&attachments=" + attachments
		 + "&services=" + services
		 + "&signed=" + (signed? "1": "0")
		 + "&publish_date=" + publishDate
		 + "&lat=" + lat
		 + "&lng=" + lng
		 + "&place_id=" + placeId
		 + "&mark_as_ads=" + (markAsAds ? "1": "0")
		 + "&close_comments=" + (closeComments ? "1": "0")
		 + "&donut_paid_duration=" + donutPaidDuration
		 + "&copyright=" + copyright
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

	public int getPostId() {
		return postId;
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

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getPosterBkgId() {
		return posterBkgId;
	}

	public void setPosterBkgId(int posterBkgId) {
		this.posterBkgId = posterBkgId;
	}

	public int getPosterBkgOwnerId() {
		return posterBkgOwnerId;
	}

	public void setPosterBkgOwnerId(int posterBkgOwnerId) {
		this.posterBkgOwnerId = posterBkgOwnerId;
	}

	public String getPosterBkgAccessHash() {
		return posterBkgAccessHash;
	}

	public void setPosterBkgAccessHash(String posterBkgAccessHash) {
		this.posterBkgAccessHash = posterBkgAccessHash;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
