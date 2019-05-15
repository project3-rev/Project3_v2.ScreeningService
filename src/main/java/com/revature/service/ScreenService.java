package com.revature.service;


import com.revature.dto.Screen;
import java.util.List;


public interface ScreenService {
   List<Screen> getAllScreenings();
   Screen getScreenById(int id);
   Screen getScreenByUserId(int user_id);
   void addScreen(Screen screen);
   void updateScreen(Screen screen, int id);
}
