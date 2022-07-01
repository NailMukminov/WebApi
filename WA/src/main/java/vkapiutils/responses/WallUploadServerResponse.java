package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class WallUploadServerResponse extends Response{
    public WallUploadServerResponse(HttpResponse<JsonNode> response) {
        super(response);
    }
    public String getUploadUrl() {
        return response.getBody().getObject().getJSONObject("response").getString("upload_url");
    }

    public int getUserID() {
        return Integer.parseInt(response
                .getBody()
                .getObject()
                .getJSONObject("response")
                .getString("user_id"));
    }
}
