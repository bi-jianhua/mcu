package pers.bjh.mcu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.bjh.mcu.dao.CharacterDao;
import pers.bjh.mcu.entity.Character;
import pers.bjh.mcu.service.CharacterService;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterDao characterDao;

    @Override
    public boolean addCharacter(Character c) {
        return characterDao.addCharacter(c);
    }

    @Override
    public List<Character> getCharacterForList() {
        return characterDao.getCharacterForList();
    }

}
