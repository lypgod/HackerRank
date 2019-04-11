package com.lypgod.demo.S07_Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_Covariant_Return_Types {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            default:
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

//Complete the classes below
class Flower {
    String flowerName = "";

    String whatsYourName() {
        return this.flowerName;
    }
}

class Jasmine extends Flower {
    public Jasmine() {
        this.flowerName = "Jasmine";
    }
}

class Lily extends Flower {
    public Lily() {
        this.flowerName = "Lily";
    }
}

class Region {
    Flower nationFlower;

    Flower yourNationalFlower() {
        return this.nationFlower;
    }
}

class WestBengal extends Region {
    public WestBengal() {
        nationFlower = new Jasmine();
    }
}

class AndhraPradesh extends Region {
    public AndhraPradesh() {
        nationFlower = new Lily();
    }
}