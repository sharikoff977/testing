package com.company;

import java.util.HashMap;
import java.util.Map;

class Entity {
    public String name;
    public int age;

    public Entity(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {

        return (name + age).hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Entity entity = (Entity) obj;
        return name.equals(entity.name) && age == entity.age;
    }
}

public class TestHash{



        public static void main(String[] args) {
            Entity entity1 = new Entity("GO", 16);
            Entity entity2 = new Entity("WENT", 16);

            Map<Entity, String> hash = new HashMap();
            hash.put(entity1, "RSA-512");

            System.out.println( hash.containsKey(entity1));
            System.out.println( hash.containsKey(entity2));

            entity1.name = "WENT";

            System.out.println( hash.containsKey(entity1));
            System.out.println( hash.containsKey(entity2));
        }
}
