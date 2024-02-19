
package fit;

public class JSONToXMLAdapter implements IFormatAdapter {
    private final XMLService xmlService;

    public JSONToXMLAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String convert(String jsonData) {
        // Chuyển đổi JSON sang XML (giả lập)
        String xmlData = "<data>" + jsonData.replace("{\"data\": \"", "").replace("\"}", "") + "</data>";
        return xmlService.processXML(xmlData);
    }
}
