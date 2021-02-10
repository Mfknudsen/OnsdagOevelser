package com.company;

public class Dansk implements Dialog {

    private String s = "Dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Tryk q for at stoppe";
    }

    @Override
    public String selectedLanguage() {
        return "Det valgte sprog er";
    }
}
