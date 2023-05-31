package com.class1;

public class Main {
    public static void main(String[] args) {
        try {
            JSonManagement jsonManagement = new JSonManagement();
            //jsonManagement.readJSON();
            //jsonManagement.readJSONsample();

            jsonManagement.readJSONFromApijsonplaceholder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
