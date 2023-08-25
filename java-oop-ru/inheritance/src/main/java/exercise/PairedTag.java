package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public final class PairedTag extends Tag {
    private final String body;

    private final List<Tag> child;

    public PairedTag(String getNameTag, Map<String, String> attributes, String body, List<Tag> child) {
        super(getNameTag, attributes);
        this.body = body;
        this.child = child;
    }

    @Override
    public String toString() {
        String childString = child.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
        return "<" + getNameTag() + super.toString() + ">" + childString + this.body
                + "</" + getNameTag() + ">";
    }
}
// END
