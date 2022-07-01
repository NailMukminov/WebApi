package vkapiutils;

public enum ApiMethodsNames {
	POST("method/wall.post?"),
	EDIT("method/wall.edit?"),
	CREATE_COMMENT("method/wall.createComment?"),
	GET_LIKES("method/wall.getLikes?"),
	DELETE("method/wall.delete?"),
	PHOTOS_GET_UPLOADS_SERVER("method/photos.getWallUploadServer?"),
	SAVE_WALL_PHOTO("method/photos.saveWallPhoto?");

	private final String code;

	ApiMethodsNames(String code){
		this.code = code;
	}

	public String getCode(){ return code;}
}
