package com.company;

public enum Country {
    Russia(7, () -> {
        System.out.println("This number from Russia!");
    }),
    USA(1, () -> {
        System.out.println("This number from USA!");
    }),
    Ukraine(3, () -> {
        System.out.println("This number from Ukraine!");
    });

    Country(int key, ParseAction action){
        this.action = action;
        countryKey = key;
    }

    private int countryKey;
    ParseAction action;

    public static Country parse(String number){
        char ch = number.charAt(1);
        for (Country c: Country.values()) {
            int i = Integer.parseInt(String.valueOf(ch));
            if( i == c.getCountryKey())
                return c;
        }
        return null;
    }

    public void start(){
        action.doSmth();
    }

    public int getCountryKey() {
        return countryKey;
    }
}

interface ParseAction{
    void doSmth();
}
