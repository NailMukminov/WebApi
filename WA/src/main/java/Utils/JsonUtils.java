package Utils;

import java.io.FileReader;
import java.io.IOException;

import aquality.selenium.browser.AqualityServices;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtils {
	public static Object smartReadJson(String filename, String key) {
		try (FileReader reader = new FileReader(filename)){
			JSONParser jsonParser = new JSONParser();
			JSONObject rootJsonObject = (JSONObject) jsonParser.parse(reader);
			return rootJsonObject.get(key);
		} catch (IOException | ParseException | NullPointerException e) {
			AqualityServices.getLogger().warn(e.getMessage());
		}
		return null;
	}
	public static Object deserializeJsonObject(String filename, String caseName, int index, Class<?> objClass) {
		try (FileReader reader = new FileReader(filename)){
			JSONParser jsonParser = new JSONParser();
			JSONObject rootJsonObject = (JSONObject) jsonParser.parse(reader);

			JSONArray jsonArray = (JSONArray) rootJsonObject.get(caseName);
			JSONObject jsonObject = (JSONObject) jsonArray.get(index);
			return new GsonBuilder().create().fromJson(jsonObject.toString(), objClass);
		} catch (IOException | ParseException | NullPointerException e) {
			AqualityServices.getLogger().warn(e.getMessage());
		}
		return null;
	}
	public static Object smartDeserialize(String filename, Class<?> objClass) {
		try (FileReader reader = new FileReader(filename)){
			JSONParser jsonParser = new JSONParser();
			JSONObject rootJsonObject = (JSONObject) jsonParser.parse(reader);

			return new GsonBuilder().create().fromJson(rootJsonObject.toString(), objClass);
		} catch (IOException | ParseException | NullPointerException e) {
			AqualityServices.getLogger().warn(e.getMessage());
		}
		return null;
	}
}
