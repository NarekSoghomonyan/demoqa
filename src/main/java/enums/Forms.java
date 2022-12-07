package enums;

public enum Forms {
    PRACTICE_FORM("Practice Form");
    Forms(String formName){
        this.formName = formName;
    }

    private String formName;

    public String getFormName() {
        return formName;
    }
}
