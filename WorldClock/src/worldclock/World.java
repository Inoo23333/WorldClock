package worldclock;

import java.util.Scanner;

public class World
{
    public static void main(String[] args)
    {
        System.out.println("欢迎来到'★★★★★码农酒店★★★★★'！");
        System.out.println("当前时间为：");
        WorldClock worldclock = new WorldClock();
        worldclock.initialize();
        worldclock.setWorldClock();
        worldclock.printWorldClock();

        Scanner scanner = new Scanner(System.in);
        System.out.println("是否需要修改当前北京时间？是，请输入'Y'；否，请输入'N'");
        String input = scanner.next();
        if(input.equals("Y"))
        {
            System.out.println("请按照'hh+空格+mm+空格+ss'的格式输入时间");
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            int second = scanner.nextInt();
            Clocktime CurBeijingTime = new Clocktime(hour,minute,second);
            worldclock.setBeijingTime(CurBeijingTime);
            worldclock.setWorldClock();
            worldclock.printWorldClock();
        }
        else
        {
            System.out.println("结束");
        }

    }
}
