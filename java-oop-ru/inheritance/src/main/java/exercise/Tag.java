package exercise;

import java.util.Map;
import java.util.stream.Collectors;

import static java.nio.file.Files.getAttribute;

// BEGIN
public abstract class Tag{
    public String nameTag;
    public Map<String, String> attributes;
    public Tag(String nameTag, Map<String, String> attributes) {
        this.nameTag = nameTag;
        this.attributes = attributes;
    }
    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
    
    public String getNameTag() {
        return nameTag;
    }
    public Map<String, String> getAttributes() {
        return attributes;
    }
    public String toString() {
        return getAttributes().keySet()
                .stream()
                .map(key -> " " + key + "=" + "\"" + getAttributes().get(key) + "\"")
                .collect(Collectors.joining());
    }
}


