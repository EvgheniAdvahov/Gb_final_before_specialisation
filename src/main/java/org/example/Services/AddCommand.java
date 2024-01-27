package org.example.Services;

import org.example.Data.Dog;

public class AddCommand<T extends Dog> {
    T dog;
    T getDog(){
        return dog;
    }



}
