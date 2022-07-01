package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class SaveWallPhotoResponse extends Response{
    public SaveWallPhotoResponse(HttpResponse<JsonNode> response) {
        super(response);
    }

    public int getPhotoId() {
        return response.getBody()
                .getObject()
                .getJSONArray("response")
                .getJSONObject(0)
                .getInt("id");
    }
}
