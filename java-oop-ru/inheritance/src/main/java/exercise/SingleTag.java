package exercise;

import java.util.Map;

// BEGIN
public final class SingleTag extends Tag{
    public SingleTag(String nameTag, Map<String, String> attributes) {
        super(nameTag, attributes);
    }

    public String toString() {
        return "<" + getNameTag() + super.toString() + ">";}
}
// END
