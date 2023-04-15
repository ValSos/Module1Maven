package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.MyName;

public class Main {


    public static void main(String[] args) {
        MyName name = new MyName("Valeriia", "Sosiedka");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(name);

        System.out.println(json);
    }
}