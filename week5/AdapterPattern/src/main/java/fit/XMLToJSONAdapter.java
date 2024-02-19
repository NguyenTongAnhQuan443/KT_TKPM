
package fit;

public class XMLToJSONAdapter implements IFormatAdapter {
    private final JSONService jsonService;

    public XMLToJSONAdapter(JSONService jsonService) {
        this.jsonService = jsonService;
    }

    @Override
    public String convert(String xmlData) {
        // Chuyển đổi XML sang JSON (giả lập)
        String jsonData = "{\"data\": \"" + xmlData.replace("<data>", "").replace("</data>", "") + "\"}";
        return jsonService.processJSON(jsonData);
    }
}
