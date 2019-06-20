package pers.bjh.mcu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pers.bjh.mcu.entity.Character;
import pers.bjh.mcu.service.CharacterService;

@RestController
public class CharacterController {

    private Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @Autowired
    private CharacterService characterService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        logger.debug("进入 CharacterController 的 index 方法");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        logger.debug("离开 CharacterController 的 index 方法");
        return modelAndView;
    }

    @RequestMapping(name = "/character", method = RequestMethod.POST)
    public String addCharacter(Character character){
        return characterService.addCharacter(character) ? "success" : "failure";
    }

}
