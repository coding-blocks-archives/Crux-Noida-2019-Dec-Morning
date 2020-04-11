package com.company.Lec27;

import com.company.Lec26.HashMapLL;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashmapusingAL {


    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    private int size = 0;

    private float lf=0.5f;

    public HashmapusingAL() {

        for (int i = 0; i <3 ; i++) {

            entities.add(new LinkedList<>());
        }
    }


    public void put(String key, String value){
        if(((float)(size))/entities.size()>lf){
            rehash();
        }

        int hashcode= Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if (entity.key.equals(key)) {
                entity.value=value;
                return;
            }
        }
        list.add(new Entity(key,value));
        size++;
    }

    private void rehash() {

        System.out.println("me badh gya");
        ArrayList<LinkedList<Entity>> old = entities;
        entities = new ArrayList<>();

        for (int i = 0; i <old.size()*2 ; i++) {
            entities.add(new LinkedList<>());
        }

        size=0;

        for (LinkedList<Entity> list: old) {

            for (Entity entity:list) {

                put(entity.key,entity.value);
            }
        }

    }

    public String get(String key){
        int hashcode= Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;

    }

    public void remove(String key){

        int hashcode= Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(hashcode);

        Entity target =null;

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                target=entity;
                size--;
                break;
            }
        }
        list.remove(target);
    }



    class Entity{

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
