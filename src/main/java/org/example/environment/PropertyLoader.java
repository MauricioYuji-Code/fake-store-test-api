package org.example.environment;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class PropertyLoader {

    public String getUrl(){
        Yaml yaml = new Yaml();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("properties.yaml");
        Map<String, Object> root = yaml.load(inputStream);
        Map<String, Object> data = (Map<String, Object>) root.get("servico");
        return data.get("url").toString();
    }
}
