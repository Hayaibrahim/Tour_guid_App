package com.example.enghaya.pro;

/**
 * Created by ENG.HAYA on 8/29/2017 AD.
 */

public class information {

    private String Name;
    private String Address;
    private String location;
    private int pic;

    public information(String Name, String Address, String location, int pic) {
        this.Name = Name;
        this.Address = Address;
        this.location = location;
        this.pic = pic;
    }

    public information(String Name, String location, String Address) {
        this.Name = Name;
        this.location = location;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getLocation() {
        return location;
    }

    public int getPic() {
        return pic;
    }

}
