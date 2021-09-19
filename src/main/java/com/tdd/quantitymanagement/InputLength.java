package com.tdd.quantitymanagement;

public class InputLength {
    private String value, value1, type, type1;

    public InputLength() {
    }

    public InputLength(String input) {
        if (input.contains("ft")) {
            String[] inputLength = input.split("ft");
            value = inputLength[0];
            type = "ft";
        } else {
            value = "";
            type = "";
        }
    }

    public void setLength(String input) {
        if (input.contains("ft")) {
            String[] inputLength = input.split("ft");
            value = inputLength[0];
            type = "ft";
        } else {
            value = "";
            type = "";
        }
    }

    public void setLength1(String input) {
        if (input.contains("ft")) {
            String[] inputLength = input.split("ft");
            value1 = inputLength[0];
            type1 = "ft";
        } else {
            value1 = "";
            type1 = "";
        }
    }

    public String getType() {
        return type;
    }

    public String getType1() {
        return type1;
    }

    public String getValue() {
        return value;
    }

    public String getValue1() {
        return value1;
    }
}
