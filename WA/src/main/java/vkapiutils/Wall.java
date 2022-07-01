package vkapiutils;

import kong.unirest.Unirest;
import vkapiutils.responses.Response;
import vkapiutils.responses.WallCommentResponse;
import vkapiutils.responses.WallPostResponse;

public class Wall {
    public static WallPostResponse post(String parametersUrl) {
        return new WallPostResponse(Unirest.get(ApiConfig.VK_API.getCode() + ApiMethodsNames.POST.getCode() + parametersUrl)
                .asJson());
    }

    public static Response edit(String parametersUrl) {
        return new Response(Unirest.get(ApiConfig.VK_API.getCode() + ApiMethodsNames.EDIT.getCode() + parametersUrl)
                .asJson());
    }

    public static WallCommentResponse createComment(String parametersUrl) {
        return new WallCommentResponse(Unirest.get(ApiConfig.VK_API.getCode() + ApiMethodsNames.CREATE_COMMENT.getCode() + parametersUrl)
                .asJson());
    }

    public static Response getLikes(String parametersUrl) {
        return new Response(Unirest.get(ApiConfig.VK_API.getCode() + ApiMethodsNames.GET_LIKES.getCode() + parametersUrl)
                .asJson());
    }

    public static Response delete(String parametersUrl) {
        return new Response(Unirest.get(ApiConfig.VK_API.getCode() + ApiMethodsNames.DELETE.getCode() + parametersUrl).asJson());
    }
}
