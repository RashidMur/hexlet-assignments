package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String submit;
    private TagInterface imputTag1;

    public LabelTag(String submit, TagInterface imputTag1) {
        this.submit = submit;
        this.imputTag1 = imputTag1;
    }
    @Override
    public String render(){

        return "<label>" + submit + imputTag1.render() + "</label>";

    }

}
// END
