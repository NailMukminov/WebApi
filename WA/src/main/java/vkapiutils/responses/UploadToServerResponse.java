package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UploadToServerResponse extends Response{
    public UploadToServerResponse(HttpResponse<JsonNode> response) {
        super(response);
    }

    public int getServer() {
        return response
                .getBody()
                .getObject()
                .getInt("server");
    }

    public String getPhoto() {
        return URLEncoder.encode(response
                .getBody()
                .getObject()
                .getString("photo"), StandardCharsets.UTF_8);
    }

    public String getHash() {
        return response
                .getBody()
                .getObject()
                .getString("hash");
    }
}
