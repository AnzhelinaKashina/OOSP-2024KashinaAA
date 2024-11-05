package _11;


import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, DocumentPrototype> templates = new HashMap<>();

    public void addTemplate(String key, DocumentPrototype template) {
        templates.put(key, template);
    }

    public DocumentPrototype createDocument(String key) {
        DocumentPrototype template = templates.get(key);
        return template != null ? template.clone() : null;
    }
}
