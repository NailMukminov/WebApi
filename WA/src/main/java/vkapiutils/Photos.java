package vkapiutils;

import kong.unirest.Unirest;
import vkapiutils.responses.SaveWallPhotoResponse;
import vkapiutils.responses.WallUploadServerResponse;
import vkapiutils.responses.UploadToServerResponse;

import java.io.File;

public class Photos {
    public static WallUploadServerResponse getWallUploadServer(String parametersUrl) {
        return new WallUploadServerResponse(Unirest
                .post(ApiConfig.VK_API.getCode() + ApiMethodsNames.PHOTOS_GET_UPLOADS_SERVER.getCode() + parametersUrl)
                .asJson());
    }

    public static UploadToServerResponse uploadToServer(String uploadUrl, String typeOfFile, String pathToFile){
        return new UploadToServerResponse(Unirest
                .post(uploadUrl)
                .field(typeOfFile, new File(pathToFile)).asJson());
    }

    public static SaveWallPhotoResponse saveWallPhoto(String parametersUrl) {
        String url = ApiConfig.VK_API.getCode() + ApiMethodsNames.SAVE_WALL_PHOTO.getCode() + parametersUrl;
        return new SaveWallPhotoResponse(Unirest.post(url).asJson());
    }
}
