package com.company;

public class Finnish implements Dialog
{

        private String s = "Suomi";

        @Override
        public String getLanguage() {
            return s;
        }

        @Override
        public String quit() {
            return "Lopeta painamalla q";
        }

        @Override
        public String selectedLanguage() {
            return "Valittu kieli on";
        }

}

