package pers.bjh.mcu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pers.bjh.mcu.entity.Character;

import java.util.List;

@Mapper
@Component
public interface CharacterDao {

    boolean addCharacter(Character c);

    List<Character> getCharacterForList();

}
