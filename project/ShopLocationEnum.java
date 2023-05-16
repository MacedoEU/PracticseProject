package project;

public enum ShopLocationEnum {
    
    UK("United Kingdom", "Dundee"), // United kingdom 
    IE("Ireland", "Dundalk"),  // Ireland
    ESP("Spain", "Madrid"),  // Spain
    POL("Poland", "Warsaw"),  // Poland 
    FRA("France", "Paris"),  // France 
    GER("Germany", "Berlin"); // Germany 


    private final String country; 
    private final String city; 

    ShopLocationEnum(String country, String city) {
     this.country = country;
     this.city = city; 
    }

    public  String getLocation() {
        return this.country;
    }

    public String getCity() {
        return this.city; 
    }

    

}
