package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Press q for quit";
    }

    @Override
    public String selectedLanguage() {
        return "The selected language is";
    }

    @Override
    public String greet() { return "Hello!";}

}
