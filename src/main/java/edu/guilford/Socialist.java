package edu.guilford;

import java.util.Random;

public class Socialist implements Comparable<Socialist>{
    private String continentName;
    private String ocean;
    private String countryName;
    private String language;
    private String economy;


//Constructor
public Socialist() {
    String[] continents = {"Asia", "Africa", "North America", "South America", "Europe", "Australia"};
    String[] oceans = {"Atlantic", "Pacific", "Indian", "Arctic", "Southern"};
    String[] countries = {"China", "India", "United States", "Indonesia", "Pakistan", "Brazil", "Nigeria", "Bangladesh", "Russia", "Mexico"};
    String[] languages = {"Mandarin", "Spanish", "English", "Hindi", "Arabic", "Bengali", "Portuguese", "Russian", "Japanese", "Punjabi"};
    String[] economies = {"Planned", "Mixed", "Market", "Traditional"};

    Random rand = new Random();
    this.continentName = continents[rand.nextInt(continents.length)];
    this.ocean = oceans[rand.nextInt(oceans.length)];
    this.countryName = countries[rand.nextInt(countries.length)];
    this.language = languages[rand.nextInt(languages.length)];
    this.economy = economies[rand.nextInt(economies.length)];
}

public Socialist (String continentName, String ocean, String countryName, String language,  String economy) {
    this.continentName = continentName;
    this.ocean = ocean;
    this.countryName = countryName;
    this.language = language;
    this.economy = economy;
}

//Getters and Setters
public String getEconomy() {
    return economy;
}
public void setEconomy(String economy) {
    this.economy = economy;
}


@Override
public int compareTo(Socialist other) {
    // We can compare the last names first using the compareTo method of
    // the String class. String is Comparable, so it has a compareTo method
    int result = countryName.compareTo(other.countryName);
    // If the last names are the same, we can compare the first names
    if (result == 0) {
        result = continentName.compareTo(other.continentName);
    }
    return result;
}

//Build a quicksort method to sort the list
// public 
// 
}
