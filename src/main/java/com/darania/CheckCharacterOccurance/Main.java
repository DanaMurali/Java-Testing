package com.darania.CheckCharacterOccurance;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CharacterMap character = new CharacterMap();

        Map characterResult = CharacterMap.characterMap(" ");
        System.out.println(characterResult);

    }
}
