package SimpleDateFormat;
/*
+ 需求
  秒杀开始时间是2020年11月11日 00:00:00,结束时间是2020年11月11日 00:10:00,用户小贾下单时间是2020年11月11日 00:03:47,
用户小皮下单时间是2020年11月11日 00:10:11,判断用户有没有成功参与秒杀活动
+ 实现步骤
  1. 判断下单时间是否在开始到结束的范围内
  2. 把字符串形式的时间变成毫秒值
**/
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Practice {
    public static void main(String[] args) throws ParseException {
        //开始时间：2020年11月11日 0:0:0
        //结束时间：2020年11月11日 0:10:0

        //小贾2020年11月11日 0:03:47
        //小皮2020年11月11日 0:10:11

        //1.判断两位同学的下单时间是否在范围之内就可以了。

        //2.要把每一个时间都换算成毫秒值。

        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";

        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();

//        System.out.println(startTime);
//        System.out.println(endTime);
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();

        if(jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("小贾同学参加上了秒杀活动");
        }else{
            System.out.println("小贾同学没有参加上秒杀活动");
        }

        System.out.println("------------------------");

        if(piTime >= startTime && piTime <= endTime){
            System.out.println("小皮同学参加上了秒杀活动");
        }else{
            System.out.println("小皮同学没有参加上秒杀活动");
        }

    }
}
