package com.taxi.sa.parsing;

import com.taxi.sa.parsing.input.InputCheckpoint;
import com.taxi.sa.parsing.input.InputWall;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ValidatorService {

    // A simple check to verify whether walls and checkpoints have been defined within map width and heights
    public boolean validate(InputMapInterface inputMap) {
        int width = inputMap.getWidth();
        int height = inputMap.getHeight();
        ArrayList<InputWall> walls = inputMap.getWalls();
        ArrayList<InputCheckpoint> checkpoints = inputMap.getCheckpoints();
        boolean checkWalls = walls.stream().allMatch(x -> checkWidth(x.getX1(),x.getX2(),width) && checkHeight(x.getY1(),x.getY2(),height));
        boolean checkCheckpoints = checkpoints.stream().allMatch(x -> checkWidth(x.getX1(),x.getX2(),width) && checkHeight(x.getY1(),x.getY2(),height));
        return checkWalls && checkCheckpoints;
    }

    private boolean checkWidth(int x1, int x2, int mapWidth) {
        boolean x1Check = x1 >= 1 && x1 <= mapWidth;
        boolean x2Check = x2 >= 1 && x2 <= mapWidth;
        return x1Check && x2Check;
    }

    private boolean checkHeight(int y1, int y2, int mapHeight) {
       boolean y1Check = y1 >= 1 && y1 <= mapHeight;
       boolean y2Check = y2 >= 1 && y2 <= mapHeight;
       return y1Check && y2Check;
    }

}
