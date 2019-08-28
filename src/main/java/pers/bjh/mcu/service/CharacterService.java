package pers.bjh.mcu.service;

import pers.bjh.mcu.entity.Character;

import java.util.List;

public interface CharacterService {

    boolean addCharacter(Character c);

    List<Character> getCharacterForList();

}
