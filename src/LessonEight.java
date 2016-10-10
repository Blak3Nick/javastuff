/**
 * Created by Cyr1lfiggus1 on 9/23/2016.
 */

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;
public class LessonEight {
    public static void main(String[] args )
    {
        Monster.buildBattleBoard();

        char [][] tempBattleBoard = new char[10][10];

        //ObjectName[] ArrayName = new ObjectName[4];

        Monster[] Monsters = new Monster[4];

        Monsters[0] = new Monster(1000, 20, 1, "Francis");
        Monsters[1] = new Monster(500, 40, 2, "Crazy");
        Monsters[2] = new Monster(100, 20, 1, "Bruce");
        Monsters[3] = new Monster(1000, 20, 1, "Prometheus");

        Monster.redrawBoard();
    }

}
