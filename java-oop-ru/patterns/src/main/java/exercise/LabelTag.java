package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String submit;
    private TagInterface imputTag;

    public LabelTag(String submit, TagInterface imputTag) {
        this.submit = submit;
        this.imputTag = imputTag;
    }
    @Override
    public String render(){

        return "<label>" + submit + imputTag + "</label>";

    }

}
// END
